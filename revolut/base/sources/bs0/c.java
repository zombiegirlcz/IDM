package bs0;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f18020a;

    public c(int i, a gravity) {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        if (b.f18019a[gravity.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.f18020a = new f(i);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "view");
        f fVar = this.f18020a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        return new int[]{layoutManager.getF53278a() ? fVar.c(layoutManager, targetView, fVar.a(layoutManager)) : 0, layoutManager.canScrollVertically() ? fVar.c(layoutManager, targetView, fVar.a(layoutManager)) : 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        boolean z;
        int iAbs;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        f fVar = this.f18020a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        OrientationHelper helper = fVar.a(layoutManager);
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(helper, "helper");
        boolean z3 = true;
        int endAfterPadding = (layoutManager.getF53278a() && layoutManager.getLayoutDirection() == 1) ? helper.getEndAfterPadding() : helper.getStartAfterPadding();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        int position = -1;
        while (i2 < childCount) {
            View childAt = layoutManager.getChildAt(i2);
            if (childAt != null) {
                int iB = fVar.b(childAt, helper);
                if (helper.getDecoratedStart(childAt) != 0 || fVar.f18022b == 0 || helper.getLayoutManager().getPosition(childAt) != 0) {
                    RecyclerView.LayoutManager layoutManager2 = helper.getLayoutManager();
                    z = z3;
                    if (helper.getDecoratedEnd(childAt) != helper.getTotalSpace() || fVar.f18022b == layoutManager2.getItemCount() - 1 || layoutManager2.getPosition(childAt) != layoutManager2.getItemCount() - 1) {
                        if (fVar.f18022b == helper.getLayoutManager().getPosition(childAt)) {
                            RecyclerView.LayoutManager layoutManager3 = helper.getLayoutManager();
                            Intrinsics.checkNotNullExpressionValue(layoutManager3, "getLayoutManager(...)");
                            if (fVar.c(layoutManager3, childAt, helper) == 0) {
                            }
                        }
                        if (layoutManager.getPosition(childAt) % fVar.f18021a == 0 && (iAbs = Math.abs(iB - endAfterPadding)) < i) {
                            position = layoutManager.getPosition(childAt);
                            i = iAbs;
                            view = childAt;
                        }
                    }
                }
                position = layoutManager.getPosition(childAt);
                view = childAt;
                break;
            }
            z = z3;
            i2++;
            z3 = z;
        }
        if (position == -1) {
            position = fVar.f18022b;
        }
        fVar.f18022b = position;
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
    
        return r9.getItemCount() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    @Override // androidx.recyclerview.widget.SnapHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "layoutManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            bs0.f r1 = r8.f18020a
            int r2 = r1.f18021a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.recyclerview.widget.OrientationHelper r3 = r1.a(r9)
            boolean r4 = r9.getF53278a()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L27
            int r11 = r9.getLayoutDirection()
            if (r11 != r6) goto L24
            if (r10 >= 0) goto L22
        L20:
            r10 = r6
            goto L2a
        L22:
            r10 = r5
            goto L2a
        L24:
            if (r10 <= 0) goto L22
            goto L20
        L27:
            if (r11 <= 0) goto L22
            goto L20
        L2a:
            if (r10 == 0) goto L2e
            r11 = r5
            goto L33
        L2e:
            int r11 = r9.getItemCount()
            int r11 = r11 - r6
        L33:
            if (r10 == 0) goto L3d
            int r4 = r9.getItemCount()
            int r4 = r4 - r6
            if (r11 > r4) goto L9d
            goto L3f
        L3d:
            if (r11 < 0) goto L9d
        L3f:
            android.view.View r4 = r9.findViewByPosition(r11)
            if (r4 == 0) goto L96
            java.lang.String r7 = "targetView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r7 = "helper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            int r4 = r1.c(r9, r4, r3)
            boolean r7 = r9.getF53278a()
            if (r7 == 0) goto L6a
            int r7 = r9.getLayoutDirection()
            if (r7 != r6) goto L6a
            if (r10 == 0) goto L67
            if (r4 <= 0) goto L72
            goto L96
        L67:
            if (r4 >= 0) goto L72
            goto L96
        L6a:
            if (r10 == 0) goto L6f
            if (r4 >= 0) goto L72
            goto L96
        L6f:
            if (r4 <= 0) goto L72
            goto L96
        L72:
            if (r10 == 0) goto L81
            int r9 = r1.f18022b
            int r11 = r11 - r9
            int r10 = r11 % r2
            int r11 = r11 / r2
            if (r10 != 0) goto L7d
            goto L7e
        L7d:
            int r11 = r11 + r6
        L7e:
            int r2 = r2 * r11
            int r2 = r2 + r9
            return r2
        L81:
            int r9 = r1.f18022b
            int r10 = r9 - r11
            int r11 = r10 % r2
            int r10 = r10 / r2
            if (r11 != 0) goto L8b
            goto L8c
        L8b:
            int r10 = r10 + r6
        L8c:
            int r11 = r9 % r2
            int r9 = r9 - r11
            int r2 = r2 * r10
            int r9 = r9 - r2
            int r9 = java.lang.Math.max(r5, r9)
            return r9
        L96:
            if (r10 == 0) goto L9a
            r4 = r6
            goto L9b
        L9a:
            r4 = -1
        L9b:
            int r11 = r11 + r4
            goto L33
        L9d:
            if (r10 == 0) goto La5
            int r9 = r9.getItemCount()
            int r9 = r9 - r6
            return r9
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bs0.c.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }
}
