package p4c;

import aw0.ka;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreenContract$InputData;
import d3c.j0;
import d3c.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppShopProductScreenContract$InputData f232875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3c.f f232876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mpj.a f232877c;
    public final r4c.b d;

    public a0(IppShopProductScreenContract$InputData inputData, z3c.d menuItemsMapper, z3c.i productMapper, z3c.g productAssetsMapper, z3c.f permissionsAndVisibilityMapper, mpj.a revolutShopAcquiringProvider, r4c.b productTemplateItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(productAssetsMapper, "productAssetsMapper");
        Intrinsics.checkNotNullParameter(permissionsAndVisibilityMapper, "permissionsAndVisibilityMapper");
        Intrinsics.checkNotNullParameter(revolutShopAcquiringProvider, "revolutShopAcquiringProvider");
        Intrinsics.checkNotNullParameter(productTemplateItemMapper, "productTemplateItemMapper");
        this.f232875a = inputData;
        this.f232876b = permissionsAndVisibilityMapper;
        this.f232877c = revolutShopAcquiringProvider;
        this.d = productTemplateItemMapper;
    }

    public static aw0.g a(k kVar) {
        j0 j0VarA;
        d3c.x xVar = kVar.e;
        return new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_product_footer_button_add_to_cart_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "ADD_TO_CART_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_product_footer_button_buy_now_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "BUY_NOW_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), (xVar == null || (j0VarA = xVar.a(k0.PRE_ORDER)) == null) ? null : new TextLocalisedClause(R$string.revolut_shop_common_order_shipping_from_title, zhm.u.c(new TimeClause(j0VarA.f111040b, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12), (aw0.f) null, 17);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(t1.u(domainState.d, domainState.f232883g, domainState.f232881b), new y(this, domainState, 0), new or4.i(this, domainState), new ox2.d(this, domainState, 5));
    }
}
