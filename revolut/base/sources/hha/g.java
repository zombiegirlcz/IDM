package hha;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f152306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f152307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f152308c;
    public final o d;
    public final f e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f152309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f152310h;

    public g(Period period, Period period2, dj0.d fee2, o oVar, f fVar, z zVar, dj0.d dVar, m mVar) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f152306a = period;
        this.f152307b = period2;
        this.f152308c = fee2;
        this.d = oVar;
        this.e = fVar;
        this.f = zVar;
        this.f152309g = dVar;
        this.f152310h = mVar;
    }

    public final o a(long j2) {
        Long l2;
        f fVar = null;
        f fVar2 = this.e;
        if (fVar2 != null && ((l2 = fVar2.f152303b) == null || l2.longValue() > j2)) {
            fVar = fVar2;
        }
        if (fVar == null) {
            o oVar = this.d;
            if (oVar != null) {
                return oVar;
            }
            o.Companion.getClass();
            return n.a(this.f152308c);
        }
        o oVar2 = fVar.d;
        if (oVar2 != null) {
            return oVar2;
        }
        n nVar = o.Companion;
        dj0.d dVar = fVar.f152304c;
        nVar.getClass();
        return n.a(dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f152306a, gVar.f152306a) && Intrinsics.f(this.f152307b, gVar.f152307b) && Intrinsics.f(this.f152308c, gVar.f152308c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f152309g, gVar.f152309g) && Intrinsics.f(this.f152310h, gVar.f152310h);
    }

    public final int hashCode() {
        int iHashCode = this.f152306a.hashCode() * 31;
        Period period = this.f152307b;
        int iC = v7.c((iHashCode + (period == null ? 0 : period.hashCode())) * 31, 31, this.f152308c);
        o oVar = this.d;
        int iHashCode2 = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
        f fVar = this.e;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        z zVar = this.f;
        int iHashCode4 = (iHashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        dj0.d dVar = this.f152309g;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f152310h;
        return iHashCode5 + (mVar != null ? mVar.hashCode() : 0);
    }
}
