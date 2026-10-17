package i4d;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158416c;
    public final int d;

    public a(int i, String assetTypeKey, String assetCode, long j2) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(assetCode, "assetCode");
        this.f158414a = assetTypeKey;
        this.f158415b = assetCode;
        this.f158416c = j2;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f158414a, aVar.f158414a) && Intrinsics.f(this.f158415b, aVar.f158415b) && this.f158416c == aVar.f158416c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + d.c(p.a.c(this.f158414a.hashCode() * 31, 31, this.f158415b), 31, this.f158416c);
    }
}
