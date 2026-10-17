package gul;

import java.util.Iterator;
import java.util.List;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {
    public static zsl.k a(List validationErrors, r0 orderType) {
        Object next;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        ksj.b.v(validationErrors);
        List list = validationErrors;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof zsl.m) {
                break;
            }
        }
        if (!(next instanceof zsl.m)) {
            next = null;
        }
        zsl.m mVar = (zsl.m) next;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (next2 instanceof zsl.n) {
                break;
            }
        }
        if (!(next2 instanceof zsl.n)) {
            next2 = null;
        }
        zsl.n nVar = (zsl.n) next2;
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (next3 instanceof zsl.w) {
                break;
            }
        }
        if (!(next3 instanceof zsl.w)) {
            next3 = null;
        }
        zsl.w wVar = (zsl.w) next3;
        if (mVar != null) {
            return new zsl.a(mVar.f324973b, mVar.f324974c, mVar.d, mVar.e);
        }
        if (nVar != null) {
            return new zsl.b(nVar.f324975b, nVar.f324976c, nVar.d, nVar.e);
        }
        if (wVar != null) {
            return new zsl.f(wVar.f324989c, wVar.f324988b);
        }
        return null;
    }

    public static zsl.k b(List validationErrors) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        ksj.b.v(validationErrors);
        List list = validationErrors;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof zsl.q) {
                break;
            }
        }
        if (!(next instanceof zsl.q)) {
            next = null;
        }
        zsl.q qVar = (zsl.q) next;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (next2 instanceof zsl.p) {
                break;
            }
        }
        if (!(next2 instanceof zsl.p)) {
            next2 = null;
        }
        zsl.p pVar = (zsl.p) next2;
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (next3 instanceof zsl.v) {
                break;
            }
        }
        if (!(next3 instanceof zsl.v)) {
            next3 = null;
        }
        zsl.v vVar = (zsl.v) next3;
        Iterator it11 = list.iterator();
        while (true) {
            if (!it11.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it11.next();
            if (next4 instanceof zsl.l) {
                break;
            }
        }
        if (!(next4 instanceof zsl.l)) {
            next4 = null;
        }
        zsl.l lVar = (zsl.l) next4;
        Iterator it12 = list.iterator();
        while (true) {
            if (!it12.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it12.next();
            if (next5 instanceof zsl.s) {
                break;
            }
        }
        if (!(next5 instanceof zsl.s)) {
            next5 = null;
        }
        zsl.s sVar = (zsl.s) next5;
        Iterator it13 = list.iterator();
        while (true) {
            if (!it13.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it13.next();
            if (next6 instanceof zsl.r) {
                break;
            }
        }
        if (!(next6 instanceof zsl.r)) {
            next6 = null;
        }
        zsl.r rVar = (zsl.r) next6;
        Iterator it14 = list.iterator();
        while (true) {
            if (!it14.hasNext()) {
                next7 = null;
                break;
            }
            next7 = it14.next();
            if (next7 instanceof zsl.t) {
                break;
            }
        }
        if (!(next7 instanceof zsl.t)) {
            next7 = null;
        }
        zsl.t tVar = (zsl.t) next7;
        if (qVar != null) {
            return new zsl.d(qVar.f324980b, qVar.f324981c, qVar.d);
        }
        if (pVar != null) {
            return new zsl.c(pVar.f324978b, pVar.f324979c, pVar.d);
        }
        if (vVar != null) {
            return zsl.j.f324971a;
        }
        if (lVar != null) {
            return zsl.g.f324968a;
        }
        if (rVar != null) {
            return zsl.h.f324969a;
        }
        if (sVar != null) {
            return zsl.i.f324970a;
        }
        if (tVar == null) {
            return null;
        }
        return new zsl.e(tVar.f324984b, tVar.f324985c, tVar.d);
    }
}
