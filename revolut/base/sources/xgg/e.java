package xgg;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import hx7.q;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f305761a;

    public e(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f305761a = uiKitResources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public final List a(hfg.e airline, Integer num) {
        ?? r142;
        List listC;
        TextLocalisedClause textLocalisedClause;
        int i;
        TextLocalisedClause textLocalisedClause2;
        int i2 = 2;
        Intrinsics.checkNotNullParameter(airline, "airline");
        ArrayList arrayList = airline.f151828l;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it8.hasNext()) {
                int i5 = i2;
                if (arrayList2.isEmpty()) {
                    r142 = 0;
                    listC = f0.f322471a;
                } else if (arrayList2.size() == 1) {
                    int i6 = R$attr.uikit_dp0;
                    int i21 = R$attr.uikit_dp4;
                    listC = u.c(new xk("REDEEM_OPTIONS_GRID_LIST_ID", arrayList2, 1, null, null, i6, 0, i21, i21, 63864));
                    r142 = 0;
                } else if (arrayList2.size() % 2 == 1) {
                    List listSubList = arrayList2.subList(0, arrayList2.size() - 1);
                    int i22 = R$attr.uikit_dp0;
                    int i32 = R$attr.uikit_dp4;
                    xk xkVar = new xk("REDEEM_OPTIONS_GRID_LIST_ID", listSubList, 2, null, null, i22, i32, i32, i32, 63608);
                    List listC2 = u.c(d0.m0(arrayList2));
                    int i33 = R$attr.uikit_dp4;
                    listC = v.k(xkVar, new xk("REDEEM_OPTIONS_GRID_LIST_ID1", listC2, 1, null, null, i33, 0, i33, i33, 63864));
                    r142 = 0;
                } else {
                    int i43 = R$attr.uikit_dp0;
                    int i59 = R$attr.uikit_dp4;
                    r142 = 0;
                    listC = u.c(new xk("REDEEM_OPTIONS_GRID_LIST_ID", arrayList2, 2, null, null, i43, 0, i59, i59, 63864));
                }
                if (listC.isEmpty()) {
                    return listC;
                }
                int i66 = d.f305760a[airline.f151827j.f94107h.ordinal()];
                if (i66 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_redeem_options_title, r142, r142, 14);
                } else {
                    if (i66 != i5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_redeem_options_avios_title, r142, r142, 14);
                }
                return d0.E0(listC, u.c(new ListSubheaderDelegate.Model("REDEEM_OPTIONS_SUB_HEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
            }
            Object next = it8.next();
            int i74 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            TravelMilesRedeemOption travelMilesRedeemOption = (TravelMilesRedeemOption) next;
            Integer numZ = q.z(this.f305761a, travelMilesRedeemOption.f94119c);
            if (numZ != null) {
                int iIntValue = numZ.intValue();
                Double d = travelMilesRedeemOption.d;
                if (d != null) {
                    i = i2;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.miles_airline_details_redeem_option_starting_price, u.c(nub.a.k(d.doubleValue(), o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, null, 54)), null, 12);
                } else {
                    i = i2;
                    textLocalisedClause2 = null;
                }
                Clause textClause = new TextClause(travelMilesRedeemOption.f94117a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String strN = a0.d.n("REDEEM_OPTIONS_ITEM_LIST_ID_", i3);
                GlyphImage glyphImage = new GlyphImage(iIntValue, null, null, 6);
                if (num != null) {
                    textClause = new TextLocalisedClause(num.intValue(), u.c(textClause), null, 12);
                }
                ActionCardDelegate.Model model = new ActionCardDelegate.Model(strN, textClause, glyphImage, null, textLocalisedClause2 != null ? new com.revolut.core.ui_kit.delegates.f(textLocalisedClause2, com.revolut.core.ui_kit.delegates.e.SMALL) : null, travelMilesRedeemOption, null, !travelMilesRedeemOption.e.isEmpty(), 14024);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                obj = model;
            } else {
                i = i2;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
            i3 = i74;
            i2 = i;
        }
    }

    public final List b() {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("REDEEM_OPTIONS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278);
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            ip0.f fVar = new ip0.f(a0.d.n("REDEEM_OPTIONS_ITEM_LIST_ID_", i));
            yp0.b.l(fVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(fVar);
        }
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp4;
        return v.k(model, new xk("REDEEM_OPTIONS_GRID_LIST_ID", arrayList, 2, null, null, i2, 0, i3, i3, 63864));
    }
}
