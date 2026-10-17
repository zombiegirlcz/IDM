package xpk;

import aw0.p0;
import aw0.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.ratedetails.impl.R$string;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements jki.p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateDetailsScreenContract$InputData f308006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f308007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f308008c;
    public final PairedImage d;

    public o(RateDetailsScreenContract$InputData inputData, i navBarMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        this.f308006a = inputData;
        this.f308007b = navBarMapper;
        int i = R$string.rate_details_title_format;
        xi0.b bVar = inputData.f103727a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        CurrencyClause currencyClause = new CurrencyClause(bVar, ticker, null, 4);
        xi0.b bVar2 = inputData.f103728b;
        this.f308008c = new TextLocalisedClause(i, v.k(currencyClause, new CurrencyClause(bVar2, ticker, null, 4)), null, 12);
        this.d = new PairedImage(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 12), new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 12), R$attr.uikit_colorWidgetBackground, null);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        koi.j[] jVarArr = (koi.j[]) domainState.e.toArray(new koi.j[0]);
        List listM = v.m(Arrays.copyOf(jVarArr, jVarArr.length));
        IconNavBarMenuItem iconNavBarMenuItem = domainState.f307988c;
        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = this.f308006a;
        if (!rateDetailsScreenContract$InputData.e) {
            iconNavBarMenuItem = null;
        }
        boolean z = domainState.f307987b;
        ((bqk.a) this.f308007b).getClass();
        IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, z ? "WATCHLIST_MENU_ITEM_ADDED_ID" : "WATCHLIST_MENU_ITEM_REMOVED_ID", new ResourceImage(z ? R$drawable.uikit_icn_24_star_filled : R$drawable.uikit_icn_24_star_empty, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        if (!domainState.f307986a || !rateDetailsScreenContract$InputData.f) {
            iconNavBarMenuItemA = null;
        }
        IconNavBarMenuItem[] elements = {iconNavBarMenuItem, iconNavBarMenuItemA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        p9j.a aVar = (p9j.a) domainState.f.getContent();
        return new j(listM, listL, this.f308008c, aVar != null ? aVar.f234323a : null, this.d, domainState.f, domainState.d ? new q0(new p0("ID_ACTION_BUY", new TextLocalisedClause(R.string.common_action_buy, null, null, 14), null, null, 28), new p0("ID_ACTION_SELL", new TextLocalisedClause(R.string.common_action_sell, null, null, 14), null, null, 28), 4) : null, domainState.f307989g);
    }
}
