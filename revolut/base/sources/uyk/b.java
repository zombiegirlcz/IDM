package uyk;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.completed.CompletedContract$Configuration;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import ofm.h;
import ofm.q;
import pfm.m;
import skm.p0;
import syk.j;
import syk.o;
import syk.p;
import t1i.n;
import te0.w;
import up5.s;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f284444b;

    public /* synthetic */ b(g gVar, int i) {
        this.f284443a = i;
        this.f284444b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ServerError serverErrorA;
        StatusViewConfiguration.Error error;
        StatusViewConfiguration.Error error2;
        ServerError serverErrorA2;
        int i;
        switch (this.f284443a) {
            case 0:
                g gVar = this.f284444b;
                k3l.b bVar = gVar.f284449h;
                gVar.f284450j.getClass();
                ((k3l.d) bVar).O(new StatusViewConfiguration.LoadingIndefinite(766, null, "LOADING_DIALOG"));
                return Unit.f186387a;
            case 1:
                i iVar = (i) obj2;
                Intrinsics.h(iVar);
                g gVar2 = this.f284444b;
                p pVar = gVar2.i;
                ifm.b bVar2 = gVar2.f239031a;
                CompletedContract$Configuration completedContract$Configuration = gVar2.k;
                syk.f fVar = gVar2.f284450j;
                k3l.b bVar3 = gVar2.f284449h;
                if (!iVar.d()) {
                    TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig = completedContract$Configuration.f104145a;
                    if (tradingOnboardingFeatureConfig.getF104121c().f104095a) {
                        int i2 = c.f284445a[tradingOnboardingFeatureConfig.getF104121c().f104096b.ordinal()];
                        if (i2 == 1) {
                            fVar.getClass();
                            ((k3l.d) bVar3).O(new StatusViewConfiguration.Success("COMPLETED_DIALOG", new TextLocalisedClause(R$string.wealth_trade_onboarding_joint_status_pending_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trade_onboarding_joint_status_pending_subtitle, null, null, 14), null, new SuccessType.ResultAction(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null), 1912));
                        } else if (i2 == 2) {
                            ((k3l.d) bVar3).O(fVar.a());
                        } else if (i2 == 3) {
                            fVar.getClass();
                            ((k3l.d) bVar3).O(new StatusViewConfiguration.Success("COMPLETED_DIALOG", new TextLocalisedClause(R$string.wealth_robo_onboarding_portfolio_recommendation_dialog_title, null, null, 14), null, null, null, 2044));
                        } else if (i2 == 4) {
                            o oVar = (o) gVar2.f284451l;
                            oVar.getClass();
                            ufm.b bVarO0 = w.o0(p0.f264003c, new j(oVar, null));
                            b bVar4 = new b(gVar2, 4);
                            Function1 function1K = gVar2.K();
                            ufm.i iVar2 = new ufm.i(bVarO0, new nw8.d(13, new s(new BreadcrumbException(), 14)), 2);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                            ofm.i iVar3 = new ofm.i(new ly7.g(22, bVar4), new ly7.g(22, function1K), 0);
                            iVar2.q(iVar3);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
                            w.j0(bVar2, iVar3);
                        } else {
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVar.getClass();
                            ((k3l.d) bVar3).O(new StatusViewConfiguration.Success("COMPLETED_DIALOG", new TextLocalisedClause(R$string.wealth_stock_lending_onboarding_prompt, null, null, 14), null, null, null, 2044));
                        }
                    } else {
                        efm.b bVarA = pVar.a(tradingOnboardingFeatureConfig);
                        Function1 function1K2 = gVar2.K();
                        pfm.a aVar = new pfm.a(bVarA, new nw8.d(13, new s(new BreadcrumbException(), 16)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                        h hVarW = aVar.w(new ly7.g(22, function1K2), new n(9, f.f284448a));
                        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                        w.j0(bVar2, hVarW);
                    }
                } else if (((Boolean) iVar.c()).booleanValue()) {
                    ((k3l.d) bVar3).O(fVar.a());
                } else {
                    efm.b bVarA2 = pVar.a(completedContract$Configuration.f104145a);
                    Function1 function1K3 = gVar2.K();
                    pfm.a aVar2 = new pfm.a(bVarA2, new nw8.d(13, new s(new BreadcrumbException(), 15)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                    h hVarW2 = aVar2.w(new ly7.g(22, function1K3), new n(9, e.f284447a));
                    Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                    w.j0(bVar2, hVarW2);
                }
                return Unit.f186387a;
            case 2:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                g gVar3 = this.f284444b;
                CompletedContract$Configuration completedContract$Configuration2 = gVar3.k;
                syk.f fVar2 = gVar3.f284450j;
                if (c.f284445a[completedContract$Configuration2.f104145a.getF104121c().f104096b.ordinal()] == 1) {
                    v60.e eVar = fVar2.f266686b;
                    sf0.h hVar = fVar2.f266685a;
                    if (error3 instanceof CompositeException) {
                        List list = ((CompositeException) error3).f163108a;
                        Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                serverErrorA2 = hVar.a((Throwable) it8.next());
                                if (serverErrorA2 != null) {
                                }
                            } else {
                                serverErrorA2 = null;
                            }
                        }
                    } else {
                        serverErrorA2 = hVar.a(error3);
                    }
                    if (serverErrorA2 != null) {
                        v60.d dVarB = ((ao0.a) eVar).b(Integer.valueOf(serverErrorA2.f51362a));
                        if (dVarB == null) {
                            dVarB = new v60.b();
                        }
                        error2 = new StatusViewConfiguration.Error("ERROR_DIALOG", q.O(dVarB), null, null, null, null, null, 8188);
                    } else {
                        error = new StatusViewConfiguration.Error("ERROR_DIALOG", new TextLocalisedClause(R$string.wealth_trade_onboarding_joint_status_failed_title, null, null, 14), null, null, null, null, null, 8188);
                        error2 = error;
                    }
                } else {
                    v60.e eVar2 = fVar2.f266686b;
                    sf0.h hVar2 = fVar2.f266685a;
                    if (error3 instanceof CompositeException) {
                        List list2 = ((CompositeException) error3).f163108a;
                        Intrinsics.checkNotNullExpressionValue(list2, "getExceptions(...)");
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                serverErrorA = hVar2.a((Throwable) it9.next());
                                if (serverErrorA != null) {
                                }
                            } else {
                                serverErrorA = null;
                            }
                        }
                    } else {
                        serverErrorA = hVar2.a(error3);
                    }
                    if (serverErrorA != null) {
                        v60.d dVarB2 = ((ao0.a) eVar2).b(Integer.valueOf(serverErrorA.f51362a));
                        if (dVarB2 == null) {
                            dVarB2 = new v60.b();
                        }
                        error2 = new StatusViewConfiguration.Error("ERROR_DIALOG", q.O(dVarB2), null, null, null, null, null, 8188);
                    } else {
                        error = new StatusViewConfiguration.Error("ERROR_DIALOG", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, 8188);
                        error2 = error;
                    }
                }
                ((k3l.d) gVar3.f284449h).O(error2);
                return Unit.f186387a;
            case 3:
                k3l.j it10 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String f104385a = it10.a().getF104385a();
                if (Intrinsics.f(f104385a, "ERROR_DIALOG") || Intrinsics.f(f104385a, "COMPLETED_DIALOG")) {
                    g gVar4 = this.f284444b;
                    return gVar4.i.a(gVar4.k.f104145a);
                }
                m mVar = m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                g gVar5 = this.f284444b;
                k3l.b bVar5 = gVar5.f284449h;
                syk.f fVar3 = gVar5.f284450j;
                fVar3.getClass();
                int i3 = zBooleanValue ? R$string.wealth_robo_onboarding_portfolio_reassessment_changed_title : R$string.wealth_robo_onboarding_portfolio_reassessment_not_changed_title;
                if (zBooleanValue) {
                    i = R$string.wealth_robo_onboarding_portfolio_reassessment_changed_description;
                } else {
                    i = ((jte.d) fVar3.f266687c).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_strategies_onboarding_portfolio_reassessment_not_changed_description : R$string.wealth_robo_onboarding_portfolio_reassessment_not_changed_description;
                }
                ((k3l.d) bVar5).O(new StatusViewConfiguration.Success("COMPLETED_DIALOG", new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, null, 2040));
                return Unit.f186387a;
        }
    }
}
