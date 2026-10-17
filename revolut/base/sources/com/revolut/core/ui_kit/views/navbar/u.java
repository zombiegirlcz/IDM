package com.revolut.core.ui_kit.views.navbar;

/* JADX INFO: loaded from: classes20.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59550a;

    public u(boolean z) {
        this.f59550a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f59550a == ((u) obj2).f59550a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59550a);
    }
}
