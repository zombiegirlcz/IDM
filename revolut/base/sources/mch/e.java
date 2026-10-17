package mch;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.ng;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.b4;
import ich.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.w;
import zzg.s;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final y a(List options, InstrumentsCollectionSortOption selected) {
        SingleChoiceDelegate.b aVar;
        int i;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(selected, "selected");
        t tVar = new t(new TextLocalisedClause(R$string.wealth_trading_assets_sorting_header_title, null, null, 14), null, null, 30);
        List<InstrumentsCollectionSortOption> list = options;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (InstrumentsCollectionSortOption instrumentsCollectionSortOption : list) {
            TextLocalisedClause textLocalisedClauseB = adh.f.b(instrumentsCollectionSortOption);
            boolean z = selected.getClass() == instrumentsCollectionSortOption.getClass();
            o oVar = new o(selected, instrumentsCollectionSortOption);
            s f95282a = selected.getF95282a();
            if (f95282a != null) {
                int i2 = f.f204360a[f95282a.ordinal()];
                if (i2 == 1) {
                    i = R$string.wealth_trading_assets_sorting_direction_asc;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_trading_assets_sorting_direction_desc;
                }
                aVar = new ng(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), adh.f.a(f95282a));
            } else {
                aVar = new SingleChoiceDelegate.b.a(0);
            }
            arrayList.add(new SingleChoiceDelegate.Model("INSTRUMENTS_COLLECTION_DIALOG_ITEM_LIST_ID", textLocalisedClauseB, z, aVar, oVar, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_apply, null, null, 14);
        int i3 = R$attr.uikit_dp24;
        int i5 = R$attr.uikit_dp16;
        return new y(d0.F0(new LargeActionButtonDelegate.Model("INSTRUMENTS_COLLECTION_DIALOG_BUTTON_APPLY_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, selected, i3, i3, i5, i5, 368), arrayList), tVar, null, null, null, null, 1020);
    }
}
