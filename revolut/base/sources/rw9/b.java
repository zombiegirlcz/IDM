package rw9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257854a;

    public b(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f257854a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f257854a, ((b) obj2).f257854a);
    }

    public final int hashCode() {
        return this.f257854a.hashCode();
    }
}
