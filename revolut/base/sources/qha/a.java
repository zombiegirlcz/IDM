package qha;

import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import hha.n;
import hha.o;
import iha.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f246565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f246566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f246567c;
    public final List d;
    public final dj0.d e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f246568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f246569h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PricingPlanCancelScreenConfig f246570j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f246571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f246572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f246573n;
    public final g o;

    public a(dj0.d dVar, o oVar, List fees, List taxes, dj0.d dVar2, DateTime dateTime, boolean z, w wVar, DateTime dateTime2, PricingPlanCancelScreenConfig pricingPlanCancelScreenConfig, ArrayList arrayList, String str, Boolean bool, ArrayList arrayList2, g gVar) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f246565a = dVar;
        this.f246566b = oVar;
        this.f246567c = fees;
        this.d = taxes;
        this.e = dVar2;
        this.f = dateTime;
        this.f246568g = z;
        this.f246569h = wVar;
        this.i = dateTime2;
        this.f246570j = pricingPlanCancelScreenConfig;
        this.k = arrayList;
        this.f246571l = str;
        this.f246572m = bool;
        this.f246573n = arrayList2;
        this.o = gVar;
    }

    public final b a() {
        Object next;
        Iterator it8 = this.f246567c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            d dVar = ((b) next).f246574a;
            d.Companion.getClass();
            if (Intrinsics.f(dVar, d.f246580h)) {
                break;
            }
        }
        return (b) next;
    }

    public final o b() {
        o oVar = this.f246566b;
        if (oVar != null) {
            return oVar;
        }
        dj0.d dVar = this.f246565a;
        if (dVar == null) {
            return null;
        }
        o.Companion.getClass();
        return n.a(dVar);
    }

    public final dj0.d c() {
        dj0.d dVarH;
        o oVarB = b();
        if (oVarB == null || (dVarH = oVarB.f152326a) == null) {
            dj0.d.Companion.getClass();
            dVarH = dj0.d.e;
        }
        Iterator it8 = this.f246567c.iterator();
        while (it8.hasNext()) {
            dVarH = pyd.c.H(dVarH, ((b) it8.next()).f246575b);
        }
        Iterator it9 = this.d.iterator();
        while (it9.hasNext()) {
            dVarH = pyd.c.H(dVarH, ((b) it9.next()).f246575b);
        }
        return dVarH;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246565a, aVar.f246565a) && Intrinsics.f(this.f246566b, aVar.f246566b) && Intrinsics.f(this.f246567c, aVar.f246567c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f246568g == aVar.f246568g && Intrinsics.f(this.f246569h, aVar.f246569h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f246570j, aVar.f246570j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f246571l, aVar.f246571l) && Intrinsics.f(this.f246572m, aVar.f246572m) && Intrinsics.f(this.f246573n, aVar.f246573n) && Intrinsics.f(this.o, aVar.o);
    }

    public final int hashCode() {
        dj0.d dVar = this.f246565a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        o oVar = this.f246566b;
        int iD = p.a.d(p.a.d((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.f246567c), 31, this.d);
        dj0.d dVar2 = this.e;
        int iHashCode2 = (iD + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        DateTime dateTime = this.f;
        int iC = j6.a.c((iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.f246568g);
        w wVar = this.f246569h;
        int iHashCode3 = (iC + (wVar == null ? 0 : wVar.f161358a.hashCode())) * 31;
        DateTime dateTime2 = this.i;
        int iHashCode4 = (iHashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        PricingPlanCancelScreenConfig pricingPlanCancelScreenConfig = this.f246570j;
        int iHashCode5 = (iHashCode4 + (pricingPlanCancelScreenConfig == null ? 0 : pricingPlanCancelScreenConfig.hashCode())) * 31;
        List list = this.k;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f246571l;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f246572m;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.f246573n;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        g gVar = this.o;
        return iHashCode9 + (gVar != null ? gVar.hashCode() : 0);
    }
}
