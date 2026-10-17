package qk2;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.vaults.R$string;
import do3.n;
import ip0.y10;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pcd.a0;
import pcd.s;
import pcd.x;
import r8e.o;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zx0.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246956a;

    public /* synthetic */ h(int i) {
        this.f246956a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Subaccount.Group group = (Subaccount.Group) pair.f186385a;
        r8e.g gVar = (r8e.g) pair.f186386b;
        n nVar = gVar.f252406a;
        s sVar = group.f88953a;
        Iterable iterable = sVar.k;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : iterable2) {
            if (((x) obj5).f234904b == a0.ACTIVE) {
                arrayList.add(obj5);
            }
        }
        List listP0 = d0.P0(arrayList, new mqk.g(nVar, 2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : iterable2) {
            if (((x) obj6).f234904b == a0.INVITED) {
                arrayList2.add(obj6);
            }
        }
        List listP02 = d0.P0(arrayList2, new mqk.g(nVar, 2));
        aim.e eVarB = u.b();
        if (opg.c.h(nVar.f116408a, sVar)) {
            ActionsView.Item[] elements = {new ActionsView.Item("ACTION_ADD", null, false, null, null, new TextLocalisedClause(R$string.group_pockets_members_action_add, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670), gVar.f252407b ? new ActionsView.Item("ACTION_PERMISSION", null, false, null, null, new TextLocalisedClause(R$string.group_pockets_members_action_permissions, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switches, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            eVarB.add(new z("ACTIONS_HOLDER", kotlin.collections.d.L(elements), null, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 76));
        }
        if (!listP0.isEmpty()) {
            List list = listP0;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList3.add(o.b(nVar, sVar, (x) it8.next()));
            }
            zhm.a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("ACTIVE_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.group_pockets_members_section_active_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        }
        if (!listP02.isEmpty()) {
            List list2 = listP02;
            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(o.b(nVar, sVar, (x) it9.next()));
            }
            zhm.a0.x(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model("PENDING_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.group_pockets_members_section_pending_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        }
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        i9i.d content = (i9i.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new m(r9i.a.b(content));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        dj0.d amount = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new t4(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        String content = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_credit_caption, u.c(new TextClause(content, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        String str;
        Object next;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        dj0.d dVar = (dj0.d) rVar.f314201a;
        CashbackCurrency cashbackCurrency = (CashbackCurrency) rVar.f314202b;
        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) rVar.f314203c;
        xi0.b bVar = cashbackCurrency.f65687a;
        if (bVar != null && (str = bVar.f306286a) != null && !str.equalsIgnoreCase(dVar.f115083b.f306286a)) {
            Iterator it8 = cashbackByCurrencies.f65684a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (kotlin.text.a0.z(((dj0.d) next).f115083b.f306286a, str, true)) {
                    break;
                }
            }
            dj0.d dVar2 = (dj0.d) next;
            if (dVar2 != null) {
                return new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_plan_earned_subtitle, v.k(str, new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            }
        }
        return null;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List cashbackBoxes = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
        uc3.a aVar = (uc3.a) d0.d0(cashbackBoxes);
        if (aVar != null) {
            return new MoneyClause(io3.h.e(aVar.f278974b), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
        }
        rd3.d.Companion.getClass();
        return rd3.d.f253322b;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        if (zBooleanValue) {
            return new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        CashbackCurrency cashbackCurrency = (CashbackCurrency) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cashbackCurrency, "cashbackCurrency");
        xi0.b bVar = cashbackCurrency.f65687a;
        if (bVar != null) {
            return new ActionsView.Item("ID_ACTION_CHANGE_CURRENCY", null, false, null, null, new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_box_action_change_currency, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, bVar.f306286a, null, 24478);
        }
        return null;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        String str;
        Object next;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        dj0.d dVar = (dj0.d) rVar.f314201a;
        CashbackCurrency cashbackCurrency = (CashbackCurrency) rVar.f314202b;
        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) rVar.f314203c;
        xi0.b bVar = cashbackCurrency.f65687a;
        if (bVar != null && (str = bVar.f306286a) != null && !str.equalsIgnoreCase(dVar.f115083b.f306286a)) {
            Iterator it8 = cashbackByCurrencies.f65684a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (kotlin.text.a0.z(((dj0.d) next).f115083b.f306286a, str, true)) {
                    break;
                }
            }
            dj0.d dVar2 = (dj0.d) next;
            if (dVar2 != null) {
                return new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_plan_earned_subtitle, v.k(str, new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            }
        }
        return null;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        return zBooleanValue ? new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_source_plan_with_ultra_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_source_plan_subtitle, null, null, 14);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        sa saVar = null;
        if (zBooleanValue) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_plan_upgrade_to_earn_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_plan_upgrade_to_earn_subtitle, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246);
            mx0.d dVar = mx0.d.ACCENT;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_plan_action_upgrade, null, null, 14);
            ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            hha.u.Companion.getClass();
            sa saVar2 = new sa("ID_PRODUCT_NOT_AVAILABLE", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, u.c(new ActionsView.Item("ID_ACTION_UPGRADE", dVar, false, null, null, textLocalisedClause3, resourceImage2, null, null, null, false, null, null, hha.u.v, null, 24476)), false, (Image) resourceImage, (y10) null, (Object) null, 4032);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
            saVar = saVar2;
        }
        return v.l(saVar);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        CashbackCurrency cashbackCurrency = (CashbackCurrency) pair.f186386b;
        uc3.a aVar = (uc3.a) d0.d0(list);
        MoneyClause moneyClause = aVar != null ? new MoneyClause(io3.h.e(aVar.f278974b), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12) : null;
        xi0.b bVar = cashbackCurrency.f65687a;
        MoneyClause moneyClause2 = bVar != null ? new MoneyClause(new dj0.d(0L, bVar), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12) : null;
        if (moneyClause != null) {
            return moneyClause;
        }
        if (moneyClause2 != null) {
            return moneyClause2;
        }
        rd3.d.Companion.getClass();
        return rd3.d.f253322b;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        if (zBooleanValue) {
            return new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return hha.s.p(subscription.f81129a) ? "ultra_cashback_background" : "plan_cashback_background";
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        CashbackCurrency cashbackCurrency = (CashbackCurrency) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cashbackCurrency, "cashbackCurrency");
        xi0.b bVar = cashbackCurrency.f65687a;
        if (bVar != null) {
            return new ActionsView.Item("ID_ACTION_CHANGE_CURRENCY", null, false, null, null, new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_box_action_change_currency, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, bVar.f306286a, null, 24478);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13, types: [com.revolut.core.ui_kit.delegates.r0] */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r31v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [ip0.tc0] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r44v1, types: [ip0.rc0] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 3698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qk2.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f246956a = i;
    }
}
