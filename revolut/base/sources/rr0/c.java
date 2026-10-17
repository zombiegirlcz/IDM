package rr0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rect f256608a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f256609b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f256610c = new Rect();

    private c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v8 int) = (r6v6 int), (r6v5 int) binds: [B:45:0x00c1, B:40:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[PHI: r6
      0x00b7: PHI (r6v7 int) = (r6v6 int), (r6v5 int) binds: [B:45:0x00c1, B:40:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r18, android.view.View r19, android.view.View r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rr0.c.a(android.view.View, android.view.View, android.view.View, int, int, int, int, int, int, int):void");
    }

    public static void b(ViewGroup viewGroup, AmountForDualEditView horizontalAnchor, ViewGroup verticalAnchor, int i, int i2, int i3, int i5, int i6) {
        int i21;
        int i22;
        int i32 = (i6 & 8) != 0 ? 0 : i2;
        int i33 = (i6 & 32) != 0 ? 0 : i3;
        int i43 = (i6 & 64) != 0 ? 0 : i5;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(horizontalAnchor, "horizontalAnchor");
        Intrinsics.checkNotNullParameter(verticalAnchor, "verticalAnchor");
        if (viewGroup.getLayoutDirection() == 1) {
            i22 = i32;
            i21 = i33;
        } else {
            i21 = i32;
            i22 = i33;
        }
        a(viewGroup, horizontalAnchor, verticalAnchor, i, 0, i21, 0, i22, i43, 24);
    }

    public static boolean c(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void d(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static boolean e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (view.getVisibility() == 8 || view.getParent() == null) ? false : true;
    }
}
