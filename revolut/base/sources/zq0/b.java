package zq0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import qv0.h;
import qv0.k;
import zhm.d0;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private b() {
    }

    public static InsetDrawable a(Drawable drawable, qv0.c cVar, int i, int i2) {
        if ((cVar instanceof c.f) || (cVar instanceof c.b) || (cVar instanceof c.e) || (cVar instanceof c.a)) {
            return new InsetDrawable(drawable, 0, 0, i, i2);
        }
        if ((cVar instanceof c.C1364c) || (cVar instanceof c.d)) {
            throw new IllegalStateException("Background not drawn for this position");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static RippleDrawable b(Context context, Drawable drawable, InsetDrawable insetDrawable, InsetDrawable insetDrawable2, Drawable drawable2) {
        ArrayList arrayList = new ArrayList();
        if (drawable != null && insetDrawable != null) {
            arrayList.add(drawable);
            arrayList.add(insetDrawable);
        } else if (drawable != null) {
            arrayList.add(drawable);
        } else if (insetDrawable != null) {
            arrayList.add(insetDrawable);
        }
        if (insetDrawable2 != null) {
            arrayList.add(insetDrawable2);
        }
        Drawable layerDrawable = arrayList.size() > 1 ? new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])) : arrayList.size() == 1 ? (Drawable) d0.b0(arrayList) : null;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        return new RippleDrawable(colorStateListValueOf, layerDrawable, drawable2);
    }

    public static Drawable c(boolean z, Context context, qv0.c cVar, k kVar) {
        float[] fArrW;
        float fK = kli.a.k(context, h.LARGE.a());
        if (z) {
            float[] fArr = new float[2];
            for (int i = 0; i < 2; i++) {
                fArr[i] = fK;
            }
            float[] fArr2 = new float[4];
            for (int i2 = 0; i2 < 4; i2++) {
                fArr2[i2] = 0.0f;
            }
            float[] fArrW2 = p.w(fArr, fArr2);
            float[] fArr3 = new float[2];
            for (int i3 = 0; i3 < 2; i3++) {
                fArr3[i3] = fK;
            }
            fArrW = p.w(fArrW2, fArr3);
        } else {
            float[] fArr4 = new float[2];
            for (int i5 = 0; i5 < 2; i5++) {
                fArr4[i5] = 0.0f;
            }
            float[] fArr5 = new float[4];
            for (int i6 = 0; i6 < 4; i6++) {
                fArr5[i6] = fK;
            }
            float[] fArrW3 = p.w(fArr4, fArr5);
            float[] fArr6 = new float[2];
            for (int i21 = 0; i21 < 2; i21++) {
                fArr6[i21] = 0.0f;
            }
            fArrW = p.w(fArrW3, fArr6);
        }
        Rect rectN = dr0.b.n(context, cVar, kVar);
        int iK = Intrinsics.f(cVar, c.C1364c.f249512a) ? 0 : kli.a.k(context, 4.0f);
        switch (a.f324345a[kVar.ordinal()]) {
            case 1:
                return dr0.b.i(fArrW, !z ? 0 : rectN.left - iK, rectN.top, z ? 0 : rectN.right - iK, rectN.bottom);
            case 2:
                return dr0.b.i(fArrW, !z ? 0 : rectN.left - iK, rectN.top - iK, z ? 0 : rectN.right - iK, rectN.bottom - iK);
            case 3:
                return dr0.b.i(fArrW, !z ? 0 : rectN.left - iK, rectN.top, z ? 0 : rectN.right - iK, rectN.bottom - iK);
            case 4:
                return dr0.b.i(fArrW, !z ? 0 : rectN.left - iK, rectN.top - iK, z ? 0 : rectN.right - iK, rectN.bottom);
            case 5:
            case 6:
                return dr0.b.i(fArrW, !z ? 0 : rectN.left, rectN.top, z ? 0 : rectN.right, rectN.bottom);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(View leftColumnBackgroundContainer, View rightColumnBackgroundContainer, qv0.c positionInBox, k positionInGroup, boolean z, boolean z3) {
        InsetDrawable insetDrawableQ;
        Drawable drawableA;
        boolean z4;
        InsetDrawable insetDrawableQ2;
        float[] fArrW;
        float[] fArrW2;
        float f;
        int iK;
        Intrinsics.checkNotNullParameter(leftColumnBackgroundContainer, "leftColumnBackgroundContainer");
        Intrinsics.checkNotNullParameter(rightColumnBackgroundContainer, "rightColumnBackgroundContainer");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
        Context context = leftColumnBackgroundContainer.getContext();
        boolean z6 = context.getResources().getConfiguration().getLayoutDirection() == 1;
        boolean zP = dr0.b.p(positionInGroup, positionInBox);
        Drawable drawableC = dr0.b.o(positionInBox) ? dr0.b.c(positionInBox, context, null) : null;
        if (drawableC == null) {
            drawableC = null;
        } else if (!zP) {
            drawableC = a(drawableC, positionInBox, z ? kli.a.k(context, 2.0f) : 0, z3 ? kli.a.k(context, 2.0f) : 0);
        }
        if (zP) {
            float fK = kli.a.k(context, h.LARGE.a());
            switch (a.f324345a[positionInGroup.ordinal()]) {
                case 1:
                    fArrW2 = new float[8];
                    for (int i = 0; i < 8; i++) {
                        fArrW2[i] = 0.0f;
                    }
                    break;
                case 2:
                    float[] fArr = new float[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        fArr[i2] = fK;
                    }
                    float[] fArr2 = new float[4];
                    for (int i3 = 0; i3 < 4; i3++) {
                        fArr2[i3] = 0.0f;
                    }
                    float[] fArrW3 = p.w(fArr, fArr2);
                    float[] fArr3 = new float[2];
                    for (int i5 = 0; i5 < 2; i5++) {
                        fArr3[i5] = fK;
                    }
                    fArrW2 = p.w(fArrW3, fArr3);
                    break;
                case 3:
                    float[] fArr4 = new float[6];
                    for (int i6 = 0; i6 < 6; i6++) {
                        fArr4[i6] = 0.0f;
                    }
                    float[] fArr5 = new float[2];
                    for (int i21 = 0; i21 < 2; i21++) {
                        fArr5[i21] = fK;
                    }
                    fArrW2 = p.w(fArr4, fArr5);
                    break;
                case 4:
                    float[] fArr6 = new float[2];
                    for (int i22 = 0; i22 < 2; i22++) {
                        fArr6[i22] = fK;
                    }
                    float[] fArr7 = new float[6];
                    for (int i32 = 0; i32 < 6; i32++) {
                        fArr7[i32] = 0.0f;
                    }
                    fArrW2 = p.w(fArr6, fArr7);
                    break;
                case 5:
                case 6:
                    throw new IllegalArgumentException("Group position \"" + positionInGroup + "\" does not support background");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArrW2, null, null));
            shapeDrawable.getPaint().setColor(kli.a.s(dr0.b.f117045a, context));
            if (z) {
                f = 2.0f;
                iK = kli.a.k(context, 2.0f) + (-kli.a.k(context, 4.0f));
            } else {
                f = 2.0f;
                iK = -kli.a.k(context, 4.0f);
            }
            insetDrawableQ = dr0.b.q(context, shapeDrawable, positionInGroup, new Rect(0, 0, iK, z3 ? kli.a.k(context, f) : 0));
        } else {
            insetDrawableQ = null;
        }
        RippleDrawable rippleDrawableB = b(context, drawableC, insetDrawableQ, null, c(true, context, positionInBox, positionInGroup));
        boolean zP2 = dr0.b.p(positionInGroup, positionInBox);
        Drawable drawableC2 = dr0.b.o(positionInBox) ? dr0.b.c(positionInBox, context, null) : null;
        if (drawableC2 != null) {
            drawableA = zP2 ? drawableC2 : a(drawableC2, positionInBox, 0, z3 ? kli.a.k(context, 2.0f) : 0);
        } else {
            drawableA = null;
        }
        if (dr0.b.p(positionInGroup, positionInBox)) {
            float fK2 = kli.a.k(context, h.LARGE.a());
            switch (a.f324345a[positionInGroup.ordinal()]) {
                case 1:
                    float[] fArr8 = new float[8];
                    for (int i33 = 0; i33 < 8; i33++) {
                        fArr8[i33] = 0.0f;
                    }
                    fArrW = fArr8;
                    break;
                case 2:
                    float[] fArr9 = new float[2];
                    for (int i43 = 0; i43 < 2; i43++) {
                        fArr9[i43] = 0.0f;
                    }
                    float[] fArr10 = new float[4];
                    for (int i59 = 0; i59 < 4; i59++) {
                        fArr10[i59] = fK2;
                    }
                    float[] fArrW4 = p.w(fArr9, fArr10);
                    float[] fArr11 = new float[2];
                    for (int i66 = 0; i66 < 2; i66++) {
                        fArr11[i66] = 0.0f;
                    }
                    fArrW = p.w(fArrW4, fArr11);
                    break;
                case 3:
                    float[] fArr12 = new float[4];
                    for (int i74 = 0; i74 < 4; i74++) {
                        fArr12[i74] = 0.0f;
                    }
                    float[] fArr13 = new float[2];
                    for (int i92 = 0; i92 < 2; i92++) {
                        fArr13[i92] = fK2;
                    }
                    float[] fArrW5 = p.w(fArr12, fArr13);
                    float[] fArr14 = new float[2];
                    for (int i96 = 0; i96 < 2; i96++) {
                        fArr14[i96] = 0.0f;
                    }
                    fArrW = p.w(fArrW5, fArr14);
                    break;
                case 4:
                    float[] fArr15 = new float[2];
                    for (int i99 = 0; i99 < 2; i99++) {
                        fArr15[i99] = 0.0f;
                    }
                    float[] fArr16 = new float[2];
                    for (int i100 = 0; i100 < 2; i100++) {
                        fArr16[i100] = fK2;
                    }
                    float[] fArrW6 = p.w(fArr15, fArr16);
                    float[] fArr17 = new float[4];
                    for (int i101 = 0; i101 < 4; i101++) {
                        fArr17[i101] = 0.0f;
                    }
                    fArrW = p.w(fArrW6, fArr17);
                    break;
                case 5:
                case 6:
                    throw new IllegalArgumentException("Group position \"" + positionInGroup + "\" does not support background");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArrW, null, null));
            shapeDrawable2.getPaint().setColor(kli.a.s(dr0.b.f117045a, context));
            z4 = false;
            insetDrawableQ2 = dr0.b.q(context, shapeDrawable2, positionInGroup, new Rect(-kli.a.k(context, 4.0f), 0, 0, z3 ? kli.a.k(context, 2.0f) : 0));
        } else {
            z4 = false;
            insetDrawableQ2 = null;
        }
        RippleDrawable rippleDrawableB2 = b(context, drawableA, insetDrawableQ2, null, c(z4, context, positionInBox, positionInGroup));
        if (z6) {
            leftColumnBackgroundContainer.setBackground(rippleDrawableB2);
            rightColumnBackgroundContainer.setBackground(rippleDrawableB);
        } else {
            leftColumnBackgroundContainer.setBackground(rippleDrawableB);
            rightColumnBackgroundContainer.setBackground(rippleDrawableB2);
        }
    }
}
