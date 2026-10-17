package ha4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import mx4.u;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f150452a;

    public n(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f150452a = contentImageMapper;
    }

    public static BigDecimal a(dj0.d dVar, dj0.d dVar2) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(100L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(bigDecimalValueOf2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(dVar2.f115082a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf3, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a3, code lost:
    
        r13.add(new com.revolut.core.ui_kit.delegates.RowDelegate.Model(r7.f230877a, new com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage.Image40(r53.f150452a.a(r7.f230879c), null, null, false, null, false, 62), new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_down_payment_source_v2_details_sources_source_title, zhm.u.c(r7.f230878b), null, 12), null, 0, new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_down_payment_source_v2_details_sources_source_description, zhm.u.c(new com.revolut.core.ui_kit.models.PercentageClause(a(r4.f150445b, r2), (com.revolut.core.ui_kit.models.PercentageClause.Format) null, (com.revolut.core.ui_kit.models.Style) null, 6)), null, 12), null, null, 0, new com.revolut.core.ui_kit.delegates.qf(r4.f150445b, null, false, false, 30), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        r1 = r1;
     */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r54) {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha4.n.c(cli.j):cli.o");
    }
}
