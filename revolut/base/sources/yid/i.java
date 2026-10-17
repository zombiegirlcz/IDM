package yid;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f314308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f314309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f314310c;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data carousel, boolean z, long j2, int i) {
        if ((i & 1) != 0) {
            carousel = iVar.f314308a;
        }
        if ((i & 2) != 0) {
            z = iVar.f314309b;
        }
        if ((i & 4) != 0) {
            j2 = iVar.f314310c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        return new i(j2, carousel, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f314308a, iVar.f314308a) && this.f314309b == iVar.f314309b && this.f314310c == iVar.f314310c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f314310c) + j6.a.c(this.f314308a.hashCode() * 31, 31, this.f314309b);
    }

    public i(long j2, Data carousel, boolean z) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        this.f314308a = carousel;
        this.f314309b = z;
        this.f314310c = j2;
    }

    public /* synthetic */ i(int i) {
        this(0L, new Data(null, null, true, 3, null), false);
    }
}
