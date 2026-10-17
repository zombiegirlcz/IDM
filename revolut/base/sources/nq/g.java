package nq;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f218294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f218296c;

    public g(ByteBuffer bytes, String str, Integer num) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f218294a = bytes;
        this.f218295b = str;
        this.f218296c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f218294a, gVar.f218294a) && Intrinsics.f(this.f218295b, gVar.f218295b) && Intrinsics.f(this.f218296c, gVar.f218296c);
    }

    public final int hashCode() {
        int iHashCode = this.f218294a.hashCode() * 31;
        String str = this.f218295b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f218296c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
