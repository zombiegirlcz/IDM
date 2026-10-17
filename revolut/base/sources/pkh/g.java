package pkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237185a;

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f237185a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f237185a, ((g) obj2).f237185a);
    }

    public final int hashCode() {
        return this.f237185a.hashCode();
    }
}
