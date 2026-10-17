package bp0;

import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.NumberClause;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f17503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17505c;

    public l(j numberClausePrinter, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(numberClausePrinter, "numberClausePrinter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f17503a = numberClausePrinter;
        this.f17504b = te0.w.y0(new k(languageProvider, 0));
        this.f17505c = te0.w.y0(new k(languageProvider, 1));
    }

    public static NumberClause.Format.FixedDigitsAfterDot a(l lVar, int i) {
        return new NumberClause.Format.FixedDigitsAfterDot(i, p9.ONLY_NEGATIVE, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.DOWN);
    }
}
