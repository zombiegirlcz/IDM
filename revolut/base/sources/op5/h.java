package op5;

import android.os.Parcelable;
import com.google.firebase.messaging.t;
import com.revolut.feature.crypto.withdraw.impl.ui.recipientdetails.SubmitRecipientDetailsActionHandler$FinalAction;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import up5.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements mm.b, g3l.d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f227526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm.g f227527b;

    public h(j router, g3l.a statusConfigurationDispatcher, ap5.b cryptoWithdrawInteractor, t actionFactory, bq5.c cryptoCreateBeneficiaryDialogProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(statusConfigurationDispatcher, "statusConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
        this.f227526a = router;
        this.f227527b = actionFactory.f(new o0(this, 11));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        if (aVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "action");
        return this.f227527b.a(null);
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        efm.f fVarC;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof k3l.g) {
            StatusViewConfiguration statusViewConfiguration = ((k3l.g) result).f180817a;
            if (Intrinsics.f(statusViewConfiguration.getF104385a(), "SUBMIT_RECIPIENT_DETAILS_SUCCESS_STATUS_VIEW_ID")) {
                Parcelable f = statusViewConfiguration.getF();
                Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui.recipientdetails.SubmitRecipientDetailsActionHandler.FinalAction");
                int i = g.f227525a[((SubmitRecipientDetailsActionHandler$FinalAction) f).ordinal()];
                if (i == 1) {
                    fVarC = ((g0) this.f227526a).c();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVarC = m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(fVarC, "complete(...)");
                }
                efm.b bVarJ = efm.b.j(fVarC);
                Intrinsics.checkNotNullExpressionValue(bVarJ, "concatArray(...)");
                return bVarJ.D(Boolean.TRUE);
            }
        }
        return d0.m(Boolean.FALSE);
    }
}
