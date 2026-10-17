package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f55486a;

    public r() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f55486a, ((r) obj2).f55486a);
    }

    public final int hashCode() {
        return this.f55486a.hashCode();
    }

    public r(int i) {
        AnimationRequest animationRequest = new AnimationRequest(false);
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        this.f55486a = animationRequest;
    }
}
