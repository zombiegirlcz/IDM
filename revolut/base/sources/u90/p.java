package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.Filter;
import com.revolut.feature.backend_flow.domain.models.FilterValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import q90.w;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t90.b f278326a;

    public p(t90.j dateMapper, t90.b backendFlowFilterMapper) {
        Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
        Intrinsics.checkNotNullParameter(backendFlowFilterMapper, "backendFlowFilterMapper");
        this.f278326a = backendFlowFilterMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        Filter lt2;
        LocalDate localDateB;
        String value;
        q90.x0 item = (q90.x0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        q90.y0 value2 = item.getValue();
        if (value2 == null || (value = value2.getValue()) == null) {
            lt2 = null;
            localDateB = null;
        } else {
            localDateB = t90.j.b(value);
            lt2 = null;
        }
        String hint = item.getHint();
        q90.w filter = item.getValueFilter();
        if (filter != null) {
            kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
            KClass filterValueType = p0Var.b(FilterValue.DateValue.class);
            t90.c cVar = this.f278326a.f268933a;
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(filterValueType, "filterValueType");
            if (filter instanceof w.c) {
                w.c cVar2 = (w.c) filter;
                FilterValue filterValueA = cVar.a(cVar2.getValue());
                if (filterValueType.equals(p0Var.b(filterValueA.getClass()))) {
                    lt2 = new Filter.Eq(filterValueA, cVar2.getNegated());
                }
            } else if (filter instanceof w.e) {
                w.e eVar = (w.e) filter;
                Set values = eVar.getValues();
                ArrayList arrayList = new ArrayList(zhm.w.t(values, 10));
                Iterator it8 = values.iterator();
                while (it8.hasNext()) {
                    arrayList.add(cVar.a((q90.x) it8.next()));
                }
                if (!arrayList.isEmpty() && zhm.c0.N(arrayList, nim.a.o(filterValueType)).size() == arrayList.size()) {
                    lt2 = new Filter.In(zhm.d0.i1(arrayList), eVar.getNegated());
                }
            } else if (filter instanceof w.a) {
                w.a aVar = (w.a) filter;
                FilterValue filterValueA2 = cVar.a(aVar.getFrom());
                FilterValue filterValueA3 = cVar.a(aVar.getTo());
                if (filterValueType.equals(p0Var.b(filterValueA2.getClass())) && filterValueType.equals(p0Var.b(filterValueA3.getClass()))) {
                    lt2 = new Filter.Between(aVar.getFromInclusive(), aVar.getToInclusive(), filterValueA2, filterValueA3, aVar.getNegated());
                }
            } else if (filter instanceof w.d) {
                w.d dVar = (w.d) filter;
                FilterValue filterValueA4 = cVar.a(dVar.getValue());
                if (filterValueType.equals(p0Var.b(filterValueA4.getClass()))) {
                    lt2 = new Filter.Gt(filterValueA4, dVar.getNegated());
                }
            } else {
                if (!(filter instanceof w.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                w.f fVar = (w.f) filter;
                FilterValue filterValueA5 = cVar.a(fVar.getValue());
                if (filterValueType.equals(p0Var.b(filterValueA5.getClass()))) {
                    lt2 = new Filter.Lt(filterValueA5, fVar.getNegated());
                }
            }
        }
        return new DateInputItem(id10, required, hint, localDateB, lt2, previousElements.isEmpty());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        q90.w fVar;
        DateInputItem item = (DateInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63380a;
        boolean z = item.f63381b;
        LocalDate localDate = item.d;
        q90.w aVar = null;
        q90.y0 y0Var = localDate != null ? new q90.y0(t90.j.a(localDate)) : null;
        String str2 = item.f63382c;
        Filter filter = item.e;
        if (filter != null) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            if (filter instanceof Filter.Eq) {
                Filter.Eq eq7 = (Filter.Eq) filter;
                fVar = new w.c(t90.c.b(eq7.f63444a), eq7.f63445b);
            } else if (filter instanceof Filter.In) {
                Filter.In in10 = (Filter.In) filter;
                Set set = in10.f63448a;
                ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(t90.c.b((FilterValue) it8.next()));
                }
                aVar = new w.e(zhm.d0.i1(arrayList), in10.f63449b);
            } else if (filter instanceof Filter.Between) {
                Filter.Between between = (Filter.Between) filter;
                aVar = new w.a(between.f63441a, between.f63442b, t90.c.b(between.f63443c), t90.c.b(between.d), between.e);
            } else if (filter instanceof Filter.Gt) {
                Filter.Gt gt = (Filter.Gt) filter;
                fVar = new w.d(t90.c.b(gt.f63446a), gt.f63447b);
            } else {
                if (!(filter instanceof Filter.Lt)) {
                    throw new NoWhenBranchMatchedException();
                }
                Filter.Lt lt2 = (Filter.Lt) filter;
                fVar = new w.f(t90.c.b(lt2.f63450a), lt2.f63451b);
            }
            aVar = fVar;
        }
        return new q90.x0(str, z, str2, aVar, y0Var);
    }
}
