package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j9 extends NewRevolutCardDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f54325a;

    public j9(AnimationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f54325a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j9) && Intrinsics.f(this.f54325a, ((j9) obj2).f54325a);
    }

    public final int hashCode() {
        return this.f54325a.hashCode();
    }
}
