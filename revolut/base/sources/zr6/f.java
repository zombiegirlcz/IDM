package zr6;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f324611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f324612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f324613c;
    public final g d;
    public final g e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f324614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f324615h;

    public f(e type, ArrayList rules) {
        Object obj2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f324611a = type;
        this.f324612b = rules;
        Iterator it8 = rules.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            g gVar = (g) next;
            c cVar = gVar.f324616a;
            if ((cVar != null ? Intrinsics.f(cVar.f324606a, Boolean.FALSE) : false) && gVar.f324616a.f324607b == h.DOMESTIC) {
                break;
            }
        }
        this.f324613c = (g) next;
        Iterator it9 = this.f324612b.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            g gVar2 = (g) next2;
            c cVar2 = gVar2.f324616a;
            if ((cVar2 != null ? Intrinsics.f(cVar2.f324606a, Boolean.FALSE) : false) && gVar2.f324616a.f324607b == h.REGIONAL) {
                break;
            }
        }
        this.d = (g) next2;
        Iterator it10 = this.f324612b.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            g gVar3 = (g) next3;
            c cVar3 = gVar3.f324616a;
            if ((cVar3 != null ? Intrinsics.f(cVar3.f324606a, Boolean.FALSE) : false) && gVar3.f324616a.f324607b == h.INTERNATIONAL) {
                break;
            }
        }
        this.e = (g) next3;
        Iterator it11 = this.f324612b.iterator();
        while (true) {
            if (!it11.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it11.next();
            g gVar4 = (g) next4;
            c cVar4 = gVar4.f324616a;
            if ((cVar4 != null ? Intrinsics.f(cVar4.f324606a, Boolean.TRUE) : false) && gVar4.f324616a.f324607b == h.DOMESTIC) {
                break;
            }
        }
        this.f = (g) next4;
        Iterator it12 = this.f324612b.iterator();
        while (true) {
            if (!it12.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it12.next();
            g gVar5 = (g) next5;
            c cVar5 = gVar5.f324616a;
            if ((cVar5 != null ? Intrinsics.f(cVar5.f324606a, Boolean.TRUE) : false) && gVar5.f324616a.f324607b == h.REGIONAL) {
                break;
            }
        }
        this.f324614g = (g) next5;
        Iterator it13 = this.f324612b.iterator();
        while (true) {
            if (!it13.hasNext()) {
                break;
            }
            Object next6 = it13.next();
            g gVar6 = (g) next6;
            c cVar6 = gVar6.f324616a;
            if ((cVar6 != null ? Intrinsics.f(cVar6.f324606a, Boolean.TRUE) : false) && gVar6.f324616a.f324607b == h.INTERNATIONAL) {
                obj2 = next6;
                break;
            }
        }
        this.f324615h = (g) obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f324611a == fVar.f324611a && this.f324612b.equals(fVar.f324612b);
    }

    public final int hashCode() {
        return this.f324612b.hashCode() + (this.f324611a.hashCode() * 31);
    }
}
