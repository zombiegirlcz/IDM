package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yb1 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f35252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f35253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f35254c;
    private final p70 d;
    private final int e;
    private final boolean f;

    public yb1(c81 title, c81 description, c81 hint, p70 lottieSource, int i, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        this.f35252a = title;
        this.f35253b = description;
        this.f35254c = hint;
        this.d = lottieSource;
        this.e = i;
        this.f = z;
    }

    public final c81 a() {
        return this.f35253b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yb1)) {
            return false;
        }
        yb1 yb1Var = (yb1) obj2;
        return Intrinsics.f(this.f35252a, yb1Var.f35252a) && Intrinsics.f(this.f35253b, yb1Var.f35253b) && Intrinsics.f(this.f35254c, yb1Var.f35254c) && Intrinsics.f(this.d, yb1Var.d) && this.e == yb1Var.e && this.f == yb1Var.f;
    }

    public final c81 getTitle() {
        return this.f35252a;
    }

    public int hashCode() {
        return (((((((((this.f35252a.hashCode() * 31) + this.f35253b.hashCode()) * 31) + this.f35254c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public final c81 n() {
        return this.f35254c;
    }

    public final p70 o() {
        return this.d;
    }

    public final int p() {
        return this.e;
    }

    public final boolean q() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f35252a + ", description=" + this.f35253b + ", hint=" + this.f35254c + ", lottieSource=" + this.d + ", progress=" + this.e + ", showProgress=" + this.f + ")";
    }
}
