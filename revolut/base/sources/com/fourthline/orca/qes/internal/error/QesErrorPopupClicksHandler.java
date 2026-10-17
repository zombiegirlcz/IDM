package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.fh0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.ww;
import com.fourthline.orca.qes.internal.error.QesError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesErrorPopupClicksHandler;", "Lcom/fourthline/orca/internal/ww;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/fh0;", "orcaDestroyer", "<init>", "(Lcom/fourthline/orca/internal/fh0;)V", "Lyhm/m;", "Lcom/fourthline/orca/internal/dj0;", "result", "", "finishOrca", "(Ljava/lang/Object;)V", "Lcom/fourthline/orca/internal/kd1;", "intent", "error", "", "source", "Lkotlin/Function0;", "retryBlock", "onPrimaryClicked", "(Lcom/fourthline/orca/internal/kd1;Lcom/fourthline/orca/qes/internal/error/QesError;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onSecondaryClicked", "Lcom/fourthline/orca/internal/fh0;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QesErrorPopupClicksHandler implements ww {
    public static final int $stable = 8;

    @NotNull
    private final fh0 orcaDestroyer;

    public QesErrorPopupClicksHandler(@NotNull fh0 orcaDestroyer) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        this.orcaDestroyer = orcaDestroyer;
    }

    private final void finishOrca(Object result) {
        this.orcaDestroyer.a(result);
    }

    @Override // com.fourthline.orca.internal.ww
    public /* bridge */ /* synthetic */ void onPrimaryClicked(kd1 kd1Var, Throwable th10, String str, Function0 function0) {
        onPrimaryClicked(kd1Var, (QesError) th10, str, (Function0<Unit>) function0);
    }

    @Override // com.fourthline.orca.internal.ww
    public /* bridge */ /* synthetic */ void onSecondaryClicked(kd1 kd1Var, Throwable th10, String str, Function0 function0) {
        onSecondaryClicked(kd1Var, (QesError) th10, str, (Function0<Unit>) function0);
    }

    public void onPrimaryClicked(@NotNull kd1 intent, @NotNull QesError error, @NotNull String source, @NotNull Function0<Unit> retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (!(error instanceof QesError.Canceled) && !(error instanceof QesError.KycRequired) && !(error instanceof QesError.Rejected) && !(error instanceof QesError.TooManyAuthorizationAttempts) && !(error instanceof QesError.TooManyResendOtpAttempts) && !(error instanceof QesError.InvalidSignature) && !(error instanceof QesError.OperationNotAllowed) && !(error instanceof QesError.Unexpected) && !(error instanceof QesError.QtspInvalidSession)) {
            throw new NoWhenBranchMatchedException();
        }
        m.Companion companion = m.INSTANCE;
        finishOrca(o.a(error));
    }

    public void onSecondaryClicked(@NotNull kd1 intent, @NotNull QesError error, @NotNull String source, @NotNull Function0<Unit> retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if ((error instanceof QesError.KycRequired) || (error instanceof QesError.Rejected) || (error instanceof QesError.TooManyAuthorizationAttempts) || (error instanceof QesError.TooManyResendOtpAttempts) || (error instanceof QesError.Unexpected) || (error instanceof QesError.InvalidSignature) || (error instanceof QesError.OperationNotAllowed) || (error instanceof QesError.QtspInvalidSession)) {
            m.Companion companion = m.INSTANCE;
            finishOrca(o.a(error));
        } else if (!(error instanceof QesError.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
