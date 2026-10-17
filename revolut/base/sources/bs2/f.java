package bs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18029a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f18029a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f18029a, ((f) obj2).f18029a);
    }

    public final int hashCode() {
        return this.f18029a.hashCode();
    }
}
