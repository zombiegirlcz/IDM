package hha;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f152339a = yhm.j.b(new hf7.d(4));

    public static final boolean a(d dVar, u... featuresForCheck) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(featuresForCheck, "featuresForCheck");
        List<x> list = dVar.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (x xVar : list) {
            u uVar = xVar.f152369a;
            if (xVar.f152370b == y.ENABLED && kotlin.collections.d.I(featuresForCheck, uVar)) {
                return true;
            }
        }
        return false;
    }

    public static final d b(List list, w0 tier) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Object obj2 = null;
        switch (r.f152335a[tier.ordinal()]) {
            case 1:
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        d dVar = (d) next;
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        if (kotlin.text.a0.z(dVar.f152288b, "ESSENTIALS", true)) {
                            obj2 = next;
                        }
                    }
                }
                return (d) obj2;
            case 2:
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (((d) next2).f152296p) {
                            obj2 = next2;
                        }
                    }
                }
                return (d) obj2;
            case 3:
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next3 = it10.next();
                        if (m((d) next3)) {
                            obj2 = next3;
                        }
                    }
                }
                return (d) obj2;
            case 4:
                Iterator it11 = list.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next4 = it11.next();
                        if (n((d) next4)) {
                            obj2 = next4;
                        }
                    }
                }
                return (d) obj2;
            case 5:
                Iterator it12 = list.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next5 = it12.next();
                        if (j((d) next5)) {
                            obj2 = next5;
                        }
                    }
                }
                return (d) obj2;
            case 6:
                Iterator it13 = list.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next6 = it13.next();
                        if (p((d) next6)) {
                            obj2 = next6;
                        }
                    }
                }
                return (d) obj2;
            case 7:
                Iterator it14 = list.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        Object next7 = it14.next();
                        if (o((d) next7)) {
                            obj2 = next7;
                        }
                    }
                }
                return (d) obj2;
            case 8:
                Iterator it15 = list.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next8 = it15.next();
                        d dVar2 = (d) next8;
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        if (kotlin.text.a0.z(dVar2.f152289c, "BASIC", true)) {
                            obj2 = next8;
                        }
                    }
                }
                return (d) obj2;
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final o c(PricingPlanSubscription pricingPlanSubscription) {
        Object next;
        Intrinsics.checkNotNullParameter(pricingPlanSubscription, "<this>");
        g gVar = pricingPlanSubscription.f81133h;
        if (gVar == null) {
            Iterator it8 = pricingPlanSubscription.f81129a.f152291h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((g) next).f152306a, pricingPlanSubscription.d)) {
                    break;
                }
            }
            gVar = (g) next;
        }
        if (gVar == null) {
            return null;
        }
        o oVar = gVar.d;
        if (oVar != null) {
            return oVar;
        }
        n nVar = o.Companion;
        dj0.d dVar = gVar.f152308c;
        nVar.getClass();
        return n.a(dVar);
    }

    public static final oha.a d(d dVar) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it8 = dVar.i.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String str = ((oha.a) next).f225324a.f225329a;
            oha.c.Companion.getClass();
            if (Intrinsics.f(str, oha.c.f225328b.f225329a)) {
                break;
            }
        }
        return (oha.a) next;
    }

    public static final w0 e(String displayCode) {
        Intrinsics.checkNotNullParameter(displayCode, "displayCode");
        return kotlin.text.a0.z(displayCode, "BASIC", true) ? w0.BASIC : kotlin.text.a0.z(displayCode, "ESSENTIALS", true) ? w0.ESSENTIAL : kotlin.text.a0.z(displayCode, "STANDARD", true) ? w0.STANDARD : kotlin.text.a0.z(displayCode, "PLUS", true) ? w0.PLUS : kotlin.text.a0.z(displayCode, "PREMIUM", true) ? w0.PREMIUM : kotlin.text.a0.z(displayCode, "METAL", true) ? w0.METAL : kotlin.text.a0.z(displayCode, "ULTRA", true) ? w0.ULTRA : kotlin.text.a0.z(displayCode, "PRIVATE", true) ? w0.PRIVATE : w0.UNKNOWN;
    }

    public static final w0 f(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.f152296p) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return kotlin.text.a0.z(dVar.f152288b, "ESSENTIALS", true) ? w0.ESSENTIAL : w0.STANDARD;
        }
        u.Companion.getClass();
        if (h(dVar, u.u)) {
            return w0.PLUS;
        }
        if (h(dVar, u.f152362t)) {
            return w0.PREMIUM;
        }
        if (h(dVar, u.f152361s)) {
            return w0.METAL;
        }
        if (h(dVar, u.f152360r)) {
            return w0.ULTRA;
        }
        if (h(dVar, u.f152359q)) {
            return w0.PRIVATE;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return kotlin.text.a0.z(dVar.f152289c, "BASIC", true) ? w0.BASIC : w0.UNKNOWN;
    }

    public static final boolean g(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (i(dVar)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        u.Companion.getClass();
        return h(dVar, u.f152350h0);
    }

    public static final boolean h(d dVar, u feature) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<x> list = dVar.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (x xVar : list) {
            u uVar = xVar.f152369a;
            y yVar = xVar.f152370b;
            if (Intrinsics.f(uVar, feature) && yVar == y.ENABLED) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        u.Companion.getClass();
        return h(dVar, u.l0);
    }

    public static final boolean j(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f(dVar) == w0.METAL;
    }

    public static final boolean k(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f152291h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((g) it8.next()).f152308c.f115082a > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return n(dVar) || j(dVar) || m(dVar) || p(dVar) || o(dVar);
    }

    public static final boolean m(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f(dVar) == w0.PLUS;
    }

    public static final boolean n(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f(dVar) == w0.PREMIUM;
    }

    public static final boolean o(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f(dVar) == w0.PRIVATE;
    }

    public static final boolean p(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f(dVar) == w0.ULTRA;
    }
}
