package ojk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225843a;

    public u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f225843a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f225843a, ((u) obj2).f225843a);
    }

    public final int hashCode() {
        return this.f225843a.hashCode();
    }
}
