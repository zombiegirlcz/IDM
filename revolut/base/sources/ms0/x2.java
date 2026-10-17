package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 extends w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208486a;

    public x2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f208486a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x2) && Intrinsics.f(this.f208486a, ((x2) obj2).f208486a);
    }

    public final int hashCode() {
        return this.f208486a.hashCode();
    }
}
