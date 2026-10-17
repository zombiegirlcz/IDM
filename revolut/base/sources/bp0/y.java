package bp0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import aw0.db;
import aw0.fa;
import aw0.ga;
import aw0.ha;
import aw0.k7;
import aw0.l3;
import aw0.n9;
import aw0.o9;
import aw0.s1;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Color;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.FilterClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LabelBadgeInternalClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NameClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderQuantityClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TextWithHighlightsClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.b0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ty0.c {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f17530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u80.t f17531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f17532c;
    public final h01.g d;
    public final wn0.a e;
    public final t70.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u80.m f17533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f17534h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f17535j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f17536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f17537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f17538n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f17539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f17540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oy0.a f17541r;

    public y(f90.b pluralFormatter, t70.g localization, u80.t ratesMoneyUtils, qd0.b languageProvider, h01.g sensitiveDataManager, wn0.a otaStringsRepository, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
        Intrinsics.checkNotNullParameter(otaStringsRepository, "otaStringsRepository");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f17530a = localization;
        this.f17531b = ratesMoneyUtils;
        this.f17532c = languageProvider;
        this.d = sensitiveDataManager;
        this.e = otaStringsRepository;
        this.f = currenciesLocalization;
        this.f17533g = new u80.m(languageProvider);
        this.f17534h = yhm.j.b(new bc1.b(this, 19));
        d dVar = new d(pluralFormatter, languageProvider, localization);
        this.i = dVar;
        this.f17535j = new q(localization, languageProvider, dVar);
        j jVar = new j(languageProvider);
        this.k = jVar;
        this.f17536l = new l(jVar, languageProvider);
        this.f17537m = new n(localization);
        this.f17538n = new f();
        this.o = new g();
        this.f17539p = new b();
        this.f17540q = new c();
        this.f17541r = oy0.a.f230869a;
    }

    public static ScaleMode d(ScaleMode scaleMode, int i) {
        if (scaleMode instanceof ScaleMode.SimpleLen) {
            ScaleMode.SimpleLen simpleLen = (ScaleMode.SimpleLen) scaleMode;
            int f51441a = simpleLen.getF51441a();
            if (i > f51441a) {
                i = f51441a;
            }
            return ScaleMode.SimpleLen.a(simpleLen, i);
        }
        if (scaleMode.equals(ScaleMode.CryptoHoldingFormat.f51439a) || scaleMode.equals(ScaleMode.TradingPrecise.f51443a) || scaleMode.equals(ScaleMode.PrettyFormat.f51440a)) {
            return scaleMode;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void f(Context context, db dbVar, SpannableStringBuilder spannableStringBuilder, int i) {
        int i2;
        switch (x.d[dbVar.ordinal()]) {
            case 1:
                i2 = R$attr.internal_textAppearanceDisplay1;
                break;
            case 2:
                i2 = R$attr.internal_textAppearanceDisplay2;
                break;
            case 3:
                i2 = R$attr.internal_textAppearanceHeading1;
                break;
            case 4:
                i2 = R$attr.internal_textAppearanceHeading2;
                break;
            case 5:
                i2 = R$attr.internal_textAppearanceHeading3;
                break;
            case 6:
                i2 = R$attr.internal_textAppearanceEmphasis1;
                break;
            case 7:
                i2 = R$attr.internal_textAppearanceEmphasis2;
                break;
            case 8:
                i2 = R$attr.internal_textAppearanceEmphasis3;
                break;
            case 9:
                i2 = R$attr.internal_textAppearanceEmphasis4;
                break;
            case 10:
                i2 = R$attr.internal_textAppearanceBody1;
                break;
            case 11:
                i2 = R$attr.internal_textAppearanceBody2;
                break;
            case 12:
                i2 = R$attr.internal_textAppearanceBody3;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, kli.a.x(i2, context)), 0, spannableStringBuilder.length(), i);
    }

    public static int k(int i) {
        if (i <= 255) {
            return ((255 - i) << 16) & 16711680;
        }
        throw new IllegalStateException("The recursion level must not be more than 255");
    }

    public static String n(int i) {
        return j6.a.l(i, "%", "$uikit%");
    }

    public static MoneyClause x(AssetClause assetClause, MoneyClause.Format format) {
        BigDecimal bigDecimalC = assetClause.getF57731a();
        BigDecimal bigDecimalPow = BigDecimal.TEN.pow(assetClause.getF57731a().scale());
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        BigDecimal bigDecimalMultiply = bigDecimalC.multiply(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new MoneyClause(new dj0.d(bigDecimalMultiply.longValueExact(), new xi0.b(4, assetClause.getF57733c(), Integer.valueOf(assetClause.getF57731a().scale()))), format, assetClause.getD(), assetClause.getD());
    }

    public static u80.e y(k7 k7Var) {
        int i = x.f17527a[k7Var.ordinal()];
        if (i == 1) {
            return u80.e.UNSIGNED;
        }
        if (i == 2) {
            return u80.e.SIGNED;
        }
        if (i == 3) {
            return u80.e.SIGNED_ONLY_NEGATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [bp0.t] */
    public final void e(final SpannableStringBuilder spannableStringBuilder, final Clause clause, Style style, final Context context, final Function3 function3, ty0.g gVar, int i, final ty0.b bVar) {
        String str;
        int iK = k(i);
        if (style instanceof Click) {
            Click click = (Click) style;
            spannableStringBuilder.setSpan(new b0(context, click.e, click.d, click.f57745c, v(clause), bVar, new bib.b(function3, style, spannableStringBuilder, clause, 2)), 0, spannableStringBuilder.length(), iK);
            return;
        }
        if (!(style instanceof Custom)) {
            if (!(style instanceof Color)) {
                throw new NoWhenBranchMatchedException();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((Color) style).getF57746a()), 0, spannableStringBuilder.length(), iK);
            return;
        }
        Custom custom = (Custom) style;
        db dbVar = custom.f57759c;
        Custom.Color color = custom.f57757a;
        if (color instanceof Custom.Color.Solid) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(kli.a.s(((Custom.Color.Solid) color).getF57767a(), context)), 0, spannableStringBuilder.length(), iK);
        } else if (color instanceof Custom.Color.SolidInt) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((Custom.Color.SolidInt) color).getF57768a()), 0, spannableStringBuilder.length(), iK);
        } else if (color instanceof Custom.Color.Gradient) {
            String string = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            spannableStringBuilder.setSpan(new ep0.o(context, (Custom.Color.Gradient) color, string), 0, spannableStringBuilder.length(), iK);
        } else if (color instanceof Custom.Color.Highlight) {
            Custom.Color.Highlight highlight = (Custom.Color.Highlight) color;
            Integer f57766b = highlight.getF57766b();
            if (f57766b != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(kli.a.s(f57766b.intValue(), context)), 0, spannableStringBuilder.length(), iK);
            }
            spannableStringBuilder.setSpan(new BackgroundColorSpan(kli.a.s(highlight.getF57765a(), context)), 0, spannableStringBuilder.length(), iK);
        } else if (color != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (custom.f57758b) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), iK);
        }
        if (custom.e) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i5 = i3 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    spannableStringBuilder.replace(i3, i5, " ");
                }
                i2++;
                i3 = i5;
            }
        }
        if (custom.f) {
            int i6 = 0;
            int i21 = 0;
            while (i6 < spannableStringBuilder.length()) {
                spannableStringBuilder.charAt(i6);
                int i22 = i21 + 1;
                if (i21 % 2 == 0 && i21 != spannableStringBuilder.length() - 1) {
                    spannableStringBuilder.insert(i22, "\ufeff");
                }
                i6++;
                i21 = i22;
            }
        }
        if (gVar instanceof ty0.d) {
            if (dbVar != null) {
                f(context, dbVar, spannableStringBuilder, iK);
            }
        } else if (gVar instanceof ty0.e) {
            if (dbVar != null && (str = custom.f57761h) != null && ((ty0.e) gVar).a().contains(str)) {
                f(context, dbVar, spannableStringBuilder, iK);
            }
        } else if (!(gVar instanceof ty0.f)) {
            throw new NoWhenBranchMatchedException();
        }
        Custom.LinkifyMode linkifyMode = custom.f57760g;
        if (!(linkifyMode instanceof Custom.LinkifyMode.Enabled)) {
            if (!Intrinsics.f(linkifyMode, Custom.LinkifyMode.Disabled.f57769a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            final Custom.LinkifyMode.Enabled enabled = (Custom.LinkifyMode.Enabled) linkifyMode;
            com.revolut.core.android.spannable.a aVarA = new e80.i(context).a(enabled.getF57770a(), enabled.getF57771b(), new s(function3, clause, 0));
            aVarA.b(spannableStringBuilder, new Function2() { // from class: bp0.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    String url2 = (String) obj2;
                    Intrinsics.checkNotNullParameter(url2, "url");
                    Intrinsics.checkNotNullParameter((String) obj3, "<unused var>");
                    Custom.LinkifyMode.Enabled enabled2 = enabled;
                    Integer num = enabled2.f57772c;
                    boolean z = enabled2.f57771b;
                    y yVar = this;
                    Clause clause2 = clause;
                    return new b0(context, num, z, false, yVar.v(clause2), bVar, new bib.b(function3, url2, spannableStringBuilder, clause2, 1));
                }
            });
            spannableStringBuilder.replace(0, spannableStringBuilder.length(), (CharSequence) aVarA.d());
        }
    }

    public final boolean g(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (!(clause instanceof fa) || !(((fa) clause).getD() instanceof Click)) {
            if (clause instanceof CompositeClause) {
                List list = ((CompositeClause) clause).f57747a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!g((Clause) list.get(i))) {
                    }
                }
                return false;
            }
            if (clause instanceof TextLocalisedClause) {
                List list2 = ((TextLocalisedClause) clause).f57941b;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj2 = list2.get(i2);
                    if (!(obj2 instanceof Clause) || !g((Clause) obj2)) {
                    }
                }
                return false;
            }
            if (clause instanceof TextLocalisedGenderClause) {
                List list3 = ((TextLocalisedGenderClause) clause).f57945c;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj3 = list3.get(i3);
                    if (!(obj3 instanceof Clause) || !g((Clause) obj3)) {
                    }
                }
                return false;
            }
            if (clause instanceof TextLocalisedGenderQuantityClause) {
                ArrayList arrayList = ((TextLocalisedGenderQuantityClause) clause).d;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    Object obj4 = arrayList.get(i5);
                    if (!(obj4 instanceof Clause) || !g((Clause) obj4)) {
                    }
                }
                return false;
            }
            if (clause instanceof TextLocalisedQuantityClause) {
                List list4 = ((TextLocalisedQuantityClause) clause).f57951c;
                int size5 = list4.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    Object obj5 = list4.get(i6);
                    if (!(obj5 instanceof Clause) || !g((Clause) obj5)) {
                    }
                }
                return false;
            }
            if (clause instanceof TextClause) {
                List list5 = ((TextClause) clause).f;
                int size6 = list5.size();
                for (int i21 = 0; i21 < size6; i21++) {
                    if (!g((Clause) list5.get(i21))) {
                    }
                }
                return false;
            }
            if (clause instanceof TrackableClause) {
                return g(((TrackableClause) clause).f57984b);
            }
            if (clause instanceof CustomContentDescriptionClause) {
                return g(((CustomContentDescriptionClause) clause).getF57953a());
            }
            if (clause instanceof FilterClause) {
                return g(((FilterClause) clause).getF57953a());
            }
            if (clause instanceof CapitalizedClause) {
                return g(((CapitalizedClause) clause).getF57953a());
            }
            if (clause instanceof TextWithHighlightsClause) {
                return g(((TextWithHighlightsClause) clause).getF57953a());
            }
            if ((clause instanceof HtmlClause) || (clause instanceof HtmlLocalisedClause)) {
                return true;
            }
            if ((clause instanceof NameClause) || (clause instanceof AssetClause) || (clause instanceof CharSequenceClause) || (clause instanceof ImageClause) || (clause instanceof MoneyClause) || (clause instanceof NumberClause) || (clause instanceof PercentageClause) || (clause instanceof RateClause) || (clause instanceof TimeClause) || (clause instanceof CurrencyClause) || (clause instanceof CountryClause) || (clause instanceof TimeRangeClause) || (clause instanceof PeriodClause) || (clause instanceof LabelBadgeInternalClause) || (clause instanceof DotDividerClause)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    public final boolean h(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        boolean z = (clause instanceof n9) && ((n9) clause).getD() == o9.SENSITIVE;
        if (!z) {
            if (!(clause instanceof CompositeClause)) {
                if (clause instanceof TextLocalisedClause) {
                    return m(((TextLocalisedClause) clause).f57941b);
                }
                if (clause instanceof TextLocalisedGenderClause) {
                    return m(((TextLocalisedGenderClause) clause).f57945c);
                }
                if (clause instanceof TextLocalisedQuantityClause) {
                    return m(((TextLocalisedQuantityClause) clause).f57951c);
                }
                if (clause instanceof TextLocalisedGenderQuantityClause) {
                    return m(((TextLocalisedGenderQuantityClause) clause).d);
                }
                if (clause instanceof TextClause) {
                    return m(((TextClause) clause).f);
                }
                if (clause instanceof TrackableClause) {
                    return h(((TrackableClause) clause).f57984b);
                }
                if (clause instanceof CustomContentDescriptionClause) {
                    return h(((CustomContentDescriptionClause) clause).getF57953a());
                }
                if (clause instanceof FilterClause) {
                    return h(((FilterClause) clause).getF57953a());
                }
                if (clause instanceof CapitalizedClause) {
                    return h(((CapitalizedClause) clause).getF57953a());
                }
                if ((clause instanceof MoneyClause) || (clause instanceof AssetClause)) {
                    return z;
                }
                if (clause instanceof TextWithHighlightsClause) {
                    return h(((TextWithHighlightsClause) clause).getF57953a());
                }
                if ((clause instanceof CharSequenceClause) || (clause instanceof RateClause) || (clause instanceof HtmlClause) || (clause instanceof HtmlLocalisedClause) || (clause instanceof ImageClause) || (clause instanceof TimeClause) || (clause instanceof TimeRangeClause) || (clause instanceof NumberClause) || (clause instanceof PercentageClause) || (clause instanceof CountryClause) || (clause instanceof CurrencyClause) || (clause instanceof PeriodClause) || (clause instanceof NameClause) || (clause instanceof LabelBadgeInternalClause) || (clause instanceof DotDividerClause)) {
                    return z;
                }
                throw new NoWhenBranchMatchedException();
            }
            CompositeClause compositeClause = (CompositeClause) clause;
            if (!m(compositeClause.f57747a)) {
                Clause clause2 = compositeClause.f57748b;
                if (!(clause2 != null ? h(clause2) : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean i(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (clause instanceof TimeClause) {
            return true;
        }
        if (clause instanceof CompositeClause) {
            List list = ((CompositeClause) clause).f57747a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i((Clause) list.get(i))) {
                    return true;
                }
            }
            return false;
        }
        if (clause instanceof TextLocalisedClause) {
            List list2 = ((TextLocalisedClause) clause).f57941b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj2 = list2.get(i2);
                if ((obj2 instanceof Clause) && i((Clause) obj2)) {
                    return true;
                }
            }
            return false;
        }
        if (clause instanceof TextLocalisedGenderClause) {
            List list3 = ((TextLocalisedGenderClause) clause).f57945c;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Object obj3 = list3.get(i3);
                if ((obj3 instanceof Clause) && i((Clause) obj3)) {
                    return true;
                }
            }
            return false;
        }
        if (clause instanceof TextLocalisedGenderQuantityClause) {
            ArrayList arrayList = ((TextLocalisedGenderQuantityClause) clause).d;
            int size4 = arrayList.size();
            for (int i5 = 0; i5 < size4; i5++) {
                Object obj4 = arrayList.get(i5);
                if ((obj4 instanceof Clause) && i((Clause) obj4)) {
                    return true;
                }
            }
            return false;
        }
        if (clause instanceof TextLocalisedQuantityClause) {
            List list4 = ((TextLocalisedQuantityClause) clause).f57951c;
            int size5 = list4.size();
            for (int i6 = 0; i6 < size5; i6++) {
                Object obj5 = list4.get(i6);
                if ((obj5 instanceof Clause) && i((Clause) obj5)) {
                    return true;
                }
            }
            return false;
        }
        if (clause instanceof TextClause) {
            List list5 = ((TextClause) clause).f;
            int size6 = list5.size();
            for (int i21 = 0; i21 < size6; i21++) {
                if (i((Clause) list5.get(i21))) {
                    return true;
                }
            }
        } else {
            if (clause instanceof TrackableClause) {
                return i(((TrackableClause) clause).f57984b);
            }
            if (clause instanceof TextWithHighlightsClause) {
                return i(((TextWithHighlightsClause) clause).getF57953a());
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0e7b  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0ee2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0f38  */
    /* JADX WARN: Type inference failed for: r0v202, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v204, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v209, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder j(com.revolut.core.ui_kit.models.Clause r34, final android.content.Context r35, final kotlin.jvm.functions.Function3 r36, ty0.g r37, int r38, boolean r39, java.lang.String r40, final ty0.b r41, aw0.ha r42) {
        /*
            Method dump skipped, instruction units count: 3907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp0.y.j(com.revolut.core.ui_kit.models.Clause, android.content.Context, kotlin.jvm.functions.Function3, ty0.g, int, boolean, java.lang.String, ty0.b, aw0.ha):android.text.SpannableStringBuilder");
    }

    public final void l(Clause clause, TextView textView, Function1 function1, ty0.g handleTypeface) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        pyd.c.c(textView).d(clause, function1, handleTypeface);
    }

    public final boolean m(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Object obj2 : list2) {
            if ((obj2 instanceof Clause) && h((Clause) obj2)) {
                return true;
            }
        }
        return false;
    }

    public final Clause o(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        cp0.b bVarJ = mo3.a.j(textView);
        if (bVarJ != null) {
            return bVarJ.e;
        }
        return null;
    }

    public final String p(ResourceId resourceId, String str, List list) {
        if (resourceId instanceof ResourceId.IntResourceId) {
            return q((ResourceId.IntResourceId) resourceId, str, list);
        }
        if (!(resourceId instanceof ResourceId.StringResourceId)) {
            throw new NoWhenBranchMatchedException();
        }
        ResourceId.StringResourceId stringResourceId = (ResourceId.StringResourceId) resourceId;
        t70.g gVar = this.f17530a;
        if (str != null) {
            String f57935a = stringResourceId.getF57935a();
            Object[] array = list.toArray(new Object[0]);
            return gVar.r(f57935a, str, Arrays.copyOf(array, array.length));
        }
        String f57935a2 = stringResourceId.getF57935a();
        Object[] array2 = list.toArray(new Object[0]);
        return gVar.l(f57935a2, Arrays.copyOf(array2, array2.length));
    }

    public final String q(ResourceId.IntResourceId intResourceId, String str, List list) {
        t70.g gVar = this.f17530a;
        if (str != null) {
            int i = intResourceId.f57934a;
            Object[] array = list.toArray(new Object[0]);
            return gVar.f(i, str, Arrays.copyOf(array, array.length));
        }
        int i2 = intResourceId.f57934a;
        Object[] array2 = list.toArray(new Object[0]);
        return gVar.i(i2, Arrays.copyOf(array2, array2.length));
    }

    public final ex0.c r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ex0.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return (ex0.c) ex0.c.e.e(new a01.c(context.getApplicationContext(), 9));
    }

    public final void s(TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        cp0.b bVarC = pyd.c.c(textView);
        boolean z3 = bVarC.f107764p;
        if (z3 != z) {
            boolean z4 = bVarC.o;
            boolean z6 = true;
            boolean z11 = z4 || z3;
            bVarC.f107764p = z;
            if (!z4 && !z) {
                z6 = false;
            }
            if (z11 != z6) {
                bVarC.b(bVarC.f107755a, bVarC.a());
                bVarC.c();
            }
        }
    }

    public final boolean t(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (clause instanceof ga) {
            return true;
        }
        if ((clause instanceof fa) && (((fa) clause).getD() instanceof Click)) {
            return true;
        }
        if (clause instanceof CompositeClause) {
            CompositeClause compositeClause = (CompositeClause) clause;
            Clause clause2 = compositeClause.f57748b;
            if (pd.b.j(clause2 != null ? Boolean.valueOf(t(clause2)) : null)) {
                return true;
            }
            List list = compositeClause.f57747a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (t((Clause) list.get(i))) {
                    return true;
                }
            }
        } else if (clause instanceof s1) {
            List f = ((s1) clause).getF57945c();
            int size2 = f.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj2 = f.get(i2);
                Clause clause3 = obj2 instanceof Clause ? (Clause) obj2 : null;
                if (pd.b.j(clause3 != null ? Boolean.valueOf(t(clause3)) : null)) {
                    return true;
                }
            }
        } else if (clause instanceof l3) {
            return t(((l3) clause).getF57953a());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249 A[PHI: r1
      0x0249: PHI (r1v20 ??) = (r1v19 ??), (r1v38 ??) binds: [B:115:0x022c, B:119:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [bp0.y] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence u(com.revolut.core.ui_kit.models.ResourceId r17, java.util.List r18, android.content.Context r19, kotlin.jvm.functions.Function3 r20, java.lang.Number r21, bj0.b r22, com.revolut.core.ui_kit.models.Clause r23, ty0.g r24, boolean r25, int r26, boolean r27, java.lang.String r28, ty0.b r29) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp0.y.u(com.revolut.core.ui_kit.models.ResourceId, java.util.List, android.content.Context, kotlin.jvm.functions.Function3, java.lang.Number, bj0.b, com.revolut.core.ui_kit.models.Clause, ty0.g, boolean, int, boolean, java.lang.String, ty0.b):java.lang.CharSequence");
    }

    public final Clause v(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        boolean z = this.d.a() == h01.c.HIDDEN;
        this.f17541r.getClass();
        return oy0.a.g(clause, z);
    }

    public final void w(TextView textView, ha stylingMode) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(stylingMode, "stylingMode");
        cp0.b bVarC = pyd.c.c(textView);
        Intrinsics.checkNotNullParameter(stylingMode, "stylingMode");
        if (bVarC.f107766r != stylingMode) {
            bVarC.f107766r = stylingMode;
            bVarC.b(bVarC.f107755a, bVarC.a());
        }
    }
}
