package com.revolut.core.ui_kit.delegates.widgets;

/* JADX INFO: loaded from: classes19.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55346b;

    public /* synthetic */ e3(int i) {
        this(i, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return this.f55345a == e3Var.f55345a && this.f55346b == e3Var.f55346b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55346b) + (Integer.hashCode(this.f55345a) * 31);
    }

    public e3(int i, boolean z) {
        this.f55345a = i;
        this.f55346b = z;
    }
}
