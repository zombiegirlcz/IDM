package cgd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFavouritesCounterpartChooserScreenContract$InputData f23945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23946b;

    public q(SharedFavouritesCounterpartChooserScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f23945a = inputData;
        IntRange intRange = new IntRange(0, 8, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("LOADING_ID_", it8.nextInt())));
        }
        this.f23946b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ?? C;
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = this.f23945a.f86836a;
        List list = domainState.f23939a;
        FavouritesCounterpartAsset favouritesCounterpartAsset = domainState.f23940b;
        String str = domainState.f23941c;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            List<FavouritesCounterpartAsset> list3 = list;
            C = new ArrayList(w.t(list3, 10));
            for (FavouritesCounterpartAsset favouritesCounterpartAsset2 : list3) {
                String str2 = favouritesCounterpartAsset2.f86867a;
                boolean zF = Intrinsics.f(str2, favouritesCounterpartAsset != null ? favouritesCounterpartAsset.f86867a : null);
                String strQ = j6.a.q("ITEM_ID_", str2);
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(favouritesCounterpartAsset2.f86867a, (ImageTransformations) null, (TextLocalisedClause) null, 14), d8l.d.b(zF), null, false, null, false, 60);
                TextClause textClause = new TextClause(favouritesCounterpartAsset2.f86869c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a(str2);
                C.add(new RowDelegate.Model(strQ, image40, textClause, null, 0, cp5.d.z(bVarA) ? new CurrencyClause(bVarA, CurrencyClause.Format.Ticker.f57756a, null, 4) : new TextClause(favouritesCounterpartAsset2.f86867a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, true, null, zF, null, null, null, null, null, null, favouritesCounterpartAsset2, null, 0, 0, 0, 0, 532666328));
            }
        } else if (str.length() > 0) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(R$string.shared_watchlist_assets_search_empty_state_description, u.c(str), null, 12), new TextLocalisedClause(R$string.rates_counterpart_picker_search_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.shared_watchlist_assets_search_empty_state_button_clear_search, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            C = u.c(model);
        } else {
            C = this.f23946b;
        }
        ?? r4 = C;
        yp0.b.k(r4, 0, 0, 0, 0, 31);
        return new o(clause, r4);
    }
}
