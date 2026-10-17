package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.kh0;
import com.fourthline.orca.internal.kw;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.wr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesOrcaErrorHandler;", "Lcom/fourthline/orca/internal/kw;", "Lcom/fourthline/orca/internal/kh0;", "Lcom/fourthline/orca/internal/re1;", "workerErrorHandler", "Lcom/fourthline/orca/qes/internal/error/QesError;", "qesErrorHandler", "Lcom/fourthline/orca/internal/wr0;", "qesAgreementsErrorHandler", "<init>", "(Lcom/fourthline/orca/internal/kw;Lcom/fourthline/orca/internal/kw;Lcom/fourthline/orca/internal/kw;)V", "error", "", "source", "", "handleError", "(Lcom/fourthline/orca/internal/kh0;Ljava/lang/String;)V", "Lkotlin/Function0;", "onRetry", "handleRecoverableError", "(Lcom/fourthline/orca/internal/kh0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/fourthline/orca/internal/kw;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QesOrcaErrorHandler implements kw {
    public static final int $stable = 0;

    @NotNull
    private final kw qesAgreementsErrorHandler;

    @NotNull
    private final kw qesErrorHandler;

    @NotNull
    private final kw workerErrorHandler;

    public QesOrcaErrorHandler(@NotNull kw workerErrorHandler, @NotNull kw qesErrorHandler, @NotNull kw qesAgreementsErrorHandler) {
        Intrinsics.checkNotNullParameter(workerErrorHandler, "workerErrorHandler");
        Intrinsics.checkNotNullParameter(qesErrorHandler, "qesErrorHandler");
        Intrinsics.checkNotNullParameter(qesAgreementsErrorHandler, "qesAgreementsErrorHandler");
        this.workerErrorHandler = workerErrorHandler;
        this.qesErrorHandler = qesErrorHandler;
        this.qesAgreementsErrorHandler = qesAgreementsErrorHandler;
    }

    @Override // com.fourthline.orca.internal.kw
    public /* bridge */ /* synthetic */ void handleRecoverableError(Throwable th10, String str, Function0 function0) {
        handleRecoverableError((kh0) th10, str, (Function0<Unit>) function0);
    }

    @Override // com.fourthline.orca.internal.kw
    public void handleError(@NotNull kh0 error, @NotNull String source) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        if (error instanceof re1) {
            this.workerErrorHandler.handleError(error, source);
        } else if (error instanceof QesError) {
            this.qesErrorHandler.handleError(error, source);
        } else {
            if (!(error instanceof wr0)) {
                throw new IllegalStateException("FL Developer error. This handler does not expect any other error type");
            }
            this.qesAgreementsErrorHandler.handleError(error, source);
        }
    }

    public void handleRecoverableError(@NotNull kh0 error, @NotNull String source, @NotNull Function0<Unit> onRetry) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        if (error instanceof re1) {
            this.workerErrorHandler.handleRecoverableError(error, source, onRetry);
        } else if (error instanceof QesError) {
            this.qesErrorHandler.handleRecoverableError(error, source, onRetry);
        } else {
            if (!(error instanceof wr0)) {
                throw new IllegalStateException("FL Developer error. This handler does not expect any other error type");
            }
            this.qesAgreementsErrorHandler.handleRecoverableError(error, source, onRetry);
        }
    }
}
