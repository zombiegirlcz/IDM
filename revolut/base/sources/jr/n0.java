package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f177807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f177809c;
    public final boolean d;
    public final String e;

    public /* synthetic */ n0(int i, long j2, int i2, Integer num, boolean z, String str) {
        if (11 != (i & 11)) {
            qlm.j1.f(l0.f177804a.getDescriptor(), i, 11);
            throw null;
        }
        this.f177807a = j2;
        this.f177808b = i2;
        if ((i & 4) == 0) {
            this.f177809c = null;
        } else {
            this.f177809c = num;
        }
        this.d = z;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f177807a == n0Var.f177807a && this.f177808b == n0Var.f177808b && Intrinsics.f(this.f177809c, n0Var.f177809c) && this.d == n0Var.d && Intrinsics.f(this.e, n0Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f177808b, Long.hashCode(this.f177807a) * 31, 31);
        Integer num = this.f177809c;
        int iC = j6.a.c((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
