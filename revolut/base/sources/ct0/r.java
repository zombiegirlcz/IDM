package ct0;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private r() {
    }

    public static t a(int i) {
        return (i == R$attr.uikit_colorGreen || i == R$attr.uikit_colorPerformancePositive) ? t.POSITIVE : (i == R$attr.uikit_colorRed || i == R$attr.uikit_colorPerformanceNegative) ? t.NEGATIVE : (i == R$attr.uikit_colorDeepGrey || i == R$attr.uikit_colorPerformanceStatic) ? t.STATIC : i == R$attr.uikit_colorOrange ? t.WARNING : t.BASIC;
    }
}
