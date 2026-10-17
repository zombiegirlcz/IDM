package ijd;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressExtKt;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.store.api.model.StorePurchaseDetailsResponse;
import com.revolut.feature.store.core.api.StoreCoreApi$Toggles$StoreDMD2Compliance;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f161777a;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f161777a = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    @Override // cli.n
    public final o c(j jVar) {
        List listC;
        ?? arrayList;
        List listC2;
        StorePurchaseDetailsResponse storePurchaseDetailsResponse;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.shops_screens_item_details_title, null, null, 14), null, null, null, false, 30);
        String str = domainState.f161770a;
        Data data = domainState.f161774h;
        List listC3 = u.c(new ve("PRODUCT_INFO_ITEM_ID", new UrlImage(domainState.f161772c, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152706b, null, null, false, false, 507902), new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, new TextClause(domainState.f161771b, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), null, null, null, null, null, 1048552));
        yp0.b.k(listC3, 0, 0, 0, 0, 31);
        List list = listC3;
        Address address = domainState.f;
        if (address != null) {
            listC = u.c(new RowDelegate.Model("DELIVERY_ADDRESS_ITEM_ID", null, new TextLocalisedClause(R$string.shops_screens_item_details_sections_delivery_address_title, null, null, 14), null, 0, AddressExtKt.formatInline(address), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            listC = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(listC, list);
        double d = domainState.f161773g;
        int i = domainState.d;
        Map map = domainState.e;
        aim.e eVarB = u.b();
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(new CellDetailsDelegate.Model(j6.a.q("ATTRIBUTES_ITEM_ID_", str2), new t0((Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause((String) entry.getValue(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
        } else {
            arrayList = f0.f322471a;
        }
        eVarB.addAll((Collection) arrayList);
        eVarB.add(new CellDetailsDelegate.Model("QUANTITY_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_item_details_sections_purchase_details_quantity_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        eVarB.add(new CellDetailsDelegate.Model("POINTS_PRICE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_item_details_sections_price_title, null, null, 14), (Image) null, 0, false, 30), nub.a.p(d, null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        ArrayList arrayListE02 = d0.E0(eVarA, arrayListE0);
        if ((data != null ? (StorePurchaseDetailsResponse) data.getContent() : null) == null && data != null && data.getLoading()) {
            listC2 = u.c(new s7("PURCHASE_DETAILS_LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
        } else {
            listC2 = f0.f322471a;
        }
        ArrayList arrayListE03 = d0.E0(listC2, arrayListE02);
        n6 n6Var = new n6(new TextLocalisedClause(R$string.shops_screens_item_details_action_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SHOPS_ITEM_DETAIL_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        return new cii.b((!((jte.d) this.f161777a).c(StoreCoreApi$Toggles$StoreDMD2Compliance.f88626c) || data == null || (storePurchaseDetailsResponse = (StorePurchaseDetailsResponse) data.getContent()) == null || !storePurchaseDetailsResponse.f88586g) ? new aw0.e(false, null, null, n6Var, null, null, 55) : new aw0.h(false, n6Var, new n6(new TextLocalisedClause(R$string.shops_screens_item_details_cancel_order, null, null, 14), LargeActionButton.ButtonStyle.o, null, null, false, null, null, 1020), null, null, null, 121), arrayListE03, aVar);
    }
}
