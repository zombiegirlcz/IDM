package com.revolut.core.ui_kit.internal.views.floatingbottombar;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57066c;

    public e(boolean z, boolean z3, boolean z4) {
        this.f57064a = z;
        this.f57065b = z3;
        this.f57066c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f57064a == eVar.f57064a && this.f57065b == eVar.f57065b && this.f57066c == eVar.f57066c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57066c) + j6.a.c(Boolean.hashCode(this.f57064a) * 31, 31, this.f57065b);
    }
}
