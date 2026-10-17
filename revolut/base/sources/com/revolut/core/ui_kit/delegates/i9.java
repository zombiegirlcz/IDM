package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i9 extends NewRevolutCardDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f54287a;

    public i9(AnimationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f54287a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i9) && Intrinsics.f(this.f54287a, ((i9) obj2).f54287a);
    }

    public final int hashCode() {
        return this.f54287a.hashCode();
    }
}
