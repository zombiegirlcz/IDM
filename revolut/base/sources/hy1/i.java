package hy1;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156651a;

    public /* synthetic */ i(int i) {
        this.f156651a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f156651a) {
            case 0:
                tx1.j it8 = (tx1.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return tx1.k.a(it8);
            case 1:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ux1.i.b(it9);
            case 2:
                ux1.h it10 = (ux1.h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ux1.i.a(it10);
            case 3:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return vx1.h.b(it11);
            case 4:
                vx1.g it12 = (vx1.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return vx1.h.a(it12);
            case 5:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return xx1.h.b(it13);
            case 6:
                xx1.g it14 = (xx1.g) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return xx1.h.a(it14);
            case 7:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zx1.j.b(it15);
            case 8:
                zx1.i it16 = (zx1.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zx1.j.a(it16);
            case 9:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return ay1.j.b(it17);
            case 10:
                ay1.i it18 = (ay1.i) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return ay1.j.a(it18);
            case 11:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return by1.i.b(it19);
            case 12:
                by1.h it20 = (by1.h) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return by1.i.a(it20);
            case 13:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return cy1.i.b(it21);
            case 14:
                cy1.h it22 = (cy1.h) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return cy1.i.a(it22);
            case 15:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return dy1.i.b(it23);
            case 16:
                dy1.h it24 = (dy1.h) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return dy1.i.a(it24);
            case 17:
                List it25 = (List) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return hy2.f.f(null, it25);
            case 18:
                List it26 = (List) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return hy2.f.f(null, it26);
            case 19:
                List it27 = (List) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return hy2.f.f(null, it27);
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                e93.f fVar = (e93.f) pair.f186386b;
                return new e93.r(fVar.l(), hy2.f.f(fVar, (List) obj3));
            case 21:
                Data it28 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return Boolean.valueOf(!it28.getLoading());
            case 22:
                Data it29 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return Boolean.valueOf(!it29.getLoading());
            case 23:
                List it30 = (List) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : it30) {
                    if (obj4 instanceof e93.d) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 24:
                e93.d design = (e93.d) obj2;
                Intrinsics.checkNotNullParameter(design, "design");
                od0.i.Companion.getClass();
                return od0.h.a(design);
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 26:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                od0.h hVar = od0.i.Companion;
                Iterator it31 = list.iterator();
                while (true) {
                    if (it31.hasNext()) {
                        next = it31.next();
                        b93.b bVarC = ((e93.f) next).c();
                        b93.b.Companion.getClass();
                        if (Intrinsics.f(bVarC, b93.b.i0)) {
                        }
                    } else {
                        next = null;
                    }
                }
                e93.e eVar = next instanceof e93.e ? (e93.e) next : null;
                hVar.getClass();
                return od0.h.a(eVar);
            case 27:
                Throwable it32 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it32, "it");
                return zi0.c.O(it32);
            case 28:
                return (String) zhm.d0.b0((List) obj2);
            default:
                Boolean canRender3d = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(canRender3d, "canRender3d");
                canRender3d.booleanValue();
                return canRender3d;
        }
    }

    public /* synthetic */ i(b93.b bVar, hy2.f fVar) {
        this.f156651a = 20;
    }

    public /* synthetic */ i(hy2.f fVar, int i) {
        this.f156651a = i;
    }
}
