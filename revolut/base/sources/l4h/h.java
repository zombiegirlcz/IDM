package l4h;

import aw0.db;
import aw0.k7;
import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import d9.t0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.o0;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.MoneyClause a(ej0.b r10, nel.z r11, nel.n r12, boolean r13) {
        /*
            java.lang.String r0 = "money"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "instrumentType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.revolut.core.ui_kit.models.MoneyClause r1 = new com.revolut.core.ui_kit.models.MoneyClause
            dj0.d r2 = d9.t0.D(r10, r12)
            com.revolut.core.ui_kit.models.MoneyClause$Format$Headers r3 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Headers
            int[] r10 = l4h.g.f192132a
            int r11 = r11.ordinal()
            r10 = r10[r11]
            r11 = 1
            if (r10 == r11) goto L29
            r11 = 2
            if (r10 == r11) goto L27
            r11 = 3
            if (r10 == r11) goto L29
            com.revolut.core.model.money.ScaleMode$PrettyFormat r10 = com.revolut.core.model.money.ScaleMode.PrettyFormat.f51440a
        L25:
            r5 = r10
            goto L2c
        L27:
            r10 = 0
            goto L25
        L29:
            com.revolut.core.model.money.ScaleMode$TradingPrecise r10 = com.revolut.core.model.money.ScaleMode.TradingPrecise.f51443a
            goto L25
        L2c:
            r7 = 0
            r9 = 13
            r4 = 0
            r6 = 0
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            aw0.o9 r5 = aw0.o9.NON_SENSITIVE
            r6 = 4
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l4h.h.a(ej0.b, nel.z, nel.n, boolean):com.revolut.core.ui_kit.models.MoneyClause");
    }

    public static PercentageClause b(BigDecimal percentage) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        BigDecimal bigDecimalMultiply = percentage.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 2, p9.ONLY_NEGATIVE, wa.SHOW_ALL_ZEROES, null), (Style) null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l4h.f c(eel.k r29, com.revolut.core.ui_kit.delegates.TrendViewDelegate.a r30, eel.c r31, eel.i r32, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r33, boolean r34, nel.n r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4h.h.c(eel.k, com.revolut.core.ui_kit.delegates.TrendViewDelegate$a, eel.c, eel.i, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker, boolean, nel.n, boolean):l4h.f");
    }

    public static Clause d(BigDecimal balanceDelta, String currentCurrency, nel.n nVar, boolean z, BigDecimal balanceDeltaPercentage, Clause clause, ScaleMode scaleMode) {
        Clause clauseW;
        Intrinsics.checkNotNullParameter(balanceDelta, "balanceDelta");
        Intrinsics.checkNotNullParameter(currentCurrency, "currentCurrency");
        Intrinsics.checkNotNullParameter(balanceDeltaPercentage, "balanceDeltaPercentage");
        xi0.b.Companion.getClass();
        Clause moneyClause = new MoneyClause(t0.D(new ej0.b(balanceDelta, xi0.a.a(currentCurrency)), nVar), new MoneyClause.Format.Defaults(k7.ALWAYS, scaleMode, z, false, 8), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, db.EMPHASIS2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), o9.NON_SENSITIVE);
        if (balanceDelta.compareTo(BigDecimal.ZERO) != 0) {
            moneyClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(moneyClause, l9.l.N(balanceDeltaPercentage)));
        }
        return (clause == null || (clauseW = yoj.b.w(yoj.b.w(moneyClause, new TextClause(" · ", (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122)), clause)) == null) ? moneyClause : clauseW;
    }

    public static boolean e(InstrumentTicker instrumentTicker) {
        if ((instrumentTicker != null ? instrumentTicker.f105111a : null) != o0.INDEX) {
            return false;
        }
        xi0.b bVar = instrumentTicker.e.f115083b;
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar, xi0.b.f306271c);
    }

    public static Clause f(long j2, eel.c cVar, boolean z) {
        Custom custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254);
        switch (g.f192134c[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new CompositeClause(v.k(new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), null, null, 12), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
            case 4:
                return new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), custom, null, 8);
            case 5:
            case 6:
            case 7:
                if (!z) {
                    if (LocalDate.now().minusMonths(6).compareTo((ReadablePartial) new LocalDate(j2)) <= 0) {
                        return new TimeClause(j2, new TimeClause.Format.DayAndMonth(0), custom, null, 8);
                    }
                }
                return new TimeClause(j2, TimeClause.Format.DateLong.f57962b, custom, null, 8);
            case 8:
                throw new IllegalArgumentException("Year to date period is not available in stock details");
            case 9:
                throw new IllegalArgumentException("Ten years period is not available in stock details");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
