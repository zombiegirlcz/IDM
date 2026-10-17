package an4;

import aii.r;
import aii.u;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.a;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.kyc.impl.KycPromptDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.NextContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qu4.s;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6552b;

    public /* synthetic */ b(com.revolut.feature.kyc.impl.d dVar, KycPromptDestination kycPromptDestination) {
        this.f6551a = 2;
        this.f6552b = kycPromptDestination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.revolut.retail.core.navigation.NaviCommand] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlow) throws Throwable {
        NaviCommand naviCommandF;
        int i = this.f6551a;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        c.d dVar = c.d.f74507a;
        c.b bVar = c.b.f74505a;
        c.C0497c c0497c = c.C0497c.f74506a;
        ?? r3 = 0;
        d = null;
        d = null;
        NaviCommand d = null;
        Object obj2 = this.f6552b;
        switch (i) {
            case 0:
                CreditCardTopupDestination creditCardTopupDestination = (CreditCardTopupDestination) obj2;
                gu4.d output = (gu4.d) rVar;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (!(output instanceof gu4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                KompotDestination kompotDestination = creditCardTopupDestination.f68982c;
                if (kompotDestination != null) {
                    knm.b.j(wrapperFlow.l1(), kompotDestination);
                    return;
                } else {
                    wrapperFlow.J2();
                    return;
                }
            case 1:
                bw3.b bVar2 = (bw3.b) obj2;
                yp3.k result = (yp3.k) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                if (!(result instanceof yp3.i)) {
                    if (result instanceof yp3.h) {
                        bw3.b.a(wrapperFlow, bVar2, ((yp3.h) result).f315773a);
                        return;
                    } else if (result instanceof yp3.j) {
                        bw3.b.a(wrapperFlow, bVar2, ((yp3.j) result).f315777a);
                        return;
                    } else {
                        if (!(result instanceof yp3.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bw3.b.a(wrapperFlow, bVar2, ((yp3.g) result).f315772a);
                        return;
                    }
                }
                u uVar = ((yp3.i) result).f315776c;
                if (uVar != null) {
                    if (uVar instanceof BridgeDestination) {
                        naviCommandF = ((BridgeDestination) uVar).f98270a;
                    } else {
                        if (!(uVar instanceof StackDestination)) {
                            throw new IllegalStateException(("Unsupported exit destination: " + uVar).toString());
                        }
                        naviCommandF = u0.f((StackDestination) uVar);
                    }
                    r3 = naviCommandF;
                }
                bw3.b.a(wrapperFlow, bVar2, r3);
                return;
            case 2:
                KycPromptDestination kycPromptDestination = (KycPromptDestination) obj2;
                com.revolut.feature.full_screen_prompt.c result2 = (com.revolut.feature.full_screen_prompt.c) rVar;
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (result2 instanceof c.a) {
                    d = new FinishCommand(null, null, null, 7);
                } else if (Intrinsics.f(result2, c0497c)) {
                    d = kycPromptDestination.getD();
                } else if (Intrinsics.f(result2, dVar)) {
                    KycPromptDestination.Failed failed = kycPromptDestination instanceof KycPromptDestination.Failed ? (KycPromptDestination.Failed) kycPromptDestination : null;
                    if (failed != null) {
                        d = failed.f77536g;
                    }
                } else if (!Intrinsics.f(result2, bVar) && !(result2 instanceof d67.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (d != null) {
                    knm.b.j(wrapperFlow.l1(), new BridgeDestination(d));
                    return;
                }
                return;
            case 3:
                g83.a aVar = (g83.a) obj2;
                h83.a output2 = (h83.a) rVar;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapper");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), aVar.f141247a.c(new CardScreenAction.Select(output2.f149939a, 6, false, false), personal))));
                return;
            case 4:
                o63.c output3 = (o63.c) rVar;
                Intrinsics.checkNotNullParameter(output3, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapper");
                f73.c cVar = ((i73.a) obj2).f159183a;
                if (output3 instanceof o63.a) {
                    knm.b.j(wrapperFlow.l1(), new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), cVar.c(new CardScreenAction.Select(((o63.a) output3).f222490a.f150110a, 6, false, false), personal))));
                    return;
                } else {
                    if (!(output3 instanceof o63.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    knm.b.j(wrapperFlow.l1(), new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), cVar.c(new CardScreenAction.AddToGooglePay(((o63.b) output3).f222491a.f150110a), personal))));
                    return;
                }
            case 5:
                TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration = (TradingOnboardingBackendFlowContract$Configuration) obj2;
                h0l.d output4 = (h0l.d) rVar;
                Intrinsics.checkNotNullParameter(output4, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                if (!(output4 instanceof h0l.c)) {
                    knm.b.j(wrapperFlow.l1(), u0.b(new FinishCommand(null, null, null, 7)));
                    return;
                }
                if (!(tradingOnboardingBackendFlowContract$Configuration instanceof TradingOnboardingBackendFlowContract$Configuration.Regular)) {
                    if (!(tradingOnboardingBackendFlowContract$Configuration instanceof TradingOnboardingBackendFlowContract$Configuration.W8BEN)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalStateException("W8BEN config can only be cancelled, not completed"));
                    knm.b.j(wrapperFlow.l1(), u0.b(new FinishCommand(null, null, null, 7)));
                    return;
                }
                NaviCommand activityNavigateCommand = ((h0l.c) output4).f148432a;
                if (activityNavigateCommand == null) {
                    gzk.c.Companion.getClass();
                    TradingOnboardingBackendFlowContract$Configuration.Regular regular = (TradingOnboardingBackendFlowContract$Configuration.Regular) tradingOnboardingBackendFlowContract$Configuration;
                    activityNavigateCommand = new ActivityNavigateCommand(gzk.a.f148158b, new NextContract$Configuration(regular.f104225b, regular.f104224a), null, null, 0, null, null, null, null, false, 1020);
                }
                knm.b.j(wrapperFlow.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), activityNavigateCommand)));
                return;
            case 6:
                ll2.a aVar2 = (ll2.a) obj2;
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.a output5 = (com.revolut.feature.backend_driven_limits.impl.v2.ui.list.a) rVar;
                Intrinsics.checkNotNullParameter(output5, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                if (Intrinsics.f(output5, a.b.f63211a)) {
                    aVar2.f196495a.b(cmg.a.SHOW);
                    wrapperFlow.J2();
                    return;
                } else {
                    if (!Intrinsics.f(output5, a.C0457a.f63210a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrapperFlow.J2();
                    return;
                }
            case 7:
                qh6.d dVar2 = (qh6.d) obj2;
                eo6.d result3 = (eo6.d) rVar;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperModel");
                if (!(result3 instanceof eo6.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                knm.b.j(wrapperFlow.l1(), new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) dVar2.f246488a).f(((eo6.c) result3).f127867a), 14), null, null, null, 0, null, null, null, null, false, 1022)));
                return;
            default:
                com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) obj2;
                com.revolut.feature.full_screen_prompt.c output6 = (com.revolut.feature.full_screen_prompt.c) rVar;
                Intrinsics.checkNotNullParameter(output6, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                int i2 = 26;
                if ((output6 instanceof c.a) || Intrinsics.f(output6, c0497c)) {
                    eVar.l2(new qwi.j(eVar, r3, 1), new yi5.b(i2));
                    wrapperFlow.I2(output6);
                    return;
                }
                if (!(output6 instanceof d67.h)) {
                    if (!Intrinsics.f(output6, bVar) && !Intrinsics.f(output6, dVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    if (Intrinsics.f(((d67.h) output6).f111458a.f275445a, "ID_TERMS_AND_CONDITIONS_CLAUSE")) {
                        String str = ((AirportLoungePassDetailsFlowContract$State) ((j2) eVar.z.f22677a).getValue()).f98987b;
                        if (str != null) {
                            eVar.l2(new s(eVar, str, r3, 11), new yi5.b(i2));
                            return;
                        }
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AirportLoungePassDetailsFlowModel", "Can't launch T&C deeplink: no terms url", null, h0Var);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f6551a = i;
        this.f6552b = obj2;
    }
}
