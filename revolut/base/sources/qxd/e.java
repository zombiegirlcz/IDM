package qxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f250073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f250074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f250075c;
    public final boolean d;

    public e(dj0.d amount, dj0.d dVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f250073a = amount;
        this.f250074b = dVar;
        this.f250075c = z;
        this.d = z3;
    }

    public static e a(e eVar, dj0.d amount, dj0.d dVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            amount = eVar.f250073a;
        }
        if ((i & 2) != 0) {
            dVar = eVar.f250074b;
        }
        if ((i & 4) != 0) {
            z = eVar.f250075c;
        }
        if ((i & 8) != 0) {
            z3 = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new e(amount, dVar, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f250073a, eVar.f250073a) && Intrinsics.f(this.f250074b, eVar.f250074b) && this.f250075c == eVar.f250075c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f250073a.hashCode() * 31;
        dj0.d dVar = this.f250074b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f250075c);
    }
}
