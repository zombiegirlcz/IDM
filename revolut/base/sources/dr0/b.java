package dr0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f117045a = R$attr.uikit_colorNestedBackground;

    public static final Drawable a(qv0.c positionInBox, qv0.k positionInGroup, Context context, boolean z, k kVar, Rect rect) {
        Color color;
        float[] fArrW;
        InsetDrawable insetDrawableQ;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawableC = c(positionInBox, context, kVar);
        if (kVar instanceof i) {
            color = ((i) kVar).f117052a;
        } else {
            if (!Intrinsics.f(kVar, j.f117053a) && kVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            color = null;
        }
        if (p(positionInGroup, positionInBox)) {
            float fK = kli.a.k(context, qv0.h.LARGE.a());
            switch (a.f117044a[positionInGroup.ordinal()]) {
                case 1:
                    float[] fArr = new float[4];
                    for (int i = 0; i < 4; i++) {
                        fArr[i] = fK;
                    }
                    float[] fArr2 = new float[4];
                    for (int i2 = 0; i2 < 4; i2++) {
                        fArr2[i2] = 0.0f;
                    }
                    fArrW = zhm.p.w(fArr, fArr2);
                    break;
                case 2:
                    fArrW = new float[8];
                    for (int i3 = 0; i3 < 8; i3++) {
                        fArrW[i3] = 0.0f;
                    }
                    break;
                case 3:
                    float[] fArr3 = new float[4];
                    for (int i5 = 0; i5 < 4; i5++) {
                        fArr3[i5] = 0.0f;
                    }
                    float[] fArr4 = new float[4];
                    for (int i6 = 0; i6 < 4; i6++) {
                        fArr4[i6] = fK;
                    }
                    fArrW = zhm.p.w(fArr3, fArr4);
                    break;
                case 4:
                    fArrW = new float[8];
                    for (int i21 = 0; i21 < 8; i21++) {
                        fArrW[i21] = fK;
                    }
                    break;
                case 5:
                case 6:
                    throw new IllegalArgumentException("Background must be null");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArrW, null, null));
            shapeDrawable.getPaint().setColor(color != null ? io0.a.c(context, color) : kli.a.s(f117045a, context));
            insetDrawableQ = q(context, shapeDrawable, positionInGroup, null);
        } else {
            insetDrawableQ = null;
        }
        Drawable layerDrawable = (drawableC == null || insetDrawableQ == null) ? drawableC == null ? insetDrawableQ == null ? null : insetDrawableQ : drawableC : new LayerDrawable(new Drawable[]{drawableC, insetDrawableQ});
        if (z) {
            return l.f(context, fp0.b.f137017a, layerDrawable, null, positionInGroup == qv0.k.OutOfGroup ? rect == null ? e(context, positionInBox) : d(context, rect, positionInBox) : rect == null ? f(context, n(context, positionInBox, positionInGroup), positionInBox, positionInGroup) : f(context, rect, positionInBox, positionInGroup), 8);
        }
        return layerDrawable;
    }

    public static /* synthetic */ Drawable b(qv0.c cVar, qv0.k kVar, Context context, boolean z, Rect rect, int i) {
        if ((i & 32) != 0) {
            rect = null;
        }
        return a(cVar, kVar, context, z, null, rect);
    }

    public static final Drawable c(qv0.c position, Context context, k kVar) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!o(position)) {
            return null;
        }
        if (kVar instanceof i) {
            return new ColorDrawable(io0.a.c(context, ((i) kVar).f117052a));
        }
        if (!Intrinsics.f(kVar, j.f117053a)) {
            if (kVar == null) {
                return new ColorDrawable(kli.a.s(R$attr.uikit_colorWidgetBackground, context));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!jh.d.g(context)) {
            return new ColorDrawable(kli.a.s(R$attr.uikit_colorWidgetBackground, context));
        }
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{kli.a.s(R$attr.uikit_colorWidgetBackground, context), kli.a.s(R$attr.uikit_colorWidgetBackgroundFadeEnd, context)});
    }

    public static final Drawable d(Context context, Rect ripplePadding, qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ripplePadding, "ripplePadding");
        return h(j(context, positionInBox), ripplePadding.left, ripplePadding.top, ripplePadding.right, ripplePadding.bottom);
    }

    public static /* synthetic */ Drawable e(Context context, qv0.c cVar) {
        Rect rect = new Rect();
        l(context, rect, cVar);
        return d(context, rect, cVar);
    }

    public static final Drawable f(Context context, Rect ripplePadding, qv0.c positionInBox, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(ripplePadding, "ripplePadding");
        int iK = Intrinsics.f(positionInBox, c.C1364c.f249512a) ? 0 : kli.a.k(context, 4.0f);
        float fK = k(context, positionInBox, positionInGroup);
        switch (a.f117044a[positionInGroup.ordinal()]) {
            case 1:
                return h(fK, ripplePadding.left - iK, ripplePadding.top - iK, ripplePadding.right - iK, ripplePadding.bottom);
            case 2:
                return h(fK, ripplePadding.left - iK, ripplePadding.top, ripplePadding.right - iK, ripplePadding.bottom);
            case 3:
                return h(fK, ripplePadding.left - iK, ripplePadding.top, ripplePadding.right - iK, ripplePadding.bottom - iK);
            case 4:
                return h(fK, ripplePadding.left - iK, ripplePadding.top - iK, ripplePadding.right - iK, ripplePadding.bottom - iK);
            case 5:
            case 6:
                return e(context, positionInBox);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final LayerDrawable g(Context context, qv0.c positionInBox, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        float fK = k(context, positionInBox, positionInGroup);
        GradientDrawable gradientDrawableI = l.i(context, fK, fK, fK, fK, new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral_50), 192);
        Rect rectN = n(context, positionInBox, positionInGroup);
        return c6d.b.S(gradientDrawableI, rectN.left, rectN.top, rectN.right, rectN.bottom);
    }

    public static final Drawable h(float f, int i, int i2, int i3, int i5) {
        float[] fArr = new float[8];
        for (int i6 = 0; i6 < 8; i6++) {
            fArr[i6] = f;
        }
        return i(fArr, i, i2, i3, i5);
    }

    public static final Drawable i(float[] radii, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(radii, "radii");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(radii, null, null));
        return (i == 0 && i2 == 0 && i3 == 0 && i5 == 0) ? shapeDrawable : new InsetDrawable((Drawable) shapeDrawable, i, i2, i3, i5);
    }

    public static final int j(Context context, qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        if (positionInBox instanceof c.d) {
            return 0;
        }
        if ((positionInBox instanceof c.a) || (positionInBox instanceof c.b) || (positionInBox instanceof c.C1364c) || (positionInBox instanceof c.e) || (positionInBox instanceof c.f)) {
            return kli.a.k(context, qv0.h.LARGE.a());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int k(Context context, qv0.c positionInBox, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        switch (a.f117044a[positionInGroup.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return kli.a.k(context, qv0.h.LARGE.a());
            case 5:
            case 6:
                return j(context, positionInBox);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void l(Context context, Rect rect, qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int iK = kli.a.k(context, 4.0f);
        if ((positionInBox instanceof c.a) || (positionInBox instanceof c.b) || (positionInBox instanceof c.e) || (positionInBox instanceof c.C1364c) || (positionInBox instanceof c.f)) {
            rect.set(iK, iK, iK, iK);
        } else {
            if (!(positionInBox instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            rect.setEmpty();
        }
    }

    public static final void m(Context context, Rect rect, qv0.c positionInBox, qv0.k positionInGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int iK = kli.a.k(context, 4.0f);
        int i = Intrinsics.f(positionInBox, c.C1364c.f249512a) ? iK : iK * 2;
        switch (a.f117044a[positionInGroup.ordinal()]) {
            case 1:
                rect.set(i, i, i, iK);
                return;
            case 2:
                rect.set(i, iK, i, iK);
                return;
            case 3:
                rect.set(i, iK, i, i);
                return;
            case 4:
                rect.set(i, i, i, i);
                return;
            case 5:
            case 6:
                l(context, rect, positionInBox);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ Rect n(Context context, qv0.c cVar, qv0.k kVar) {
        Rect rect = new Rect();
        m(context, rect, cVar, kVar);
        return rect;
    }

    public static final boolean o(qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return (Intrinsics.f(positionInBox, c.d.f249513a) || Intrinsics.f(positionInBox, c.C1364c.f249512a)) ? false : true;
    }

    public static final boolean p(qv0.k positionInGroup, qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return (positionInGroup == qv0.k.OutOfGroup || positionInGroup == qv0.k.Header || Intrinsics.f(positionInBox, c.C1364c.f249512a)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.InsetDrawable q(android.content.Context r9, android.graphics.drawable.ShapeDrawable r10, qv0.k r11, android.graphics.Rect r12) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "background"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "positionInGroup"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            int r9 = kli.a.k(r9, r0)
            int[] r0 = dr0.a.f117044a
            int r11 = r11.ordinal()
            r11 = r0[r11]
            r0 = 0
            switch(r11) {
                case 1: goto L37;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L27;
                case 6: goto L27;
                default: goto L21;
            }
        L21:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L27:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Background must be null"
            r9.<init>(r10)
            throw r9
        L2f:
            r11 = r9
        L30:
            r1 = r11
            goto L39
        L32:
            r1 = r9
            r11 = r0
            goto L39
        L35:
            r11 = r0
            goto L30
        L37:
            r11 = r9
            r1 = r0
        L39:
            if (r12 == 0) goto L3e
            int r2 = r12.left
            goto L3f
        L3e:
            r2 = r0
        L3f:
            int r5 = r9 + r2
            if (r12 == 0) goto L46
            int r2 = r12.top
            goto L47
        L46:
            r2 = r0
        L47:
            int r6 = r11 + r2
            if (r12 == 0) goto L4e
            int r11 = r12.right
            goto L4f
        L4e:
            r11 = r0
        L4f:
            int r7 = r9 + r11
            if (r12 == 0) goto L55
            int r0 = r12.bottom
        L55:
            int r8 = r1 + r0
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.b.q(android.content.Context, android.graphics.drawable.ShapeDrawable, qv0.k, android.graphics.Rect):android.graphics.drawable.InsetDrawable");
    }
}
