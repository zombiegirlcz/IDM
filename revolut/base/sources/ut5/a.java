package ut5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f283018b;

    public a(String code, long j2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f283017a = code;
        this.f283018b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283017a, aVar.f283017a) && this.f283018b == aVar.f283018b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f283018b) + (this.f283017a.hashCode() * 31);
    }
}
