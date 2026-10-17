package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54219a;

    public gf(int i) {
        this.f54219a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gf) && this.f54219a == ((gf) obj2).f54219a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54219a);
    }
}
