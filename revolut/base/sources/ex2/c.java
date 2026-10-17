package ex2;

import com.revolut.feature.card_contactless_limit.api.Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f130337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mode f130338c;
    public final int d;
    public final boolean e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f130339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f130340h;
    public final boolean i;

    public c(boolean z, f fVar, Mode mode, int i, boolean z3, Integer num, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f130336a = z;
        this.f130337b = fVar;
        this.f130338c = mode;
        this.d = i;
        this.e = z3;
        this.f = num;
        this.f130339g = z4;
        this.f130340h = z6;
        this.i = z11;
    }

    public static c a(c cVar, boolean z, f fVar, int i) {
        if ((i & 1) != 0) {
            z = cVar.f130336a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            fVar = cVar.f130337b;
        }
        Mode mode = cVar.f130338c;
        int i2 = cVar.d;
        boolean z4 = cVar.e;
        Integer num = cVar.f;
        boolean z6 = cVar.f130339g;
        boolean z11 = cVar.f130340h;
        boolean z12 = cVar.i;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new c(z3, fVar, mode, i2, z4, num, z6, z11, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f130336a == cVar.f130336a && Intrinsics.f(this.f130337b, cVar.f130337b) && Intrinsics.f(this.f130338c, cVar.f130338c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && this.f130339g == cVar.f130339g && this.f130340h == cVar.f130340h && this.i == cVar.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f130336a) * 31;
        f fVar = this.f130337b;
        int iC = j6.a.c(j6.a.b(this.d, (this.f130338c.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31, 31), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c((iC + (num != null ? num.hashCode() : 0)) * 31, 31, this.f130339g), 31, this.f130340h);
    }
}
