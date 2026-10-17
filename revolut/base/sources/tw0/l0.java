package tw0;

import android.graphics.Rect;
import android.os.Looper;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 implements b0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m0 f274837j;
    public rp0.l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public koi.h f274838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f274839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f274840n;
    public List o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f274842q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f274832a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f274833b = v0.a.d("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f274834c = v0.a.d("create(...)");
    public final x0 d = new x0();
    public final d0 e = new d0();
    public final l1 f = new l1(new m1(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a5 f274835g = a5.f55295a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tsk.j f274836h = new tsk.j(18);
    public final ts1.h i = new ts1.h(26);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f274841p = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f274843r = true;

    public static final class a {
        private a() {
        }
    }

    public static int b(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!d(list)) {
            return i;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.f(((koi.j) listIterator.previous()).getF52049b(), "WIDGETS_DECORATION_ADD_BTN_ID")) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static Object c(koi.h hVar, int i) {
        if (hVar != null) {
            if (i == -1) {
                Iterator it8 = hVar.b().iterator();
                int i2 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    koi.j jVar = (koi.j) it8.next();
                    if ((jVar instanceof BaseDraggableWidgetDelegate.Model) && ((BaseDraggableWidgetDelegate.Model) jVar).getF54944l()) {
                        break;
                    }
                    i2++;
                }
                i = i2 == -1 ? zhm.v.j(hVar.b()) : i2;
            }
            koi.j jVar2 = (koi.j) zhm.d0.e0(i, hVar.b());
            if (jVar2 != null) {
                if (!(jVar2 instanceof BaseDraggableWidgetDelegate.Model)) {
                    jVar2 = null;
                }
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) jVar2;
                if (model != null) {
                    return model.f54988a;
                }
            }
        }
        return null;
    }

    public static boolean d(List list) {
        int iNextIndex;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (Intrinsics.f(((koi.j) listIterator.previous()).getF52049b(), "WIDGETS_DECORATION_ADD_BTN_ID")) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        return iNextIndex != -1;
    }

    public static int e(koi.h hVar) {
        Iterator it8 = hVar.b().iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (f((koi.j) it8.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean f(koi.j jVar) {
        if (!(jVar instanceof BaseDraggableWidgetDelegate.Model)) {
            return false;
        }
        BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) jVar;
        return model.getF54944l() && model.getE() == op0.r.UNSEEN;
    }

    public static void k(l0 l0Var, RecyclerView recyclerView, koi.h adapter, rp0.l0 displayer) {
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        l0Var.j(adapter, recyclerView, displayer, false, true, null);
    }

    @Override // tw0.b0
    public final void G1() {
        rp0.l0 l0Var = this.k;
        if (l0Var != null) {
            l0Var.a();
        }
        this.f274837j = null;
    }

    @Override // tw0.b0
    public final void I1() {
        this.f274834c.onNext(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.recyclerview.widget.RecyclerView r13, koi.h r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r12.f274842q
            if (r0 == 0) goto Lc2
            boolean r0 = r12.f274843r
            if (r0 != 0) goto L14
            goto Lc2
        L14:
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r1 = -1
            r0.f186408a = r1
            java.util.List r2 = r14.b()
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L29:
            if (r4 >= r2) goto Lac
            java.util.List r6 = r14.b()
            java.lang.Object r6 = zhm.d0.e0(r4, r6)
            koi.j r6 = (koi.j) r6
            boolean r6 = f(r6)
            if (r6 != 0) goto L41
            int r6 = r0.f186408a
            if (r6 != r1) goto Lac
            goto La8
        L41:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r13.findViewHolderForAdapterPosition(r4)
            if (r6 != 0) goto L48
            goto La8
        L48:
            android.graphics.Rect r7 = r12.f274841p
            android.view.View r8 = r6.itemView
            android.view.animation.Animation r8 = r8.getAnimation()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L55
            goto L9d
        L55:
            android.view.View r8 = r6.itemView
            boolean r8 = r8.getGlobalVisibleRect(r7)
            if (r8 != 0) goto L5e
            goto L9d
        L5e:
            int r7 = r7.height()
            android.view.View r8 = r6.itemView
            java.lang.String r10 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r11 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L74
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L75
        L74:
            r8 = 0
        L75:
            if (r8 == 0) goto L7a
            int r8 = r8.topMargin
            goto L7b
        L7a:
            r8 = r3
        L7b:
            if (r7 < r8) goto L9d
            r0.f186408a = r4
            if (r15 == 0) goto L97
            r12.f274843r = r3
            tw0.d0 r7 = r12.e
            android.view.View r6 = r6.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            int r8 = r5 + 1
            cli.b r9 = new cli.b
            r10 = 4
            r9.<init>(r4, r10, r0, r12)
            tw0.d0.a(r7, r6, r5, r9, r10)
            r5 = r8
            goto La8
        L97:
            android.view.View r6 = r6.itemView
            r6.setAlpha(r9)
            goto La8
        L9d:
            android.view.View r6 = r6.itemView
            int r7 = r0.f186408a
            if (r7 == r1) goto La4
            goto La5
        La4:
            r9 = 0
        La5:
            r6.setAlpha(r9)
        La8:
            int r4 = r4 + 1
            goto L29
        Lac:
            int r13 = r0.f186408a
            if (r13 == r1) goto Lc2
            r12.f274842q = r3
            ihm.f r13 = r12.f274833b
            tw0.n0 r14 = new tw0.n0
            koi.h r0 = r12.f274838l
            java.lang.Object r0 = c(r0, r1)
            r14.<init>(r0, r15)
            r13.onNext(r14)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tw0.l0.a(androidx.recyclerview.widget.RecyclerView, koi.h, boolean):void");
    }

    public final efm.r g() throws Throwable {
        List list = this.o;
        if (list == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("widget delegates are not initialised, probably setup method was not called");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                efm.r rVarEmpty = efm.r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                return rVarEmpty;
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BaseDraggableWidgetDelegate baseDraggableWidgetDelegate = (BaseDraggableWidgetDelegate) list.get(i);
            if (baseDraggableWidgetDelegate == null) {
                baseDraggableWidgetDelegate = null;
            }
            ihm.f fVar = baseDraggableWidgetDelegate != null ? baseDraggableWidgetDelegate.f : null;
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        efm.r rVarMerge = efm.r.merge(arrayList);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final void h() {
        int iE;
        RecyclerView recyclerView = this.f274839m;
        koi.h hVar = this.f274838l;
        if (recyclerView == null || hVar == null) {
            r6.b.D("recyclerView and adapter are not initialised, probably setup method was not called");
            return;
        }
        if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            recyclerView.post(new t70.x(this, 7));
            return;
        }
        if (hVar.b().isEmpty() || (iE = e(hVar)) == -1) {
            return;
        }
        AppBarLayout appBarLayout = (AppBarLayout) this.f274836h.invoke(recyclerView);
        if (appBarLayout != null) {
            appBarLayout.setExpanded(false, true);
        }
        recyclerView.smoothScrollToPosition(iE);
    }

    public final void i(nsh.e addNewWidget) {
        int iJ;
        Intrinsics.checkNotNullParameter(addNewWidget, "addNewWidget");
        RecyclerView recyclerView = this.f274839m;
        koi.h hVar = this.f274838l;
        if (recyclerView == null || hVar == null) {
            r6.b.D("recyclerView and adapter are not initialised, probably setup method was not called");
            return;
        }
        if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            recyclerView.post(new p6.e(this, addNewWidget, 27));
            return;
        }
        if (hVar.b().isEmpty()) {
            hVar.registerAdapterDataObserver(new r0(hVar, this, new tkm.d(this, addNewWidget, 26)));
            return;
        }
        List listB = hVar.b();
        List listB2 = hVar.b();
        ListIterator listIterator = listB2.listIterator(listB2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iJ = -1;
                break;
            }
            koi.j jVar = (koi.j) listIterator.previous();
            if ((jVar instanceof BaseDraggableWidgetDelegate.Model) && ((BaseDraggableWidgetDelegate.Model) jVar).getF54944l()) {
                iJ = listIterator.nextIndex();
                break;
            }
        }
        if (iJ == -1) {
            iJ = zhm.v.j(hVar.b());
        }
        x.a(recyclerView, b(iJ, listB));
        ix0.h1.d(600L, new b0.e(this, hVar, addNewWidget, recyclerView, 13));
    }

    public final void j(final koi.h hVar, final RecyclerView recyclerView, rp0.l0 l0Var, boolean z, boolean z3, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        List listA;
        this.f274839m = recyclerView;
        this.f274835g.getClass();
        if (z) {
            listA = a5.a();
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                ((BaseDraggableWidgetDelegate) listA.get(i)).e = true;
            }
        } else {
            listA = a5.a();
        }
        this.o = listA;
        koi.c cVar = hVar.f;
        cVar.b(listA);
        ArrayList arrayList = new ArrayList(cVar.e());
        this.f274840n = arrayList;
        int size2 = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
                arrayList.add(listSubheaderDelegate);
                cVar.a(listSubheaderDelegate);
                break;
            } else if (((koi.k) arrayList.get(i2)) instanceof ListSubheaderDelegate) {
                break;
            } else {
                i2++;
            }
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
                arrayList.add(smallActionButtonDelegate);
                cVar.a(smallActionButtonDelegate);
                break;
            } else if (((koi.k) arrayList.get(i3)) instanceof SmallActionButtonDelegate) {
                break;
            } else {
                i3++;
            }
        }
        this.f274838l = hVar;
        this.k = l0Var;
        if (l0Var == null) {
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            yp0.w wVar = new yp0.w();
            wVar.setSupportsChangeAnimations(false);
            recyclerView.setItemAnimator(wVar);
            return;
        }
        x0.a(this.d, recyclerView, hVar, z3, spanSizeLookup, 8);
        l1 l1Var = this.f;
        l1Var.attachToRecyclerView(recyclerView);
        List list = this.o;
        if (list != null) {
            int size4 = list.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((BaseDraggableWidgetDelegate) list.get(i5)).f54987g = l1Var;
            }
        }
        if (z3) {
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            AppBarLayout appBarLayout = (AppBarLayout) this.f274836h.invoke(recyclerView);
            if (appBarLayout != null) {
                appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: tw0.k0
                    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                    public final void onOffsetChanged(AppBarLayout appBarLayout2, int i6) {
                        RecyclerView recyclerView2 = recyclerView;
                        if (recyclerView2.getScrollState() != 2) {
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            if (i6 == ref$IntRef2.f186408a || i6 == (-appBarLayout2.getTotalScrollRange())) {
                                return;
                            }
                            ref$IntRef2.f186408a = i6;
                            this.a(recyclerView2, hVar, i6 < 0);
                        }
                    }
                });
            }
            recyclerView.addOnScrollListener(new o0(this, hVar));
            hVar.registerAdapterDataObserver(new p0(this, hVar, recyclerView));
            recyclerView.addOnChildAttachStateChangeListener(new q0(this));
        }
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        List listB;
        koi.h hVar = this.f274838l;
        int i3 = -1;
        if (hVar != null && (listB = hVar.b()) != null) {
            Iterator it8 = listB.iterator();
            int i5 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                koi.j jVar = (koi.j) it8.next();
                if ((jVar instanceof BaseDraggableWidgetDelegate.Model) && ((BaseDraggableWidgetDelegate.Model) jVar).getF54944l()) {
                    i3 = i5;
                    break;
                }
                i5++;
            }
        }
        if (i3 < 0 || i3 > Math.min(i, i2)) {
            return;
        }
        m0 m0Var = new m0(i - i3, i2 - i3, c(this.f274838l, i3));
        if (m0Var.equals(this.f274837j)) {
            return;
        }
        this.f274837j = m0Var;
        this.f274832a.onNext(m0Var);
    }
}
