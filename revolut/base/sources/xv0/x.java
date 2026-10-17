package xv0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import efm.c0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rect f309181a = new Rect();

    public static final ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof RecyclerView) {
            arrayList.add(view);
            return arrayList;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList.addAll(a(childAt));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[LOOP:1: B:31:0x009c->B:33:0x00a2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.recyclerview.widget.RecyclerView r8, java.util.ArrayList r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "visibleList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.getAdapter()
            if (r0 == 0) goto Lb7
            int r0 = r0.getItemCount()
            r1 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.f.o(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = zhm.w.t(r0, r2)
            r1.<init>(r3)
            vim.f r0 = r0.iterator()
        L28:
            boolean r3 = r0.f289625c
            if (r3 == 0) goto Lb7
            int r3 = r0.nextInt()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r8.findViewHolderForLayoutPosition(r3)
            r4 = 0
            if (r3 == 0) goto Lb2
            android.view.View r5 = r3.itemView
            if (r5 == 0) goto L6a
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L6a
            android.view.View r6 = r5.getRootView()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L6a
            android.graphics.Rect r6 = xv0.x.f309181a
            boolean r7 = r5.getGlobalVisibleRect(r6)
            if (r7 != 0) goto L54
            goto L6a
        L54:
            int r7 = r6.height()
            int r6 = r6.width()
            int r6 = r6 * r7
            float r6 = (float) r6
            int r7 = r5.getHeight()
            int r5 = r5.getWidth()
            int r5 = r5 * r7
            float r5 = (float) r5
            float r6 = r6 / r5
            goto L6b
        L6a:
            r6 = 0
        L6b:
            boolean r5 = r3 instanceof koi.b
            if (r5 == 0) goto L73
            r5 = r3
            koi.b r5 = (koi.b) r5
            goto L74
        L73:
            r5 = r4
        L74:
            if (r5 == 0) goto L78
            koi.j r4 = r5.e
        L78:
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L84
            if (r4 == 0) goto L84
            r9.add(r4)
        L84:
            android.view.View r3 = r3.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.ArrayList r3 = a(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = zhm.w.t(r3, r2)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L9c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r3.next()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            b(r5, r9)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            r4.add(r5)
            goto L9c
        Lb1:
            r4 = r9
        Lb2:
            r1.add(r4)
            goto L28
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv0.x.b(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList):void");
    }

    public static efm.r c(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        efm.r rVarDistinctUntilChanged = efm.r.interval(300L, timeUnit, c0Var).map(new xt1.a(13, new hx0.r(recyclerView, 3))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
