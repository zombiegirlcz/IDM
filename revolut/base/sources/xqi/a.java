package xqi;

import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f308177a = R$attr.uikit_colorPerformancePositive;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f308178b = R$attr.uikit_colorPerformanceNegative;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f308179c = R$attr.uikit_colorGreyTone50;
    public static final int d = R$drawable.uikit_icn_10_stocks_arrow_up;
    public static final int e = R$drawable.uikit_icn_10_stocks_arrow_down;

    public static final CompositeClause a(BigDecimal bigDecimal, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        boolean z6 = bigDecimalAbs.compareTo(bigDecimalValueOf) < 0;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return c(bigDecimal, z6, false, z, z3, z4, 64);
    }

    public static /* synthetic */ CompositeClause b(BigDecimal bigDecimal, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(bigDecimal, z, (i & 2) != 0, (i & 4) == 0);
    }

    public static CompositeClause c(BigDecimal bigDecimal, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, int i) {
        ImageClause imageClause;
        RoundingMode roundingMode = RoundingMode.DOWN;
        boolean z12 = (i & 1) != 0 ? true : z;
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        boolean z29 = (i & 4) != 0 ? true : z3;
        boolean z31 = (i & 8) != 0 ? true : z4;
        boolean z41 = (i & 16) != 0 ? true : z6;
        boolean z49 = (i & 32) != 0 ? false : z11;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        int iD = d(bigDecimal, z12, roundingMode);
        Integer numValueOf = Integer.valueOf(f308177a);
        Integer numValueOf2 = Integer.valueOf(f308178b);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        ImageClauseTint color = ImageClauseTint.TextColor.f57790a;
        Custom custom = null;
        if (iD > 0 && z41) {
            if (z31) {
                color = new ImageClauseTint.Color(iIntValue);
            }
            imageClause = new ImageClause(d, color, (Float) null, (Float) null, 28);
        } else if (iD >= 0 || !z41) {
            imageClause = null;
        } else {
            if (z31) {
                color = new ImageClauseTint.Color(iIntValue2);
            }
            imageClause = new ImageClause(e, color, (Float) null, (Float) null, 28);
        }
        m70.a.t(t0.f186434a);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (iD == 0 || !z41) {
            textClause = null;
        }
        PercentageClause.Format.Custom custom2 = new PercentageClause.Format.Custom(z12 ? 2 : 0, z49 ? p9.ALWAYS : p9.NEVER, z29 ? wa.STRIP_ALL_TRAILING_ZEROES : wa.SHOW_ALL_ZEROES, roundingMode);
        if (z31) {
            if (iD <= 0) {
                iIntValue = iD < 0 ? iIntValue2 : f308179c;
            }
            custom = new Custom(Integer.valueOf(iIntValue), false, null, false, null, 254);
        }
        Clause[] elements = {imageClause, textClause, new PercentageClause(bigDecimal, custom2, custom)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(d.L(elements), null, null, null, 14);
    }

    public static final int d(BigDecimal bigDecimal, boolean z, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal scale = bigDecimal.setScale(z ? 2 : 0, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (scale.compareTo(bigDecimal2) == 0) {
            return 0;
        }
        return scale.compareTo(bigDecimal2) > 0 ? 1 : -1;
    }
}
