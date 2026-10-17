package xa9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f303782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303783b;

    public a(long j2, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f303782a = j2;
        this.f303783b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f303782a == aVar.f303782a && Intrinsics.f(this.f303783b, aVar.f303783b);
    }

    public final int hashCode() {
        return this.f303783b.hashCode() + (Long.hashCode(this.f303782a) * 31);
    }
}
