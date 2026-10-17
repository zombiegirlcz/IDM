package w2e;

import cli.y;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements b {
    public final l2e.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g2e.b f294034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g2e.a f294035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f294036r;

    public i(j stateMapper, l2e.a storeBrandsInteractor, g2e.b filtersStateRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        this.o = storeBrandsInteractor;
        this.f294034p = filtersStateRepository;
        g2e.a aVarA = ((g2e.c) filtersStateRepository).a();
        this.f294035q = aVarA;
        List list = aVarA.f139972b;
        this.f294036r = mra.d.b(this, new a(list, 1, list), stateMapper, null, false, 12);
    }

    public static final ArrayList I2(i iVar, List list, List list2, List list3) {
        Object next;
        ArrayList arrayListF1 = d0.f1(list);
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            Pair pairA = u3e.e.a((String) it8.next(), list3);
            if (pairA != null) {
                StoreMegaFilter storeMegaFilter = (StoreMegaFilter) pairA.f186385a;
                StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue = (StoreMegaFilter.StoreMegaFilterValue) pairA.f186386b;
                Iterator it9 = arrayListF1.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((StoreMegaFilterSelection) next).f88543a.f88537a, storeMegaFilter.f88537a)) {
                        break;
                    }
                }
                StoreMegaFilterSelection storeMegaFilterSelection = (StoreMegaFilterSelection) next;
                if (storeMegaFilterSelection == null) {
                    arrayListF1.add(new StoreMegaFilterSelection(storeMegaFilter, u.c(storeMegaFilterValue)));
                } else {
                    List list4 = storeMegaFilterSelection.f88544b;
                    List list5 = list4;
                    ArrayList arrayList = new ArrayList(w.t(list5, 10));
                    Iterator it10 = list5.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(((StoreMegaFilter.StoreMegaFilterValue) it10.next()).f88540a);
                    }
                    if (!arrayList.contains(storeMegaFilterValue.f88540a)) {
                        arrayListF1.set(arrayListF1.indexOf(storeMegaFilterSelection), StoreMegaFilterSelection.a(storeMegaFilterSelection, d0.F0(storeMegaFilterValue, list4)));
                    }
                }
            }
        }
        return arrayListF1;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.b(w4l.h.f294642c), null, null, new h(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294036r;
    }
}
