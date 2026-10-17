package up5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryBridgeFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendKompotFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationContract$Configuration;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements wp5.j, qp5.h, op5.j {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f281892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f281893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uj5.b f281894c;
    public final ang.f d;
    public final mre.c e;

    public g0(b presentationModel, ln.a navigationDispatcher, uj5.b restrictedActionNavigationProvider, ang.f userInteractor, mre.c termsNavigationFactory, lo5.p cryptoSendNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        this.f281892a = presentationModel;
        this.f281893b = navigationDispatcher;
        this.f281894c = restrictedActionNavigationProvider;
        this.d = userInteractor;
        this.e = termsNavigationFactory;
    }

    public final efm.d0 a() {
        efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(this.d.k(false), new h(27)), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final NaviCommand b(d dVar, xi0.b bVar, boolean z) {
        int i = f0.f281889a[dVar.ordinal()];
        b bVar2 = this.f281892a;
        if (i == 1) {
            wp5.p.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = wp5.e.f299116b;
            a0 a0Var = (a0) bVar2;
            String str = (String) ((od0.i) ((e) a0Var.f281852b).w0().get()).f224257a;
            if (str != null) {
                return new ActivityNavigateCommand(explicitActivityDestination, new CryptoWithdrawToAddressReviewContract$SendToConfig.MatchOrCreateAddressForCurrency((WithdrawFinishBehavior) ((e) a0Var.f281852b).F0().get(), str, bVar), null, null, 0, null, null, null, null, false, 1020);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 2) {
            qp5.j.Companion.getClass();
            return new ActivityNavigateCommand(qp5.c.f248258b, new CryptoWithdrawToAddressConfirmationContract$Configuration(z), null, null, 0, null, null, null, null, false, 1020);
        }
        if (i == 3) {
            return ((a0) bVar2).q3();
        }
        if (i == 4) {
            return new FinishCommand(null, null, null, 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final pfm.a c() {
        Object objF;
        int i = f0.f281889a[((d) ((e) ((a0) this.f281892a).f281852b).D0().get()).ordinal()];
        if (i == 1) {
            objF = te0.w.f(d.END_OF_FLOW_BACK);
        } else if (i != 2) {
            objF = rfm.h.f253943a;
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(objF, "empty(...)");
        } else {
            objF = te0.w.f(d.REVIEW);
        }
        pfm.a aVar = new pfm.a(new rfm.l(objF, new d0(1, new c0(this, 2)), 0), new d0(2, new c0(this, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a d(boolean z) {
        Object objF;
        int i = f0.f281889a[((d) ((e) ((a0) this.f281892a).f281852b).D0().get()).ordinal()];
        if (i == 1) {
            objF = te0.w.f(d.SUMMARY);
        } else if (i != 2) {
            objF = rfm.h.f253943a;
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(objF, "empty(...)");
        } else {
            objF = te0.w.f(d.END_OF_FLOW_NEXT);
        }
        pfm.a aVar = new pfm.a(new rfm.l(objF, new d0(5, new c0(this, 6)), 0), new j(new t9f.n(this, z, 8), 26), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        CryptoSendInput.BeneficiaryDetails input = new CryptoSendInput.BeneficiaryDetails(id10, 7787);
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f281893b.a(new FeatureCommand(new CryptoSendKompotFeatureConfig(null, new CryptoSendDestination(input), false, 7787, 0, 52)));
    }

    public final efm.b f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f281893b.a(new FeatureCommand(new FaqFeatureConfig.Starter(key, 2)));
    }

    public final efm.b g(String beneficiaryId, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "addressId");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        return this.f281893b.a(gc0.c.f(new CryptoAddBeneficiaryBridgeFeatureConfig(new CryptoAddBeneficiaryInput.SubmitRecipientDetails(z, beneficiaryId, 35))));
    }
}
