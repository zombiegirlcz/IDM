package ag1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg1.a f4759b;

    public h(b inputData, bg1.a simpleItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(simpleItemMapper, "simpleItemMapper");
        this.f4758a = inputData;
        this.f4759b = simpleItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f4750b;
        Clause clause = domainState.f4749a;
        boolean zIsEmpty = list.isEmpty();
        b bVar = this.f4758a;
        if (zIsEmpty) {
            ArrayList arrayList = bVar.f4753c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new pb0(((qf1.f) it8.next()).getId()));
            }
            return new d(clause, arrayList2);
        }
        List<cg1.d> list2 = domainState.f4750b;
        ArrayList arrayList3 = new ArrayList();
        for (cg1.d categoryItem : list2) {
            qf1.c categoryId = bVar.f4752b;
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(categoryItem, "categoryItem");
            RowDelegate.Model modelB = this.f4759b.b(categoryId, categoryItem, true);
            if (modelB != null) {
                arrayList3.add(modelB);
            }
        }
        return new d(clause, arrayList3);
    }
}
