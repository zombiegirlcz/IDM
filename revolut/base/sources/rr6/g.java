package rr6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f256706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f256707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f256708c;
    public final c d;

    public g(f currentCycle, a config) {
        Double dValueOf;
        c cVar;
        Intrinsics.checkNotNullParameter(currentCycle, "currentCycle");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f256706a = currentCycle;
        this.f256707b = config;
        Iterator it8 = config.f256696a.iterator();
        if (it8.hasNext()) {
            double dMax = ((i) it8.next()).f256712b;
            while (it8.hasNext()) {
                dMax = Math.max(dMax, ((i) it8.next()).f256712b);
            }
            dValueOf = Double.valueOf(dMax);
        } else {
            dValueOf = null;
        }
        this.f256708c = dValueOf;
        f fVar = this.f256706a;
        d dVar = fVar.f256704a;
        e eVar = fVar.f256705b;
        i iVar = eVar.f256701a;
        double d = eVar.f256702b;
        if (dVar == null && d == 0.0d) {
            cVar = c.FIRST_TIME_USER;
        } else if (dVar == null && d > 0.0d) {
            cVar = c.LOCKED;
        } else if (dVar == null || dVar.f256699a.f256711a >= iVar.f256711a) {
            cVar = ((dVar != null ? dVar.f256699a.f256711a : 0) < iVar.f256711a || d >= 1.0d) ? d == 1.0d ? c.MAXED : c.UNKNOWN : c.REGAIN_REQUIRED;
        } else {
            cVar = c.UNLOCKED;
        }
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f256706a, gVar.f256706a) && Intrinsics.f(this.f256707b, gVar.f256707b);
    }

    public final int hashCode() {
        return this.f256707b.hashCode() + (this.f256706a.hashCode() * 31);
    }
}
