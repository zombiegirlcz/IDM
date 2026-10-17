package hbf;

import aw0.o9;
import aw0.t0;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150689a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f150690b;

    public /* synthetic */ z(dj0.d dVar) {
        this.f150690b = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f150689a) {
            case 0:
                od0.i optionalTradingAccount = (od0.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalTradingAccount.f224257a;
                if (!(tradingAccount instanceof TradingAccount.TaxAdvantage)) {
                    return null;
                }
                dj0.d dVar = this.f150690b;
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("FEES_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_fees, null, null, 14), (Image) null, 0, false, 30), dVar == null ? new TextLocalisedClause(R$string.trading_stocks_transfer_progress_section_fees_no_fees, null, new Click(30, (Integer) null, (Object) null, "FEES_CLICK_ID", false), 10) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, "FEES_CLICK_ID", false), null, 8), null, new j(tradingAccount), null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31672);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return model;
            default:
                List suggestions = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                if (suggestions.isEmpty()) {
                    return f0.f322471a;
                }
                List listC = rb6.n.c();
                ArrayList arrayListS = d0.S(suggestions, 3);
                int i = 10;
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListS, 10));
                int i2 = 0;
                for (Object obj5 : arrayListS) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    String strN = a0.d.n("AMOUNTS_CONTAINER_ID_", i2);
                    List list = (List) obj5;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list, i));
                    int i5 = 0;
                    for (Object obj6 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        dj0.d dVar2 = (dj0.d) obj6;
                        AttributeSelectorSmallDelegate.Model model2 = new AttributeSelectorSmallDelegate.Model(a0.d.g(i2, i5, "AMOUNTS_CONTAINER_ID_", "_"), new MoneyClause(dVar2, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4), null, Intrinsics.f(dVar2, this.f150690b) ? new r0(zhm.v.k(Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent))) : null, null, false, dVar2, null, 436);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        arrayList2.add(model2);
                        i5 = i6;
                    }
                    hg hgVar = new hg(strN, arrayList2, 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                    int i21 = R$attr.uikit_dp0;
                    yp0.b.r(hgVar, 0, 0, i21, i21, 3);
                    arrayList.add(hgVar);
                    i2 = i3;
                    i = 10;
                }
                return d0.E0(rb6.n.b(), d0.E0(arrayList, listC));
        }
    }

    public /* synthetic */ z(rb6.n nVar, dj0.d dVar) {
        this.f150690b = dVar;
    }
}
