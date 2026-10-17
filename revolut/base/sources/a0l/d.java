package a0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xel.f f430a;

    public d(xel.f documentValue) {
        Intrinsics.checkNotNullParameter(documentValue, "documentValue");
        this.f430a = documentValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f430a, ((d) obj2).f430a);
    }

    public final int hashCode() {
        return this.f430a.hashCode();
    }
}
