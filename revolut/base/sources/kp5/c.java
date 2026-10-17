package kp5;

import com.google.firebase.messaging.t;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow.CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import eli.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import sf0.h;
import te0.w;
import tm.g;
import up5.a0;
import vm.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e implements mm.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f188171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3l.a f188172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap5.b f188173c;
    public final h d;
    public final up5.b e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f188174g;

    public c(ln.a navigationCommandsDispatcher, g3l.a statusConfigurationDispatcher, ap5.b cryptoWithdrawInteractor, h serverErrorParser, ip5.a statusViewConfigurationFactory, up5.b presentationModel, j twoFaErrorHandler, t actionFactory) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(statusConfigurationDispatcher, "statusConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(statusViewConfigurationFactory, "statusViewConfigurationFactory");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.f188171a = navigationCommandsDispatcher;
        this.f188172b = statusConfigurationDispatcher;
        this.f188173c = cryptoWithdrawInteractor;
        this.d = serverErrorParser;
        this.e = presentationModel;
        this.f = twoFaErrorHandler;
        this.f188174g = actionFactory.f(new a(this, 0));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction action = (CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f188174g.a(action);
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (!(errorData.f281172a instanceof CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction)) {
            return e(false);
        }
        this.e.getClass();
        pfm.h hVarA = this.f188171a.a(new FinishCommand(null, null, null, 7));
        Throwable th10 = errorData.f281173b;
        if (th10 instanceof UserDeclinedTwoFaException) {
            f0 f0VarF = hVarA.f(e(true));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        ServerError serverErrorA = this.d.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || numValueOf.intValue() != 29000) {
            return e(false);
        }
        f0 f0VarF2 = this.f188172b.c0(new StatusViewConfiguration.Error("DUPLICATE_ERROR_STATUS_VIEW_ID", new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_address_duplicate_error_popup_title, null, null, 14), null, null, null, null, null, 8188)).f(e(true));
        Intrinsics.checkNotNullExpressionValue(f0VarF2, "andThen(...)");
        return f0VarF2;
    }

    public final f0 e(boolean z) {
        up5.e eVar = (up5.e) ((a0) this.e).f281852b;
        f0 f0VarF = w.z0(eVar.f281885s.getValue(eVar, up5.e.v[17]), Boolean.FALSE).f(d0.m(Boolean.valueOf(z)));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
