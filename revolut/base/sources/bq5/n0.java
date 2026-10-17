package bq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a f17738b;

    public /* synthetic */ n0(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, int i) {
        this.f17737a = i;
        this.f17738b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wk5.h hVar;
        switch (this.f17737a) {
            case 0:
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.e) {
                    this.f17738b.C1(zh9.u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-s-the-travel-rule", 2))));
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar = this.f17738b;
                cli.y yVar = aVar.C;
                zi5.d output2 = (zi5.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof zi5.e) {
                    String str = ((zi5.e) output2).f322505b;
                    if (str == null) {
                        str = ((a0) ((j2) yVar.f22677a).getValue()).f17682p;
                    }
                    aVar.H2(yVar, new bnj.n(output2, str, 9));
                }
                return Unit.f186387a;
            case 2:
                rq5.d output3 = (rq5.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof rq5.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                rq5.c cVar = (rq5.c) output3;
                String str2 = cVar.f256478a;
                int i = r0.f17749a[cVar.f256479b.ordinal()];
                if (i == 1) {
                    hVar = wk5.h.SELF_HOSTED;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = wk5.h.EXCHANGE;
                }
                CryptoAddressHostingCheckResult.Found found = new CryptoAddressHostingCheckResult.Found(str2, hVar, false, true);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = this.f17738b;
                aVar2.H2(aVar2.C, new bhl.g(found, 25));
                return Unit.f186387a;
            case 3:
                dq5.d it8 = (dq5.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar3 = this.f17738b;
                aVar3.H2(aVar3.C, new bhl.g(it8, 26));
                return Unit.f186387a;
            default:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar4 = this.f17738b;
                aVar4.H2(aVar4.C, new o0(3));
                return Unit.f186387a;
        }
    }
}
