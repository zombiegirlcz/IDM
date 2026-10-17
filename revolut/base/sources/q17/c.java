package q17;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241395a;

    public c(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f241395a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f241395a, ((c) obj2).f241395a);
    }

    public final int hashCode() {
        return this.f241395a.hashCode();
    }
}
