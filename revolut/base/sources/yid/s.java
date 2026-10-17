package yid;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$InputData;
import hjd.z;
import ip0.nf0;
import ip0.of0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yed.g0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCarouselDetailsScreenContract$InputData f314317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f314318b;

    public s(hjd.n shopsCombinedSearchButtonMapper, z shopsBadgeMapper, ShopsCarouselDetailsScreenContract$InputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(shopsCombinedSearchButtonMapper, "shopsCombinedSearchButtonMapper");
        Intrinsics.checkNotNullParameter(shopsBadgeMapper, "shopsBadgeMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f314317a = inputData;
        this.f314318b = dateProvider;
    }

    public static nf0 a() {
        nf0 nf0Var = new nf0("SHOPS_CARROUSEL_DETAILS_LIST_ID_ITEM", of0.PURPLE);
        yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
        return nf0Var;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SearchButtonDelegate.Model model = this.f314317a.f87149c ? new SearchButtonDelegate.Model("SHOPS_COMBINED_SEARCH_BUTTON", new TextLocalisedClause(R$string.shops_screens_home_search_hint, null, null, 14), null, R$attr.uikit_dp8, R$attr.uikit_dp16, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION) : null;
        aim.e eVarB = u.b();
        n14.e.b(eVarB, model);
        eVarB.addAll((Collection) iii.c.f(domainState.f314308a, new g0(this, 15), new yd8.a(16), new y66.q(this, domainState, 10)));
        return new o(u.a(eVarB));
    }
}
