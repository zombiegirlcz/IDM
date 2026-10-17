package wda;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.feature.pockets.api.details_v2.domain.AccountDetailsQrCode;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.an0;
import ip0.cn0;
import ip0.s7;
import ip0.t5;
import ip0.zj;
import ip0.zm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.j4;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements cda.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f296469c = r0.k(new Pair("Coins", Integer.valueOf(R$drawable.uikit_icn_24_coins)), new Pair("Bank", Integer.valueOf(R$drawable.uikit_icn_24_bank)), new Pair("DepositProtection", Integer.valueOf(R$drawable.uikit_icn_deposit_protection)), new Pair("ExclamationMark", Integer.valueOf(R$drawable.uikit_icn_24_exclamation_mark)), new Pair("ExclamationTriangle", Integer.valueOf(R$drawable.uikit_icn_24_exclamation_triangle)), new Pair("Flag", Integer.valueOf(R$drawable.uikit_icn_24_flag)), new Pair("Fscs", Integer.valueOf(R$drawable.uikit_icn_24_fscs)), new Pair("Globe", Integer.valueOf(R$drawable.uikit_icn_24_globe)), new Pair("Lightbulb", Integer.valueOf(R$drawable.uikit_icn_24_lightbulb)), new Pair("Lock", Integer.valueOf(R$drawable.uikit_icn_24_lock_closed)), new Pair("Shield", Integer.valueOf(R$drawable.uikit_icn_24_shield)), new Pair("Star", Integer.valueOf(R$drawable.uikit_icn_24_star_filled)), new Pair("Time", Integer.valueOf(R$drawable.uikit_icn_24_time)), new Pair("ArrowRequest", Integer.valueOf(R$drawable.uikit_icn_24_arrow_request)), new Pair("LogoRevolut", Integer.valueOf(R$drawable.uikit_icn_24_logo_revolut)), new Pair("RatesConverterPage", Integer.valueOf(R$drawable.uikit_icn_24_rates_converter_page)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f296470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo1.c f296471b;

    public b(f01.c uiKitResources, vo1.c billsFeatureChecker) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        this.f296470a = uiKitResources;
        this.f296471b = billsFeatureChecker;
    }

    public final mii.f a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.account_detail_alert_copied_clipboard, null, null, 14);
        int i = R$drawable.uikit_icn_24_copy;
        Float fValueOf = Float.valueOf(16.0f);
        return new mii.f("ID_COPIED_TO_CLIPBOARD", textLocalisedClause, null, new ConfigurableResourceImage(i, null, fValueOf, fValueOf, 926), null, null, LDSFile.EF_DG12_TAG);
    }

    public final FullScreenStateDelegate.Model b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R$string.common_state_error_title, null, null, 14), new TextLocalisedClause(R$string.common_state_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(new s7(a0.d.n("LIST_ID_LOADING_PREFIX_", i), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final List d(String currencyCode, boolean z) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (!z) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("UNAVAILABLE_ITEM_ID", new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_coming_soon_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_coming_soon_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D007", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        boolean z3 = false;
        boolean z4 = false;
        List listK = zhm.v.k(new RowDelegate.Model("UNAVAILABLE_ITEM_ID0", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_empty_transfer_title, zhm.u.c(new TextClause(currencyCode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_empty_transfer_body, zhm.u.c(new TextClause(currencyCode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("UNAVAILABLE_ITEM_ID1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rates_converter_page, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_empty_exchange_title, zhm.u.c(new TextClause(currencyCode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_empty_exchange_body, zhm.u.c(new TextClause(currencyCode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final aim.e e(dda.d accountDetailsContent, boolean z, boolean z3, boolean z4) {
        ?? arrayList;
        AccountDetailsQrCode accountDetailsQrCode;
        Object model;
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(accountDetailsContent, "accountDetailsContent");
        aim.e eVarB = zhm.u.b();
        dda.g gVar = accountDetailsContent.f113170g;
        if (gVar != null && (str = gVar.f113176a) != null && z3) {
            eVarB.add(new RowDelegate.Model("MAIN_GROUP_TITLE", null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        }
        dda.g gVar2 = accountDetailsContent.f113170g;
        if (gVar2 != null) {
            ArrayList arrayList2 = gVar2.f113177b;
            arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
            int i = 0;
            for (Object obj2 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dda.h hVar = (dda.h) obj2;
                arrayList.add(new t5(a0.d.n("MAIN_LIST_ITEM_", i), new TextClause(hVar.f113179b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(hVar.f113178a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), hVar, null, null, 0, 0, 0, 0, 2024));
                i = i2;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        Collection collection = (Collection) arrayList;
        eVarB.addAll(collection);
        if (!collection.isEmpty() && z4) {
            if (z) {
                Iterator it8 = accountDetailsContent.f113172j.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((AccountDetailsQrCode) next).f80767a == dda.j.SIX_QR && ((fp1.d) this.f296471b).c(cf9.c.f23654c)) {
                        break;
                    }
                }
                accountDetailsQrCode = (AccountDetailsQrCode) next;
            } else {
                accountDetailsQrCode = null;
            }
            if (accountDetailsQrCode != null) {
                h4 h4Var = h4.SEMIACCENT;
                cn0 primaryButton = new cn0(88, new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_qr_code_share_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4Var);
                zm0 secondaryButton = new zm0(h4Var, new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                Intrinsics.checkNotNullParameter("LIST_ID_SHARE_BTN", "listId");
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
                model = new an0("LIST_ID_SHARE_BTN", primaryButton, secondaryButton, accountDetailsQrCode);
            } else {
                h4 h4Var2 = h4.SEMIACCENT;
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_account_details_detail_action_share_details, null, null, 14);
                int i3 = R$attr.uikit_dp16;
                model = new SmallActionButtonDelegate.Model("LIST_ID_SHARE_BTN", h4Var2, resourceImage, null, textLocalisedClause, null, j4.f208300a, null, null, R$attr.uikit_dp8, i3, i3, i3, 1880);
            }
            eVarB.add(model);
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final List f(dda.m emptyState) {
        ?? r4;
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        TextClause textClause = new TextClause(emptyState.f113187b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List list = emptyState.d;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            r4 = f296469c;
            g gVar = null;
            if (!zHasNext) {
                break;
            }
            dda.r rVar = (dda.r) it8.next();
            dda.t tVar = rVar.f113194b;
            if (tVar != null) {
                ArrayList<dda.s> arrayList2 = tVar.f113198b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (dda.s sVar : arrayList2) {
                    arrayList3.add(new f((Integer) r4.get(sVar.f113196b), sVar.f113195a));
                }
                gVar = new g(rVar.f113193a, tVar.f113197a, arrayList3);
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        TextClause textClauseL = ifk.b.l(emptyState.f113188c, "ID_HIGHLIGHTED_TEXT_", arrayList);
        dda.n nVar = emptyState.e;
        l6 l6Var = nVar != null ? new l6(12, new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.account_unavailable_action_button, zhm.u.c(nVar.f113189a), null, 12), null, h4.ACCENT) : null;
        Integer num = (Integer) r4.get(emptyState.f113186a);
        List listC = zhm.u.c(new FullScreenStateDelegate.Model("ID_ITEM_EMPTY_STATE_ITEM", textClause, textClauseL, num != null ? new ComplexImage.Regular(new GlyphImage(num.intValue(), null, null, 6)) : null, l6Var, zj.REGULAR, false, emptyState.e, null, null, 1728));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final String g(dda.d accountDetailsContent) {
        Intrinsics.checkNotNullParameter(accountDetailsContent, "accountDetailsContent");
        StringBuilder sb6 = new StringBuilder();
        dda.g gVar = accountDetailsContent.f113170g;
        if (gVar != null) {
            int i = 0;
            for (Object obj2 : gVar.f113177b) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dda.h hVar = (dda.h) obj2;
                if (i > 0) {
                    sb6.append("\n");
                }
                sb6.append(this.f296470a.b(new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.account_details_list_item_preview_fields_format, zhm.v.k(new TextClause(hVar.f113178a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(hVar.f113179b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)).toString());
                i = i2;
            }
        }
        return sb6.toString();
    }

    public final String h(dda.d accountDetailsContent, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(accountDetailsContent, "accountDetailsContent");
        xi0.b.Companion.getClass();
        StringBuilder sbS = p.a.s(this.f296470a.b(new CurrencyClause(xi0.a.a(currencyCode), null, null, 6)).toString());
        dda.g gVar = accountDetailsContent.f113170g;
        if (gVar != null) {
            for (dda.h hVar : gVar.f113177b) {
                sbS.append("\n\n");
                sbS.append(hVar.f113178a + "\n" + hVar.f113179b);
            }
        }
        return sbS.toString();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
    public final aim.e i(dda.z tipsContent) {
        Intrinsics.checkNotNullParameter(tipsContent, "tipsContent");
        aim.e eVarB = zhm.u.b();
        String str = tipsContent.f113209a;
        if (str != null) {
            eVarB.add(new RowDelegate.Model("LIST_ID_TIPS_TITLE", null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        }
        List list = tipsContent.f113210b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        boolean z = false;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            RowDelegate.Model.MainImage.Image24 image24 = null;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dda.y yVar = (dda.y) obj2;
            String strN = a0.d.n("LIST_ID_TIP", i);
            List list2 = yVar.d;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(ifk.b.M((dda.w) it8.next()));
            }
            TextClause textClauseL = ifk.b.l(yVar.f113206a, "ID_HIGHLIGHTED_TIP", arrayList2);
            String str2 = yVar.f113208c;
            TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            Integer num = (Integer) f296469c.get(yVar.f113207b);
            if (num != null) {
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(num.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
            }
            arrayList.add(new RowDelegate.Model(strN, image24, textClauseL, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return zhm.u.a(eVarB);
    }
}
