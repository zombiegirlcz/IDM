package yf1;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends oki.h implements o {
    public final b0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tf1.q f313143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tf1.o f313144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f313145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tf1.t f313146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i4b.f f313147t;
    public final ang.f u;
    public final cli.y v;

    public y(s mapper, n inputData, b0 scrollManager, tf1.q interactor, tf1.o addNewProductCategoryTitleProvider, c addNewItemsGroupingUtil, tf1.t structure, i4b.f legalEntityContextProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(scrollManager, "scrollManager");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(addNewProductCategoryTitleProvider, "addNewProductCategoryTitleProvider");
        Intrinsics.checkNotNullParameter(addNewItemsGroupingUtil, "addNewItemsGroupingUtil");
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = scrollManager;
        this.f313143p = interactor;
        this.f313144q = addNewProductCategoryTitleProvider;
        this.f313145r = addNewItemsGroupingUtil;
        this.f313146s = structure;
        this.f313147t = legalEntityContextProvider;
        this.u = userInteractor;
        f0 f0Var = f0.f322471a;
        Data data = new Data(null, null, true, 3, null);
        qf1.c cVar = inputData.f313126a;
        this.v = mra.d.b(this, new m(f0Var, j.f313121a, data, cVar, cVar, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f313147t.j(null), null, null, new u(this, continuation, 0), 3);
        l2(new y7i.h(this, continuation, 9), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        List list = this.f313146s.f270200a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it8.hasNext()) {
                yji.l.b1(this, new uf0.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 19), null, new u(this, continuation, 1), 3);
                return;
            }
            tf1.b bVar = (tf1.b) it8.next();
            List<tf1.h> list2 = bVar.f270146b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (tf1.h hVar : list2) {
                arrayList2.add(new wyd.f(this.f313143p.a(hVar.a()), hVar, 26));
            }
            arrayList.add(arrayList2.isEmpty() ? new go.g(null, 2) : new wc7.e((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 12, this, bVar));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
