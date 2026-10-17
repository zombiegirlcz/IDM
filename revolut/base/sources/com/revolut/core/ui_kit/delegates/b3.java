package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f53706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53708c;

    public b3(int i, long j2, Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f53706a = title;
        this.f53707b = i;
        this.f53708c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f53706a, b3Var.f53706a) && this.f53707b == b3Var.f53707b && this.f53708c == b3Var.f53708c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53708c) + j6.a.b(this.f53707b, this.f53706a.hashCode() * 31, 31);
    }
}
