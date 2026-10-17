package com.revolut.core.ui_kit.delegates.widgets;

/* JADX INFO: loaded from: classes19.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55362b;

    public g4(int i, boolean z) {
        this.f55361a = i;
        this.f55362b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj2;
        return this.f55361a == g4Var.f55361a && this.f55362b == g4Var.f55362b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55362b) + (Integer.hashCode(this.f55361a) * 31);
    }
}
