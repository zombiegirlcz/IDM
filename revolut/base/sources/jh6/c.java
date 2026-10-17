package jh6;

import jki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f174146a;

    public c() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f174146a == ((c) obj2).f174146a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174146a);
    }

    public c(boolean z) {
        this.f174146a = z;
    }
}
