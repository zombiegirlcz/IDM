package mch;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;
import zzg.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adh.c f204359a;

    public b(adh.c instrumentToRowMapper) {
        Intrinsics.checkNotNullParameter(instrumentToRowMapper, "instrumentToRowMapper");
        this.f204359a = instrumentToRowMapper;
    }

    public static ListSubheaderDelegate.Model a(InstrumentsCollectionType instrumentsCollectionType, int i, InstrumentsCollectionSortOption instrumentsCollectionSortOption, boolean z) {
        Clause textLocalisedQuantityClause;
        CompositeClause compositeClause;
        List listK;
        if (Intrinsics.f(instrumentsCollectionType, InstrumentsCollectionType.Bonds.f95283a)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_discovery_all_bonds, null, null, 14);
            if (i > 0) {
                m70.a.a(t0.f186434a);
                listK = v.k(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            } else {
                listK = null;
            }
            if (listK == null) {
                listK = f0.f322471a;
            }
            textLocalisedQuantityClause = new CompositeClause(ue0.e.J(textLocalisedClause, listK), null, null, null, 14);
        } else if (Intrinsics.f(instrumentsCollectionType, InstrumentsCollectionType.Etfs.f95284a)) {
            textLocalisedQuantityClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.trading_all_assets_etfs_title, null, null, 14)));
        } else {
            if (!(instrumentsCollectionType instanceof InstrumentsCollectionType.Related) && !Intrinsics.f(instrumentsCollectionType, InstrumentsCollectionType.RecommendedBuy.f95285a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.trading_collection_similarto_assets_count, Integer.valueOf(i), (List) null, (Style) null, 28);
        }
        Clause clause = textLocalisedQuantityClause;
        if (z) {
            Float fValueOf = Float.valueOf(16.0f);
            TextLocalisedClause textLocalisedClauseB = adh.f.b(instrumentsCollectionSortOption);
            s f95282a = instrumentsCollectionSortOption.getF95282a();
            Clause[] elements = {textLocalisedClauseB, f95282a != null ? new ImageClause(adh.f.a(f95282a), Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
        } else {
            compositeClause = null;
        }
        return new ListSubheaderDelegate.Model("INSTRUMENTS_COLLECTION_SUBHEADER_LIST_ID", (Image) null, clause, (ResourceImage) null, false, false, (Clause) compositeClause, z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }
}
