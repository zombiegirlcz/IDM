package p5e;

import ael.k;
import cli.y;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreenContract$InputData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import ox5.r;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements dli.b {
    public final PayoutCalculatorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f233109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f233110q;

    public i(PayoutCalculatorScreenContract$InputData inputData, g mapper, ybl.b instrumentInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(instrumentInteractor, "instrumentInteractor");
        this.o = inputData;
        this.f233109p = instrumentInteractor;
        this.f233110q = mra.d.b(this, new e(inputData.f88897b, inputData.f88898c, null, J2(0), null, 0), mapper, null, false, 12);
    }

    public final dj0.d I2(int i, dj0.d dVar) {
        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = this.o;
        BigDecimal bigDecimal = payoutCalculatorScreenContract$InputData.e;
        BigDecimal bigDecimal2 = payoutCalculatorScreenContract$InputData.d;
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(pyd.c.Y(dVar));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(1000);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        xi0.b bVar = dVar.f115083b;
        BigDecimal bigDecimalDivide = bigDecimalMultiply2.divide(bigDecimalValueOf2, bVar.c(), RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalMultiply3 = bigDecimal2.multiply(pyd.c.Y(dVar));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimalDivide.add(bigDecimalMultiply3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return new dj0.d(pyd.c.W(bigDecimalAdd, bVar), bVar);
    }

    public final BigDecimal J2(int i) {
        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = this.o;
        BigDecimal bigDecimalSubtract = payoutCalculatorScreenContract$InputData.f88898c.subtract(payoutCalculatorScreenContract$InputData.f88897b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(1000);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf2, 2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalAdd = bigDecimalDivide.add(payoutCalculatorScreenContract$InputData.f88897b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(((k) this.f233109p).f(this.o.f88896a)), null, new r(this, null, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f233110q;
    }
}
