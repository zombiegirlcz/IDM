package yua;

import a31.x;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import tof.i7;
import tof.ib;
import tof.s9;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f316931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f316932c;

    public /* synthetic */ c(q qVar, String str, int i) {
        this.f316930a = i;
        this.f316931b = qVar;
        this.f316932c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f316930a;
        int i2 = 2;
        int i3 = 24;
        int i5 = 1;
        String id10 = this.f316932c;
        q qVar = this.f316931b;
        switch (i) {
            case 0:
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "it");
                x xVar = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params, "params");
                p0 p0Var = p0.f264001a;
                ufm.i iVar = new ufm.i(w.o0(elm.f.f127540b, new a31.q(xVar, id10, null, 0)), new a31.e(new a31.d(xVar, id10, params, i5), i2), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                hbd.a params2 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "it");
                x xVar2 = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params2, "params");
                return w.i0(xVar2.d(xVar2.f999a.deactivateWalletAutomation(id10), params2, null));
            case 2:
                hbd.a params3 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params3, "it");
                x xVar3 = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params3, "params");
                return w.i0(xVar3.d(xVar3.f999a.activateWalletAutomation(id10), params3, null));
            case 3:
                hbd.a it8 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((x) qVar.f316963a).b(id10, it8);
            case 4:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                if (recurringPayments.isEmpty()) {
                    return zi0.c.j(recurringPayments);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it9 = recurringPayments.iterator();
                while (it9.hasNext()) {
                    Set set = ((qua.p) it9.next()).G;
                    if (set != null) {
                        arrayList.add(set);
                    }
                }
                Set setI1 = d0.i1(zhm.w.u(arrayList));
                com.revolut.domain.interactors.transactions.a aVar = qVar.i;
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new s9(setI1), new ib(id10)};
                cVar.getClass();
                r map = com.revolut.domain.interactors.transactions.a.b(aVar, i7.c.a(i7VarArr), null, null, null, null, 30).x().map(new yta.c(23, new x5f.m(recurringPayments, i3)));
                Intrinsics.h(map);
                return map;
            case 5:
                hbd.a params4 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params4, "it");
                x xVar4 = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "receiverId");
                Intrinsics.checkNotNullParameter(params4, "params");
                Intrinsics.checkNotNullParameter(params4, "params");
                return nim.a.w(nim.a.w(xVar4.i.f(params4, false), new a09.a(i3)), new a31.g(id10, 5));
            default:
                hbd.a params5 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params5, "it");
                x xVar5 = (x) qVar.f316963a;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(params5, "params");
                p0 p0Var2 = p0.f264001a;
                ufm.i iVar2 = new ufm.i(w.o0(elm.f.f127540b, new a31.q(xVar5, id10, null, 1)), new a31.e(new a31.d(xVar5, id10, params5, 3), 8), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                return iVar2;
        }
    }
}
