package com.revolut.core.ui_kit.internal.views;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56514c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public b(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f56512a = z;
        this.f56513b = z3;
        this.f56514c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f56512a == bVar.f56512a && this.f56513b == bVar.f56513b && this.f56514c == bVar.f56514c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f56512a) * 31, 31, this.f56513b), 31, this.f56514c), 31, this.d), 31, this.e);
    }
}
