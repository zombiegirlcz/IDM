package uye;

import com.revolut.feature.cash_topup.api.declaration.CashTopUpBarcodeFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import h1j.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.o3;
import kye.z3;
import kze.d;
import l1j.a;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284285b;

    public /* synthetic */ i(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, int i) {
        this.f284284a = i;
        this.f284285b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f284284a;
        com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284285b;
        switch (i) {
            case 0:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    iVar.N.a(z3.f190889a);
                } else if (result instanceof dii.f) {
                    iVar.C1(new ExternalDestination.Browser("https://help.revolut.com/help/adding-money/cash-deposits/", null));
                }
                return Unit.f186387a;
            case 1:
                ste.u result2 = (ste.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof ste.s) {
                    if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "UAE_COUNTRY_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                        iVar.T2("question.uae-limits-and-fees");
                    }
                } else if (!(result2 instanceof ste.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                l1j.a result3 = (l1j.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof l1j.b) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((l1j.b) result3).f191547a;
                    aVar.getClass();
                    iVar.Q2(xi0.a.a(str));
                } else if (!Intrinsics.f(result3, a.C1086a.f191546a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 3:
                g0f.d result4 = (g0f.d) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof g0f.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.l1().M0(new aii.i(((g0f.c) result4).f139473a, (aii.a) null, 6));
                return Unit.f186387a;
            case 4:
                h1j.b result5 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof h1j.c) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str2 = ((h1j.c) result5).f148579a;
                    aVar2.getClass();
                    iVar.Q2(xi0.a.a(str2));
                } else if (result5 instanceof h1j.d) {
                    iVar.Q2(((h1j.d) result5).f148581b);
                } else if (!Intrinsics.f(result5, b.a.f148578a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 5:
                kze.d result6 = (kze.d) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof kze.c) {
                    iVar.l1().M0(new aii.i(((kze.c) result6).f191102a, (aii.a) null, 6));
                } else {
                    if (!Intrinsics.f(result6, d.a.f191103a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.C1(u0.b(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(CashTopUpBarcodeFeatureConfig.f65578g))));
                }
                return Unit.f186387a;
            case 6:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                iVar.l1().M0(new aii.i(e, (aii.a) null, 6));
                return Boolean.TRUE;
            default:
                we6.v result7 = (we6.v) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (!(result7 instanceof we6.u)) {
                    throw new NoWhenBranchMatchedException();
                }
                EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data data = ((we6.u) result7).f296682a;
                iVar.f90950t.a(new o3(iVar.f90949s.g(data, false), data.getD().f306286a, true));
                yki.a aVar3 = iVar.i0;
                if (oki.h.E2(aVar3, new uwi.v(25))) {
                    aVar3.e(false);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ i(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, TopupFlowContract$Step topupFlowContract$Step) {
        this.f284284a = 7;
        this.f284285b = iVar;
    }
}
