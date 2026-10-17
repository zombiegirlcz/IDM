package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54662a;

    public rc(boolean z) {
        this.f54662a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof rc) && this.f54662a == ((rc) obj2).f54662a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54662a);
    }
}
