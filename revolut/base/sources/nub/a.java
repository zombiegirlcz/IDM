package nub;

import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$plurals;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.SpareChangeAmount;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f219272a = new c(new NumberClause.Format.FixedDigitsAfterDot(0, 14, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f219273b = R$attr.uikit_colorPurple;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f219274c = R$attr.uikit_colorIndigo;

    public static final RevPoints a(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dj0.d.Companion.getClass();
        if (!Intrinsics.f(dVar, dj0.d.e)) {
            return new RevPoints(dVar);
        }
        RevPoints.INSTANCE.getClass();
        return RevPoints.Companion.a(0L);
    }

    public static final NumberClause.Format b(BigDecimal bigDecimal, g gVar) {
        NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot;
        NumberClause.Format fixedDigitsAfterDot2;
        if (gVar instanceof d) {
            fixedDigitsAfterDot2 = NumberClause.Format.Default.f57900a;
        } else if (gVar instanceof b) {
            fixedDigitsAfterDot2 = new NumberClause.Format.FixedDigitsAfterDot(0, ((b) gVar).f219275a, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.FLOOR);
        } else {
            if (gVar instanceof e) {
                fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(2, ((e) gVar).f219278a, wa.SHOW_ALL_ZEROES, RoundingMode.DOWN);
            } else if (gVar instanceof f) {
                fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(2, ((f) gVar).f219279a, wa.SHOW_ALL_ZEROES, RoundingMode.DOWN);
            } else {
                if (!(gVar instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                fixedDigitsAfterDot2 = ((c) gVar).f219276a;
            }
            fixedDigitsAfterDot2 = fixedDigitsAfterDot;
        }
        if (fixedDigitsAfterDot2 instanceof NumberClause.Format.AllDigitsAfterDot) {
            if ((bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).scale() > 0) {
                return (NumberClause.Format.AllDigitsAfterDot) fixedDigitsAfterDot2;
            }
            wa trailingZeroPolicy = wa.STRIP_ALL_TRAILING_ZEROES;
            p9 signShowingPolicy = ((NumberClause.Format.AllDigitsAfterDot) fixedDigitsAfterDot2).f57898b;
            Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
            Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
            return new NumberClause.Format.AllDigitsAfterDot(trailingZeroPolicy, signShowingPolicy);
        }
        boolean z = fixedDigitsAfterDot2 instanceof NumberClause.Format.FixedDigitsAfterDot;
        NumberClause.Format format = fixedDigitsAfterDot2;
        if (z) {
            NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot3 = (NumberClause.Format.FixedDigitsAfterDot) fixedDigitsAfterDot2;
            BigDecimal scale = bigDecimal.setScale(fixedDigitsAfterDot3.f57901a, fixedDigitsAfterDot3.f57902b);
            Intrinsics.h(scale);
            format = fixedDigitsAfterDot3;
            if ((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).scale() <= 0) {
                return NumberClause.Format.FixedDigitsAfterDot.a(fixedDigitsAfterDot3, wa.STRIP_ALL_TRAILING_ZEROES, 11);
            }
        }
        return format;
    }

    public static final CompositeClause c(BigDecimal bigDecimal, o9 o9Var, boolean z, g gVar, Integer num, float f, ImageClauseTint imageClauseTint) {
        List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_rev_points_default, imageClauseTint, Float.valueOf(f), Float.valueOf(f), 16), new NumberClause(bigDecimal, b(bigDecimal, gVar), num != null ? new Custom(num, false, null, false, null, 254) : null, o9Var));
        TextLocalisedQuantityClause textLocalisedQuantityClauseD = d(bigDecimal, null, gVar, o9Var);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, z ? new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new Custom(null, false, null, false, null, 239), textLocalisedQuantityClauseD);
    }

    public static final TextLocalisedQuantityClause d(BigDecimal bigDecimal, Style style, g gVar, o9 o9Var) {
        return new TextLocalisedQuantityClause(R$plurals.rev_points_transaction_balance_negative, bigDecimal, u.c(new NumberClause(bigDecimal, b(bigDecimal, gVar), (Style) null, o9Var)), style, 8);
    }

    public static final TextLocalisedQuantityClause e(int i, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(revPoints, "<this>");
        return new TextLocalisedQuantityClause(i, Integer.valueOf(revPoints.b().intValue()), u.c(i(revPoints, null, f219272a, null, 5)), (Style) null, 24);
    }

    public static final dj0.d f(SpareChangeAmount spareChangeAmount, double d) {
        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String str = spareChangeAmount.f84080b;
        aVar.getClass();
        int iC = xi0.a.a(str).c();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(spareChangeAmount.f84079a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new dj0.d(bigDecimalValueOf.divide(new BigDecimal(String.valueOf(d)), 6 - iC, RoundingMode.DOWN).movePointLeft(iC).movePointRight(6).longValue(), xi0.a.a("PTS"));
    }

    public static Clause g(dj0.d dVar, Custom custom, b bVar, o9 sensitivity, int i) {
        if ((i & 1) != 0) {
            custom = null;
        }
        Custom custom2 = custom;
        g format = bVar;
        if ((i & 2) != 0) {
            format = new e(0);
        }
        if ((i & 4) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        if (!Intrinsics.f(dVar.f115083b.f306286a, "PTS")) {
            return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom2, null, 8);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new NumberClause(bigDecimalValueOf, b(bigDecimalValueOf, format), custom2, sensitivity);
    }

    public static NumberClause h(double d, g format, o9 sensitivity, int i) {
        if ((i & 2) != 0) {
            format = new e(0);
        }
        if ((i & 4) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        return new NumberClause(bigDecimal, b(bigDecimal, format), (Style) null, sensitivity);
    }

    public static NumberClause i(RevPoints revPoints, Custom custom, g format, o9 sensitivity, int i) {
        if ((i & 1) != 0) {
            custom = null;
        }
        if ((i & 2) != 0) {
            format = new e(0);
        }
        if ((i & 4) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(revPoints, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        BigDecimal bigDecimalB = revPoints.b();
        return new NumberClause(bigDecimalB, b(bigDecimalB, format), custom, sensitivity);
    }

    public static NumberClause j(BigDecimal bigDecimal, o9 sensitivity, int i) {
        e format = new e(0);
        if ((i & 4) != 0) {
            sensitivity = o9.SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new NumberClause(bigDecimal, b(bigDecimal, format), (Style) null, sensitivity);
    }

    public static CompositeClause k(double d, o9 sensitivity, e format, Integer num, float f, ImageClauseTint.Color color, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            format = new e(0);
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            f = 14.0f;
        }
        if ((i & 32) != 0) {
            color = null;
        }
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(format, "format");
        return c(new BigDecimal(String.valueOf(d)), sensitivity, z, format, num, f, color);
    }

    public static CompositeClause l(RevPoints revPoints, o9 sensitivity, g gVar, Integer num, float f, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            gVar = new e(0);
        }
        g format = gVar;
        Integer num2 = (i & 8) != 0 ? null : num;
        if ((i & 16) != 0) {
            f = 14.0f;
        }
        float f4 = f;
        ImageClauseTint.TextColor textColor = (i & 32) == 0 ? ImageClauseTint.TextColor.f57790a : null;
        Intrinsics.checkNotNullParameter(revPoints, "<this>");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(format, "format");
        return c(revPoints.b(), sensitivity, z, format, num2, f4, textColor);
    }

    public static CompositeClause m(String str, o9 sensitivity, TextClause textClause, Integer num) {
        Float fValueOf = Float.valueOf(14.0f);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_rev_points_default, (ImageClauseTint) null, fValueOf, fValueOf, 16), new TextClause(str, (Style) new Custom(num, false, null, false, null, 254), (Integer) null, false, sensitivity, (List) null, LDSFile.EF_DG12_TAG));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(null, false, null, false, null, 239), textClause);
    }

    public static CompositeClause n(BigDecimal bigDecimal, o9 sensitivity, float f, Integer num, int i) {
        boolean z = (i & 2) == 0;
        e format = new e(0);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(format, "format");
        return c(bigDecimal, sensitivity, z, format, num, f, null);
    }

    public static final TextLocalisedQuantityClause o(RevPoints revPoints, Style style, g format, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(revPoints, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return d(revPoints.b(), style, format, sensitivity);
    }

    public static TextLocalisedQuantityClause p(double d, Custom custom, b bVar, int i) {
        if ((i & 1) != 0) {
            custom = null;
        }
        g format = bVar;
        if ((i & 2) != 0) {
            format = new e(0);
        }
        o9 sensitivity = o9.SENSITIVE;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return d(new BigDecimal(String.valueOf(d)), custom, format, sensitivity);
    }

    public static /* synthetic */ TextLocalisedQuantityClause q(RevPoints revPoints, Style style, g gVar, o9 o9Var, int i) {
        if ((i & 1) != 0) {
            style = null;
        }
        if ((i & 2) != 0) {
            gVar = new e(0);
        }
        if ((i & 4) != 0) {
            o9Var = o9.SENSITIVE;
        }
        return o(revPoints, style, gVar, o9Var);
    }

    public static TextLocalisedQuantityClause r(BigDecimal bigDecimal, Style style, o9 sensitivity, int i) {
        if ((i & 1) != 0) {
            style = null;
        }
        e format = new e(0);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return d(bigDecimal, style, format, sensitivity);
    }

    public static final LayeredImage s() {
        List listK = v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_gradient_background, (Color) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_revpoints, new Color.Solid(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_INSIDE, 60));
        Float fValueOf = Float.valueOf(40.0f);
        return new LayeredImage(listK, fValueOf, fValueOf, 8);
    }
}
