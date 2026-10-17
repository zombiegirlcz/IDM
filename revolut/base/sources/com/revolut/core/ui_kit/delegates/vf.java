package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class vf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54881b;

    public vf(boolean z, boolean z3) {
        this.f54880a = z;
        this.f54881b = z3;
    }

    public final boolean a() {
        return this.f54880a;
    }

    public final boolean b() {
        return this.f54881b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj2;
        return this.f54880a == vfVar.f54880a && this.f54881b == vfVar.f54881b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54881b) + (Boolean.hashCode(this.f54880a) * 31);
    }
}
