package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.z11;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hz0 implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f29451a;

    public hz0(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f29451a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, ui0 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (error instanceof ui0.c) {
            retryBlock.invoke();
        } else {
            if (!(error instanceof ui0.d)) {
                throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
            }
            this.f29451a.b(z11.a.d.f35490a);
        }
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, ui0 error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        if (!(error instanceof ui0.c) && !(error instanceof ui0.d)) {
            throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
        }
        this.f29451a.b(z11.a.C0320a.f35485a);
    }
}
