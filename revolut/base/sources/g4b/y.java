package g4b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2b.a f140468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5b.c f140469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3b.j f140470c;
    public final c5b.b d;
    public final ufl.b e;

    public y(d2b.a cfdHoldingMapper, g5b.c exitStrategiesMapper, m3b.j leverageItemMapper, vwk.a tradingHoursUiAssetMapper, c5b.b cfdSwipeActionsMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(cfdHoldingMapper, "cfdHoldingMapper");
        Intrinsics.checkNotNullParameter(exitStrategiesMapper, "exitStrategiesMapper");
        Intrinsics.checkNotNullParameter(leverageItemMapper, "leverageItemMapper");
        Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
        Intrinsics.checkNotNullParameter(cfdSwipeActionsMapper, "cfdSwipeActionsMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f140468a = cfdHoldingMapper;
        this.f140469b = exitStrategiesMapper;
        this.f140470c = leverageItemMapper;
        this.d = cfdSwipeActionsMapper;
        this.e = wealthHoldingsClauseFactory;
    }

    public static CellDetailsActionDelegate.Model a(String str, int i, dj0.d dVar, int i2, Object obj2) {
        return new CellDetailsActionDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), i2, null, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), false, false, null, obj2, 0, 0, 32224);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r10) {
        /*
            r9 = this;
            g4b.l r10 = (g4b.l) r10
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.revolut.data.model.Data r0 = r10.f140448c
            r1 = 0
            if (r0 == 0) goto L28
            g3e.h r2 = new g3e.h
            r3 = 14
            r2.<init>(r3)
            g3e.s r3 = new g3e.s
            r4 = 21
            r3.<init>(r4)
            g4b.u r4 = new g4b.u
            r5 = 1
            r4.<init>(r9)
            java.lang.Object r2 = iii.c.f(r0, r2, r3, r4)
            g4b.s r2 = (g4b.s) r2
            r4 = r2
            goto L29
        L28:
            r4 = r1
        L29:
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.retail.wealth.resources.R$string.wealth_cfds_position_details_trade_cta
            r5 = 14
            r2.<init>(r3, r1, r1, r5)
            boolean r3 = r10.e
            if (r3 == 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            if (r0 == 0) goto L58
            g3e.h r2 = new g3e.h
            r3 = 12
            r2.<init>(r3)
            g3e.s r3 = new g3e.s
            r6 = 19
            r3.<init>(r6)
            fq7.k r6 = new fq7.k
            r7 = 10
            r6.<init>(r7)
            java.lang.Object r2 = iii.c.f(r0, r2, r3, r6)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = (com.revolut.core.ui_kit.models.TextLocalisedClause) r2
            r6 = r2
            goto L59
        L58:
            r6 = r1
        L59:
            com.revolut.data.model.Data r2 = r10.f140447b
            if (r2 == 0) goto L64
            java.lang.Object r2 = r2.getContent()
            nel.a0 r2 = (nel.a0) r2
            goto L65
        L64:
            r2 = r1
        L65:
            if (r2 == 0) goto L76
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r0.getContent()
            g4b.k r1 = (g4b.k) r1
        L6f:
            boolean r1 = r1 instanceof g4b.j
            if (r1 == 0) goto L76
            r1 = 1
        L74:
            r7 = r1
            goto L78
        L76:
            r1 = 0
            goto L74
        L78:
            if (r0 == 0) goto L99
            g3e.h r1 = new g3e.h
            r2 = 13
            r1.<init>(r9, r2)
            g3e.s r2 = new g3e.s
            r3 = 20
            r2.<init>(r3)
            g4b.u r3 = new g4b.u
            r8 = 0
            r3.<init>(r9)
            java.lang.Object r10 = iii.c.f(r0, r1, r2, r3)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L97
            goto L99
        L97:
            r8 = r10
            goto L9c
        L99:
            zhm.f0 r10 = zhm.f0.f322471a
            goto L97
        L9c:
            g4b.t r3 = new g4b.t
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g4b.y.c(cli.j):cli.o");
    }
}
