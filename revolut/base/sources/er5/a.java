package er5;

import ar5.e;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wk5.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f128541b;

    public /* synthetic */ a(d dVar, int i) {
        this.f128540a = i;
        this.f128541b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128540a) {
            case 0:
                ar5.e output = (ar5.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof e.a) {
                    d dVar = this.f128541b;
                    dVar.getClass();
                    dVar.A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.which-addresses-can-i-revert-my-deposit-to", 2))));
                }
                return Unit.f186387a;
            case 1:
                List list = (List) ((Data) obj2).getContent();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (true) {
                        boolean zHasNext = it8.hasNext();
                        d dVar2 = this.f128541b;
                        if (zHasNext) {
                            Object next = it8.next();
                            CryptoAddress cryptoAddress = (CryptoAddress) next;
                            if (cryptoAddress.k && ue8.c.F(dVar2.f128544l, m.a(cryptoAddress.f71063h))) {
                                arrayList.add(next);
                            }
                        } else {
                            dVar2.f128551t.clear();
                            dVar2.f128551t.addAll(arrayList);
                        }
                    }
                }
                return Unit.f186387a;
            case 2:
                List addresses = (List) obj2;
                Intrinsics.checkNotNullParameter(addresses, "addresses");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : addresses) {
                    CryptoAddress cryptoAddress2 = (CryptoAddress) obj3;
                    if (!cryptoAddress2.k && ue8.c.F(this.f128541b.f128544l, m.a(cryptoAddress2.f71063h))) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            default:
                List blockchains = (List) obj2;
                Intrinsics.checkNotNullParameter(blockchains, "blockchains");
                CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = this.f128541b.f128544l;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : blockchains) {
                    if (ue8.c.H(cryptoSendWalletsListControllerContract$InputData, (wk5.a) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
        }
    }
}
