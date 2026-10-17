package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$ModalStep;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.e;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259961a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.amount.b f259962b;

    public /* synthetic */ j0(com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar) {
        this.f259962b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DefiCurrency defiCurrency;
        String str = null;
        switch (this.f259961a) {
            case 0:
                l1j.e result = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, e.a.f191551a)) {
                    int i = jli.h.f175850a;
                } else {
                    if (!(result instanceof l1j.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l1j.f fVar = (l1j.f) result;
                    com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = this.f259962b;
                    o oVar = (o) ((j2) bVar.z.f22677a).getValue();
                    String strS = cj9.c.s(fVar.e);
                    DeFiBalance deFiBalance = oVar.f259975h;
                    boolean zF = Intrinsics.f(deFiBalance != null ? deFiBalance.f71638g : null, fVar.f191552a);
                    boolean z = !zF;
                    DeFiAssetDetails deFiAssetDetails = oVar.f259974g;
                    if (deFiAssetDetails != null && (defiCurrency = deFiAssetDetails.f71665a) != null) {
                        str = defiCurrency.f71671a;
                    }
                    boolean zF2 = Intrinsics.f(str, strS);
                    if (!zF || !zF2) {
                        bVar.n2(new a9j.o(bVar, fVar, strS, oVar, z, (Continuation) null), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z3 = output instanceof eii.e;
                com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar2 = this.f259962b;
                if (z3) {
                    bVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.what-is-the-cryptocurrency-network", 6), (SharedFaqDestination.PassthroughData) null, false, 14));
                } else if (output instanceof eii.i) {
                    Object obj3 = ((eii.i) output).f126655a;
                    wk5.a aVar = obj3 instanceof wk5.a ? (wk5.a) obj3 : null;
                    if (aVar == null) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", a0.d.m(obj3, "Chain picker row clicked did not have Blockchain parcel: "), null, h0Var);
                        return Unit.f186387a;
                    }
                    bVar2.H2(bVar2.z, new bcj.i(aVar, 10));
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", j6.a.q("Unexpected output in network picker: ", kotlin.jvm.internal.o0.f186429a.b(output.getClass()).m()), null, h0Var2);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ j0(com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar, DeFiSendAmountScreenContract$ModalStep.ChainPicker chainPicker) {
        this.f259962b = bVar;
    }
}
