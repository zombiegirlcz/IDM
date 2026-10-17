package i76;

import aw0.e;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import eii.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c76.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f159191l;

    public d(c dialogMapper) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f159191l = dialogMapper;
    }

    @Override // c76.a
    public final void Z2(ChargeBreakdown feeBreakdown) {
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        List list = feeBreakdown.f104723b;
        ChargeEntry chargeEntry = (ChargeEntry) d0.M0(list);
        if (chargeEntry != null) {
            b3(chargeEntry);
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        this.f159191l.getClass();
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.payments_core_fees_breakdown_title, null, null, 14), null, null, null, false, 30);
        e eVarA = c.a();
        List<ChargeEntry> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ChargeEntry chargeEntry2 : list2) {
            CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(chargeEntry2.f104725a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_info_outline, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28)));
            AssetClause assetClauseA = b.a(chargeEntry2.e);
            Amount amount = chargeEntry2.f104728g;
            arrayList.add(new l((Clause) compositeClauseM, (Clause) null, (RowDelegate.Model.MainImage) null, true, false, (RowDelegate.Model.c) new RowDelegate.Model.c.b(assetClauseA, amount != null ? b.b(amount) : null, null, false, 124), (Object) chargeEntry2, 168));
        }
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar, eVarA, arrayList, new AnalyticsProduct.Retail(c.f159190a), null));
        i30.a block = new i30.a(this, 24);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        n.P2(this, rowActionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    public final void b3(ChargeEntry entry) {
        this.f159191l.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        TextClause textClause = new TextClause(entry.f104725a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = entry.f104727c;
        String str2 = str.length() > 0 ? str : null;
        n.P2(this, new ActionsBottomSheetController(new dii.a(new lw0.a(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28), c.a(), new AnalyticsProduct.Retail(c.f159190a), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}
