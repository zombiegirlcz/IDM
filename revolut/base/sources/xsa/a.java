package xsa;

import aii.e;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f308440a;

    public a() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f308440a == ((a) obj2).f308440a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f308440a);
    }

    public a(boolean z) {
        this.f308440a = z;
    }
}
