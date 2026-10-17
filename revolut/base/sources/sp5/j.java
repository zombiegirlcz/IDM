package sp5;

import aw0.o9;
import com.google.firebase.messaging.t;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoDestination;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoFeatureConfig;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoFlowType;
import com.revolut.feature.wealth_protection.sso.api.error.WealthProtectionSsoError;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import pfm.z;
import qp5.d0;
import rfm.f0;
import up5.a0;
import up5.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends vm.e implements mm.b, g3l.d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp5.h f264892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3l.a f264893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap5.b f264894c;
    public final j61.b d;
    public final up5.b e;
    public final sf0.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mm.d f264895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ym.d f264896h;
    public final v60.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lrh.a f264897j;
    public final ln.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final eli.j f264898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f264899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xq5.b f264900n;
    public final tm.g o;

    public j(qp5.h router, g3l.a statusConfigurationDispatcher, ap5.b cryptoWithdrawInteractor, d0 statusViewConfigurationFactory, j61.b mainWalletTransactionsInteractor, up5.b presentationModel, sf0.h serverErrorParser, mm.d actionsDispatcher, ym.d loadingDispatcher, v60.e serverErrorsProvider, lrh.a wealthProtectionErrorParser, ln.a navigationCommandsDispatcher, eli.j twoFaErrorHandler, gte.a featureToggleInteractor, xq5.b cryptoSendConfirmationLoadingHandler, t actionFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(statusConfigurationDispatcher, "statusConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(statusViewConfigurationFactory, "statusViewConfigurationFactory");
        Intrinsics.checkNotNullParameter(mainWalletTransactionsInteractor, "mainWalletTransactionsInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(wealthProtectionErrorParser, "wealthProtectionErrorParser");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoSendConfirmationLoadingHandler, "cryptoSendConfirmationLoadingHandler");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.f264892a = router;
        this.f264893b = statusConfigurationDispatcher;
        this.f264894c = cryptoWithdrawInteractor;
        this.d = mainWalletTransactionsInteractor;
        this.e = presentationModel;
        this.f = serverErrorParser;
        this.f264895g = actionsDispatcher;
        this.f264896h = loadingDispatcher;
        this.i = serverErrorsProvider;
        this.f264897j = wealthProtectionErrorParser;
        this.k = navigationCommandsDispatcher;
        this.f264898l = twoFaErrorHandler;
        this.f264899m = featureToggleInteractor;
        this.f264900n = cryptoSendConfirmationLoadingHandler;
        this.o = actionFactory.f(new g(this, 1));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        qp5.d action = (qp5.d) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.o.a(action);
    }

    @Override // g3l.d
    public final efm.d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = result instanceof k3l.g;
        qp5.h hVar = this.f264892a;
        z zVarD = ((z && Intrinsics.f(((k3l.g) result).f180817a.getF104385a(), "WITHDRAW_SUCCESS_STATUS_VIEW_ID")) ? ((g0) hVar).d(false) : (z && Intrinsics.f(((k3l.g) result).f180817a.getF104385a(), "ERROR_STATUS_VIEW_ID")) ? m.f235744a : ((g0) hVar).c()).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }

    @Override // vm.d
    public final efm.d0 d(um.a errorData) throws IOException {
        efm.b bVarK3;
        Object error;
        int i;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        mm.a aVar = errorData.f281172a;
        Throwable th10 = errorData.f281173b;
        if (!(aVar instanceof qp5.d)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        boolean z = th10 instanceof UserDeclinedTwoFaException;
        up5.b bVar = this.e;
        if (z) {
            bVar.getClass();
            pfm.h hVarA = this.k.a(new FinishCommand(null, null, null, 7));
            ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return hVarA.f(bVarM2);
        }
        if (th10 instanceof HandledNetworkException) {
            ufm.b bVarM3 = efm.d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        WealthProtectionSsoError error2 = this.f264897j.a(th10);
        qp5.h hVar = this.f264892a;
        if (error2 != null) {
            g0 g0Var = (g0) hVar;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(error2, "error");
            pfm.h hVarA2 = g0Var.f281893b.a(new FeatureCommand(new WealthProtectionSsoFeatureConfig(new WealthProtectionSsoDestination(new WealthProtectionSsoDestination.InputData(error2, WealthProtectionSsoFlowType.Retry.f96310a, new WealthProtectionSsoDestination.EndStatusDialogInfo(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, hrh.a.SUCCESS), new FinishCommand(null, null, null, 7))))));
            ufm.b bVarM4 = efm.d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            f0 f0VarF = hVarA2.f(bVarM4);
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        ServerError serverErrorA = this.f.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        wp5.f error3 = (numValueOf != null && numValueOf.intValue() == 29020) ? wp5.f.INCORRECT_FEES : (numValueOf != null && numValueOf.intValue() == 29023) ? wp5.f.EXPIRED_QUOTE_TOKEN : null;
        if (error3 != null) {
            a0 a0Var = (a0) bVar;
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(error3, "error");
            int i2 = up5.m.f281904a[error3.ordinal()];
            if (i2 == 1) {
                bVarK3 = a0Var.k3();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarK3 = a0Var.l3();
            }
        } else {
            bVarK3 = null;
        }
        g3l.a aVar2 = this.f264893b;
        if (bVarK3 != null) {
            TextLocalisedClause errorMessage = new TextLocalisedClause(R.string.error_generic, null, null, 14);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            z zVarD = bVarK3.e(aVar2.c0(new StatusViewConfiguration.Error("ERROR_STATUS_VIEW_ID", errorMessage, null, null, null, null, null, 8188))).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        if (serverErrorA != null && serverErrorA.f51362a == 29016) {
            g0 g0Var2 = (g0) hVar;
            g0Var2.getClass();
            pfm.h hVarA3 = g0Var2.f281893b.a(new CompositeCommand(new FinishCommand(null, null, null, 7), ((ik5.g) g0Var2.f281894c).a()));
            ufm.b bVarM5 = efm.d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            f0 f0VarF2 = hVarA3.f(bVarM5);
            Intrinsics.checkNotNullExpressionValue(f0VarF2, "andThen(...)");
            return f0VarF2;
        }
        Integer numValueOf2 = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if ((numValueOf2 != null && numValueOf2.intValue() == 29005) || ((numValueOf2 != null && numValueOf2.intValue() == 29004) || (numValueOf2 != null && numValueOf2.intValue() == 29003))) {
            switch (numValueOf2.intValue()) {
                case 29003:
                    i = R$string.crypto_withdrawals_screen_create_withdrawal_new_amount_daily_limit_exceeded_prompt_title;
                    break;
                case 29004:
                    i = R$string.crypto_withdrawals_screen_create_withdrawal_new_amount_monthly_limit_exceeded_prompt_title;
                    break;
                case 29005:
                    i = R$string.crypto_withdrawals_screen_create_withdrawal_below_minimum_error_dialog_title;
                    break;
                default:
                    throw new IllegalStateException("Limit title called for non limit error code");
            }
            error = new StatusViewConfiguration.Warning("LIMIT_ERROR_STATUS_VIEW_ID", new TextLocalisedClause(i, null, null, 14), null, new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_limit_error_dialog_button_text, null, null, 14), null, null, 1012);
        } else {
            v60.c cVarB = ((ao0.a) this.i).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
            TextLocalisedClause errorMessage2 = cVarB != null ? q.O(cVarB) : new TextLocalisedClause(R.string.error_generic, null, null, 14);
            Intrinsics.checkNotNullParameter(errorMessage2, "errorMessage");
            error = new StatusViewConfiguration.Error("ERROR_STATUS_VIEW_ID", errorMessage2, null, null, null, null, null, 8188);
        }
        z zVarD2 = aVar2.c0(error).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
        return zVarD2;
    }
}
