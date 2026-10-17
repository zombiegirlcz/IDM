package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.r10;
import com.fourthline.orca.internal.v10;
import com.fourthline.orca.internal.yw;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.qes.internal.error.QesError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.a;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0018\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesErrorPopupStateBuilder;", "Lcom/fourthline/orca/internal/yw;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/v10;", "imageServiceLocator", "<init>", "(Lcom/fourthline/orca/internal/v10;)V", "error", "Lcom/fourthline/orca/internal/zp0;", "buildStateFor", "(Lcom/fourthline/orca/qes/internal/error/QesError;)Lcom/fourthline/orca/internal/zp0;", "exitErrorPopupState$delegate", "Lkotlin/Lazy;", "getExitErrorPopupState", "()Lcom/fourthline/orca/internal/zp0;", "exitErrorPopupState", "tooManyAuthoriseAttemptPopupState$delegate", "getTooManyAuthoriseAttemptPopupState", "tooManyAuthoriseAttemptPopupState", "tooManySessionsPopupState$delegate", "getTooManySessionsPopupState", "tooManySessionsPopupState", "nonRecoverableErrorPopupState$delegate", "getNonRecoverableErrorPopupState", "nonRecoverableErrorPopupState", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QesErrorPopupStateBuilder implements yw {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: exitErrorPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy exitErrorPopupState;

    /* JADX INFO: renamed from: nonRecoverableErrorPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nonRecoverableErrorPopupState;

    /* JADX INFO: renamed from: tooManyAuthoriseAttemptPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tooManyAuthoriseAttemptPopupState;

    /* JADX INFO: renamed from: tooManySessionsPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tooManySessionsPopupState;

    public QesErrorPopupStateBuilder(@NotNull v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.exitErrorPopupState = j.b(new a(imageServiceLocator, 0));
        this.tooManyAuthoriseAttemptPopupState = j.b(new a(imageServiceLocator, 1));
        this.tooManySessionsPopupState = j.b(new a(imageServiceLocator, 2));
        this.nonRecoverableErrorPopupState = j.b(new a(imageServiceLocator, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e exitErrorPopupState_delegate$lambda$0(v10 v10Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(c81.a.a(aVar, R.string.shared_button_exit_qes, 0, 2, null)), new kd1.a(null, 1, null), true);
    }

    private final zp0 getExitErrorPopupState() {
        return (zp0) this.exitErrorPopupState.getValue();
    }

    private final zp0 getNonRecoverableErrorPopupState() {
        return (zp0) this.nonRecoverableErrorPopupState.getValue();
    }

    private final zp0 getTooManyAuthoriseAttemptPopupState() {
        return (zp0) this.tooManyAuthoriseAttemptPopupState.getValue();
    }

    private final zp0 getTooManySessionsPopupState() {
        return (zp0) this.tooManySessionsPopupState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e nonRecoverableErrorPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new kd1.f(null, 1, null), null, true, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e tooManyAuthoriseAttemptPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_too_many_attempts, 0, 2, null), new kd1.f(null, 1, null), null, true, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e tooManySessionsPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_qtsp_multi_session, 0, 2, null), new kd1.f(null, 1, null), null, true, 8, null);
    }

    @Override // com.fourthline.orca.internal.yw
    @NotNull
    public zp0 buildStateFor(@NotNull QesError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof QesError.Canceled) {
            return getExitErrorPopupState();
        }
        if ((error instanceof QesError.KycRequired) || (error instanceof QesError.Rejected) || (error instanceof QesError.InvalidSignature) || (error instanceof QesError.OperationNotAllowed) || (error instanceof QesError.TooManyResendOtpAttempts) || (error instanceof QesError.Unexpected)) {
            return getNonRecoverableErrorPopupState();
        }
        if (error instanceof QesError.TooManyAuthorizationAttempts) {
            return getTooManyAuthoriseAttemptPopupState();
        }
        if (error instanceof QesError.QtspInvalidSession) {
            return getTooManySessionsPopupState();
        }
        throw new NoWhenBranchMatchedException();
    }
}
