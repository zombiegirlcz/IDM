package se1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f262080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262082c;
    public final dj0.d d;
    public final TaxRate e;

    public d() {
        this(0);
    }

    public static d a(d dVar, dj0.d dVar2, String str, boolean z, dj0.d dVar3, TaxRate taxRate, int i) {
        if ((i & 1) != 0) {
            dVar2 = dVar.f262080a;
        }
        dj0.d amount = dVar2;
        if ((i & 2) != 0) {
            str = dVar.f262081b;
        }
        String description = str;
        if ((i & 4) != 0) {
            z = dVar.f262082c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            dVar3 = dVar.d;
        }
        dj0.d dVar4 = dVar3;
        if ((i & 16) != 0) {
            taxRate = dVar.e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        return new d(amount, description, z3, dVar4, taxRate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f262080a, dVar.f262080a) && Intrinsics.f(this.f262081b, dVar.f262081b) && this.f262082c == dVar.f262082c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f262080a.hashCode() * 31, 31, this.f262081b), 31, this.f262082c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        TaxRate taxRate = this.e;
        return iHashCode + (taxRate != null ? taxRate.hashCode() : 0);
    }

    public d(dj0.d amount, String description, boolean z, dj0.d dVar, TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f262080a = amount;
        this.f262081b = description;
        this.f262082c = z;
        this.d = dVar;
        this.e = taxRate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i) {
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.e;
        m70.a.c(t0.f186434a);
        this(dVar, "", false, null, null);
    }
}
