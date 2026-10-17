package mle;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.r0;
import rp0.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z;
        int i;
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = InvestSettingsScreen.f0;
        z zVar = (z) iVar;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        wlh.k kVar = (wlh.k) zVar.u;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        Continuation continuation = null;
        if (obj4 instanceof uih.f) {
            r60.b bVar = kVar.f298500n;
            wlh.n nVar = kVar.o;
            uih.f parcel = (uih.f) obj4;
            StockBuyBlock stockBuyBlock = parcel.f280444b;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StockBuyBlock.Active active = StockBuyBlock.Active.f105144a;
            boolean zF = Intrinsics.f(stockBuyBlock, active);
            StockBuyBlock.Inactive inactive = StockBuyBlock.Inactive.f105145a;
            if (zF) {
                z = false;
            } else {
                if (!Intrinsics.f(stockBuyBlock, inactive) && !(stockBuyBlock instanceof StockBuyBlock.PendingDeactivation)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            int i2 = z ? R$string.trading_settings_buy_block_block_title : R$string.trading_settings_buy_block_unblock_title;
            if (Intrinsics.f(stockBuyBlock, active)) {
                i = R$string.trading_settings_buy_block_unblock_subtitle;
            } else if (Intrinsics.f(stockBuyBlock, inactive)) {
                i = R$string.trading_settings_buy_block_block_subtitle;
            } else {
                if (!(stockBuyBlock instanceof StockBuyBlock.PendingDeactivation)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_settings_buy_block_reblock_subtitle;
            }
            int i3 = z ? R$string.trading_settings_buy_block_block_action : R$string.trading_settings_buy_block_unblock_cancel;
            int i5 = z ? R$string.trading_common_action_cancel : R$string.trading_settings_buy_block_unblock_action;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            Clause clause = null;
            Clause clause2 = null;
            ResourceImage resourceImage2 = null;
            r60.d dVar = (r60.d) bVar;
            dVar.R(new u0(new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(i, null, null, 14), clause, new r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), clause2, resourceImage, resourceImage2, null, new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(i5, null, null, 14), null, null, null, null, null, null, parcel, null, null, 33028564));
        } else if (obj4 instanceof uih.d) {
            kVar.V2(new w76.a(kVar, continuation, 20), new yi5.b(29));
        } else if (obj4 instanceof uih.c) {
            kVar.V2(new wka.e(kVar, ((uih.c) obj4).f280440a, continuation, 3), new yi5.b(29));
        }
        zVar.f206702r.c3(model);
        return Unit.f186387a;
    }
}
