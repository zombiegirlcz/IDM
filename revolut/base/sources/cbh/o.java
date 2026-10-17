package cbh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2f.g f22839a;

    public o(z2f.g wrappedParams) {
        Intrinsics.checkNotNullParameter(wrappedParams, "wrappedParams");
        this.f22839a = wrappedParams;
    }

    @Override // lk0.f
    public final int a() {
        return this.f22839a.c();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f22839a, ((o) obj2).f22839a);
    }

    public final int hashCode() {
        return this.f22839a.hashCode();
    }
}
