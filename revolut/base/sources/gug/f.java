package gug;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosure;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeatureRating;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackDetails;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import com.revolut.feature.wealth.account_closure.impl.data.network.AccountClosureService;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$FlowState;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import do3.q;
import f23.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.u1;
import nii.y0;
import nii.z;
import skm.p0;
import vkm.j2;
import wtg.f0;
import wtg.i0;
import yhm.o;
import yji.l;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b f146933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountClosureFeedback f146934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f146935y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar, AccountClosureFeedback accountClosureFeedback, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f146933w = bVar;
        this.f146934x = accountClosureFeedback;
        this.f146935y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f146933w, this.f146934x, this.f146935y, continuation, 0);
            case 1:
                return new f(this.f146933w, this.f146934x, this.f146935y, continuation, 1);
            default:
                return new f(this.f146933w, this.f146934x, this.f146935y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i0 i0Var;
        String str;
        ArrayList arrayList;
        Object objP2;
        m0 g0Var;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                AccountClosureFeedback feedback = this.f146934x;
                AccountClosureFeedbackChoice accountClosureFeedbackChoice = feedback.f94857a;
                if (!Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.AnotherPlatform.f94860b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.EeaRemediationOptOut.f94861b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.FeaturesDontWork.f94862b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.NotInterested.f94863b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.PoorPerformance.f94865b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.TooExpensive.f94866b) && !Intrinsics.f(accountClosureFeedbackChoice, AccountClosureFeedbackChoice.UnhappyCustomerSupport.f94867b)) {
                    if (!(accountClosureFeedbackChoice instanceof AccountClosureFeedbackChoice.Other)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (d0.W(((AccountClosureFeedbackChoice.Other) accountClosureFeedbackChoice).f94864b)) {
                        AccountClosureFeedbackChoice.Other feedbackChoice = new AccountClosureFeedbackChoice.Other("Other");
                        AccountClosureFeedbackDetails accountClosureFeedbackDetails = feedback.f94858b;
                        Intrinsics.checkNotNullParameter(feedbackChoice, "feedbackChoice");
                        feedback = new AccountClosureFeedback(feedbackChoice, accountClosureFeedbackDetails);
                    }
                }
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar = this.f146933w;
                ktg.a aVar2 = bVar.f94919p;
                ltg.b bVar2 = ((AccountClosureFlowContract$FlowState) ((j2) bVar.v.f22677a).getValue()).f94898c;
                aug.d dVar = (aug.d) aVar2;
                dVar.getClass();
                String portfolioId = this.f146935y;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(feedback, "feedback");
                xtg.e eVar = dVar.f9824a;
                AccountClosure accountClosure = new AccountClosure(portfolioId, feedback, bVar2);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(accountClosure, "accountClosure");
                AccountClosureService accountClosureService = eVar.f308815a;
                Intrinsics.checkNotNullParameter(accountClosure, "<this>");
                String str2 = feedback.f94857a.f94859a;
                AccountClosureFeedbackDetails accountClosureFeedbackDetails2 = feedback.f94858b;
                if (accountClosureFeedbackDetails2 != null) {
                    Intrinsics.checkNotNullParameter(accountClosureFeedbackDetails2, "<this>");
                    AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = accountClosureFeedbackDetails2.f94868a;
                    if (accountClosureCompetitorCompanyChoice == null) {
                        str = null;
                    } else if (accountClosureCompetitorCompanyChoice instanceof AccountClosureCompetitorCompanyChoice.Company) {
                        str = ((AccountClosureCompetitorCompanyChoice.Company) accountClosureCompetitorCompanyChoice).f94852a;
                    } else {
                        if (!(accountClosureCompetitorCompanyChoice instanceof AccountClosureCompetitorCompanyChoice.Other)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((AccountClosureCompetitorCompanyChoice.Other) accountClosureCompetitorCompanyChoice).f94853a;
                    }
                    Map map = accountClosureFeedbackDetails2.f94869b;
                    if (map != null) {
                        Set<Map.Entry> setEntrySet = map.entrySet();
                        arrayList = new ArrayList(w.t(setEntrySet, 10));
                        for (Map.Entry entry : setEntrySet) {
                            AccountClosureFeedbackFeature accountClosureFeedbackFeature = (AccountClosureFeedbackFeature) entry.getKey();
                            AccountClosureFeatureRating accountClosureFeatureRating = (AccountClosureFeatureRating) entry.getValue();
                            arrayList.add(new f0(accountClosureFeedbackFeature.f94870a, accountClosureFeatureRating.f94855a, accountClosureFeatureRating.f94856b));
                        }
                    } else {
                        arrayList = null;
                    }
                    i0Var = new i0(str, arrayList);
                } else {
                    i0Var = null;
                }
                ltg.b bVar3 = accountClosure.f94851c;
                pfm.a aVarE = te0.w.g0(accountClosureService.requestAccountClosure(portfolioId, new wtg.i(str2, i0Var, bVar3 != null ? bVar3.name() : null))).k(1L, TimeUnit.SECONDS, hhm.f.f152430b).e(pd.b.n(p0.f264003c, new aug.c(dVar, portfolioId, (Continuation) null)));
                efm.d0 d0VarFirstOrError = zi0.c.J(dVar.a(portfolioId)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                rfm.f0 f0VarF = aVarE.f(zi0.c.t(d0VarFirstOrError));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                this.v = 1;
                Object objB = nim.a.b(f0VarF, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar4 = this.f146933w;
                f fVar = new f(bVar4, this.f146934x, this.f146935y, null, 0);
                this.v = 1;
                Object objT = q.t(bVar4, fVar, this);
                return objT == aVar3 ? aVar3 : objT;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar5 = this.f146933w;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar2 = new f(bVar5, this.f146934x, this.f146935y, continuation, 1);
                    this.v = 1;
                    objP2 = bVar5.p2(this, fVar2);
                    if (objP2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objP2 = obj2;
                }
                AccountClosureStatus accountClosureStatus = (AccountClosureStatus) objP2;
                bvg.a aVar5 = bVar5.u;
                Intrinsics.h(accountClosureStatus);
                TradingAccount account = ((AccountClosureFlowContract$FlowState) ((j2) bVar5.v.f22677a).getValue()).f94897b;
                if (account == null) {
                    throw new IllegalArgumentException("Trading account can't be null when cloasing account.");
                }
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(accountClosureStatus, "accountClosureStatus");
                Intrinsics.checkNotNullParameter(account, "account");
                if (accountClosureStatus instanceof AccountClosureStatus.AccountClosed) {
                    boolean z = account instanceof TradingAccount.Robo;
                    if (z || (account instanceof TradingAccount.GIA)) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.trading_account_closure_result_screen_success_text, null, null, 14);
                    } else if (account instanceof TradingAccount.Margin) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_margin_account_closure_result_screen_success, null, null, 14);
                    } else if ((account instanceof TradingAccount.TaxAdvantage.Isa) || (account instanceof TradingAccount.TaxAdvantage.JIsa)) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_isa_account_closure_result_screen_success_text, null, null, 14);
                    } else {
                        if (!(account instanceof TradingAccount.TaxAdvantage.Pea)) {
                            if (!(account instanceof TradingAccount.MoneyMarketFunds) && !(account instanceof TradingAccount.TaxAdvantage.Unknown) && !(account instanceof TradingAccount.PaperTrading) && !(account instanceof TradingAccount.Unknown)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException(("Account Closure Flow not supported for " + account.W()).toString());
                        }
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_pea_account_closure_result_screen_success_text, null, null, 14);
                    }
                    TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
                    if ((account instanceof TradingAccount.TaxAdvantage.Pea) || (account instanceof TradingAccount.TaxAdvantage.JIsa) || (account instanceof TradingAccount.TaxAdvantage.Isa)) {
                        textLocalisedClause3 = new TextLocalisedClause(R$string.trading_account_closure_result_screen_success_description, null, null, 14);
                    } else {
                        if (!(account instanceof TradingAccount.GIA) && !(account instanceof TradingAccount.Margin) && !(account instanceof TradingAccount.MoneyMarketFunds) && !z && !(account instanceof TradingAccount.TaxAdvantage.Unknown) && !(account instanceof TradingAccount.PaperTrading) && !(account instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause3 = null;
                    }
                    g0Var = new j0((Clause) textLocalisedClause4, (Clause) textLocalisedClause3, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                } else if ((accountClosureStatus instanceof AccountClosureStatus.AccountClosureInProgress) || (accountClosureStatus instanceof AccountClosureStatus.AccountClosureProgressBlocked) || (accountClosureStatus instanceof AccountClosureStatus.BackendRequestedAccountClosure)) {
                    if ((account instanceof TradingAccount.GIA) || (account instanceof TradingAccount.Robo) || (account instanceof TradingAccount.TaxAdvantage.Isa) || (account instanceof TradingAccount.TaxAdvantage.Pea) || (account instanceof TradingAccount.TaxAdvantage.JIsa)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_result_screen_pending_text, null, null, 14);
                    } else {
                        if (!(account instanceof TradingAccount.Margin)) {
                            if (!(account instanceof TradingAccount.MoneyMarketFunds) && !(account instanceof TradingAccount.TaxAdvantage.Unknown) && !(account instanceof TradingAccount.PaperTrading) && !(account instanceof TradingAccount.Unknown)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException(("Account Closure Flow not supported for " + account.W()).toString());
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_account_closure_result_screen_pending, null, null, 14);
                    }
                    g0Var = new g0(textLocalisedClause, null, null, null, null, null, null, null, false, null, false, null, 16382);
                } else {
                    if (!(accountClosureStatus instanceof AccountClosureStatus.NoAccountClosure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g0Var = new z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_status_error_title, null, null, 14), new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_status_error_description_android, (List) null, (Integer) null, (Object) null, 30), null, null, null, null, false, null, null, null, null, null, null, 32764);
                }
                return l.a1(bVar5, bVar5.X1(new y0(null, g0Var, false, 5)), null, null, new y(bVar5, accountClosureStatus, continuation, 13), 3);
        }
    }
}
