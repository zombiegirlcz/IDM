package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ri implements si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54682a;

    public ri(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54682a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ri) && Intrinsics.f(this.f54682a, ((ri) obj2).f54682a);
    }

    public final int hashCode() {
        return this.f54682a.hashCode();
    }
}
