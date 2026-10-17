package hoi;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hoi.n;
import java.util.ArrayList;
import java.util.List;
import joi.t;
import joi.v;
import joi.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements r {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f154337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final joi.c f154338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ks0.f f154339c;
    public final r10.f d;
    public final x e;
    public final joi.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f154340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f154341h;
    public final TimeInterpolator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayMap f154342j;

    public p(RecyclerView recyclerView, q animatorHost, joi.c cVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(animatorHost, "animatorHost");
        this.f154337a = animatorHost;
        this.f154338b = cVar;
        ks0.f fVar = new ks0.f(recyclerView);
        this.f154339c = fVar;
        r10.f fVar2 = new r10.f(fVar);
        this.d = fVar2;
        this.e = new x(fVar2);
        this.f = new joi.r();
        this.f154340g = new t();
        this.f154341h = new v(fVar);
        c.Companion.getClass();
        this.i = hx7.i.p();
        this.f154342j = new ArrayMap();
    }

    public final boolean a(RecyclerView.ViewHolder holder) {
        List list;
        koi.b bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        m mVarL = l(holder);
        m mVar = null;
        String sectionKey = mVarL != null ? mVarL.f154331a : null;
        joi.r rVar = this.f;
        if (sectionKey != null) {
            rVar.getClass();
            Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
            if (!rVar.f177126c.contains(sectionKey)) {
                e(holder);
                this.f154342j.put(holder, sectionKey);
                koi.b headerHolder = mVarL.f154332b;
                v vVar = this.f154341h;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(headerHolder, "headerHolder");
                vVar.f177137a.put(holder, headerHolder);
                n(holder, sectionKey, n.c.d);
                holder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
                Intrinsics.checkNotNullParameter(holder, "holder");
                ArrayMap arrayMap = rVar.f177124a;
                Object arrayList = arrayMap.get(sectionKey);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    arrayMap.put(sectionKey, arrayList);
                }
                ((List) arrayList).add(holder);
                return true;
            }
        } else {
            ks0.c cVarE = this.f154339c.e(holder);
            if (cVarE != null && (bVar = cVarE.f189065b) == holder) {
                mVar = new m(cVarE.f189064a, bVar);
            }
            if (mVar != null) {
                String sectionKey2 = mVar.f154331a;
                koi.b bVar2 = mVar.f154332b;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(sectionKey2, "sectionKey");
                rVar.f177126c.add(sectionKey2);
                List list2 = (List) rVar.f177124a.remove(sectionKey2);
                Intrinsics.checkNotNullParameter(sectionKey2, "sectionKey");
                rVar.d.add(sectionKey2);
                List list3 = (List) rVar.f177125b.remove(sectionKey2);
                List list4 = list2;
                if ((list4 != null && !list4.isEmpty()) || ((list = list3) != null && !list.isEmpty())) {
                    m(sectionKey2, bVar2);
                }
                j(list2);
                k(list3);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r27, java.util.List r28, hoi.n r29) {
        /*
            Method dump skipped, instruction units count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hoi.p.b(java.lang.String, java.util.List, hoi.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(RecyclerView.ViewHolder holder) {
        List list;
        koi.b bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        m mVarL = l(holder);
        ArrayMap arrayMap = this.f154342j;
        String sectionKey = (String) arrayMap.get(holder);
        m mVar = null;
        if (sectionKey == null) {
            sectionKey = mVarL != null ? mVarL.f154331a : null;
        }
        boolean z = false;
        joi.r rVar = this.f;
        if (sectionKey != null) {
            rVar.getClass();
            ArrayMap arrayMap2 = rVar.f177125b;
            Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
            if (!rVar.d.contains(sectionKey)) {
                ArrayMap arrayMap3 = rVar.f177124a;
                for (int size = arrayMap3.getSize() - 1; -1 < size; size--) {
                    List list2 = (List) arrayMap3.valueAt(size);
                    if (list2.remove(holder)) {
                        if (list2.isEmpty()) {
                            String str = (String) arrayMap3.keyAt(size);
                            arrayMap3.removeAt(size);
                            Intrinsics.h(str);
                            g(holder, str, n.c.f154336c);
                        }
                        z = true;
                    }
                }
                if (z) {
                    View itemView = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    this.e.getClass();
                    x.a(itemView);
                    Intrinsics.checkNotNullParameter(holder, "<this>");
                    holder.setIsRecyclable(true);
                }
                for (int size2 = arrayMap2.getSize() - 1; -1 < size2; size2--) {
                    List list3 = (List) arrayMap2.valueAt(size2);
                    if (list3.remove(holder) && list3.isEmpty()) {
                        String str2 = (String) arrayMap2.keyAt(size2);
                        arrayMap2.removeAt(size2);
                        Intrinsics.h(str2);
                        g(holder, str2, n.a.f154335c);
                    }
                }
                this.f154340g.a(holder, new hmc.a(26));
                arrayMap.put(holder, sectionKey);
                if (mVarL != null) {
                    koi.b headerHolder = mVarL.f154332b;
                    v vVar = this.f154341h;
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(headerHolder, "headerHolder");
                    vVar.f177137a.put(holder, headerHolder);
                }
                n(holder, sectionKey, n.a.d);
                Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
                Intrinsics.checkNotNullParameter(holder, "holder");
                Object arrayList = arrayMap2.get(sectionKey);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    arrayMap2.put(sectionKey, arrayList);
                }
                ((List) arrayList).add(holder);
                return true;
            }
        } else {
            ks0.c cVarE = this.f154339c.e(holder);
            if (cVarE != null && (bVar = cVarE.f189065b) == holder) {
                mVar = new m(cVarE.f189064a, bVar);
            }
            if (mVar != null) {
                String sectionKey2 = mVar.f154331a;
                koi.b bVar2 = mVar.f154332b;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(sectionKey2, "sectionKey");
                rVar.d.add(sectionKey2);
                List list4 = (List) rVar.f177125b.remove(sectionKey2);
                Intrinsics.checkNotNullParameter(sectionKey2, "sectionKey");
                rVar.f177126c.add(sectionKey2);
                List list5 = (List) rVar.f177124a.remove(sectionKey2);
                List list6 = list4;
                if ((list6 != null && !list6.isEmpty()) || ((list = list5) != null && !list.isEmpty())) {
                    m(sectionKey2, bVar2);
                }
                k(list4);
                j(list5);
            }
        }
        return false;
    }

    public final void d(List holders) {
        Intrinsics.checkNotNullParameter(holders, "holders");
        this.f154342j.removeAll(holders);
        v vVar = this.f154341h;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(holders, "holders");
        int size = holders.size();
        for (int i = 0; i < size; i++) {
            vVar.f177137a.remove((RecyclerView.ViewHolder) holders.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
        /*
            r10 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.collection.ArrayMap r0 = r10.f154342j
            java.lang.Object r1 = r0.get(r11)
            java.lang.String r1 = (java.lang.String) r1
            joi.r r2 = r10.f
            androidx.collection.ArrayMap r3 = r2.f177124a
            int r4 = r3.getSize()
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
        L19:
            r8 = -1
            if (r8 >= r4) goto L43
            java.lang.Object r8 = r3.valueAt(r4)
            java.util.List r8 = (java.util.List) r8
            boolean r9 = r8.remove(r11)
            if (r9 == 0) goto L40
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L3f
            java.lang.Object r7 = r3.keyAt(r4)
            java.lang.String r7 = (java.lang.String) r7
            r3.removeAt(r4)
            kotlin.jvm.internal.Intrinsics.h(r7)
            hoi.n$c r8 = hoi.n.c.f154336c
            r10.g(r11, r7, r8)
        L3f:
            r7 = r5
        L40:
            int r4 = r4 + (-1)
            goto L19
        L43:
            if (r7 == 0) goto L4c
            hoi.n$c r2 = hoi.n.c.f154336c
            r10.f(r11, r2)
        L4a:
            r2 = r5
            goto L86
        L4c:
            androidx.collection.ArrayMap r2 = r2.f177125b
            int r3 = r2.getSize()
            int r3 = r3 - r5
            r4 = r6
        L54:
            if (r8 >= r3) goto L7d
            java.lang.Object r7 = r2.valueAt(r3)
            java.util.List r7 = (java.util.List) r7
            boolean r9 = r7.remove(r11)
            if (r9 == 0) goto L7a
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.keyAt(r3)
            java.lang.String r4 = (java.lang.String) r4
            r2.removeAt(r3)
            kotlin.jvm.internal.Intrinsics.h(r4)
            hoi.n$a r7 = hoi.n.a.f154335c
            r10.g(r11, r4, r7)
        L79:
            r4 = r5
        L7a:
            int r3 = r3 + (-1)
            goto L54
        L7d:
            if (r4 == 0) goto L85
            hoi.n$a r2 = hoi.n.a.f154335c
            r10.f(r11, r2)
            goto L4a
        L85:
            r2 = r6
        L86:
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            e1.f r4 = new e1.f
            r7 = 2
            r4.<init>(r3, r7)
            joi.t r7 = r10.f154340g
            r7.a(r11, r4)
            r0.remove(r11)
            joi.v r0 = r10.f154341h
            r0.getClass()
            java.lang.String r4 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r4)
            androidx.collection.ArrayMap r0 = r0.f177137a
            r0.remove(r11)
            if (r1 != 0) goto Lb2
            if (r2 != 0) goto Lb2
            boolean r11 = r3.f186407a
            if (r11 == 0) goto Lb1
            goto Lb2
        Lb1:
            r5 = r6
        Lb2:
            if (r5 == 0) goto Lb7
            r10.i()
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hoi.p.e(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
    }

    public final void f(RecyclerView.ViewHolder viewHolder, n nVar) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.e.getClass();
        x.a(itemView);
        nVar.a(viewHolder, this);
    }

    public final void g(RecyclerView.ViewHolder holder, String sectionKey, n nVar) {
        v vVar = this.f154341h;
        View viewC = vVar.c(holder, sectionKey);
        qv0.c fallback = nVar.d();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        koi.b bVarA = vVar.a(holder, sectionKey);
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        koi.j jVar = bVarA != null ? bVarA.e : null;
        qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
        qv0.c f51675h = iVar != null ? iVar.getF52329j() : null;
        if (f51675h != null) {
            fallback = f51675h;
        }
        r10.f fVar = this.d;
        if (viewC != null) {
            fVar.B(viewC);
        }
        fVar.O(viewC, sectionKey, fallback);
    }

    public final boolean h() {
        if (!this.f154340g.f177130a.isEmpty()) {
            return true;
        }
        joi.r rVar = this.f;
        return (rVar.f177124a.isEmpty() && rVar.f177125b.isEmpty()) ? false : true;
    }

    public final void i() {
        if (h()) {
            return;
        }
        s sVar = (s) this.f154337a;
        if (sVar.isRunning()) {
            return;
        }
        sVar.dispatchAnimationsFinished();
    }

    public final void j(List list) {
        int i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i2);
                this.f154342j.remove(viewHolder);
                View itemView = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                this.e.getClass();
                x.a(itemView);
                s sVar = (s) this.f154337a;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(this, "excludedAnimator");
                List list2 = sVar.f154343q;
                int size2 = list2.size();
                while (true) {
                    if (i >= size2) {
                        sVar.i(viewHolder);
                        break;
                    }
                    r rVar = (r) list2.get(i);
                    i = (rVar == this || !((p) rVar).a(viewHolder)) ? i + 1 : 0;
                }
            }
        }
    }

    public final void k(List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i);
                this.f154342j.remove(viewHolder);
                View itemView = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                this.e.getClass();
                x.a(itemView);
                ((s) this.f154337a).k(viewHolder, this);
            }
        }
    }

    public final m l(RecyclerView.ViewHolder itemHolder) {
        String f52218a;
        ks0.f fVar = this.f154339c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
        qv0.i iVarF = ks0.f.f(itemHolder);
        koi.b bVarC = (iVarF != null && ks0.f.i(iVarF, ks0.f.g(iVarF))) ? fVar.c(itemHolder) : null;
        if (bVarC != null) {
            koi.j jVar = bVarC.e;
            qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
            if (iVar != null && (f52218a = iVar.getF52324a()) != null) {
                return new m(f52218a, bVarC);
            }
        }
        return null;
    }

    public final void m(String sectionKey, koi.b bVar) {
        qv0.i iVarF;
        if (bVar == null) {
            ks0.f fVar = this.f154339c;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
            RecyclerView recyclerView = fVar.f189069a;
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    bVar = null;
                    break;
                }
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                koi.b bVar2 = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                if (bVar2 != null && (iVarF = ks0.f.f(bVar2)) != null && Intrinsics.f(iVarF.getF52324a(), sectionKey) && ks0.f.j(iVarF, ks0.f.g(iVarF))) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        }
        View view = bVar != null ? bVar.itemView : null;
        n.Companion.getClass();
        qv0.c fallback = n.f154333a;
        this.f154341h.getClass();
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        koi.j jVar = bVar != null ? bVar.e : null;
        qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
        qv0.c f51675h = iVar != null ? iVar.getF52329j() : null;
        if (f51675h != null) {
            fallback = f51675h;
        }
        r10.f fVar2 = this.d;
        if (view != null) {
            fVar2.B(view);
        }
        fVar2.O(view, sectionKey, fallback);
    }

    public final void n(RecyclerView.ViewHolder holder, String sectionKey, qv0.c boxRolePosition) {
        v vVar = this.f154341h;
        View viewC = vVar.c(holder, sectionKey);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(boxRolePosition, "boxRolePosition");
        koi.b bVarA = vVar.a(holder, sectionKey);
        koi.j jVar = bVarA != null ? bVarA.e : null;
        qv0.i iVar = jVar instanceof qv0.i ? (qv0.i) jVar : null;
        qv0.c f51675h = iVar != null ? iVar.getF52329j() : null;
        qv0.c outlinePosition = (f51675h == null || (f51675h instanceof qv0.a)) ? boxRolePosition : f51675h;
        r10.f fVar = this.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(outlinePosition, "outlinePosition");
        if (viewC == null) {
            return;
        }
        as0.d dVar = new as0.d(fVar, viewC, 4);
        ((ArraySet) fVar.c).add(viewC);
        r10.f.c(viewC, outlinePosition);
        viewC.addOnAttachStateChangeListener(dVar);
        OneShotPreDrawListener.add(viewC, new joi.q(viewC, viewC, dVar, fVar, sectionKey, outlinePosition));
    }
}
