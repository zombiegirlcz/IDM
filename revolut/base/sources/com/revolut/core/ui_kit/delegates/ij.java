package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54310c;

    public ij(boolean z, boolean z3, boolean z4) {
        this.f54308a = z;
        this.f54309b = z3;
        this.f54310c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj2;
        return this.f54308a == ijVar.f54308a && this.f54309b == ijVar.f54309b && this.f54310c == ijVar.f54310c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54310c) + j6.a.c(Boolean.hashCode(this.f54308a) * 31, 31, this.f54309b);
    }
}
