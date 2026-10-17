package s7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dii.g f260604a;

    public d0(dii.g result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f260604a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f260604a, ((d0) obj2).f260604a);
    }

    public final int hashCode() {
        return this.f260604a.hashCode() * 31;
    }
}
