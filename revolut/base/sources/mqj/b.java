package mqj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f208013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f208015c;

    public b(long j2, long j3, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f208013a = j2;
        this.f208014b = source;
        this.f208015c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f208013a == bVar.f208013a && Intrinsics.f(this.f208014b, bVar.f208014b) && this.f208015c == bVar.f208015c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f208015c) + p.a.c(Long.hashCode(this.f208013a) * 31, 31, this.f208014b);
    }
}
