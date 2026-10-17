package ix0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f169223c;
    public int d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f169224g;

    public c2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f169221a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets a(android.view.WindowInsets r11) {
        /*
            r10 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.view.View r0 = r10.f169221a
            r1 = r0
            ix0.v0 r1 = (ix0.v0) r1
            boolean r1 = r1.getInsetsAdjustable()
            if (r1 != 0) goto L12
            goto L97
        L12:
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r11)
            java.lang.String r2 = "toWindowInsetsCompat(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r2 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            int r3 = androidx.core.view.WindowInsetsCompat.Type.ime()
            r2 = r2 | r3
            androidx.core.graphics.Insets r3 = r1.getInsets(r2)
            java.lang.String r4 = "getInsets(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r4 = r3.bottom
            boolean r5 = r10.f
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L4b
            int r5 = r10.f169224g
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L42
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L43
        L42:
            r8 = r6
        L43:
            if (r8 == 0) goto L48
            int r8 = r8.bottomMargin
            goto L49
        L48:
            r8 = r7
        L49:
            if (r5 == r8) goto L61
        L4b:
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            boolean r8 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L56
            r6 = r5
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
        L56:
            if (r6 == 0) goto L5b
            int r5 = r6.bottomMargin
            goto L5c
        L5b:
            r5 = r7
        L5c:
            r10.e = r5
            r5 = 1
            r10.f = r5
        L61:
            int r5 = r10.e
            int r5 = r5 + r4
            r10.f169224g = r5
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            if (r4 == 0) goto L99
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r5 = r10.f169224g
            r4.bottomMargin = r5
            r0.setLayoutParams(r4)
            int r0 = r3.left
            int r4 = r3.top
            int r3 = r3.right
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r4, r3, r7)
            java.lang.String r3 = "of(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            androidx.core.view.WindowInsetsCompat$Builder r3 = new androidx.core.view.WindowInsetsCompat$Builder
            r3.<init>(r1)
            androidx.core.view.WindowInsetsCompat$Builder r0 = r3.setInsets(r2, r0)
            androidx.core.view.WindowInsetsCompat r0 = r0.build()
            android.view.WindowInsets r0 = r0.toWindowInsets()
            if (r0 != 0) goto L98
        L97:
            return r11
        L98:
            return r0
        L99:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.c2.a(android.view.WindowInsets):android.view.WindowInsets");
    }

    public final WindowInsets b(WindowInsets insets, boolean z) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (z) {
            a(insets);
            WindowInsets windowInsets = WindowInsetsCompat.CONSUMED.toWindowInsets();
            if (windowInsets != null) {
                return windowInsets;
            }
            WindowInsets windowInsetsConsumeSystemWindowInsets = insets.consumeSystemWindowInsets();
            Intrinsics.checkNotNullExpressionValue(windowInsetsConsumeSystemWindowInsets, "consumeSystemWindowInsets(...)");
            return windowInsetsConsumeSystemWindowInsets;
        }
        if (!this.f) {
            return insets;
        }
        View view = this.f169221a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.e;
        view.setLayoutParams(marginLayoutParams);
        this.e = 0;
        this.f = false;
        this.f169224g = 0;
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowInsets c(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        View view = this.f169221a;
        if (((v0) view).getInsetsAdjustable()) {
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
            int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
            Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            int i = insets2.bottom;
            if (!this.f169223c || this.d != view.getPaddingBottom()) {
                this.f169222b = view.getPaddingBottom();
                this.f169223c = true;
            }
            int i2 = this.f169222b + i;
            this.d = i2;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
            Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, 0);
            Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
            WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
            if (windowInsets != null) {
                return windowInsets;
            }
        }
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowInsets d(WindowInsets insets, boolean z) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        View view = this.f169221a;
        if (z) {
            if (((v0) view).getInsetsAdjustable()) {
                return c(insets);
            }
        } else if (this.f169223c) {
            knm.b.v(this.f169222b, view);
            this.f169222b = 0;
            this.f169223c = false;
            this.d = 0;
        }
        return insets;
    }
}
