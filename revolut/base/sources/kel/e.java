package kel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f183163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f183164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f183165c;
    public final List d;
    public final d e;

    public e(BigDecimal redeemable, BigDecimal redeemableWithFee, BigDecimal locked, ArrayList arrayList, d dVar) {
        Intrinsics.checkNotNullParameter(redeemable, "redeemable");
        Intrinsics.checkNotNullParameter(redeemableWithFee, "redeemableWithFee");
        Intrinsics.checkNotNullParameter(locked, "locked");
        this.f183163a = redeemable;
        this.f183164b = redeemableWithFee;
        this.f183165c = locked;
        this.d = arrayList;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f183163a, eVar.f183163a) && Intrinsics.f(this.f183164b, eVar.f183164b) && Intrinsics.f(this.f183165c, eVar.f183165c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f183165c, t61.a.d(this.f183164b, this.f183163a.hashCode() * 31, 31), 31);
        List list = this.d;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.e;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
