package a82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2005b;

    public g(List codes, long j2) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        this.f2004a = codes;
        this.f2005b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f2004a, gVar.f2004a) && this.f2005b == gVar.f2005b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2005b) + (this.f2004a.hashCode() * 31);
    }
}
