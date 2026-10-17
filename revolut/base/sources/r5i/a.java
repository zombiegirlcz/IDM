package r5i;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends pri.c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f251594h;

    public a(d mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f251594h = mapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Throwable] */
    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.TaxBreakdown screen2 = (Screen.TaxBreakdown) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        ChargeBreakdown taxBreakdown = screen2.f97139a;
        this.f251594h.getClass();
        Intrinsics.checkNotNullParameter(taxBreakdown, "taxBreakdown");
        List list = null;
        t tVar = new t(new TextLocalisedClause(R$string.market_data_taxes_breakdown_title, null, null, 14), null, null, 30);
        List list2 = taxBreakdown.f104723b;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                ?? r322 = list;
                v.s();
                throw r322;
            }
            ChargeEntry chargeEntry = (ChargeEntry) obj2;
            String strN = a0.d.n("TAX_BREAKDOWN_ITEM_", i);
            String str = chargeEntry.f104726b;
            Amount amount = chargeEntry.e;
            arrayList.add(new CellDetailsDelegate.Model(strN, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, o9.SENSITIVE, 8), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(chargeEntry), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
            i = i2;
            list = list;
        }
        List list3 = list;
        e eVarB = u.b();
        eVarB.addAll(arrayList);
        if (arrayList.size() > 1) {
            Amount amount2 = taxBreakdown.f104722a;
            eVarB.add(new CellDetailsDelegate.Model("TAX_BREAKDOWN_TOTAL_ID", new TextLocalisedClause(R$string.market_data_transfer_breakdown_total, list3, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new AssetClause(amount2.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount2.f104718b.f104720b, null, o9.SENSITIVE, 8), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, R$attr.uikit_dp24, 0, 0, 29);
        r rVarJust = r.just(new y(eVarA, tVar, l.WINDOW, null, screen2, null, 984));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
