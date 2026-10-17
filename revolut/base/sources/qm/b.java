package qm;

import efm.d0;
import efm.f;
import ib6.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qe0.g;
import qfm.f0;
import qfm.j0;
import ql6.s;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gpk.c f247736b;

    public /* synthetic */ b(gpk.c cVar, int i) {
        this.f247735a = i;
        this.f247736b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f247735a) {
            case 0:
                gpk.c cVar = this.f247736b;
                List list = (List) cVar.f145463a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add((d0) ((Function1) it8.next()).invoke(obj2));
                }
                return new i(new i(new f0(new j0(d0.h(efm.i.h(arrayList)), new g(26, new s(5)), 0), Boolean.FALSE), new g(27, new j(obj2, 18)), 1), new g(28, new qce.a(cVar, obj2, 20)), 2);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                return !((Boolean) obj3).booleanValue() ? (f) ((Function1) this.f247736b.f145465c).invoke(pair.f186386b) : m.f235744a;
        }
    }
}
