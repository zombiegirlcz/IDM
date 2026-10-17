package u80;

import com.revolut.core.model.money.ScaleMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f278031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f278032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f278033c;
    public final boolean d;
    public final Long e;
    public final ScaleMode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f278034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f278035h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f278036j;
    public final Integer k;

    public f(dj0.d money, e signType, boolean z, boolean z3, ScaleMode scaleMode, boolean z4, boolean z6, boolean z11, Integer num, int i) {
        signType = (i & 2) != 0 ? e.UNSIGNED : signType;
        z = (i & 8) != 0 ? false : z;
        z3 = (i & 16) != 0 ? false : z3;
        Long l2 = (i & 32) != 0 ? null : 1L;
        scaleMode = (i & 64) != 0 ? null : scaleMode;
        z4 = (i & 128) != 0 ? false : z4;
        boolean z12 = (i & 256) == 0;
        z6 = (i & 512) != 0 ? false : z6;
        z11 = (i & 1024) != 0 ? false : z11;
        num = (i & 2048) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(signType, "signType");
        this.f278031a = money;
        this.f278032b = signType;
        this.f278033c = z;
        this.d = z3;
        this.e = l2;
        this.f = scaleMode;
        this.f278034g = z4;
        this.f278035h = z12;
        this.i = z6;
        this.f278036j = z11;
        this.k = num;
    }

    public final Long a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f278033c;
    }

    public final boolean d() {
        return this.i;
    }

    public final ScaleMode e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f278031a, fVar.f278031a) && this.f278032b == fVar.f278032b && this.f278033c == fVar.f278033c && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f278034g == fVar.f278034g && this.f278035h == fVar.f278035h && this.i == fVar.i && this.f278036j == fVar.f278036j && Intrinsics.f(this.k, fVar.k);
    }

    public final dj0.d f() {
        return this.f278031a;
    }

    public final boolean g() {
        return this.f278035h;
    }

    public final boolean h() {
        return this.f278036j;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c((this.f278032b.hashCode() + (this.f278031a.hashCode() * 31)) * 31, 31, false), 31, this.f278033c), 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        ScaleMode scaleMode = this.f;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (scaleMode == null ? 0 : scaleMode.hashCode())) * 31, 31, this.f278034g), 31, this.f278035h), 31, this.i), 31, this.f278036j);
        Integer num = this.k;
        return iC2 + (num != null ? num.hashCode() : 0);
    }

    public final e i() {
        return this.f278032b;
    }

    public final Integer j() {
        return this.k;
    }

    public final boolean k() {
        return this.f278034g;
    }
}
