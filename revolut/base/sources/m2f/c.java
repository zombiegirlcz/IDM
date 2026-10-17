package m2f;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f201965a;

    public c(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        s80.b bVar = (s80.b) languageProvider;
        char cL = oc.c.l(bVar.b());
        char cK = oc.c.k(bVar.b());
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(bVar.b());
        decimalFormatSymbols.setGroupingSeparator(cL);
        decimalFormatSymbols.setDecimalSeparator(cK);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", decimalFormatSymbols);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(2);
        this.f201965a = decimalFormat;
    }
}
