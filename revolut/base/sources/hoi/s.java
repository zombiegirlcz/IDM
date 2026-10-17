package hoi;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;
import hoi.n;
import java.util.ArrayList;
import java.util.List;
import joi.t;
import joi.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class s extends j implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f154343q;

    public s(RecyclerView recyclerView, joi.c cVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        hm3.b animatorsFactory = new hm3.b(recyclerView, cVar, 13);
        Intrinsics.checkNotNullParameter(animatorsFactory, "animatorsFactory");
        super(null, 3);
        this.f154343q = (List) animatorsFactory.invoke(this);
    }

    @Override // hoi.c, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((p) ((r) list.get(i))).a(holder)) {
                return true;
            }
        }
        i(holder);
        return true;
    }

    @Override // hoi.c, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((p) ((r) list.get(i))).c(holder)) {
                return true;
            }
        }
        super.animateRemove(holder);
        return true;
    }

    @Override // hoi.c, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((p) ((r) list.get(i))).e(item)) {
                return;
            }
        }
        super.endAnimation(item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hoi.c, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        String str;
        String str2;
        List list;
        ArrayMap arrayMap;
        int i;
        List list2 = this.f154343q;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            p pVar = (p) ((r) list2.get(i2));
            joi.r rVar = pVar.f;
            v vVar = pVar.f154341h;
            r10.f fVar = pVar.d;
            ArrayMap arrayMap2 = rVar.f177124a;
            ArrayMap arrayMap3 = rVar.f177125b;
            int size2 = arrayMap2.getSize();
            int i3 = 0;
            while (true) {
                str = "holder";
                if (i3 >= size2) {
                    break;
                }
                K kKeyAt = arrayMap2.keyAt(i3);
                V vValueAt = arrayMap2.valueAt(i3);
                Intrinsics.checkNotNullExpressionValue(vValueAt, "valueAt(...)");
                List list3 = (List) vValueAt;
                int size3 = list3.size();
                List list4 = list2;
                int i5 = 0;
                while (i5 < size3) {
                    List list5 = list3;
                    RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) list3.get(i5);
                    int i6 = i5;
                    String sectionKey = (String) kKeyAt;
                    int i21 = size;
                    n.c cVar = n.c.f154336c;
                    int i22 = i2;
                    if (sectionKey != null) {
                        View viewC = vVar.c(holder, sectionKey);
                        arrayMap = arrayMap2;
                        qv0.c fallback = cVar.d();
                        Intrinsics.checkNotNullParameter(holder, "holder");
                        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
                        Intrinsics.checkNotNullParameter(fallback, "fallback");
                        i = size2;
                        koi.b bVarA = vVar.a(holder, sectionKey);
                        Intrinsics.checkNotNullParameter(fallback, "fallback");
                        koi.j jVar = bVarA != null ? bVarA.e : null;
                        qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
                        qv0.c f52609l = iVar != null ? iVar.getF52329j() : null;
                        if (f52609l == null) {
                            f52609l = fallback;
                        }
                        if (viewC != null) {
                            fVar.B(viewC);
                        }
                        fVar.O(viewC, sectionKey, f52609l);
                    } else {
                        arrayMap = arrayMap2;
                        i = size2;
                    }
                    pVar.f(holder, cVar);
                    i5 = i6 + 1;
                    list3 = list5;
                    size = i21;
                    i2 = i22;
                    arrayMap2 = arrayMap;
                    size2 = i;
                }
                i3++;
                list2 = list4;
            }
            List list6 = list2;
            int i32 = size;
            int i33 = i2;
            rVar.f177124a.clear();
            rVar.f177126c.clear();
            int size4 = arrayMap3.getSize();
            int i43 = 0;
            while (i43 < size4) {
                Object objKeyAt = arrayMap3.keyAt(i43);
                V vValueAt2 = arrayMap3.valueAt(i43);
                Intrinsics.checkNotNullExpressionValue(vValueAt2, "valueAt(...)");
                List list7 = (List) vValueAt2;
                int size5 = list7.size();
                int i59 = 0;
                while (i59 < size5) {
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list7.get(i59);
                    int i66 = size4;
                    String sectionKey2 = (String) objKeyAt;
                    int i74 = i43;
                    n.a aVar = n.a.f154335c;
                    Object obj2 = objKeyAt;
                    if (sectionKey2 != null) {
                        View viewC2 = vVar.c(viewHolder, sectionKey2);
                        list = list7;
                        qv0.c fallback2 = aVar.d();
                        Intrinsics.checkNotNullParameter(viewHolder, str);
                        Intrinsics.checkNotNullParameter(sectionKey2, "sectionKey");
                        Intrinsics.checkNotNullParameter(fallback2, "fallback");
                        str2 = str;
                        koi.b bVarA2 = vVar.a(viewHolder, sectionKey2);
                        Intrinsics.checkNotNullParameter(fallback2, "fallback");
                        koi.j jVar2 = bVarA2 != null ? bVarA2.e : null;
                        qv0.i iVar2 = jVar2 instanceof qv0.i ? (qv0.i) jVar2 : null;
                        qv0.c f52609l2 = iVar2 != null ? iVar2.getF52329j() : null;
                        qv0.c cVar2 = f52609l2 == null ? fallback2 : f52609l2;
                        if (viewC2 != null) {
                            fVar.B(viewC2);
                        }
                        fVar.O(viewC2, sectionKey2, cVar2);
                    } else {
                        str2 = str;
                        list = list7;
                    }
                    pVar.f(viewHolder, aVar);
                    i59++;
                    size4 = i66;
                    i43 = i74;
                    objKeyAt = obj2;
                    list7 = list;
                    str = str2;
                }
                i43++;
            }
            arrayMap3.clear();
            rVar.d.clear();
            t tVar = pVar.f154340g;
            hmc.a endTransition = new hmc.a(27);
            tVar.getClass();
            Intrinsics.checkNotNullParameter(endTransition, "endTransition");
            ArrayList arrayList = tVar.f177130a;
            int size6 = arrayList.size();
            for (int i92 = 0; i92 < size6; i92++) {
                endTransition.invoke(arrayList.get(i92));
            }
            arrayList.clear();
            pVar.f154342j.clear();
            vVar.f177137a.clear();
            ((ArraySet) fVar.c).clear();
            i2 = i33 + 1;
            list2 = list6;
            size = i32;
        }
        super.endAnimations();
    }

    public final void i(RecyclerView.ViewHolder viewHolder) {
        super.animateAdd(viewHolder);
        j(viewHolder);
    }

    @Override // hoi.c, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((p) ((r) list.get(i))).h()) {
                return true;
            }
        }
        return super.isRunning();
    }

    public void j(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public final void k(RecyclerView.ViewHolder viewHolder, p excludedAnimator) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(excludedAnimator, "excludedAnimator");
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r rVar = (r) list.get(i);
            if (rVar != excludedAnimator && ((p) rVar).c(viewHolder)) {
                return;
            }
        }
        super.animateRemove(viewHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hoi.c, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void runPendingAnimations() {
        List list = this.f154343q;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) ((r) list.get(i));
            joi.r rVar = pVar.f;
            ArrayMap arrayMap = rVar.f177124a;
            ArrayMap arrayMap2 = rVar.f177125b;
            int size2 = arrayMap.getSize();
            while (true) {
                size2--;
                if (-1 >= size2) {
                    break;
                }
                String str = (String) arrayMap.keyAt(size2);
                List list2 = (List) arrayMap2.remove(str);
                if (list2 != null) {
                    List list3 = (List) arrayMap.valueAt(size2);
                    arrayMap.removeAt(size2);
                    Intrinsics.h(str);
                    Intrinsics.h(list3);
                    pVar.m(str, null);
                    pVar.k(list2);
                    pVar.j(list3);
                }
            }
            int size3 = arrayMap2.getSize();
            for (int i2 = 0; i2 < size3; i2++) {
                pVar.b((String) arrayMap2.keyAt(i2), (List) arrayMap2.valueAt(i2), n.a.f154335c);
            }
            arrayMap2.clear();
            ArrayMap arrayMap3 = rVar.f177124a;
            int size4 = arrayMap3.getSize();
            for (int i3 = 0; i3 < size4; i3++) {
                pVar.b((String) arrayMap3.keyAt(i3), (List) arrayMap3.valueAt(i3), n.c.f154336c);
            }
            arrayMap3.clear();
            rVar.f177126c.clear();
            rVar.d.clear();
        }
        super.runPendingAnimations();
    }
}
