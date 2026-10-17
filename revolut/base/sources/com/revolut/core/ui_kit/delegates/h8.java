package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54236b;

    public h8(int i, float f) {
        this.f54235a = i;
        this.f54236b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj2;
        return this.f54235a == h8Var.f54235a && Float.compare(this.f54236b, h8Var.f54236b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54236b) + (Integer.hashCode(this.f54235a) * 31);
    }
}
