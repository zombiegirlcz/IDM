package kkf;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m f185002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.m1 f185003c;
    public final vlf.b d;
    public final ylg.b e;
    public final elf.x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final elf.d2 f185004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final elf.e0 f185005h;
    public final tkf.b i;

    public x(klf.h0 commonDataSource, klf.m chargeBreakdownDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, ylg.b userInteractor, elf.x chargesClickHandler, elf.d2 taxesBreakdownClickHandler, elf.e0 feesBreakdownClickHandler, tkf.b feeItemProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(chargeBreakdownDataSource, "chargeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(chargesClickHandler, "chargesClickHandler");
        Intrinsics.checkNotNullParameter(taxesBreakdownClickHandler, "taxesBreakdownClickHandler");
        Intrinsics.checkNotNullParameter(feesBreakdownClickHandler, "feesBreakdownClickHandler");
        Intrinsics.checkNotNullParameter(feeItemProvider, "feeItemProvider");
        this.f185001a = commonDataSource;
        this.f185002b = chargeBreakdownDataSource;
        this.f185003c = juniorDataSource;
        this.d = commonUiMapper;
        this.e = userInteractor;
        this.f = chargesClickHandler;
        this.f185004g = taxesBreakdownClickHandler;
        this.f185005h = feesBreakdownClickHandler;
        this.i = feeItemProvider;
    }

    public static CellDetailsActionDelegate.Model c(tof.a3 a3Var) {
        int i;
        tof.y6 y6Var = a3Var.e;
        int i2 = s.f184923a[y6Var.ordinal()];
        if (i2 == 1) {
            i = R$string.transactionUI_fees_breakdown_charged_by_atm;
        } else {
            if (i2 != 2) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "FeesBreakdownBlockProvider", "unsupported transaction type for cards " + y6Var, null, null, 16);
                return null;
            }
            i = R$string.transactionUI_fees_breakdown_charged_by_merchant;
        }
        return new CellDetailsActionDelegate.Model("ID_FEE_AMOUNT_WITH_BREAKDOWN", new TextLocalisedClause(i, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), k71.k.q(a3Var) ? xjf.e.b(a3Var) : xjf.e.f(a3Var), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static CellDetailsDelegate.Model f(dj0.d dVar) {
        return new CellDetailsDelegate.Model("CASH_AMOUNT_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_atm_charges_cash, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsActionDelegate.Model g(tof.a3 a3Var, xi0.b bVar) {
        tof.o3 o3Var;
        dj0.d dVar;
        xi0.b bVar2;
        if (bVar == null || (o3Var = a3Var.J) == null || (dVar = o3Var.f272965a) == null || (bVar2 = dVar.f115083b) == null) {
            return null;
        }
        return new CellDetailsActionDelegate.Model("ID_EXTRAS_CONVERSION_TYPE", new TextLocalisedClause(R$string.transactionUI_fees_breakdown_conversion_type, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.transactionUI_fees_breakdown_conversion_type_multi_currency, zhm.v.k(bVar2.f306286a, bVar.f306286a, a3Var.k.f115083b.f306286a), null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static CellDetailsDelegate.Model h(tof.a3 a3Var) {
        return new CellDetailsDelegate.Model("ID_EXTRAS_EXCHANGE_AMOUNT", new TextLocalisedClause(R$string.transactionUI_fees_breakdown_exchanged_amount, null, null, 14), new MoneyClause(a3Var.k, new MoneyClause.Format.Defaults(aw0.k7.NEVER, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model k(tof.a3 a3Var) {
        z3l.a aVar;
        tof.y6 y6Var = a3Var.e;
        String str = a3Var.f272581b;
        dj0.d dVar = a3Var.f272599l;
        dj0.d dVar2 = a3Var.k;
        if (y6Var == tof.y6.MERCHANT_REFUND || y6Var == tof.y6.MERCHANT_CB) {
            return null;
        }
        xi0.b bVar = dVar2.f115083b;
        xi0.b bVar2 = dVar2.f115083b;
        if (!Intrinsics.f(bVar, dVar.f115083b)) {
            l(str, bVar2.f306286a, dVar.f115083b.f306286a);
            return null;
        }
        tof.m3 m3Var = a3Var.f272589e1;
        dj0.d dVar3 = (m3Var == null || (aVar = m3Var.f272930b) == null) ? null : aVar.f319299b;
        if (dVar3 != null) {
            xi0.b bVar3 = dVar3.f115083b;
            if (!Intrinsics.f(bVar2, bVar3)) {
                l(str, bVar2.f306286a, bVar3.f306286a);
                return null;
            }
        }
        int i = k71.k.S0(a3Var) ? -1 : 1;
        Long[] elements = {Long.valueOf(dVar.f115082a), dVar3 != null ? Long.valueOf(dVar3.f115082a) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.L(elements).iterator();
        long jLongValue = 0;
        while (it8.hasNext()) {
            jLongValue += ((Number) it8.next()).longValue() * ((long) i);
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_TOTAL_AMOUNT", new TextLocalisedClause(R$string.transactionUI_fees_breakdown_your_total, null, null, 14), new MoneyClause(new dj0.d(Math.abs(dVar2.f115082a) + jLongValue, bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static void l(String str, String str2, String str3) {
        StringBuilder sbM = v0.a.m("Transaction with id ", str, " has different currencies for amount ", str2, " and fee ");
        sbM.append(str3);
        IllegalStateException illegalStateException = new IllegalStateException(sbM.toString());
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "FeesBreakdownBlockProvider", null, illegalStateException, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r36, gim.c r37, tof.a3 r38, tof.t3 r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.x.a(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, gim.c, tof.a3, tof.t3, boolean):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r29, gim.c r30, tof.a3 r31, tof.t3 r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.x.b(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, gim.c, tof.a3, tof.t3, boolean):java.io.Serializable");
    }

    public final cmf.p d(Function1 additionalFilter) {
        Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
        klf.h0 h0Var = this.f185001a;
        return new cmf.p(ta6.a.g(h0Var.d(), h0Var.c(), new iyg.b0(this.f185003c.a(), 22), (Flow) this.f185002b.d.getValue(), new w(additionalFilter, this, null)), new ka9.b(26), zhm.v.k(this.f, this.f185004g, this.f185005h), "Charges");
    }

    public final qv0.i i(tof.a3 a3Var, Double d, boolean z) {
        dj0.d dVar;
        boolean zQ = k71.k.q(a3Var);
        double d5 = a3Var.f272619w;
        if (!zQ) {
            return null;
        }
        tof.o3 o3Var = a3Var.J;
        xi0.b bVar = (o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b;
        if (d == null || bVar == null) {
            return this.d.c(a3Var);
        }
        if (z) {
            d5 = ((double) 1) / d5;
        }
        return new CellDetailsActionDelegate.Model("ID_EXTRAS_FINAL_EXCHANGE_RATE", new TextLocalisedClause(R$string.transactionUI_fees_breakdown_final_exchange_rate, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.b(bVar, a3Var.k.f115083b, d5, null), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i j(tof.a3 r32, tof.t3 r33, boolean r34, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r35) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.x.j(tof.a3, tof.t3, boolean, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown):qv0.i");
    }
}
