package e3i;

import cli.y;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends oki.h implements i {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final BigDecimal f122314y;
    public final TPSLAmountControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u80.t f122315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qd0.b f122316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f122317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h3i.d f122318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h3i.a f122319t;
    public final n60.a u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f122320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f122321x;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f122314y = bigDecimalValueOf;
    }

    public s(TPSLAmountControllerContract$InputData inputData, u80.t ratesMoneyUtils, qd0.b languageProvider, j60.a bottomDialog, h3i.d errorsDialogProvider, h3i.a stopLimitErrorDialogProvider, n60.a keyboardViewControllerModel, v stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(errorsDialogProvider, "errorsDialogProvider");
        Intrinsics.checkNotNullParameter(stopLimitErrorDialogProvider, "stopLimitErrorDialogProvider");
        Intrinsics.checkNotNullParameter(keyboardViewControllerModel, "keyboardViewControllerModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f122315p = ratesMoneyUtils;
        this.f122316q = languageProvider;
        this.f122317r = bottomDialog;
        this.f122318s = errorsDialogProvider;
        this.f122319t = stopLimitErrorDialogProvider;
        this.u = keyboardViewControllerModel;
        final int i = 0;
        this.v = yhm.j.b(new Function0(this) { // from class: e3i.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f122310b;

            {
                this.f122310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = this.f122310b.o;
                        return ta6.a.F(tPSLAmountControllerContract$InputData.f96977a) ? new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData.f96980g)) : new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData.f));
                    default:
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData2 = this.f122310b.o;
                        return ta6.a.F(tPSLAmountControllerContract$InputData2.f96977a) ? new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData2.f)) : new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData2.f96980g));
                }
            }
        });
        final int i2 = 1;
        this.f122320w = yhm.j.b(new Function0(this) { // from class: e3i.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f122310b;

            {
                this.f122310b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = this.f122310b.o;
                        return ta6.a.F(tPSLAmountControllerContract$InputData.f96977a) ? new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData.f96980g)) : new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData.f));
                    default:
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData2 = this.f122310b.o;
                        return ta6.a.F(tPSLAmountControllerContract$InputData2.f96977a) ? new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData2.f)) : new BigDecimal(String.valueOf(tPSLAmountControllerContract$InputData2.f96980g));
                }
            }
        });
        long j2 = inputData.f96978b;
        long j3 = inputData.f96979c;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(f122314y);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal scale = bigDecimalMultiply.setScale(2, RoundingMode.HALF_DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        long j5 = inputData.f96979c;
        this.f122321x = mra.d.b(this, new j(j2, scale, inputData.f96977a, j5, inputData.d, inputData.e, l.AMOUNT, null, true, false, inputData.f96981h), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f122317r.t()), null, null, new e0b.c(this, null, 10), 3);
    }

    public final BigDecimal I2(k kVar) {
        int i = r.f122313c[this.o.f96977a.ordinal()];
        Lazy lazy = this.f122320w;
        Lazy lazy2 = this.v;
        if (i == 1) {
            int i2 = r.f122312b[kVar.ordinal()];
            if (i2 == 1) {
                return (BigDecimal) lazy2.getValue();
            }
            if (i2 == 2) {
                return (BigDecimal) lazy.getValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = r.f122312b[kVar.ordinal()];
        if (i3 == 1) {
            return ((BigDecimal) lazy.getValue()).abs();
        }
        if (i3 == 2) {
            return ((BigDecimal) lazy2.getValue()).abs();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void J2() {
        l lVar;
        y yVar = this.f122321x;
        int i = r.f122311a[((j) ((j2) yVar.f22677a).getValue()).f122301g.ordinal()];
        if (i == 1) {
            lVar = l.PERCENT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = l.AMOUNT;
        }
        H2(yVar, new e2j.j(lVar, 6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f122321x;
    }
}
