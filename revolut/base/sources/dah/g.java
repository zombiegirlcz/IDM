package dah;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzg.a f112535a;

    public g(mzg.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f112535a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f112535a == ((g) obj2).f112535a;
    }

    public final int hashCode() {
        return this.f112535a.hashCode();
    }
}
