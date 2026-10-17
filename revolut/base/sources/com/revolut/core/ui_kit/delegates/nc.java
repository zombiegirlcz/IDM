package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54508c;
    public final boolean d;

    public nc(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f54506a = z;
        this.f54507b = z3;
        this.f54508c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj2;
        return this.f54506a == ncVar.f54506a && this.f54507b == ncVar.f54507b && this.f54508c == ncVar.f54508c && this.d == ncVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f54506a) * 31, 31, this.f54507b), 31, this.f54508c);
    }
}
