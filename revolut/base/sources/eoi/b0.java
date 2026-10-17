package eoi;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.performance_analytics_ui.R$id;
import ip0.xc;
import ip0.xk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.b f127913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f127914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f127915c;
    public final Handler d;
    public final androidx.view.d e;
    public final y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f127916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f127917h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f127918j;

    /* JADX WARN: Type inference failed for: r2v7, types: [eoi.v] */
    public b0(androidx.lifecycle.b onTraversalRequested) {
        Intrinsics.checkNotNullParameter(onTraversalRequested, "onTraversalRequested");
        this.f127913a = onTraversalRequested;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new androidx.view.d(this, 10);
        this.f = new y(this);
        this.f127916g = new a0(this);
        this.f127917h = new z(this);
        this.i = new x(this);
        this.f127918j = new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: eoi.v
            @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
            public final void onAnimationsFinished() {
                this.f127979a.f127913a.invoke();
            }
        };
    }

    public static boolean b(koi.j jVar) {
        if (jVar instanceof ListSubheaderDelegate.Model) {
            return false;
        }
        if (((jVar instanceof tw0.y) && ((tw0.y) jVar).getF55088h()) || (jVar instanceof TabsDelegate.Model) || (jVar instanceof FixedTabsDelegate.Model)) {
            return false;
        }
        if (!m.a(o.Companion)) {
            return true;
        }
        j6.a.s("item with data: ", jVar.getClass().getName(), "{ id= ", jVar.getF52560a(), " }");
        return true;
    }

    public static boolean c(koi.j jVar) {
        if (jVar instanceof eg) {
            List listA = ((eg) jVar).a();
            if ((listA instanceof Collection) && listA.isEmpty()) {
                return false;
            }
            Iterator it8 = listA.iterator();
            while (it8.hasNext()) {
                if (c((koi.j) it8.next())) {
                    return true;
                }
            }
            return false;
        }
        if (jVar instanceof hg) {
            List listP = ((hg) jVar).p();
            if ((listP instanceof Collection) && listP.isEmpty()) {
                return false;
            }
            Iterator it9 = listP.iterator();
            while (it9.hasNext()) {
                if (c((qv0.i) it9.next())) {
                    return true;
                }
            }
            return false;
        }
        if (jVar instanceof xk) {
            List listA2 = ((xk) jVar).a();
            if ((listA2 instanceof Collection) && listA2.isEmpty()) {
                return false;
            }
            Iterator it10 = listA2.iterator();
            while (it10.hasNext()) {
                if (c((koi.j) it10.next())) {
                    return true;
                }
            }
            return false;
        }
        if (!(jVar instanceof xc)) {
            return (jVar instanceof tw0.y) && ((tw0.y) jVar).getF55088h();
        }
        List listE = ((xc) jVar).e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it11 = listE.iterator();
        while (it11.hasNext()) {
            if (c((koi.j) it11.next())) {
                return true;
            }
        }
        return false;
    }

    public final void a(RecyclerView recyclerView) {
        if (recyclerView.getTag(R$id.internal_viewTreeIterator_rv_attach_listener) == null) {
            int i = R$id.internal_viewTreeIterator_rv_attach_listener;
            RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener = this.i;
            recyclerView.setTag(i, onChildAttachStateChangeListener);
            recyclerView.addOnChildAttachStateChangeListener(onChildAttachStateChangeListener);
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null && itemAnimator.isRunning() && recyclerView.getTag(R$id.internal_viewTreeIterator_rv_animator_finish_listener) == null) {
            int i2 = R$id.internal_viewTreeIterator_rv_animator_finish_listener;
            RecyclerView.ItemAnimator.ItemAnimatorFinishedListener itemAnimatorFinishedListener = this.f127918j;
            recyclerView.setTag(i2, itemAnimatorFinishedListener);
            itemAnimator.isRunning(itemAnimatorFinishedListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0169 A[LOOP:1: B:72:0x00d3->B:108:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x016d A[EDGE_INSN: B:177:0x016d->B:109:0x016d BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2 A[EDGE_INSN: B:172:0x00a2->B:56:0x00a2 BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169, LOOP_LABEL: LOOP:1: B:72:0x00d3->B:108:0x0169], EDGE_INSN: B:173:0x00a2->B:56:0x00a2 BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169, LOOP_LABEL: LOOP:1: B:72:0x00d3->B:108:0x0169], EDGE_INSN: B:174:0x00a2->B:56:0x00a2 BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169, LOOP_LABEL: LOOP:1: B:72:0x00d3->B:108:0x0169], EDGE_INSN: B:175:0x00a2->B:56:0x00a2 BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169, LOOP_LABEL: LOOP:1: B:72:0x00d3->B:108:0x0169], EDGE_INSN: B:176:0x00a2->B:56:0x00a2 BREAK  A[LOOP:1: B:72:0x00d3->B:108:0x0169], EDGE_INSN: B:56:0x00a2->B:110:0x016e BREAK  A[LOOP:2: B:75:0x00e6->B:79:0x00f5, LOOP_LABEL: LOOP:1: B:72:0x00d3->B:108:0x0169]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eoi.b0.d(android.view.View):boolean");
    }
}
