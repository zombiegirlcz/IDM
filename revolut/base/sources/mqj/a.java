package mqj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f208010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f208012c;

    public a(long j2, long j3, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f208010a = j2;
        this.f208011b = source;
        this.f208012c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f208010a == aVar.f208010a && Intrinsics.f(this.f208011b, aVar.f208011b) && this.f208012c == aVar.f208012c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f208012c) + p.a.c(Long.hashCode(this.f208010a) * 31, 31, this.f208011b);
    }
}
