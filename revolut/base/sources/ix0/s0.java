package ix0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import androidx.core.graphics.ColorUtils;
import aw0.q8;
import aw0.s8;
import aw0.x8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.drawables.SmoothEdgesBitmapDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f169288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f169289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f169290c;
        public long d;

        public final void a(int i) {
            this.f169288a += (long) Color.red(i);
            this.f169289b += (long) Color.green(i);
            this.f169290c += (long) Color.blue(i);
            this.d++;
        }

        public final int b() {
            long j2 = this.d;
            if (j2 > 0) {
                return Color.rgb((int) (this.f169288a / j2), (int) (this.f169289b / j2), (int) (this.f169290c / j2));
            }
            return 0;
        }
    }

    private s0() {
    }

    public static int a(Context context, boolean z, boolean z3, int i) {
        if (z && z3) {
            float[] fArr = new float[3];
            Color.colorToHSV(i, fArr);
            fArr[2] = Math.min(fArr[2], 0.1f);
            return Color.HSVToColor(fArr);
        }
        if (!z || z3) {
            return kli.a.s(R$attr.uikit_colorBackground, context);
        }
        float[] fArr2 = new float[3];
        Color.colorToHSV(i, fArr2);
        fArr2[1] = Math.min(fArr2[1], 0.1f);
        fArr2[2] = 0.96f;
        return Color.HSVToColor(fArr2);
    }

    public static x8 b(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.s(R$attr.uikit_colorBackground, context);
        boolean zG = jh.d.g(context);
        boolean zQ = kli.a.q(context);
        int iA = a(context, zG, zQ, iS);
        aw0.v1 v1Var = aw0.v1.DARK;
        return new x8(v1Var, kli.a.s(R$attr.uikit_colorWhite_20, context), iS, h(zQ, iA, iS, v1Var, z), iA, iS);
    }

    public static x8 c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d(new ColorDrawable(0), context, s8.DEFAULT);
    }

    public static x8 d(Drawable drawable, Context context, s8 paletteType) {
        t0 t0VarG;
        int iD;
        int iD2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paletteType, "paletteType");
        boolean zG = jh.d.g(context);
        boolean zQ = kli.a.q(context);
        if ((drawable instanceof ColorDrawable) && ((ColorDrawable) drawable).getColor() == 0) {
            boolean z = zG && zQ;
            aw0.v1.Companion.getClass();
            aw0.v1 v1VarA = aw0.t1.a(context);
            if (zQ) {
                v1VarA = aw0.v1.DARK;
            }
            aw0.v1 v1Var = v1VarA;
            int i = u0.f169314a[v1Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int[] iArr = io0.c.f163133a;
                iD2 = io0.a.d(0.5f, io0.c.b(io0.a.d(0.2f, -16777216), -1, ho0.a.SRC_OVER));
            } else if (z) {
                iD2 = kli.a.s(R$attr.uikit_colorWhite_20, context);
            } else {
                int[] iArr2 = io0.c.f163133a;
                iD2 = io0.a.d(0.75f, io0.c.b(io0.a.d(0.25f, -1), -16777216, ho0.a.SRC_OVER));
            }
            int i2 = iD2;
            int iS = kli.a.s(R$attr.uikit_colorBackground, context);
            int iA = a(context, zG, zQ, iS);
            return new x8(v1Var, i2, iS, zG ? new q8(iA, iA, BitmapDescriptorFactory.HUE_RED, true) : null, iA, 0);
        }
        if ((zG || paletteType != s8.INTRICATE) && (t0VarG = g(context, drawable)) != null) {
            int i3 = t0VarG.f169308a;
            aw0.v1 v1VarF = f(i3);
            aw0.v1 v1Var2 = zQ ? aw0.v1.DARK : v1VarF;
            s8 s8Var = s8.INTRICATE;
            int iS2 = paletteType == s8Var ? kli.a.s(R$attr.uikit_colorBackground, context) : v1Var2 == aw0.v1.LIGHT ? ColorUtils.blendARGB(i3, -16777216, 0.1f) : ColorUtils.calculateContrast(-1, ColorUtils.setAlphaComponent(i3, 255)) >= 17.5d ? ColorUtils.blendARGB(i3, -1, 0.005f) : ColorUtils.blendARGB(i3, -16777216, 0.3f);
            int i5 = t0VarG.f169310c;
            int iA2 = a(context, zG, zQ, i5);
            q8 q8VarH = h(zQ, iA2, i5, v1VarF, paletteType != s8.DEFAULT);
            int i6 = t0VarG.f169309b;
            if (paletteType == s8Var) {
                iD = kli.a.s(R$attr.uikit_colorWhite_20, context);
            } else if (v1VarF == aw0.v1.LIGHT) {
                int[] iArr3 = io0.c.f163133a;
                iD = io0.a.d(0.75f, io0.c.b(io0.a.d(0.2f, -16777216), i6, ho0.a.SRC_OVER));
            } else {
                int[] iArr4 = io0.c.f163133a;
                iD = io0.a.d(0.75f, io0.c.b(io0.a.d(0.3f, -1), i6, ho0.a.SRC_OVER));
            }
            return new x8(v1Var2, iD, iS2, q8VarH, iA2, t0VarG.f169308a);
        }
        return b(context, true);
    }

    public static t0 e(Context context, Bitmap bitmap) {
        a aVar;
        int i;
        int i2;
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return new t0(0, 0, 0);
        }
        a aVar2 = new a();
        int iK = kli.a.k(context, 120.0f);
        a[] aVarArr = new a[4];
        for (int i3 = 0; i3 < 4; i3++) {
            aVarArr[i3] = new a();
        }
        int width = bitmap.getWidth() / 4;
        if (width < 1) {
            width = 1;
        }
        int height = bitmap.getHeight() - iK;
        int width2 = (int) (bitmap.getWidth() * 0.75f);
        int height2 = (int) (bitmap.getHeight() * 0.6f);
        int width3 = (bitmap.getWidth() - width2) / 2;
        int height3 = (bitmap.getHeight() - height2) / 2;
        a[] aVarArr2 = new a[4];
        for (int i5 = 0; i5 < 4; i5++) {
            aVarArr2[i5] = new a();
        }
        int i6 = height2 / 4;
        if (i6 < 1) {
            i6 = 1;
        }
        int height4 = bitmap.getHeight() / 100;
        if (height4 < 1) {
            height4 = 1;
        }
        int width4 = bitmap.getWidth() / 100;
        if (width4 < 1) {
            width4 = 1;
        }
        kotlin.ranges.c cVarN = kotlin.ranges.f.n(height4, kotlin.ranges.f.o(0, bitmap.getHeight()));
        int i21 = cVarN.f186448a;
        int i22 = cVarN.f186449b;
        int i32 = cVarN.f186450c;
        if ((i32 > 0 && i21 <= i22) || (i32 < 0 && i22 <= i21)) {
            while (true) {
                int i33 = i6;
                kotlin.ranges.c cVarN2 = kotlin.ranges.f.n(width4, kotlin.ranges.f.o(0, bitmap.getWidth()));
                int i43 = cVarN2.f186448a;
                int i59 = width;
                int i66 = cVarN2.f186449b;
                int i74 = cVarN2.f186450c;
                if ((i74 > 0 && i43 <= i66) || (i74 < 0 && i66 <= i43)) {
                    i = width2;
                    while (true) {
                        int pixel = bitmap.getPixel(i43, i21);
                        aVar2.a(pixel);
                        aVar = aVar2;
                        if (i43 <= width3 || i43 >= width3 + i || i21 <= height3 || i21 >= height3 + height2) {
                            i2 = height2;
                        } else {
                            Intrinsics.checkNotNullParameter(aVarArr2, "<this>");
                            i2 = height2;
                            aVarArr2[kotlin.ranges.f.g((i21 - height3) / i33, 0, 3)].a(pixel);
                        }
                        if (i21 > height && i21 < height + iK) {
                            Intrinsics.checkNotNullParameter(aVarArr, "<this>");
                            aVarArr[kotlin.ranges.f.g(i43 / i59, 0, 3)].a(pixel);
                        }
                        if (i43 == i66) {
                            break;
                        }
                        i43 += i74;
                        aVar2 = aVar;
                        height2 = i2;
                    }
                } else {
                    aVar = aVar2;
                    i = width2;
                    i2 = height2;
                }
                if (i21 == i22) {
                    break;
                }
                i21 += i32;
                i6 = i33;
                width = i59;
                width2 = i;
                aVar2 = aVar;
                height2 = i2;
            }
        } else {
            aVar = aVar2;
        }
        int iB = aVar.b();
        a aVar3 = aVarArr2[0];
        Intrinsics.checkNotNullParameter(aVarArr2, "<this>");
        double dCalculateContrast = ColorUtils.calculateContrast(iB, aVar3.b());
        int i92 = 1;
        while (true) {
            a aVar4 = aVarArr2[i92];
            double dCalculateContrast2 = ColorUtils.calculateContrast(iB, aVar4.b());
            if (Double.compare(dCalculateContrast, dCalculateContrast2) < 0) {
                aVar3 = aVar4;
                dCalculateContrast = dCalculateContrast2;
            }
            if (i92 == 3) {
                break;
            }
            i92++;
        }
        int iB2 = aVar3.b();
        a aVar5 = aVarArr[0];
        Intrinsics.checkNotNullParameter(aVarArr, "<this>");
        double dCalculateContrast3 = ColorUtils.calculateContrast(iB, aVar5.b());
        int i96 = 1;
        while (true) {
            a aVar6 = aVarArr[i96];
            double dCalculateContrast4 = ColorUtils.calculateContrast(iB, aVar6.b());
            if (Double.compare(dCalculateContrast3, dCalculateContrast4) > 0) {
                aVar5 = aVar6;
                dCalculateContrast3 = dCalculateContrast4;
            }
            if (i96 == 3) {
                return new t0(iB, iB2, aVar5.b());
            }
            i96++;
        }
    }

    public static aw0.v1 f(int i) {
        return ColorUtils.calculateContrast(-1, ColorUtils.setAlphaComponent(i, 255)) >= 2.5d ? aw0.v1.DARK : aw0.v1.LIGHT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t0 g(Context context, Drawable drawable) {
        if (drawable instanceof TransitionDrawable) {
            TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
            if (transitionDrawable.getNumberOfLayers() > 0) {
                return g(context, transitionDrawable.getDrawable(transitionDrawable.getNumberOfLayers() - 1));
            }
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            return e(context, bitmap);
        }
        if (drawable instanceof yy0.c) {
            return e(context, ((SmoothEdgesBitmapDrawable) ((yy0.c) drawable)).f59829a);
        }
        if (!(drawable instanceof ColorDrawable)) {
            return null;
        }
        ColorDrawable colorDrawable = (ColorDrawable) drawable;
        return new t0(colorDrawable.getColor(), colorDrawable.getColor(), colorDrawable.getColor());
    }

    public static q8 h(boolean z, int i, int i2, aw0.v1 v1Var, boolean z3) {
        float fMin;
        float f;
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        if (!z && v1Var == aw0.v1.DARK) {
            fMin = Math.min(fArr[2], 0.8f);
            if (z3) {
                f = 0.2f;
                fMin -= f;
            }
        } else if (!z && v1Var == aw0.v1.LIGHT) {
            fMin = Math.min(fArr[2], 0.9f);
        } else if (z) {
            fMin = fArr[2] - 0.6f;
            if (z3) {
                f = 0.1f;
                fMin -= f;
            }
        } else {
            fMin = fArr[2];
        }
        if (fMin < 0.15f) {
            fMin = 0.15f;
        }
        fArr[2] = Math.min(fArr[2], fMin);
        return new q8(i, Color.HSVToColor(fArr), (z3 && z) || ((z3 && v1Var == aw0.v1.DARK) || (v1Var == aw0.v1.LIGHT && z)) ? 1.0f : BitmapDescriptorFactory.HUE_RED, false);
    }
}
