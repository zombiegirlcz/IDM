package s77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f260539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260541c;
    public final Long d;
    public final String e;

    public /* synthetic */ g(int i, long j2, Long l2, String str, String str2, String str3) {
        if (31 != (i & 31)) {
            j1.f(e.f260538a.getDescriptor(), i, 31);
            throw null;
        }
        this.f260539a = j2;
        this.f260540b = str;
        this.f260541c = str2;
        this.d = l2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f260539a == gVar.f260539a && Intrinsics.f(this.f260540b, gVar.f260540b) && Intrinsics.f(this.f260541c, gVar.f260541c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Long.hashCode(this.f260539a) * 31, 31, this.f260540b), 31, this.f260541c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public g(long j2, Long l2, String updatedAt, String currency, String str) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f260539a = j2;
        this.f260540b = updatedAt;
        this.f260541c = currency;
        this.d = l2;
        this.e = str;
    }
}
