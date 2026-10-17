package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f232606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f232607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f232608c;
    public final e d;
    public final dj0.d e;
    public final dj0.d f;

    public b0(e eVar, e eVar2, dj0.d dVar, e eVar3, dj0.d dVar2, dj0.d totalAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f232606a = eVar;
        this.f232607b = eVar2;
        this.f232608c = dVar;
        this.d = eVar3;
        this.e = dVar2;
        this.f = totalAmount;
        if (dVar == null) {
            dj0.d.Companion.getClass();
            dj0.d.c(dj0.d.e, 0L, totalAmount.f115083b, 1);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f232606a, b0Var.f232606a) && Intrinsics.f(this.f232607b, b0Var.f232607b) && Intrinsics.f(this.f232608c, b0Var.f232608c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f);
    }

    public final int hashCode() {
        e eVar = this.f232606a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.f232607b;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        dj0.d dVar = this.f232608c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
