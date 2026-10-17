package ez3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130896a;

    public h(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f130896a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f130896a, ((h) obj2).f130896a);
    }

    public final int hashCode() {
        return this.f130896a.hashCode();
    }
}
