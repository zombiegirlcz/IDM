package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300855a;

    public b(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f300855a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f300855a, ((b) obj2).f300855a);
    }

    public final int hashCode() {
        return this.f300855a.hashCode();
    }
}
