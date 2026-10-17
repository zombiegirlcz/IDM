package com.revolut.core.ui_kit.models;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58079a;

    public f0(int i) {
        this.f58079a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && this.f58079a == ((f0) obj2).f58079a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58079a);
    }
}
