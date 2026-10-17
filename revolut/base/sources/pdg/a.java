package pdg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyHostDetails;
import ip0.ak0;
import ip0.yj0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235172a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HotelsProperty f235173b;

    public /* synthetic */ a(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b bVar, HotelsProperty hotelsProperty) {
        this.f235173b = hotelsProperty;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        char c2;
        ListSubheaderDelegate.Model model;
        UrlImage urlImage;
        CellDetailsDelegate.Model model2;
        String str;
        String str2;
        int i = this.f235172a;
        TextDelegate.Model model3 = null;
        HotelsProperty hotelsProperty = this.f235173b;
        switch (i) {
            case 0:
                Set favorites = (Set) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(favorites, "favorites");
                return IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "FAVORITES_ICON_ID", h9g.e.c(hotelsProperty, favorites), null, null, null, 124);
            case 1:
                List roomsList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                return new a.c(2, !hx7.a.m(hotelsProperty) ? new TextLocalisedClause(R$string.hotels_common_action_change_dates, null, null, 14) : hx7.a.o(hotelsProperty, fgi.a.VRBO) ? new TextLocalisedClause(R$string.hotels_common_action_continue, null, null, 14) : new TextLocalisedClause(R$string.hotels_property_details_choose_rooms, null, null, 14));
            default:
                List providerList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(providerList, "providersList");
                Intrinsics.checkNotNullParameter(hotelsProperty, "<this>");
                Intrinsics.checkNotNullParameter(providerList, "providerList");
                Iterator it8 = providerList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((fgi.b) next).f135075a == hotelsProperty.u) {
                        }
                    } else {
                        next = null;
                    }
                }
                fgi.b provider = (fgi.b) next;
                if (provider == null) {
                    return zhm.f0.f322471a;
                }
                Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                Intrinsics.checkNotNullParameter(provider, "provider");
                HotelsPropertyHostDetails hotelsPropertyHostDetails = hotelsProperty.v;
                if (hotelsPropertyHostDetails != null) {
                    List list = hotelsPropertyHostDetails.d;
                    boolean z = hotelsPropertyHostDetails.f98037b;
                    String str3 = hotelsPropertyHostDetails.e;
                    ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("HOST_DETAILS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_property_details_host_details_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                    if (str3 != null) {
                        c2 = 0;
                        model = model4;
                        urlImage = new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                    } else {
                        c2 = 0;
                        model = model4;
                        urlImage = null;
                    }
                    LayeredImage layeredImageB = str3 != null ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_star_filled, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 4.0f, null, null, 48) : null;
                    String str4 = hotelsPropertyHostDetails.f98036a;
                    RowDelegate.Model model5 = new RowDelegate.Model("HOST_DETAILS_HEADER_ITEM_ID", urlImage, null, null, str4 != null ? new TextLocalisedClause(R$string.hotels_property_details_host_details_title, zhm.u.c(str4), null, 12) : new TextLocalisedClause(R$string.hotels_property_details_host_details_title_unknown_name, null, null, 14), z ? new TextLocalisedClause(R$string.hotels_property_details_host_details_subtitle_private, null, null, 14) : new TextLocalisedClause(R$string.hotels_property_details_host_details_subtitle_professional, null, null, 14), null, null, 0, null, false, false, layeredImageB, null, null, null, null, null, null, 0, 0, 0, 0, 1073725292);
                    String str5 = hotelsPropertyHostDetails.f98038c;
                    CellDetailsDelegate.Model model6 = str5 != null ? new CellDetailsDelegate.Model("HOST_DETAILS_REGISTRATION_NUMBER_ITEM_ID", new TextLocalisedClause(R$string.hotels_property_details_host_details_registration_number, null, null, 14), new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
                    if (list.isEmpty()) {
                        model2 = null;
                    } else {
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_property_details_host_details_languages, null, null, 14);
                        m70.a.t(t0.f186434a);
                        model2 = new CellDetailsDelegate.Model("HOST_DETAILS_LANGUAGES_ITEM_ID", textLocalisedClause, new TextClause(zhm.d0.k0(list, ", ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
                    }
                    fgi.c cVar = provider.f135079h;
                    if (cVar != null) {
                        if (z && (str2 = cVar.f135080a) != null) {
                            model3 = new TextDelegate.Model("HOST_DETAILS_DESCRIPTION_ITEM_ID", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036);
                        } else if (!z && (str = cVar.f135081b) != null) {
                            model3 = new TextDelegate.Model("HOST_DETAILS_DESCRIPTION_ITEM_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036);
                        }
                    }
                    qv0.i[] elements = new qv0.i[4];
                    elements[c2] = model5;
                    elements[1] = model6;
                    elements[2] = model2;
                    elements[3] = model3;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    yp0.b.k(listL, 0, 0, 0, 0, 31);
                    List listQ = i2b.a.q(model, listL);
                    if (listQ != null) {
                        return listQ;
                    }
                }
                return zhm.f0.f322471a;
        }
    }

    public /* synthetic */ a(HotelsProperty hotelsProperty) {
        this.f235173b = hotelsProperty;
    }

    public /* synthetic */ a(HotelsProperty hotelsProperty, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b bVar) {
        this.f235173b = hotelsProperty;
    }
}
