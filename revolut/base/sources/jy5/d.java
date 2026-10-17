package jy5;

import d9.e1;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import x8h.g;
import xzg.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f179329a;

    public d(g collectionsInteractor) {
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        this.f179329a = collectionsInteractor;
    }

    public static final i a(d dVar, xzg.g gVar) {
        dVar.getClass();
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalDivide = gVar.f309991c.f310002a.divide(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalAdd = ONE.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalSubtract = e1.Z(bigDecimalAdd).subtract(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new i(gVar.d, bigDecimalAdd, a0.d.r(bigDecimalSubtract.toPlainString(), "%"));
    }
}
