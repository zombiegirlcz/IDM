package gp3;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp3.b f145229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f145231c;

    public c(kp3.b corporateEvent, List restructuredInstruments, BigDecimal userOwnership) {
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        this.f145229a = corporateEvent;
        this.f145230b = restructuredInstruments;
        this.f145231c = userOwnership;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145229a, cVar.f145229a) && Intrinsics.f(this.f145230b, cVar.f145230b) && Intrinsics.f(this.f145231c, cVar.f145231c);
    }

    public final int hashCode() {
        return this.f145231c.hashCode() + p.a.d(this.f145229a.hashCode() * 31, 31, this.f145230b);
    }
}
