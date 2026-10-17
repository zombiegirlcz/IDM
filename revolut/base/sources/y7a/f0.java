package y7a;

import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import zhm.a1;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f311441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PickerScreenContract$InputData f311442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f311443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f311444s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ImmutableMap interactors, PickerScreenContract$InputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f311441p = interactors;
        this.f311442q = inputData;
        this.f311443r = new vii.c();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(zhm.f0.f322471a, null, false, 6, null);
        Set set = inputData.f80369r;
        m70.a.c(t0.f186434a);
        this.f311444s = new r(data, data2, set, "", false, false, true, false, null);
    }

    @Override // yji.l
    public final void I1() {
        f0 f0Var;
        Continuation continuation = null;
        if (this.f311442q.f80366n) {
            f0Var = this;
            yji.l.a1(f0Var, vkm.q.P(new y5j.e(q2(), 4), 1), null, null, new xv4.o(this, continuation, 28), 3);
        } else {
            f0Var = this;
        }
        Flow flowQ = vkm.q.q(new y5j.e(q2(), 2));
        Unit unit = Unit.f186387a;
        w4l.h hVar = w4l.h.f294642c;
        vii.c cVar = f0Var.f311443r;
        int i = 1;
        yji.l.a1(f0Var, ta6.a.g(vkm.q.Q(new t38.e(cVar.a(unit, hVar), 24, flowQ, new a0e.n(3, 18, continuation)), new y4f.o(continuation, this, 6)), vkm.q.q(new y5j.e(q2(), 3)), vkm.q.q(new c0(flowQ, this, 0)), vkm.q.q(new c0(flowQ, this, i)), new ov5.d(this, continuation, i)), null, null, null, 7);
        cVar.b(unit);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f311444s;
    }

    public final a8a.d y2() {
        String str = this.f311442q.k;
        Map map = this.f311441p;
        return str != null ? (a8a.d) r0.h(str, map) : (a8a.d) zhm.d0.a0(map.values());
    }

    public final void z2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        PickerScreenContract$InputData pickerScreenContract$InputData = this.f311442q;
        if (!pickerScreenContract$InputData.f80365m) {
            if (((List) ((r) t2()).f311447a.getContent()) != null) {
                v2(new v(y2().d(y0.b(listId), pickerScreenContract$InputData.f80358a)));
                return;
            }
            return;
        }
        x2(new y66.p(7));
        if (Intrinsics.f(listId, "PICKER_RESET_ITEM_ID")) {
            x2(new y66.p(9));
            return;
        }
        if (Intrinsics.f(listId, "PICKER_SELECTABLE_HEADER_ID")) {
            Object content = ((r) t2()).f311447a.getContent();
            Intrinsics.h(content);
            Iterable iterable = (Iterable) content;
            ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList.add(((qv0.i) it8.next()).getF52040s());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!Intrinsics.f((String) obj2, "PICKER_SELECTABLE_HEADER_ID")) {
                    arrayList2.add(obj2);
                }
            }
            x2(new xyc.j(arrayList2, zhm.d0.h1(((r) t2()).f311449c), 22));
            return;
        }
        if (!pickerScreenContract$InputData.f80366n) {
            x2(new g36.a(this, zhm.d0.h1(((r) t2()).f311449c), listId, 9));
            return;
        }
        Object content2 = ((r) t2()).f311447a.getContent();
        Intrinsics.h(content2);
        Iterable iterable2 = (Iterable) content2;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable2, 10));
        Iterator it9 = iterable2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(((qv0.i) it9.next()).getF52040s());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!Intrinsics.f((String) obj3, "PICKER_SELECT_ALL_ITEM_ID")) {
                arrayList4.add(obj3);
            }
        }
        Set setH1 = zhm.d0.h1(((r) t2()).f311449c);
        if (setH1.contains(listId) && !Intrinsics.f(listId, "PICKER_SELECT_ALL_ITEM_ID") && setH1.containsAll(arrayList4)) {
            x2(new g36.a(setH1, listId, 10));
            return;
        }
        if (setH1.contains(listId)) {
            x2(new g36.a(setH1, listId, 11));
            return;
        }
        if (!setH1.contains(listId) && Intrinsics.f(listId, "PICKER_SELECT_ALL_ITEM_ID")) {
            x2(new ua2.r(15, arrayList4));
            return;
        }
        if (!setH1.contains(listId) && a1.m(setH1, listId).size() == arrayList4.size()) {
            x2(new g36.a(setH1, listId, 12));
        } else {
            if (setH1.contains(listId)) {
                return;
            }
            x2(new g36.a(setH1, listId, 8));
        }
    }
}
