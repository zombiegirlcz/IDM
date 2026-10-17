package i2l;

import aw0.n6;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import hha.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelStatusPartnerScreen f158033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(TravelStatusPartnerScreen travelStatusPartnerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158033w = travelStatusPartnerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f158033w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f158033w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a2l.n nVar;
        int i = this.u;
        TravelStatusPartnerScreen travelStatusPartnerScreen = this.f158033w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE3 = travelStatusPartnerScreen.R2();
                Object obj3 = n6Var.k;
                m0 m0Var = (m0) yVarE3;
                cli.y yVar = m0Var.f158032y;
                a2l.r rVar = obj3 instanceof a2l.r ? (a2l.r) obj3 : null;
                if (rVar != null) {
                    int i2 = b0.f158001a[rVar.f922a.ordinal()];
                    if (i2 == 1) {
                        String str = rVar.f923b;
                        if (str != null) {
                            m0Var.H2(yVar, new i2i.o(7));
                            m0Var.J2(str);
                        }
                    } else if (i2 == 2) {
                        a2l.y yVar2 = (a2l.y) ((q) ((j2) yVar.f22677a).getValue()).f158038a.getContent();
                        if (yVar2 != null && (nVar = yVar2.f937c) != null) {
                            m0Var.l2(new g0(m0Var, nVar, null, 1), new yi5.b(26));
                        }
                    } else if (i2 == 3) {
                        w0 w0Var = rVar.d;
                        if (w0Var != null) {
                            m0Var.C1(u0.c(new PricingPlanFeatureConfig.DashboardByPlanTier(w0Var, xfa.b.PARTNERSHIPS, PlanChangeSuccessActionStrategy.Quit.f102917a)));
                        }
                    } else if (i2 == 4) {
                        a2l.y yVar3 = (a2l.y) ((q) ((j2) yVar.f22677a).getValue()).f158038a.getContent();
                        TravelStatusLinkAccountInfo travelStatusLinkAccountInfo = yVar3 != null ? yVar3.k : null;
                        if (travelStatusLinkAccountInfo != null) {
                            TravelStatusLinkAccountInfo.LinkAccountAction linkAccountAction = travelStatusLinkAccountInfo.e.f104301b;
                            if (linkAccountAction instanceof TravelStatusLinkAccountInfo.LinkAccountAction.Url) {
                                m0Var.J2(((TravelStatusLinkAccountInfo.LinkAccountAction.Url) linkAccountAction).f104299a);
                            } else {
                                if (!Intrinsics.f(linkAccountAction, TravelStatusLinkAccountInfo.LinkAccountAction.Api.f104298a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                m0Var.C2(new v(m0Var.o.f104322a, travelStatusLinkAccountInfo));
                            }
                        }
                    } else if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE32 = travelStatusPartnerScreen.R2();
                Object obj4 = aVar2.d;
                m0 m0Var2 = (m0) yVarE32;
                m0Var2.getClass();
                if (obj4 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj4).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        m0Var2.n2(new hul.f0(m0Var2, ((HyperTextTarget.Link) hyperTextTarget).f74757a, null, 29), new whi.b(6));
                    }
                }
                return Unit.f186387a;
        }
    }
}
