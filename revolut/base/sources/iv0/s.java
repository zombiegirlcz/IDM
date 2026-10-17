package iv0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends ViewOutlineProvider {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f168696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168698c = -1;
    public int d = -1;
    public final Rect e = new Rect();

    public s(float f, boolean z) {
        this.f168696a = f;
        this.f168697b = z;
    }

    public final int a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f168698c;
        return i < 0 ? view.getHeight() + this.e.bottom : i;
    }

    public final int b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.d;
        return i < 0 ? view.getWidth() + this.e.right : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    @Override // android.view.ViewOutlineProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getOutline(android.view.View r8, android.graphics.Outline r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "outline"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.graphics.Rect r0 = r7.e
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r7.b(r8)
            int r5 = r7.a(r8)
            float r6 = r7.f168696a
            r1 = r9
            r1.setRoundRect(r2, r3, r4, r5, r6)
            boolean r9 = r7.f168697b
            if (r9 == 0) goto L83
            android.graphics.drawable.Drawable r8 = r8.getBackground()
        L26:
            boolean r9 = r8 instanceof android.graphics.drawable.LayerDrawable
            if (r9 == 0) goto L45
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            int r9 = r8.getNumberOfLayers()
            r0 = 0
        L36:
            if (r0 >= r9) goto L43
            android.graphics.drawable.Drawable r2 = r8.getDrawable(r0)
            if (r2 == 0) goto L40
            r8 = r2
            goto L26
        L40:
            int r0 = r0 + 1
            goto L36
        L43:
            r8 = 0
            goto L26
        L45:
            r9 = 0
            if (r8 != 0) goto L49
            goto L80
        L49:
            boolean r0 = r8 instanceof android.graphics.drawable.ShapeDrawable
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L73
            android.graphics.drawable.ShapeDrawable r8 = (android.graphics.drawable.ShapeDrawable) r8
            int r0 = r8.getAlpha()
            if (r0 != r3) goto L80
            android.graphics.Paint r0 = r8.getPaint()
            int r0 = r0.getAlpha()
            if (r0 != r3) goto L80
            android.graphics.Paint r8 = r8.getPaint()
            int r8 = r8.getColor()
            int r8 = android.graphics.Color.alpha(r8)
            if (r8 != r3) goto L80
        L71:
            r9 = r2
            goto L80
        L73:
            boolean r0 = r8 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L80
            android.graphics.drawable.ColorDrawable r8 = (android.graphics.drawable.ColorDrawable) r8
            int r8 = r8.getAlpha()
            if (r8 != r3) goto L80
            goto L71
        L80:
            r1.setAlpha(r9)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iv0.s.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
