package lk0;

import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import rfm.j;
import rfm.m;
import rfm.u;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f196162b;

    public /* synthetic */ a(d dVar, int i) {
        this.f196161a = i;
        this.f196162b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196161a) {
            case 0:
                h event = (h) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                d dVar = this.f196162b;
                int i = 2;
                j jVar = new j(dVar.a(), new v(9, new l9k.v(event, dVar, 22)), i);
                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                m mVar = new m(jVar, new v(i, new a(dVar, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
                return new sfm.b(mVar, new v(12, new a(dVar, 5)), 1);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                f fVar = (f) pair.f186385a;
                efm.b bVar = (efm.b) this.f196162b.f196169c.invoke((g) pair.f186386b);
                u uVarF = w.f(fVar);
                bVar.getClass();
                return new rfm.e(uVarF, bVar, 0);
            case 2:
                f params = (f) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return this.f196162b.c(params, false);
            case 3:
                e page = (e) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                return new i(this.f196162b.a(), new v(8, new c(page, 0)), 1);
            case 4:
                g newPagedData = (g) obj2;
                Intrinsics.checkNotNullParameter(newPagedData, "newPagedData");
                return ((efm.b) this.f196162b.f196169c.invoke(newPagedData)).g(w.h(newPagedData));
            case 5:
                f params2 = (f) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return this.f196162b.c(params2, true);
            default:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f196174a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((e) it9.next()).f196172b);
                }
                return r.fromIterable(arrayList).flatMap(new v(3, new a(this.f196162b, 2)));
        }
    }
}
