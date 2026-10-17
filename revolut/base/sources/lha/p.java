package lha;

import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f195224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f195225c;
    public final hha.o d;
    public final q e;
    public final PricingPlanCancelScreenConfig.Footer f;

    public p(String planId, List fees, dj0.d dVar, hha.o oVar, q qVar, PricingPlanCancelScreenConfig.Footer footer) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f195223a = planId;
        this.f195224b = fees;
        this.f195225c = dVar;
        this.d = oVar;
        this.e = qVar;
        this.f = footer;
    }

    public final qha.b a() {
        Object next;
        Iterator it8 = this.f195224b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            qha.d dVar = ((qha.b) next).f246574a;
            qha.d.Companion.getClass();
            if (Intrinsics.f(dVar, qha.d.f246581j)) {
                break;
            }
        }
        return (qha.b) next;
    }

    public final qha.b b() {
        Object next;
        Iterator it8 = this.f195224b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            qha.d dVar = ((qha.b) next).f246574a;
            qha.d.Companion.getClass();
            if (Intrinsics.f(dVar, qha.d.f246580h)) {
                break;
            }
        }
        return (qha.b) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f195223a, pVar.f195223a) && Intrinsics.f(this.f195224b, pVar.f195224b) && Intrinsics.f(this.f195225c, pVar.f195225c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f195223a.hashCode() * 31, 31, this.f195224b);
        dj0.d dVar = this.f195225c;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        hha.o oVar = this.d;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        q qVar = this.e;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        PricingPlanCancelScreenConfig.Footer footer = this.f;
        return iHashCode3 + (footer != null ? footer.f81172a.hashCode() : 0);
    }
}
