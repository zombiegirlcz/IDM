package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f54136b;

    public f(Clause text, e appearance) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.f54135a = text;
        this.f54136b = appearance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f54135a, fVar.f54135a) && this.f54136b == fVar.f54136b;
    }

    public final int hashCode() {
        return this.f54136b.hashCode() + (this.f54135a.hashCode() * 31);
    }
}
