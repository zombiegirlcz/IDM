package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k9 extends NewRevolutCardDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f54374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NewRevolutCardDelegate.Model f54375b;

    public k9(AnimationRequest request, NewRevolutCardDelegate.Model previousModel) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(previousModel, "previousModel");
        this.f54374a = request;
        this.f54375b = previousModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj2;
        return Intrinsics.f(this.f54374a, k9Var.f54374a) && Intrinsics.f(this.f54375b, k9Var.f54375b);
    }

    public final int hashCode() {
        return this.f54375b.hashCode() + (this.f54374a.hashCode() * 31);
    }
}
