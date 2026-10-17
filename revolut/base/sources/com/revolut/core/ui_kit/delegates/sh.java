package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54720c;
    public final boolean d;
    public final boolean e;

    public sh(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f54718a = z;
        this.f54719b = z3;
        this.f54720c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj2;
        return this.f54718a == shVar.f54718a && this.f54719b == shVar.f54719b && this.f54720c == shVar.f54720c && this.d == shVar.d && this.e == shVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f54718a) * 31, 31, this.f54719b), 31, this.f54720c), 31, this.d);
    }
}
