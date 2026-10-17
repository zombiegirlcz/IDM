package mv3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f209135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f209136c;
    public final fu3.a d;

    public k(List credits, long j2, long j3, fu3.a aVar) {
        Intrinsics.checkNotNullParameter(credits, "credits");
        this.f209134a = credits;
        this.f209135b = j2;
        this.f209136c = j3;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f209134a, kVar.f209134a) && this.f209135b == kVar.f209135b && this.f209136c == kVar.f209136c && this.d == kVar.d;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(this.f209134a.hashCode() * 31, 31, this.f209135b), 31, this.f209136c);
        fu3.a aVar = this.d;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
