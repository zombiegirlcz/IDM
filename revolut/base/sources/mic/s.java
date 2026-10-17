package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205678a;

    public s(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f205678a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f205678a, ((s) obj2).f205678a);
    }

    public final int hashCode() {
        return this.f205678a.hashCode();
    }
}
