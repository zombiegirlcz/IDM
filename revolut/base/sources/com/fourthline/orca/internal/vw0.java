package com.fourthline.orca.internal;

import com.fourthline.orca.internal.uw0;
import com.fourthline.orca.qes.internal.error.QesError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class vw0 implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fh0 f34468a;

    public vw0(fh0 orcaDestroyer) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        this.f34468a = orcaDestroyer;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, uw0 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (!(error instanceof uw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        retryBlock.invoke();
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, uw0 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (!(error instanceof uw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        fh0 fh0Var = this.f34468a;
        m.Companion companion = yhm.m.INSTANCE;
        fh0Var.a(yhm.o.a(QesError.Canceled.INSTANCE));
    }
}
