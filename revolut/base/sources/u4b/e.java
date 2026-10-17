package u4b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f277290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f277291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f277292c;
    public final d1h.g d;
    public final boolean e;
    public final boolean f;

    public e() {
        this(0L, 63);
    }

    public static e a(e eVar, Data data, long j2, Data data2, d1h.g gVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = eVar.f277290a;
        }
        Data availableToWithdraw = data;
        if ((i & 2) != 0) {
            j2 = eVar.f277291b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            data2 = eVar.f277292c;
        }
        Data validation = data2;
        if ((i & 8) != 0) {
            gVar = eVar.d;
        }
        d1h.g gVar2 = gVar;
        if ((i & 16) != 0) {
            z = eVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(validation, "validation");
        return new e(availableToWithdraw, j3, validation, gVar2, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f277290a, eVar.f277290a) && this.f277291b == eVar.f277291b && Intrinsics.f(this.f277292c, eVar.f277292c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f277292c, a0.d.c(this.f277290a.hashCode() * 31, 31, this.f277291b), 31);
        d1h.g gVar = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iC + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.e);
    }

    public e(Data availableToWithdraw, long j2, Data validation, d1h.g gVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.f277290a = availableToWithdraw;
        this.f277291b = j2;
        this.f277292c = validation;
        this.d = gVar;
        this.e = z;
        this.f = z3;
    }

    public /* synthetic */ e(long j2, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? 0L : j2, new Data(null, null, true, 3, null), null, false, false);
    }
}
