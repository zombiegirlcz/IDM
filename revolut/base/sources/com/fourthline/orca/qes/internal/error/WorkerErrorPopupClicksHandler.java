package com.fourthline.orca.qes.internal.error;

import com.fourthline.orca.internal.fh0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.kt0;
import com.fourthline.orca.internal.re1;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/WorkerErrorPopupClicksHandler;", "Lcom/fourthline/orca/internal/ww;", "Lcom/fourthline/orca/internal/re1;", "Lcom/fourthline/orca/internal/fh0;", "orcaDestroyer", "Lcom/fourthline/orca/internal/kt0;", "qesFlowDataBundle", "<init>", "(Lcom/fourthline/orca/internal/fh0;Lcom/fourthline/orca/internal/kt0;)V", "Lyhm/m;", "Lcom/fourthline/orca/internal/dj0;", "result", "", "finishOrca", "(Ljava/lang/Object;)V", "Lcom/fourthline/orca/internal/kd1;", "intent", "error", "", "source", "Lkotlin/Function0;", "retryBlock", "onPrimaryClicked", "(Lcom/fourthline/orca/internal/kd1;Lcom/fourthline/orca/internal/re1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onSecondaryClicked", "Lcom/fourthline/orca/internal/fh0;", "Lcom/fourthline/orca/internal/kt0;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkerErrorPopupClicksHandler implements ww {
    public static final int $stable = 8;

    @NotNull
    private final fh0 orcaDestroyer;

    @NotNull
    private final kt0 qesFlowDataBundle;

    public WorkerErrorPopupClicksHandler(@NotNull fh0 orcaDestroyer, @NotNull kt0 qesFlowDataBundle) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(qesFlowDataBundle, "qesFlowDataBundle");
        this.orcaDestroyer = orcaDestroyer;
        this.qesFlowDataBundle = qesFlowDataBundle;
    }

    private final void finishOrca(Object result) {
        this.orcaDestroyer.a(result);
    }

    @Override // com.fourthline.orca.internal.ww
    public /* bridge */ /* synthetic */ void onPrimaryClicked(kd1 kd1Var, Throwable th10, String str, Function0 function0) {
        onPrimaryClicked(kd1Var, (re1) th10, str, (Function0<Unit>) function0);
    }

    @Override // com.fourthline.orca.internal.ww
    public /* bridge */ /* synthetic */ void onSecondaryClicked(kd1 kd1Var, Throwable th10, String str, Function0 function0) {
        onSecondaryClicked(kd1Var, (re1) th10, str, (Function0<Unit>) function0);
    }

    public void onPrimaryClicked(@NotNull kd1 intent, @NotNull re1 error, @NotNull String source, @NotNull Function0<Unit> retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if ((error instanceof re1.a) || (error instanceof re1.c)) {
            retryBlock.invoke();
        } else {
            if (!(error instanceof re1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m.Companion companion = m.INSTANCE;
            finishOrca(o.a(QesError.Unexpected.Companion.create$default(QesError.Unexpected.INSTANCE, ((re1.b) error).getMessage(), null, 2, null)));
        }
    }

    public void onSecondaryClicked(@NotNull kd1 intent, @NotNull re1 error, @NotNull String source, @NotNull Function0<Unit> retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if ((error instanceof re1.a) || (error instanceof re1.c)) {
            m.Companion companion = m.INSTANCE;
            finishOrca(o.a(QesError.Canceled.INSTANCE));
        } else if (!(error instanceof re1.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
