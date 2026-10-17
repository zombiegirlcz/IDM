package dnk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f116364a;

    public l(f01.c uiKitResources, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f116364a = uiKitResources;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f116364a = uiKitResources;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f116364a = uiKitResources;
                break;
            default:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f116364a = uiKitResources;
                break;
        }
    }

    public int a(String iconCode) {
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        Integer numB = b(iconCode);
        return numB != null ? numB.intValue() : R$drawable.uikit_icn_24_info_sign;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Integer b(String iconCode) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        switch (iconCode.hashCode()) {
            case -2057959651:
                numValueOf = !iconCode.equals("icn_24_calendar_date") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_date);
                break;
            case -2057390237:
                numValueOf = !iconCode.equals("icn_24_calendar_week") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_week);
                break;
            case -1775444848:
                numValueOf = !iconCode.equals("icn_24_services") ? null : Integer.valueOf(R$drawable.uikit_icn_24_services);
                break;
            case -1369561056:
                numValueOf = !iconCode.equals("icn_24_medical_cross") ? null : Integer.valueOf(R$drawable.uikit_icn_24_medical_cross);
                break;
            case -1218222745:
                numValueOf = !iconCode.equals("icn_24_driving_licence") ? null : Integer.valueOf(R$drawable.uikit_icn_24_driving_licence);
                break;
            case -1135440462:
                numValueOf = !iconCode.equals("icn_24_price_tag") ? null : Integer.valueOf(R$drawable.uikit_icn_24_price_tag);
                break;
            case -1112951835:
                numValueOf = !iconCode.equals("icn_24_premium") ? null : Integer.valueOf(R$drawable.uikit_icn_24_premium);
                break;
            case -1112777143:
                numValueOf = !iconCode.equals("icn_24_present") ? null : Integer.valueOf(R$drawable.uikit_icn_24_present);
                break;
            case -1103925449:
                numValueOf = !iconCode.equals("icn_24_profile") ? null : Integer.valueOf(R$drawable.uikit_icn_24_profile);
                break;
            case -1032886350:
                numValueOf = !iconCode.equals("icn_24_backpack") ? null : Integer.valueOf(R$drawable.uikit_icn_24_backpack);
                break;
            case -897203540:
                numValueOf = !iconCode.equals("icn_24_bitcoin") ? null : Integer.valueOf(R$drawable.uikit_icn_24_bitcoin);
                break;
            case -860871605:
                numValueOf = !iconCode.equals("icn_24_arrow_exchange") ? null : Integer.valueOf(R$drawable.uikit_icn_24_arrow_exchange);
                break;
            case -800366760:
                numValueOf = !iconCode.equals("icn_24_chevron_down") ? null : Integer.valueOf(R$drawable.uikit_icn_24_chevron_down);
                break;
            case -670026638:
                numValueOf = !iconCode.equals("icn_24_arrow_right_left") ? null : Integer.valueOf(R$drawable.uikit_icn_24_arrow_right_left);
                break;
            case -580338435:
                numValueOf = !iconCode.equals("icn_24_logo_revolut") ? null : Integer.valueOf(R$drawable.uikit_icn_24_logo_revolut);
                break;
            case -577475568:
                numValueOf = !iconCode.equals("icn_24_revert_left") ? null : Integer.valueOf(R$drawable.uikit_icn_24_revert_left);
                break;
            case -577428274:
                numValueOf = !iconCode.equals("icn_24_calendar_recurring") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_recurring);
                break;
            case -532294086:
                numValueOf = !iconCode.equals("icn_24_savings_vault") ? null : Integer.valueOf(R$drawable.uikit_icn_24_savings_vault);
                break;
            case -439083001:
                numValueOf = !iconCode.equals("icn_24_lounges") ? null : Integer.valueOf(R$drawable.uikit_icn_24_lounges);
                break;
            case -405871869:
                numValueOf = !iconCode.equals("icn_24_resort") ? null : Integer.valueOf(R$drawable.uikit_icn_24_resort);
                break;
            case -374779877:
                numValueOf = !iconCode.equals("icn_24_shield") ? null : Integer.valueOf(R$drawable.uikit_icn_24_shield);
                break;
            case -337137716:
                numValueOf = !iconCode.equals("icn_24_travel") ? null : Integer.valueOf(R$drawable.uikit_icn_24_travel);
                break;
            case -336726302:
                numValueOf = !iconCode.equals("icn_24_trophy") ? null : Integer.valueOf(R$drawable.uikit_icn_24_trophy);
                break;
            case -263265185:
                numValueOf = !iconCode.equals("icn_24_wealth") ? null : Integer.valueOf(R$drawable.uikit_icn_24_wealth);
                break;
            case -154307524:
                numValueOf = !iconCode.equals("icn_24_voucher") ? null : Integer.valueOf(R$drawable.uikit_icn_24_voucher);
                break;
            case -70807984:
                numValueOf = !iconCode.equals("icn_24_candlestick_chart") ? null : Integer.valueOf(R$drawable.uikit_icn_24_candlestick_chart);
                break;
            case -29475047:
                numValueOf = !iconCode.equals("icn_24_commodities") ? null : Integer.valueOf(R$drawable.uikit_icn_24_commodities);
                break;
            case 3636945:
                numValueOf = !iconCode.equals("icn_24_chevron_up") ? null : Integer.valueOf(R$drawable.uikit_icn_24_chevron_up);
                break;
            case 242093697:
                numValueOf = !iconCode.equals("icn_24_repayment") ? null : Integer.valueOf(R$drawable.uikit_icn_24_repayment);
                break;
            case 627030905:
                numValueOf = !iconCode.equals("icn_24_calendar_check") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_check);
                break;
            case 627243635:
                numValueOf = !iconCode.equals("icn_24_calendar_coins") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_coins);
                break;
            case 646529347:
                numValueOf = !iconCode.equals("icn_16_sand_watch") ? null : Integer.valueOf(R$drawable.uikit_icn_16_sand_watch);
                break;
            case 795852186:
                numValueOf = !iconCode.equals("icn_24_shopping") ? null : Integer.valueOf(R$drawable.uikit_icn_24_shopping);
                break;
            case 959787360:
                numValueOf = !iconCode.equals("icn_24_snowflake") ? null : Integer.valueOf(R$drawable.uikit_icn_24_snowflake);
                break;
            case 961988464:
                numValueOf = !iconCode.equals("icn_24_calendar") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar);
                break;
            case 1063018728:
                numValueOf = !iconCode.equals("icn_24_insurance") ? null : Integer.valueOf(R$drawable.uikit_icn_24_insurance);
                break;
            case 1118509484:
                numValueOf = !iconCode.equals("icn_24_drawing") ? null : Integer.valueOf(R$drawable.uikit_icn_24_drawing);
                break;
            case 1164802764:
                numValueOf = !iconCode.equals("icn_24_cashback") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cashback);
                break;
            case 1190371549:
                numValueOf = !iconCode.equals("icn_24_calendar_quarter") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_quarter);
                break;
            case 1259451633:
                numValueOf = !iconCode.equals("icn_16_lock_closed") ? null : Integer.valueOf(R$drawable.uikit_icn_16_lock_closed);
                break;
            case 1288488586:
                numValueOf = !iconCode.equals("icn_24_suitcase_insurance") ? null : Integer.valueOf(R$drawable.uikit_icn_24_suitcase_insurance);
                break;
            case 1381240746:
                numValueOf = !iconCode.equals("icn_24_globe_p2p") ? null : Integer.valueOf(R$drawable.uikit_icn_24_globe_p2p);
                break;
            case 1566933937:
                numValueOf = !iconCode.equals("icn_24_smartphone_shield") ? null : Integer.valueOf(R$drawable.uikit_icn_24_smartphone_shield);
                break;
            case 1606392814:
                numValueOf = !iconCode.equals("icn_16_lock_opened") ? null : Integer.valueOf(R$drawable.uikit_icn_16_lock_opened);
                break;
            case 1610002858:
                numValueOf = !iconCode.equals("icn_24_sim_card") ? null : Integer.valueOf(R$drawable.uikit_icn_24_sim_card);
                break;
            case 1676414168:
                numValueOf = !iconCode.equals("icn_24_lightning") ? null : Integer.valueOf(R$drawable.uikit_icn_24_lightning);
                break;
            case 1692240212:
                numValueOf = !iconCode.equals("icn_24_revpoints") ? null : Integer.valueOf(R$drawable.uikit_icn_24_revpoints);
                break;
            case 1774245398:
                numValueOf = !iconCode.equals("icn_24_check") ? null : Integer.valueOf(R$drawable.uikit_icn_24_check);
                break;
            case 1774374723:
                numValueOf = !iconCode.equals("icn_24_cloud") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cloud);
                break;
            case 1774458128:
                numValueOf = !iconCode.equals("icn_24_coins") ? null : Integer.valueOf(R$drawable.uikit_icn_24_coins);
                break;
            case 1774553422:
                numValueOf = !iconCode.equals("icn_24_cross") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cross);
                break;
            case 1778068219:
                numValueOf = !iconCode.equals("icn_24_globe") ? null : Integer.valueOf(R$drawable.uikit_icn_24_globe);
                break;
            case 1782594761:
                numValueOf = !iconCode.equals("icn_24_limit") ? null : Integer.valueOf(R$drawable.uikit_icn_24_limit);
                break;
            case 1791599424:
                numValueOf = !iconCode.equals("icn_24_vault") ? null : Integer.valueOf(R$drawable.uikit_icn_24_vault);
                break;
            case 1806442425:
                numValueOf = !iconCode.equals("icn_16_check") ? null : Integer.valueOf(R$drawable.uikit_icn_16_check);
                break;
            case 1806750449:
                numValueOf = !iconCode.equals("icn_16_cross") ? null : Integer.valueOf(R$drawable.uikit_icn_16_cross);
                break;
            case 1930501419:
                numValueOf = !iconCode.equals("icn_24_cleaning") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cleaning);
                break;
            case 1995346454:
                numValueOf = !iconCode.equals("icn_16_status_refund") ? null : Integer.valueOf(R$drawable.uikit_icn_16_status_refund);
                break;
            case 2135392164:
                numValueOf = !iconCode.equals("icn_24_apps") ? null : Integer.valueOf(R$drawable.uikit_icn_24_apps);
                break;
            case 2135437200:
                numValueOf = !iconCode.equals("icn_24_call") ? null : Integer.valueOf(R$drawable.uikit_icn_24_call);
                break;
            case 2135437378:
                numValueOf = !iconCode.equals("icn_24_card") ? null : Integer.valueOf(R$drawable.uikit_icn_24_card);
                break;
            case 2135437413:
                numValueOf = !iconCode.equals("icn_24_cash") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cash);
                break;
            case 2135443594:
                numValueOf = !iconCode.equals("icn_24_chat") ? null : Integer.valueOf(R$drawable.uikit_icn_24_chat);
                break;
            case 2135530207:
                numValueOf = !iconCode.equals("icn_24_fees") ? null : Integer.valueOf(R$drawable.uikit_icn_24_fees);
                break;
            case 2135563874:
                numValueOf = !iconCode.equals("icn_24_gift") ? null : Integer.valueOf(R$drawable.uikit_icn_24_gift);
                break;
            case 2135951359:
                numValueOf = !iconCode.equals("icn_24_time") ? null : Integer.valueOf(R$drawable.uikit_icn_24_time);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        String lowerCase = iconCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iA = this.f116364a.a(d0.e0(lowerCase, "icn_"));
        Integer numValueOf2 = Integer.valueOf(iA);
        if (iA != 0) {
            return numValueOf2;
        }
        return null;
    }

    public ResourceImage c(String iconCode) {
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        return new ResourceImage(a(iconCode), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList d(ArrayList countryCodes, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        ArrayList arrayList = new ArrayList(w.t(countryCodes, 10));
        Iterator it8 = countryCodes.iterator();
        while (it8.hasNext()) {
            wi0.b bVar2 = (wi0.b) it8.next();
            arrayList.add(new ChooserScreenContract$Model(bVar2.f297794a, this.f116364a.b(new CountryClause(bVar2, null)).toString(), null, null, null, new CountryImage(bVar2.f297794a, (Integer) null, (ez0.e) (0 == true ? 1 : 0), 14), bVar2.equals(bVar), bVar2, 29052));
        }
        return arrayList;
    }
}
