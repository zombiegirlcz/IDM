package rdj;

import aw0.p9;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements pcj.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a61.a f253469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f253470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f253471c;
    public final List d;

    public h(a61.a commodityPriceTargetsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(commodityPriceTargetsInteractor, "commodityPriceTargetsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f253469a = commodityPriceTargetsInteractor;
        this.f253470b = dateProvider;
        od0.i.Companion.getClass();
        ihm.b bVarE = ihm.b.e(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f253471c = bVarE;
        this.d = v.k(10L, 30L, 60L);
    }

    public static PercentageClause a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        MathContext mathContext = MathContext.DECIMAL128;
        BigDecimal bigDecimalDivide = bigDecimal2.divide(bigDecimal, mathContext);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(100, mathContext));
        Intrinsics.h(bigDecimalMultiply);
        return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), (Style) null, 4);
    }
}
