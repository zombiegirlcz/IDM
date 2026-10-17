package io0;

import a0.d;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f163133a = {R$attr.uikit_colorBlue, R$attr.uikit_colorBrown, R$attr.uikit_colorCyan, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorDeepPurple, R$attr.uikit_colorGreen, R$attr.uikit_colorIndigo, R$attr.uikit_colorLightBlue, R$attr.uikit_colorOrange, R$attr.uikit_colorPink, R$attr.uikit_colorTeal, R$attr.uikit_colorTerracotta};

    private c() {
    }

    public static int a(int i, int i2, int i3, int i5) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i5;
    }

    public static int b(int i, int i2, ho0.a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i3 = b.f163132a[mode.ordinal()];
        if (i3 == 1) {
            int i5 = i >>> 24;
            int i6 = i2 >>> 24;
            return a((i5 + i6) - ((i5 * i6) / 255), c(h(i), h(i2), i5, i6), c(f(i), f(i2), i5, i6), c(i & 255, i2 & 255, i5, i6));
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i21 = i >>> 24;
        int i22 = i2 >>> 24;
        return a((i21 + i22) - ((i21 * i22) / 255), d(h(i), h(i2), i21, i22), d(f(i), f(i2), i21, i22), d(i & 255, i2 & 255, i21, i22));
    }

    public static int c(int i, int i2, int i3, int i5) {
        int i6 = (i * i3) / 255;
        int i21 = (i2 * i5) / 255;
        int i22 = i21 * 2;
        if (i22 <= i5) {
            return (((255 - i3) * i21) + v0.a.a(255, i5, i6, (i6 * 2) * i21)) / 255;
        }
        return (((((i3 + 255) * i21) + ((i5 + 255) * i6)) - (i22 * i6)) - (i5 * i3)) / 255;
    }

    public static int d(int i, int i2, int i3, int i5) {
        return (((255 - i3) * ((i2 * i5) / 255)) / 255) + ((i * i3) / 255);
    }

    public static int e(float f, int i, int i2) {
        return a(255, g(f, h(i2), h(i)), g(f, f(i2), f(i)), g(f, i2 & 255, i & 255));
    }

    public static int f(int i) {
        return (i >> 8) & 255;
    }

    public static int g(float f, int i, int i2) {
        return (int) d.a(f, i2 / 255.0f, (1 - f) * (i / 255.0f), 255.0f);
    }

    public static int h(int i) {
        return (i >> 16) & 255;
    }
}
