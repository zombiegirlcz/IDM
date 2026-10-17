package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54124c;

    public ee(boolean z, boolean z3, boolean z4) {
        this.f54122a = z;
        this.f54123b = z3;
        this.f54124c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj2;
        return this.f54122a == eeVar.f54122a && this.f54123b == eeVar.f54123b && this.f54124c == eeVar.f54124c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54124c) + j6.a.c(Boolean.hashCode(this.f54122a) * 31, 31, this.f54123b);
    }
}
