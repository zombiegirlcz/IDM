package qha;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f246574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f246575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f246576c;
    public final e d;

    public b(d feeCode, dj0.d amount, dj0.d dVar, e eVar) {
        Intrinsics.checkNotNullParameter(feeCode, "feeCode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f246574a = feeCode;
        this.f246575b = amount;
        this.f246576c = dVar;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246574a, bVar.f246574a) && Intrinsics.f(this.f246575b, bVar.f246575b) && Intrinsics.f(this.f246576c, bVar.f246576c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f246574a.f246582a.hashCode() * 31, 31, this.f246575b);
        dj0.d dVar = this.f246576c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.d;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
