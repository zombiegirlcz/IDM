package u80;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f278028c = new Locale("pl", "SP");
    public static final Locale d = new Locale("pl", "PL");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DecimalFormat f278029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f278030b;

    public d(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        locale = Intrinsics.f(locale, f278028c) ? d : locale;
        this.f278030b = locale;
        this.f278029a = oc.c.i(locale);
    }

    public final String a(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.f278029a.format(value);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final int b() {
        String positivePrefix = this.f278029a.getPositivePrefix();
        Intrinsics.checkNotNullExpressionValue(positivePrefix, "getPositivePrefix(...)");
        return (positivePrefix.length() > 0 ? 1 : 0) ^ 1;
    }

    public final String c() {
        String currencySymbol = this.f278029a.getDecimalFormatSymbols().getCurrencySymbol();
        Intrinsics.checkNotNullExpressionValue(currencySymbol, "getCurrencySymbol(...)");
        return currencySymbol;
    }

    public final char d() {
        return this.f278029a.getDecimalFormatSymbols().getMonetaryDecimalSeparator();
    }

    public final void e(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        DecimalFormat decimalFormat = this.f278029a;
        DecimalFormatSymbols it8 = decimalFormat.getDecimalFormatSymbols();
        Intrinsics.h(it8);
        Intrinsics.checkNotNullParameter(it8, "it");
        it8.setCurrencySymbol(value);
        Unit unit = Unit.f186387a;
        decimalFormat.setDecimalFormatSymbols(it8);
    }

    public final void f(int i) {
        this.f278029a.setMaximumFractionDigits(i);
    }

    public final void g(RoundingMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f278029a.setRoundingMode(value.ordinal());
    }
}
