package hzj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.retail.feature.limits.impl.R$string;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mha.n;
import mha.o;
import mha.p;
import mha.s;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import wtc.x;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();
    public static final Custom e = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
    public static final Custom f = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TextClause f157206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TextClause f157207h;
    public static final TextClause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f157208j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f157209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zyj.a f157210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f157211c;
    public final gte.a d;

    static {
        m70.a.c(t0.f186434a);
        f157206g = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        f157207h = new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        i = new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        com.revolut.feature.wallets.api.module.a[] elements = {com.revolut.feature.wallets.api.module.a.ANNUAL_LRS, com.revolut.feature.wallets.api.module.a.BALANCE_MCY, com.revolut.feature.wallets.api.module.a.DAILY_INBOUND_MCY, com.revolut.feature.wallets.api.module.a.DIRECT_DEBIT_MONTHLY, com.revolut.feature.wallets.api.module.a.MX_FCY_BALANCE, com.revolut.feature.wallets.api.module.a.MONETISATION, com.revolut.feature.wallets.api.module.a.ATM_ROLLING_MONTH, com.revolut.feature.wallets.api.module.a.ATM_ROLLING_DAY};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f157208j = kotlin.collections.d.y0(elements);
    }

    public e(al2.a atmNetworkStrategy, qd0.b languageProvider, zyj.a limitsPlanAppConfig, x securityHubMigratedCounterLimitInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(atmNetworkStrategy, "atmNetworkStrategy");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(limitsPlanAppConfig, "limitsPlanAppConfig");
        Intrinsics.checkNotNullParameter(securityHubMigratedCounterLimitInteractor, "securityHubMigratedCounterLimitInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f157209a = languageProvider;
        this.f157210b = limitsPlanAppConfig;
        this.f157211c = securityHubMigratedCounterLimitInteractor;
        this.d = featureToggleInteractor;
    }

    public static TextLocalisedClause b(e eVar, int i2, List list, int i3) {
        if ((i3 & 2) != 0) {
            list = f0.f322471a;
        }
        eVar.getClass();
        eVar.getClass();
        return new TextLocalisedClause(i2, list, e, 8);
    }

    public static int e(s sVar) {
        if (!e0.y(sVar) && q(sVar)) {
            return R$attr.uikit_colorRed_10;
        }
        return R$attr.uikit_colorAccent_10;
    }

    public static int f(s sVar) {
        if (!e0.y(sVar) && q(sVar)) {
            return R$attr.uikit_colorRed;
        }
        return R$attr.uikit_colorAccent;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(hzj.e r31, mha.s r32, hha.d r33, boolean r34, l71.d r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hzj.e.g(hzj.e, mha.s, hha.d, boolean, l71.d, int):java.util.List");
    }

    public static MoneyClause h(dj0.d dVar, Style style) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), style, null, 8);
    }

    public static Clause j(p pVar, Style style) {
        if (pVar == null) {
            return f157206g;
        }
        if (pVar instanceof n) {
            return h(((n) pVar).f205461a, style);
        }
        if (pVar instanceof o) {
            return new TextClause(String.valueOf(((o) pVar).f205462a), style, (Integer) null, false, (o9) null, (List) null, 124);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int k(s sVar) {
        long j2;
        long j3;
        int iMin = 0;
        if (e0.y(sVar)) {
            return 0;
        }
        p pVar = sVar.f205467h;
        if (pVar != null) {
            if (pVar instanceof o) {
                j2 = ((o) pVar).f205462a;
            } else {
                if (!(pVar instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 = ((n) pVar).f205461a.f115082a;
            }
            p pVar2 = sVar.f205468j;
            if (pVar2 != null) {
                if (pVar2 instanceof o) {
                    j3 = ((o) pVar2).f205462a;
                } else {
                    if (!(pVar2 instanceof n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j3 = ((n) pVar2).f205461a.f115082a;
                }
                if (j2 != 0) {
                    iMin = Math.min(100, (int) ((j3 / j2) * 100));
                }
            }
        }
        return Math.min(iMin, 100);
    }

    public static int l(s sVar) {
        if (!e0.y(sVar) && q(sVar)) {
            return R$attr.uikit_colorRed;
        }
        return R$attr.uikit_colorAccent;
    }

    public static Clause m(s sVar, boolean z) {
        DateTime dateTime;
        TextClause textClause;
        if (e0.y(sVar) || (dateTime = sVar.f) == null) {
            return null;
        }
        TimeClause timeClause = new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        if (z) {
            t0 t0Var = t0.f186434a;
            textClause = new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = f157206g;
        }
        return yoj.b.w(textClause, new TextLocalisedClause(R$string.limits_refresh_date, u.c(timeClause), e, 8));
    }

    public static TextLocalisedClause n(int i2) {
        return new TextLocalisedClause(i2, null, f, 10);
    }

    public static boolean q(s sVar) {
        p pVar = sVar.f205468j;
        p pVar2 = sVar.f205467h;
        return ((pVar instanceof o) && (pVar2 instanceof o)) ? ((o) pVar).f205462a >= ((o) pVar2).f205462a : (pVar instanceof n) && (pVar2 instanceof n) && ((n) pVar).f205461a.f115082a >= ((n) pVar2).f205461a.f115082a;
    }

    public final a a(s sVar) {
        boolean zY = e0.y(sVar);
        Custom custom = f;
        if (zY) {
            return new a(k(sVar), new TextLocalisedClause(R$string.limits_price_unlimited, null, custom, 10), null);
        }
        boolean zQ = q(sVar);
        Custom custom2 = e;
        return zQ ? new a(k(sVar), c(sVar, custom), new TextLocalisedClause(R$string.limits_fee_applies_fee_for_withdrawal, u.c(d(sVar, null)), custom2, 8)) : new a(k(sVar), j(sVar.f205468j, custom), new TextLocalisedClause(R$string.limits_of, u.c(j(sVar.f205467h, null)), custom2, 8));
    }

    public final Clause c(s sVar, Style style) {
        mha.k kVar = sVar.f205466g;
        if (kVar == null) {
            return f157206g;
        }
        if (kVar instanceof mha.i) {
            return h(((mha.i) kVar).f205453a, style);
        }
        if (!(kVar instanceof mha.j)) {
            throw new NoWhenBranchMatchedException();
        }
        mha.j jVar = (mha.j) kVar;
        dj0.d dVar = jVar.f205455b;
        return dVar != null ? h(dVar, null) : i(jVar.f205454a, style);
    }

    public final Clause d(s sVar, Style style) {
        mha.k kVar = sVar.f205466g;
        if (kVar == null) {
            return f157206g;
        }
        if (kVar instanceof mha.i) {
            return h(((mha.i) kVar).f205453a, style);
        }
        if (kVar instanceof mha.j) {
            return i(((mha.j) kVar).f205454a, style);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextClause i(double d, Style style) {
        String strT;
        long j2 = (long) d;
        double d5 = j2;
        qd0.b bVar = this.f157209a;
        if (d == d5) {
            strT = m72.b.t(new Object[]{Long.valueOf(j2)}, 1, ((s80.b) bVar).a(), "%d", "format(...)");
        } else {
            strT = m72.b.t(new Object[]{Double.valueOf(d)}, 1, ((s80.b) bVar).a(), "%s", "format(...)");
        }
        return new TextClause(strT.concat("%"), style, (Integer) null, false, (o9) null, (List) null, 124);
    }

    public final Clause o(s sVar) {
        TextClause textClause;
        boolean zY = e0.y(sVar);
        p pVar = sVar.f205467h;
        if (zY) {
            return new TextLocalisedClause(R$string.limits_price_unlimited, null, null, 14);
        }
        Clause clauseJ = j(sVar.f205468j, null);
        if (pVar == null) {
            textClause = f157206g;
        } else if (pVar instanceof n) {
            textClause = f157207h;
        } else {
            if (!(pVar instanceof o)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = i;
        }
        return yoj.b.w(yoj.b.w(clauseJ, textClause), j(pVar, null));
    }

    public final b p(WalletLimit limit, yt8.i addressKycStatus) {
        int i2;
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(addressKycStatus, "addressKycStatus");
        if (!(limit instanceof WalletLimit.CounterLimit)) {
            if (limit instanceof WalletLimit.TransactionLimit) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) limit;
        com.revolut.feature.wallets.api.module.a aVar = counterLimit.f94844a;
        if (!f157208j.contains(aVar)) {
            String counterLimitName = aVar.name();
            Intrinsics.checkNotNullParameter(counterLimitName, "counterLimitName");
            if (!this.f157211c.f299918a.contains(counterLimitName)) {
                int[] iArr = d.f157204a;
                switch (iArr[aVar.ordinal()]) {
                    case 1:
                        i2 = R$string.limits_wallet_counter_daily_outbound_title;
                        break;
                    case 2:
                        i2 = R$string.limits_wallet_counter_weekly_outbound_title;
                        break;
                    case 3:
                        i2 = R$string.limits_wallet_counter_yearly_outbound_title;
                        break;
                    case 4:
                        i2 = R$string.limits_wallet_counter_yearly_inbound_title;
                        break;
                    case 5:
                        i2 = R$string.limits_wallet_counter_brl_exchange_title;
                        break;
                    case 6:
                        i2 = R$string.transfer_wallet_limits_name_stock;
                        break;
                    case 7:
                        i2 = R$string.transfer_wallet_limits_name_flow;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        IllegalStateException illegalStateException = new IllegalStateException(aVar + " Not supported");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        throw illegalStateException;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                switch (iArr[aVar.ordinal()]) {
                    case 1:
                        i3 = R$string.limits_wallet_counter_daily_outbound_explainer;
                        break;
                    case 2:
                        i3 = R$string.limits_wallet_counter_weekly_outbound_explainer;
                        break;
                    case 3:
                        i3 = R$string.limits_wallet_counter_yearly_outbound_explainer;
                        break;
                    case 4:
                        i3 = R$string.limits_wallet_counter_yearly_inbound_explainer_verified;
                        break;
                    case 5:
                        i3 = R$string.limits_wallet_counter_brl_exchange_explainer_verified;
                        break;
                    case 6:
                        i3 = R$string.limits_wallet_explainer_stock;
                        break;
                    case 7:
                        i3 = R$string.limits_wallet_counter_explainer;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        IllegalStateException illegalStateException2 = new IllegalStateException(aVar + " Not supported");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        throw illegalStateException2;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                switch (iArr[aVar.ordinal()]) {
                    case 1:
                        i5 = R$drawable.uikit_icn_24_calendar_date;
                        break;
                    case 2:
                        i5 = R$drawable.uikit_icn_24_calendar_week;
                        break;
                    case 3:
                        i5 = R$drawable.uikit_icn_24_calendar_quarter;
                        break;
                    case 4:
                        i5 = R$drawable.uikit_icn_24_arrow_bulk_request;
                        break;
                    case 5:
                        i5 = R$drawable.uikit_icn_24_arrow_exchange;
                        break;
                    case 6:
                        i5 = R$drawable.uikit_icn_24_coins;
                        break;
                    case 7:
                        i5 = R$drawable.uikit_icn_24_transfers;
                        break;
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        throw new IllegalStateException(aVar + " Not supported");
                    case 10:
                        throw new IllegalStateException("DIRECT_DEBIT_MONTHLY Not supported");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i6 = i5;
                dj0.d dVar = counterLimit.e;
                dj0.d dVar2 = counterLimit.f94846c;
                long j2 = dVar.f115082a;
                int iMin = j2 == 0 ? 0 : Math.min(100, (int) ((dVar2.f115082a / j2) * 100));
                String strName = aVar.name();
                TextLocalisedClause textLocalisedClauseN = n(i2);
                int i21 = iArr[aVar.ordinal()];
                return new b(strName, textLocalisedClauseN, b(this, i3, v.l((i21 == 4 || i21 == 5) ? null : new PercentageClause(iMin, (PercentageClause.Format) null, (Custom) null, 6)), 4), b(this, R$string.limits_wallet_counter_usage, v.k(new MoneyClause(counterLimit.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), 4), new a(iMin, new MoneyClause(counterLimit.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.limits_of, u.c(new MoneyClause(counterLimit.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)), dVar2.compareTo(dVar) < 0 ? R$attr.uikit_colorBlue : R$attr.uikit_colorRed, dVar2.compareTo(dVar) < 0 ? R$attr.uikit_colorBlue_10 : R$attr.uikit_colorRed_10, dVar2.compareTo(dVar) < 0 ? R$attr.uikit_colorBlue : R$attr.uikit_colorRed, i6, null);
            }
        }
        return null;
    }
}
