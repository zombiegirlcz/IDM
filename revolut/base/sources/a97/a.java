package a97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2364a;

    public a(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f2364a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f2364a, ((a) obj2).f2364a);
    }

    public final int hashCode() {
        return this.f2364a.hashCode();
    }
}
