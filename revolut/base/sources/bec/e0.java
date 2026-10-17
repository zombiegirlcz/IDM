package bec;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shared.R$string;
import ip0.nb0;
import ip0.pb0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dec.v f14769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dec.c f14770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dec.f f14771c;

    public e0(dec.v revolutAccountMapper, dec.c cardMapper, dec.f filteredRevolutAccountMapper) {
        Intrinsics.checkNotNullParameter(revolutAccountMapper, "revolutAccountMapper");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(filteredRevolutAccountMapper, "filteredRevolutAccountMapper");
        this.f14769a = revolutAccountMapper;
        this.f14770b = cardMapper;
        this.f14771c = filteredRevolutAccountMapper;
    }

    public static List b(Function1 function1) {
        return (List) function1.invoke(new iii.d(10, null, true, false, "PAY_WITH_ANY_ERROR_LIST_ID"));
    }

    public static List e() {
        nb0 nb0Var = pb0.Companion;
        List listK = zhm.v.k(nb0.b(nb0Var, "FIRST_PAYMENT_METHOD_LOADING_ROW_LIST_ID", false, 0, false, 30), nb0.b(nb0Var, "SECOND_PAYMENT_METHOD_LOADING_ROW_LIST_ID", false, 0, false, 30), nb0.b(nb0Var, "THIRD_PAYMENT_METHOD_LOADING_ROW_LIST_ID", false, 0, false, 30));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    public final aim.e a(h hVar, CardPaymentAvailability cardPaymentAvailability, PaymentMethod paymentMethod, Set collapsedPocketGroups, List list) throws IOException {
        Collection collectionA;
        RowDelegate.Model.MainImage.Image40 image40;
        CircleBadgeModel circleBadgeModel;
        CircleBadgeModel accentCircleBadge;
        boolean z;
        String str;
        String str2;
        u6c.y yVar;
        TreeMap treeMap;
        TextLocalisedClause textLocalisedClause;
        List list2 = hVar.f14779a;
        List favouritePocketIds = hVar.f14780b;
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof PaymentMethod.RevolutAccount) {
                arrayList.add(obj2);
            }
        }
        PaymentMethod.RevolutAccount revolutAccount = (PaymentMethod.RevolutAccount) zhm.d0.d0(arrayList);
        ArrayList<PaymentMethod.Card> cards = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof PaymentMethod.Card) {
                cards.add(obj3);
            }
        }
        aim.e eVarB = zhm.u.b();
        if (revolutAccount != null) {
            u6c.y savingsAccountProductName = hVar.f14781c;
            Intrinsics.checkNotNullParameter(revolutAccount, "revolutAccount");
            Intrinsics.checkNotNullParameter(favouritePocketIds, "favouritePocketIds");
            Intrinsics.checkNotNullParameter(collapsedPocketGroups, "collapsedPocketGroups");
            Intrinsics.checkNotNullParameter(savingsAccountProductName, "savingsAccountProductName");
            ?? r62 = revolutAccount.f84394b;
            PaymentMethod.RevolutAccount.Wallet wallet = (PaymentMethod.RevolutAccount.Wallet) r62.get(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.BUSINESS);
            PaymentMethod.RevolutAccount.Wallet walletA = wallet != null ? dec.v.a(wallet, favouritePocketIds) : null;
            PaymentMethod.RevolutAccount.Wallet wallet2 = (PaymentMethod.RevolutAccount.Wallet) r62.get(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL);
            PaymentMethod.RevolutAccount.Wallet walletA2 = wallet2 != null ? dec.v.a(wallet2, favouritePocketIds) : null;
            PaymentMethod.RevolutAccount.Wallet wallet3 = (PaymentMethod.RevolutAccount.Wallet) r62.get(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT);
            PaymentMethod.RevolutAccount.Wallet walletA3 = wallet3 != null ? dec.v.a(wallet3, favouritePocketIds) : null;
            Collection collectionValues = r62.values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = collectionValues.iterator();
            while (it8.hasNext()) {
                Map map = ((PaymentMethod.RevolutAccount.Wallet) it8.next()).f84396b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = map.entrySet().iterator();
                while (it9.hasNext()) {
                    List list4 = (List) ((Map.Entry) it9.next()).getValue();
                    u6c.y yVar2 = savingsAccountProductName;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list4) {
                        Iterator it10 = it8;
                        Iterator it11 = it9;
                        if (favouritePocketIds.contains(((PaymentMethod.Pocket) obj4).f84376a)) {
                            arrayList4.add(obj4);
                        }
                        it8 = it10;
                        it9 = it11;
                    }
                    zhm.a0.x(arrayList4, arrayList3);
                    savingsAccountProductName = yVar2;
                }
                zhm.a0.x(arrayList3, arrayList2);
            }
            u6c.y yVar3 = savingsAccountProductName;
            aim.e eVarB2 = zhm.u.b();
            if (walletA != null) {
                z = false;
                eVarB2.add(new dec.u(walletA, false));
            } else {
                z = false;
            }
            if (walletA2 != null) {
                eVarB2.add(new dec.u(walletA2, z));
            }
            if (walletA3 != null) {
                eVarB2.add(new dec.u(walletA3, z));
            }
            if (walletA2 != null) {
                eVarB2.add(new dec.u(walletA2, true));
            }
            aim.e eVarA = zhm.u.a(eVarB2);
            aim.e eVarB3 = zhm.u.b();
            boolean zIsEmpty = arrayList2.isEmpty();
            dec.v vVar = this.f14769a;
            if (zIsEmpty) {
                str = "collapsedPocketGroups";
                str2 = "savingsAccountProductName";
                yVar = yVar3;
            } else {
                str = "collapsedPocketGroups";
                dec.x xVar = vVar.f113380b;
                str2 = "savingsAccountProductName";
                u6c.q qVar = u6c.q.f277578a;
                aim.e eVarA2 = xVar.a(qVar, arrayList2, paymentMethod, collapsedPocketGroups.contains(qVar), yVar3);
                yVar = yVar3;
                eVarB3.addAll(eVarA2);
            }
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar = (aim.b) listIterator;
                if (!bVar.hasNext()) {
                    eVarB.addAll(zhm.u.a(eVarB3));
                    break;
                }
                dec.u uVar = (dec.u) bVar.next();
                PaymentMethod.RevolutAccount.Wallet wallet4 = uVar.f113377a;
                boolean z3 = uVar.f113378b;
                dec.a0 a0Var = vVar.f113379a;
                boolean zIsEmpty2 = eVarB3.isEmpty();
                Intrinsics.checkNotNullParameter(wallet4, "wallet");
                Intrinsics.checkNotNullParameter(collapsedPocketGroups, str);
                Intrinsics.checkNotNullParameter(yVar, str2);
                aim.e eVarB4 = zhm.u.b();
                ListIterator listIterator2 = listIterator;
                Map map2 = wallet4.f84396b;
                com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j jVar = wallet4.f84395a;
                String str3 = str;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map2.size()));
                Iterator it12 = map2.entrySet().iterator();
                while (it12.hasNext()) {
                    Map.Entry entry = (Map.Entry) it12.next();
                    Iterator it13 = it12;
                    Object key = entry.getKey();
                    List list5 = (List) entry.getValue();
                    dec.v vVar2 = vVar;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list5) {
                        String str4 = str2;
                        boolean zB = ((PaymentMethod.Pocket) obj5).b();
                        if (!z3) {
                            zB = !zB;
                        }
                        if (zB) {
                            arrayList5.add(obj5);
                        }
                        str2 = str4;
                    }
                    linkedHashMap.put(key, arrayList5);
                    it12 = it13;
                    vVar = vVar2;
                }
                dec.v vVar3 = vVar;
                String str5 = str2;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                TreeMap treeMapF = q0.f(linkedHashMap2, new adh.k(a0Var, 4));
                if (!treeMapF.isEmpty()) {
                    aim.e eVarB5 = zhm.u.b();
                    eVarB5.add("WALLET_SUBHEADER_LIST_ID");
                    eVarB5.add(jVar.name());
                    if (z3) {
                        eVarB5.add("pro");
                    }
                    String strK0 = zhm.d0.k0(zhm.u.a(eVarB5), "_", null, null, 0, null, 62);
                    if (z3) {
                        treeMap = treeMapF;
                        textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_pro, null, null, 14);
                    } else {
                        treeMap = treeMapF;
                        int i = dec.z.f113384a[jVar.ordinal()];
                        if (i == 1) {
                            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_main, null, null, 14);
                        } else if (i == 2) {
                            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_personal, null, null, 14);
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_joint, null, null, 14);
                        }
                    }
                    eVarB4.add(new ListSubheaderDelegate.Model(strK0, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, zIsEmpty2 ? R$attr.uikit_dp16 : R$attr.uikit_dp32, R$attr.uikit_dp4, 0, 0, 53242));
                    for (Map.Entry entry3 : treeMap.entrySet()) {
                        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f fVar = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f) entry3.getKey();
                        List list6 = (List) entry3.getValue();
                        Intrinsics.h(fVar);
                        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l lVar = new com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l(jVar, fVar, z3);
                        dec.a0 a0Var2 = a0Var;
                        dec.x xVar2 = a0Var2.f113363a;
                        Intrinsics.h(list6);
                        aim.e eVar = eVarB4;
                        eVar.addAll(xVar2.a(lVar, list6, paymentMethod, collapsedPocketGroups.contains(lVar), yVar));
                        eVarB4 = eVar;
                        a0Var = a0Var2;
                    }
                }
                eVarB3.addAll(zhm.u.a(eVarB4));
                listIterator = listIterator2;
                yVar = yVar;
                str = str3;
                vVar = vVar3;
                str2 = str5;
            }
        }
        boolean zIsEmpty3 = eVarB.isEmpty();
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
        if (cardPaymentAvailability instanceof CardPaymentAvailability.NotAvailable) {
            collectionA = zhm.f0.f322471a;
        } else {
            aim.e eVarB6 = zhm.u.b();
            boolean zIsEmpty4 = cards.isEmpty();
            eVarB6.add(new ListSubheaderDelegate.Model("CARD_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_section_title_saved_cards, null, null, 14), (ResourceImage) null, false, false, (Clause) (!zIsEmpty4 ? new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_add_card_button, null, null, 14) : null), !zIsEmpty4, (Object) f.f14772a, (AnalyticsContext) null, zIsEmpty3 ? R$attr.uikit_dp16 : R$attr.uikit_dp32, R$attr.uikit_dp12, 0, 0, (String) null, 235322));
            if (zIsEmpty4) {
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_CARDS_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_no_saved_cards, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_cards, null, null, 6)), new l6(8, new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_add_card_button, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), null, false, null, null, null, 1892);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB6.add(model);
            } else {
                String f84393a = paymentMethod != null ? paymentMethod.getF84393a() : null;
                aim.e eVarB7 = zhm.u.b();
                for (PaymentMethod.Card card : cards) {
                    boolean zA = card.a(cardPaymentAvailability);
                    String str6 = card.f84370a;
                    boolean z4 = zA && !card.b(((l80.f) this.f14770b.f113364a).e());
                    boolean z6 = Intrinsics.f(str6, f84393a) && z4;
                    Image imageB = dec.g.b(card.d);
                    Intrinsics.checkNotNullParameter(card, "card");
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_payment_methods_expiration_date, zhm.u.c(card.e + "/" + ((Object) String.valueOf(card.f).subSequence(2, 4))), null, 12);
                    String strQ = j6.a.q("CARD_ROW_LIST_ID_", str6);
                    if (imageB != null) {
                        if (!z4) {
                            accentCircleBadge = new InactiveCircleBadge(dw0.a.Locked);
                        } else if (z6) {
                            accentCircleBadge = new AccentCircleBadge(dw0.a.Checked);
                        } else {
                            circleBadgeModel = null;
                            image40 = new RowDelegate.Model.MainImage.Image40(imageB, circleBadgeModel, null, false, null, false, 60);
                        }
                        circleBadgeModel = accentCircleBadge;
                        image40 = new RowDelegate.Model.MainImage.Image40(imageB, circleBadgeModel, null, false, null, false, 60);
                    } else {
                        image40 = null;
                    }
                    eVarB7.add(new RowDelegate.Model(strQ, image40, dec.a.a(card), null, 0, z4 ? textLocalisedClause2 : new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_disabled_method_reason_card, zhm.u.c(textLocalisedClause2), null, 12), null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_more_dots, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), z4, null, z6, z4 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, new c(card), null, 0, 0, 0, 0, 532648920));
                }
                aim.e eVarA3 = zhm.u.a(eVarB7);
                yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
                eVarB6.addAll(eVarA3);
            }
            if (cardPaymentAvailability instanceof CardPaymentAvailability.DisabledAtMerchant) {
                boolean z11 = false;
                RowDelegate.Model model2 = new RowDelegate.Model("CARD_NOT_AVAILABLE_MERCHANT_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), z11, z11, 6), new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_merchant_disabled_card_payments, zhm.u.c(((CardPaymentAvailability.DisabledAtMerchant) cardPaymentAvailability).f84363a), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                int i2 = R$attr.uikit_dp12;
                yp0.b.l(model2, i2, i2, 0, 0, null, false, 60);
                eVarB6.add(model2);
            }
            collectionA = zhm.u.a(eVarB6);
        }
        eVarB.addAll(collectionA);
        int i3 = R$attr.uikit_dp24;
        yp0.b.q(list, i3, i3, 0, 0, 12);
        eVarB.addAll(list);
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        w6c.f fVar = domainState.f14789j;
        Data data = domainState.f14784a;
        int i = d0.f14767a[fVar.ordinal()];
        if (i == 1) {
            return d(domainState);
        }
        aw0.e eVar = null;
        sVar = null;
        sVar = null;
        s sVar = null;
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Long l2 = domainState.f14787g;
            xi0.b bVar = domainState.f14788h;
            if (l2 != null && bVar != null) {
                List list = (List) iii.c.f(data, new bbh.a(this, 24), new bb2.t(this, 17), new a0i.a(this, 7, new dj0.d(l2.longValue(), bVar), domainState));
                s sVar2 = new s(list, new r(new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_non_rev_pay_products_subtitle, zhm.u.c(new MoneyClause(new dj0.d(l2.longValue(), bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), null, false), zhm.f0.f322471a, null);
                if (!list.isEmpty()) {
                    sVar = sVar2;
                }
            }
            return sVar == null ? d(domainState) : sVar;
        }
        List list2 = (List) iii.c.f(data, new bbh.a(this, 23), new bb2.t(this, 16), new b0(this, domainState, 1));
        r rVar = new r(new TextLocalisedClause(R$string.revolut_pay_payment_methods_setup_default_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_payment_methods_setup_default_subtitle, null, null, 14), true);
        zhm.f0 f0Var = zhm.f0.f322471a;
        if (((h) data.getContent()) != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_methods_setup_default_action_title, null, null, 14);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            PaymentMethod paymentMethod = domainState.e;
            String f84393a = paymentMethod != null ? paymentMethod.getF84393a() : null;
            eVar = new aw0.e(true, null, null, new n6(textLocalisedClause, defaultFilledButton, null, null, !Intrinsics.f(f84393a, domainState.d != null ? r1.getF84393a() : null), null, null, 988), null, null, 54);
        }
        return new s(list2, rVar, f0Var, eVar);
    }

    public final s d(i iVar) {
        List list = (List) iii.c.f(iVar.f14784a, new bbh.a(this, 22), new bb2.t(this, 15), new b0(this, iVar, 0));
        u6c.t tVar = iVar.f;
        Long l2 = iVar.f14787g;
        xi0.b bVar = iVar.f14788h;
        r rVar = tVar == u6c.t.DONATIONS ? new r(new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_donations_title, null, null, 14), null, false) : (!(tVar != u6c.t.REVPAY) || l2 == null || bVar == null) ? new r(new TextLocalisedClause(R$string.revolut_pay_payment_methods_title, null, null, 14), null, false) : new r(new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_non_rev_pay_products_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_payment_method_selector_non_rev_pay_products_subtitle, zhm.u.c(new MoneyClause(new dj0.d(l2.longValue(), bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), false);
        aim.e eVarB = zhm.u.b();
        if (l2 != null && bVar != null) {
            PayWithAnyFundingOptions payWithAnyFundingOptions = iVar.f14786c;
            if (!(payWithAnyFundingOptions.f84365a instanceof CardPaymentAvailability.NotAvailable) || payWithAnyFundingOptions.f84367c || payWithAnyFundingOptions.f84366b) {
                eVarB.add(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MONEY_OPTIONS_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_more_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
            }
        }
        return new s(list, rVar, zhm.u.a(eVarB), null);
    }
}
