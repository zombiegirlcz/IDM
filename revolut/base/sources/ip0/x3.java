package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 {
    private x3() {
    }

    public static z3 a(x3 x3Var, float f, w3 colorVariant, y3 lineStyle, int i) {
        if ((i & 2) != 0) {
            colorVariant = w3.DEFAULT;
        }
        if ((i & 4) != 0) {
            lineStyle = y3.DEFAULT;
        }
        x3Var.getClass();
        Intrinsics.checkNotNullParameter(colorVariant, "colorVariant");
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        return new z3(f, colorVariant, lineStyle);
    }
}
