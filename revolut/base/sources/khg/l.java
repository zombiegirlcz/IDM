package khg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184131a;

    public l(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f184131a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f184131a, ((l) obj2).f184131a);
    }

    public final int hashCode() {
        return this.f184131a.hashCode();
    }
}
