package wmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ffl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298669a;

    public c(String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f298669a = instrumentRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298669a, ((c) obj2).f298669a);
    }

    public final int hashCode() {
        return this.f298669a.hashCode();
    }

    @Override // ffl.a
    public final String i() {
        return this.f298669a;
    }
}
