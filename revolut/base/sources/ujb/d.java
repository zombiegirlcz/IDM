package ujb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f280545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f280546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f280547c;
    public final dj0.d d;
    public final String e;
    public final String f;

    public /* synthetic */ d(int i, long j2, long j3, long j5, dj0.d dVar, String str, String str2) {
        if (63 != (i & 63)) {
            j1.f(b.f280543a.getDescriptor(), i, 63);
            throw null;
        }
        this.f280545a = j2;
        this.f280546b = j3;
        this.f280547c = j5;
        this.d = dVar;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f280545a == dVar.f280545a && this.f280546b == dVar.f280546b && this.f280547c == dVar.f280547c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c(a0.d.c(a0.d.c(Long.hashCode(this.f280545a) * 31, 31, this.f280546b), 31, this.f280547c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d(long j2, long j3, long j5, dj0.d amount, String status, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f280545a = j2;
        this.f280546b = j3;
        this.f280547c = j5;
        this.d = amount;
        this.e = status;
        this.f = str;
    }
}
