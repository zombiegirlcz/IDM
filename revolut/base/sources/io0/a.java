package io0;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import jo0.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import rim.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int a(String seed) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        int[] iArr = c.f163133a;
        Intrinsics.checkNotNullParameter(seed, "seed");
        int iP = d0.P(seed);
        int i = 0;
        if (iP >= 0) {
            int iCharAt = 0;
            while (true) {
                iCharAt = ((iCharAt * 59) + seed.charAt(i)) % 12;
                if (i == iP) {
                    break;
                }
                i++;
            }
            i = iCharAt;
        }
        return c.f163133a[i];
    }

    public static final int b(float f, int i) {
        return ColorUtils.setAlphaComponent(i, d.c((Color.alpha(i) / 255.0f) * f * 255));
    }

    public static final int c(Context context, com.revolut.core.ui.models.Color color) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        if (color instanceof Color.SolidInt) {
            return ((Color.SolidInt) color).f51465b;
        }
        if (color instanceof Color.Solid) {
            return kli.a.s(((Color.Solid) color).f51464b, context);
        }
        if (color instanceof Color.SolidRes) {
            return ContextCompat.getColor(context, ((Color.SolidRes) color).f51466b);
        }
        if (color instanceof Color.Composite) {
            Color.Composite composite = (Color.Composite) color;
            int iS = kli.a.s(composite.getF51458b(), context);
            int iS2 = kli.a.s(composite.getF51459c(), context);
            int[] iArr = c.f163133a;
            return c.b(iS2, iS, composite.getD());
        }
        if (color instanceof Color.Opaque) {
            Color.Opaque opaque = (Color.Opaque) color;
            int iS3 = kli.a.s(opaque.getF51462b(), context);
            int iS4 = kli.a.s(R$attr.uikit_colorBackground, context);
            int[] iArr2 = c.f163133a;
            return c.e(opaque.getF51463c(), iS3, iS4);
        }
        if (!(color instanceof Color.ModifiedColor)) {
            throw new NoWhenBranchMatchedException();
        }
        Color.ModifiedColor modifiedColor = (Color.ModifiedColor) color;
        int iC = c(context, modifiedColor.getF51460b());
        return ((Boolean) g.m().getValue()).booleanValue() ? b(modifiedColor.getF51461c(), iC) : d(modifiedColor.getF51461c(), iC);
    }

    public static final int d(float f, int i) {
        return ColorUtils.setAlphaComponent(i, d.c(f * 255));
    }
}
