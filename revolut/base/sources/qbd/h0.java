package qbd;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(1)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f244188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f244190c;
    public final String d;

    public /* synthetic */ h0(int i, long j2, String str, a aVar, String str2) {
        if (15 != (i & 15)) {
            j1.f(f0.f244184a.getDescriptor(), i, 15);
            throw null;
        }
        this.f244188a = j2;
        this.f244189b = str;
        this.f244190c = aVar;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f244188a == h0Var.f244188a && Intrinsics.f(this.f244189b, h0Var.f244189b) && this.f244190c == h0Var.f244190c && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f244188a) * 31;
        String str = this.f244189b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f244190c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public h0(long j2, String str, a aVar, String str2) {
        this.f244188a = j2;
        this.f244189b = str;
        this.f244190c = aVar;
        this.d = str2;
    }
}
