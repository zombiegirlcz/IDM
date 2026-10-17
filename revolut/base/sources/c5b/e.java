package c5b;

import aw0.o9;
import bfl.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import dfl.b0;
import dfl.c0;
import dfl.d0;
import dfl.e0;
import dfl.f0;
import dfl.g0;
import dfl.h;
import dfl.h0;
import dfl.i;
import dfl.i0;
import dfl.j;
import dfl.l;
import dfl.q;
import dfl.s;
import dfl.t;
import dfl.v;
import dfl.w;
import dfl.y;
import dfl.z;
import java.time.Instant;
import java.util.List;
import k1h.k;
import k1h.m;
import kbh.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.n;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21549a;

    public e(f tradeUiDataMapper) {
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        this.f21549a = tradeUiDataMapper;
    }

    public static LayeredImage a(int i, int i2) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i3 = R$attr.uikit_colorWidgetBackground;
        return LayeredImage.Companion.f(companion, i, i2, i3, Integer.valueOf(i3), 3.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
    }

    public static PairedImage c(dfl.b bVar) {
        g gVar = bVar.f114191s;
        q qVar = bVar.i;
        int i = d.f21546a[gVar.ordinal()];
        if (i == 1) {
            CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D203", null, null, null, 30);
            Intrinsics.i(qVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
            return new PairedImage(new CurrencyImage(((dfl.a) qVar).f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), cdnImageC, R$attr.uikit_colorWidgetBackground, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.i(qVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
        return new PairedImage(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D203", null, null, null, 30), new CurrencyImage(((dfl.a) qVar).f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
    }

    public static LayeredImage d(dfl.b bVar) {
        int i = d.f21547b[bVar.e.ordinal()];
        if (i == 1) {
            return a(R$drawable.uikit_icn_16_status_clock_arrows, R$attr.uikit_colorAccent);
        }
        if (i == 2) {
            return a(R$drawable.uikit_icn_16_cross_small, R$attr.uikit_colorRed);
        }
        if (i != 3) {
            return null;
        }
        return a(R$drawable.uikit_icn_16_canceled, R$attr.uikit_colorDeepGrey);
    }

    public final k b(i0 trade, String str, n nVar) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (trade instanceof dfl.b) {
            dfl.b bVar = (dfl.b) trade;
            PairedImage pairedImageC = c(bVar);
            LayeredImage layeredImageD = d(bVar);
            int i = d.f21547b[bVar.e.ordinal()];
            return new m(pairedImageC, layeredImageD, i != 1 ? i != 2 ? i != 3 ? null : new InactiveCircleBadge(dw0.a.Cancelled) : new DangerCircleBadge(dw0.a.Error) : new WarningCircleBadge(dw0.a.Pending));
        }
        if ((trade instanceof l) || (trade instanceof dfl.d) || (trade instanceof z) || (trade instanceof h) || (trade instanceof j) || (trade instanceof s) || (trade instanceof v) || (trade instanceof w) || (trade instanceof b0) || (trade instanceof f0) || (trade instanceof g0) || (trade instanceof dfl.e) || (trade instanceof dfl.g) || (trade instanceof y) || (trade instanceof dfl.k) || (trade instanceof dfl.c) || (trade instanceof i) || (trade instanceof t) || (trade instanceof c0) || (trade instanceof e0) || (trade instanceof h0) || (trade instanceof dfl.m) || (trade instanceof d0)) {
            return this.f21549a.g(trade, str, nVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Clause e(i0 trade, k1h.n dateTimeFormat, String str, n nVar) {
        q0 q0Var;
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(dateTimeFormat, "dateTimeFormat");
        Instant instantN = trade.n();
        if (trade instanceof dfl.b) {
            dfl.b bVar = (dfl.b) trade;
            if (bVar.f114191s == g.SELL && bVar.e == dfl.q0.PENDING && instantN != null) {
                long jO = ofm.q.o(trade);
                int i = d.f21548c[dateTimeFormat.ordinal()];
                if (i == 1) {
                    q0Var = q0.DATETIME;
                } else if (i == 2) {
                    q0Var = q0.ONLY_TIME;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q0Var = null;
                }
                TimeClause timeClause = q0Var != null ? new TimeClause(jO, new TimeClause.Format.Pretty(q0Var), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8) : null;
                int i2 = R$string.wealth_transactions_cfd_cash_withdraw_settlement_date_row_subtitle;
                long epochMilli = instantN.toEpochMilli();
                TimeClause.Format.INSTANCE.getClass();
                Object[] elements = {new TextLocalisedClause(i2, u.c(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12)), null, 12), timeClause};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
            }
        }
        return this.f21549a.j(trade, dateTimeFormat, str, nVar);
    }

    public final Clause f(i0 trade, TradingLegalEntityInformation tradingLegalEntityInformation, Integer num) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (trade instanceof dfl.b) {
            int i = d.f21546a[((dfl.b) trade).f114191s.ordinal()];
            if (i == 1) {
                return new TextLocalisedClause(R$string.wealth_margin_cfd_transactions_topup, null, null, 14);
            }
            if (i == 2) {
                return new TextLocalisedClause(R$string.wealth_margin_cfd_transactions_withdraw, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        if ((trade instanceof l) || (trade instanceof dfl.d) || (trade instanceof z) || (trade instanceof h) || (trade instanceof j) || (trade instanceof s) || (trade instanceof v) || (trade instanceof w) || (trade instanceof b0) || (trade instanceof f0) || (trade instanceof g0) || (trade instanceof dfl.e) || (trade instanceof dfl.g) || (trade instanceof y) || (trade instanceof dfl.k) || (trade instanceof dfl.c) || (trade instanceof i) || (trade instanceof t) || (trade instanceof c0) || (trade instanceof e0) || (trade instanceof h0) || (trade instanceof dfl.m) || (trade instanceof d0)) {
            return this.f21549a.k(trade, tradingLegalEntityInformation, num);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Clause g(i0 trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        return this.f21549a.l(trade);
    }
}
