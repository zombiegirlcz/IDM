package kkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.transactions.impl.R$string;
import ip0.y10;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements oim.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f184673a = i3;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        io3.d dVar;
        aim.e eVar;
        String str;
        String str2;
        io3.l lVar;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ResourceImage resourceImage;
        TextLocalisedClause textLocalisedClause3;
        ActionsView.Item item;
        i93.c cVar;
        switch (this.f184673a) {
            case 0:
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                klf.j1 j1Var = (klf.j1) obj4;
                kr2.h hVar = (kr2.h) obj5;
                qua.p pVar = (qua.p) obj6;
                g gVar = (g) this.receiver;
                String strG = ((bnf.r) gVar.f).g((tof.a3) obj2);
                sa saVarG = null;
                String str3 = juniorBankingProfile != null ? juniorBankingProfile.f77099b : null;
                if (!j1Var.c()) {
                    if (hVar instanceof kr2.f) {
                        saVarG = ((xr2.b) gVar.d).a(((kr2.f) hVar).f188649b, strG, str3);
                    } else if (pVar != null && qua.u.k(pVar)) {
                        saVarG = ((i9e.f) gVar.e).G("ID_UNBLOCK_SUBSCRIPTION", strG, pVar, str3);
                    }
                }
                List listL = zhm.v.l(saVarG);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 1:
                tof.a3 a3Var = (tof.a3) obj2;
                Map map = (Map) obj3;
                h93.f0 f0Var = (h93.f0) obj4;
                PocketWithSubaccount pocketWithSubaccount = (PocketWithSubaccount) obj5;
                ((a2) this.receiver).getClass();
                if (((klf.j1) obj6).c()) {
                    return zhm.f0.f322471a;
                }
                aim.e eVarB = zhm.u.b();
                ActionsView.Item item2 = null;
                i93.d dVar2 = (f0Var == null || (cVar = f0Var.f150113g) == null) ? null : cVar.f159553h;
                if (pocketWithSubaccount == null || (dVar = pocketWithSubaccount.f65523a) == null) {
                    dVar = (io3.d) map.get(a3Var.f272624y.f273143a);
                }
                boolean z = pocketWithSubaccount != null || dVar2 == i93.d.ALL_CRYPTO;
                a2.Companion.getClass();
                if (z1.a(dVar, a3Var)) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_title, null, null, 14);
                    if (pocketWithSubaccount == null || (str = pocketWithSubaccount.f65524b) == null) {
                        str = dVar.d;
                    }
                    String str4 = str;
                    tof.j5 j5Var = a3Var.f272605o1;
                    tof.v1 v1Var = a3Var.O1;
                    if (j5Var == null || (str2 = j5Var.d) == null) {
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        str2 = "";
                    }
                    io3.l lVar2 = dVar.e;
                    io3.l lVar3 = io3.l.CURRENT;
                    boolean z3 = lVar2 == lVar3;
                    if (z && v1Var == tof.v1.SUBSCRIPTION) {
                        lVar = lVar3;
                        textLocalisedClause = new TextLocalisedClause(z3 ? R$string.transaction_insufficient_funds_widget_card_linked_subscription_title : R$string.transaction_insufficient_funds_widget_card_linked_to_pocket_subscription_title, zhm.v.k(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    } else {
                        lVar = lVar3;
                        if (z && v1Var == tof.v1.POST_CONSUMPTION) {
                            textLocalisedClause = new TextLocalisedClause(z3 ? R$string.transaction_insufficient_funds_widget_card_linked_post_consumtion_title : R$string.transaction_insufficient_funds_widget_card_linked_to_pocket_post_consumption_title, zhm.v.k(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        } else {
                            String str5 = str2;
                            if (z) {
                                textLocalisedClause = new TextLocalisedClause(z3 ? R$string.transaction_insufficient_funds_widget_card_linked_one_off_title : R$string.transaction_insufficient_funds_widget_card_linked_to_pocket_one_off_title, zhm.u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                            } else {
                                textLocalisedClause = v1Var == tof.v1.SUBSCRIPTION ? new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_subscription_title, zhm.u.c(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : v1Var == tof.v1.POST_CONSUMPTION ? new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_post_consumption_title, zhm.u.c(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_one_off_title, null, null, 14);
                            }
                        }
                    }
                    ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    xi0.a aVar = xi0.b.Companion;
                    String str6 = dVar.f163147c;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str6);
                    ActionsView.Item item3 = dVar.e == lVar ? new ActionsView.Item("INSUFFICIENT_FUNDS_ADD_MONEY_LIST_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_action_add_money, null, null, 14), null, null, null, null, false, null, null, bVarA, null, 24476) : cp5.d.z(bVarA) ? new ActionsView.Item("INSUFFICIENT_FUNDS_BUY_LIST_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_action_buy, zhm.u.c(new CurrencyClause(bVarA, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, null, null, null, false, null, null, bVarA, null, 24476) : null;
                    if (z) {
                        textLocalisedClause3 = textLocalisedClause4;
                        textLocalisedClause2 = textLocalisedClause;
                        resourceImage = resourceImage2;
                        item = item3;
                        eVar = eVarB;
                        item2 = new ActionsView.Item("INSUFFICIENT_FUNDS_EDIT_CARD_CURRENCY_LIST_ID", item3 == null ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transaction_insufficient_funds_widget_action_edit_card, null, null, 14), null, null, null, null, false, null, null, f0Var, null, 24476);
                    } else {
                        textLocalisedClause2 = textLocalisedClause;
                        resourceImage = resourceImage2;
                        eVar = eVarB;
                        textLocalisedClause3 = textLocalisedClause4;
                        item = item3;
                    }
                    ActionsView.Item[] elements = {item, item2};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    eVar.add(new sa("INSUFFICIENT_FUNDS_WARNING_LIST_ID", (Clause) textLocalisedClause3, (Clause) textLocalisedClause2, kotlin.collections.d.L(elements), false, (Image) resourceImage, (y10) null, (Object) null, 4048));
                } else {
                    eVar = eVarB;
                }
                aim.e eVarA = zhm.u.a(eVar);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            default:
                tof.a3 transaction = (tof.a3) obj2;
                tof.t3 t3Var = (tof.t3) obj3;
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                DateTime dateTime = (DateTime) obj5;
                znf.a aVar2 = (znf.a) obj6;
                k7 k7Var = (k7) this.receiver;
                k7Var.getClass();
                if (k71.k.q0(transaction) || k71.k.T(transaction)) {
                    return zhm.f0.f322471a;
                }
                vlf.b bVar = k7Var.f184796c;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                CapitalizedClause capitalizedClauseR = ((bnf.r) bVar.f290428b).r(transaction);
                CellDetailsDelegate.Model modelL = (capitalizedClauseR != null && bVar.h(dateTime, transaction, t3Var, zBooleanValue) == null) ? ((wnf.e) bVar.f290427a).l(capitalizedClauseR) : null;
                if (modelL == null) {
                    return zhm.f0.f322471a;
                }
                tof.y6[] elements2 = {tof.y6.TOPUP, tof.y6.TOPUP_CHARGEBACK, tof.y6.TOPUP_RETURN};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                boolean zContains = kotlin.collections.d.y0(elements2).contains(transaction.e);
                List list = t3Var != null ? t3Var.f273073q : null;
                boolean z4 = list == null || list.isEmpty();
                boolean z6 = (t3Var != null ? t3Var.C : null) != null;
                if (!z4) {
                    return zhm.f0.f322471a;
                }
                if ((!zContains || !z6) && aVar2 == null) {
                    return zhm.u.c(modelL);
                }
                return zhm.f0.f322471a;
        }
    }
}
