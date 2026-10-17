package k1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180265a;

    public h(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f180265a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f180265a, ((h) obj2).f180265a);
    }

    public final int hashCode() {
        return this.f180265a.hashCode();
    }
}
