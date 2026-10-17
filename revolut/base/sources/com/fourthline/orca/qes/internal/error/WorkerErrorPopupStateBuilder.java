package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.r10;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.v10;
import com.fourthline.orca.internal.yw;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb.a;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/WorkerErrorPopupStateBuilder;", "Lcom/fourthline/orca/internal/yw;", "Lcom/fourthline/orca/internal/re1;", "Lcom/fourthline/orca/internal/v10;", "imageServiceLocator", "<init>", "(Lcom/fourthline/orca/internal/v10;)V", "error", "Lcom/fourthline/orca/internal/zp0;", "buildStateFor", "(Lcom/fourthline/orca/internal/re1;)Lcom/fourthline/orca/internal/zp0;", "connectionLostErrorPopupState$delegate", "Lkotlin/Lazy;", "getConnectionLostErrorPopupState", "()Lcom/fourthline/orca/internal/zp0;", "connectionLostErrorPopupState", "recoverableErrorPopupState$delegate", "getRecoverableErrorPopupState", "recoverableErrorPopupState", "fatalErrorPopupState$delegate", "getFatalErrorPopupState", "fatalErrorPopupState", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkerErrorPopupStateBuilder implements yw {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: connectionLostErrorPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy connectionLostErrorPopupState;

    /* JADX INFO: renamed from: fatalErrorPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fatalErrorPopupState;

    /* JADX INFO: renamed from: recoverableErrorPopupState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recoverableErrorPopupState;

    public WorkerErrorPopupStateBuilder(@NotNull v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.connectionLostErrorPopupState = j.b(new a(imageServiceLocator, 4));
        this.recoverableErrorPopupState = j.b(new a(imageServiceLocator, 5));
        this.fatalErrorPopupState = j.b(new a(imageServiceLocator, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e connectionLostErrorPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_offline, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e fatalErrorPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
    }

    private final zp0 getConnectionLostErrorPopupState() {
        return (zp0) this.connectionLostErrorPopupState.getValue();
    }

    private final zp0 getFatalErrorPopupState() {
        return (zp0) this.fatalErrorPopupState.getValue();
    }

    private final zp0 getRecoverableErrorPopupState() {
        return (zp0) this.recoverableErrorPopupState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e recoverableErrorPopupState_delegate$lambda$0(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.yw
    @NotNull
    public zp0 buildStateFor(@NotNull re1 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof re1.a) {
            return getConnectionLostErrorPopupState();
        }
        if (error instanceof re1.c) {
            return getRecoverableErrorPopupState();
        }
        if (error instanceof re1.b) {
            return getFatalErrorPopupState();
        }
        throw new NoWhenBranchMatchedException();
    }
}
