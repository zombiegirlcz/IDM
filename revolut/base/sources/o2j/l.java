package o2j;

import android.os.Parcelable;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.feature.balance.picker.api.models.TeenInfo;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f221643a;

    public l(q balanceWrapperMapper, e personalSectionsOrderProvider, d personalSectionsMatcher) {
        Intrinsics.checkNotNullParameter(balanceWrapperMapper, "balanceWrapperMapper");
        Intrinsics.checkNotNullParameter(personalSectionsOrderProvider, "personalSectionsOrderProvider");
        Intrinsics.checkNotNullParameter(personalSectionsMatcher, "personalSectionsMatcher");
        this.f221643a = balanceWrapperMapper;
    }

    public static ListSubheaderDelegate.Model a(Clause clause, Image image, boolean z, Object obj2) {
        return new ListSubheaderDelegate.Model(a0.d.n("TITLE_BALANCE_GROUP_", clause.hashCode()), (Image) null, clause, image, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) (z ? new ListSubheaderDelegate.Model.a.b(true, false, false) : null), false, false, obj2, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 56114);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ArrayList b(List list, Map map) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                BalanceWrapper balanceWrapper = (BalanceWrapper) map.remove((String) it8.next());
                if (balanceWrapper != null) {
                    arrayList.add(balanceWrapper);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return d0.E0(map.values(), (Collection) arrayList);
    }

    public static String c(BalanceWrapper balanceWrapper) {
        if (balanceWrapper instanceof BalanceWrapper.VaultBalanceWrapper) {
            return ((BalanceWrapper.VaultBalanceWrapper) balanceWrapper).f99452h.f234881a;
        }
        if (balanceWrapper instanceof BalanceWrapper.ProVaultBalanceWrapper) {
            return ((BalanceWrapper.ProVaultBalanceWrapper) balanceWrapper).f99434h.f234881a;
        }
        if (!(balanceWrapper instanceof BalanceWrapper.JuniorPocketBalanceWrapper)) {
            return balanceWrapper.f99404a;
        }
        BalanceWrapper.JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = (BalanceWrapper.JuniorPocketBalanceWrapper) balanceWrapper;
        return juniorPocketBalanceWrapper.f99421l ? juniorPocketBalanceWrapper.k.f99454a : balanceWrapper.f99404a;
    }

    public static /* synthetic */ List h(l lVar, Map map, List list, String str, int i, qv0.i iVar, int i2) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        if ((i2 & 16) != 0) {
            iVar = null;
        }
        return lVar.f(map, list, str, i, iVar);
    }

    public static boolean i(kel.b bVar) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = Boolean.valueOf(bVar.f.f115082a > 0 || bVar.f183151g.f115082a > 0);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
            objA = Boolean.FALSE;
        }
        return ((Boolean) objA).booleanValue();
    }

    public final ArrayList d(String str, Map map) {
        int i;
        Pair pair;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            TradingAccount tradingAccount = (TradingAccount) entry.getKey();
            List list = (List) entry.getValue();
            if (tradingAccount instanceof TradingAccount.GIA) {
                i = R$string.payments_balance_picker_section_investment_title;
            } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                i = R$string.payments_balance_picker_section_investment_isa_title;
            } else if ((tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian)) {
                i = R$string.move_money_picker_investments_title;
            } else {
                if (!(tradingAccount instanceof TradingAccount.Margin)) {
                    throw new IllegalStateException("Unsupported group title for trading account ".concat(tradingAccount.getClass().getName()).toString());
                }
                i = R$string.move_money_picker_section_cfd_title;
            }
            int i2 = i;
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                pair = new Pair(null, null);
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (i(((BalanceWrapper.TradingAccountBalanceWrapper) it8.next()).i.f105108a)) {
                        pair = new Pair(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new j1j.e(tradingAccount));
                        break;
                    }
                }
                pair = new Pair(null, null);
            }
            arrayList.add(j(list, i2, (ResourceImage) pair.f186385a, (j1j.e) pair.f186386b, str, null));
        }
        return w.u(arrayList);
    }

    public final ArrayList e(Map sortedAccountIdsByProductSubSpace, ArrayList balances, String str, j1j.b extraConfig) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Collection collectionG;
        Pair pair;
        List listH;
        Pair pair2;
        List listH2;
        BalanceWrapper.DeFiBalanceWrapper deFiBalanceWrapper;
        Pair pair3;
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(extraConfig, "extraConfig");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : balances) {
            BalanceWrapper balanceWrapper = (BalanceWrapper) obj2;
            List list = (List) sortedAccountIdsByProductSubSpace.get(com.revolut.feature.tab.accounts.models.spaces.b.f89758c);
            if (list == null) {
                list = f0.f322471a;
            }
            if (list.contains(c(balanceWrapper))) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
        for (Object obj3 : arrayList2) {
            linkedHashMap3.put(c((BalanceWrapper) obj3), obj3);
        }
        LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap3);
        int iB2 = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj4 : arrayList) {
            linkedHashMap4.put(c((BalanceWrapper) obj4), obj4);
        }
        LinkedHashMap linkedHashMapZ2 = r0.z(linkedHashMap4);
        boolean z = false;
        g gVar = new g(0);
        j jVar = new j(0);
        i iVar = new i(0);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        Iterator it8 = linkedHashMapZ.entrySet().iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            boolean z3 = z;
            LinkedHashMap linkedHashMap8 = gVar.f221628a;
            LinkedHashMap linkedHashMap9 = gVar.f221629b;
            LinkedHashMap linkedHashMap10 = gVar.f221630c;
            LinkedHashMap linkedHashMap11 = gVar.d;
            Iterator it9 = it8;
            LinkedHashMap linkedHashMap12 = jVar.f221640a;
            g gVar2 = gVar;
            LinkedHashMap linkedHashMap13 = jVar.f221641b;
            j jVar2 = jVar;
            LinkedHashMap linkedHashMap14 = iVar.f221633a;
            LinkedHashMap linkedHashMap15 = iVar.d;
            LinkedHashMap linkedHashMap16 = iVar.k;
            LinkedHashMap linkedHashMap17 = iVar.f221636g;
            LinkedHashMap linkedHashMap18 = linkedHashMapZ2;
            LinkedHashMap linkedHashMap19 = iVar.i;
            LinkedHashMap linkedHashMap20 = iVar.f221638j;
            LinkedHashMap linkedHashMap21 = iVar.f221634b;
            LinkedHashMap linkedHashMap22 = iVar.f221635c;
            LinkedHashMap linkedHashMap23 = iVar.e;
            LinkedHashMap linkedHashMap24 = iVar.f;
            LinkedHashMap linkedHashMap25 = iVar.f221637h;
            LinkedHashMap linkedHashMap26 = iVar.f221639l;
            if (!zHasNext) {
                ArrayList arrayListB = b((List) sortedAccountIdsByProductSubSpace.get(com.revolut.feature.tab.accounts.models.spaces.b.f89758c), linkedHashMap18);
                if (arrayListB.isEmpty()) {
                    linkedHashMap = linkedHashMap19;
                    linkedHashMap2 = linkedHashMap24;
                    collectionG = f0.f322471a;
                } else {
                    Float fValueOf = Float.valueOf(16.0f);
                    linkedHashMap = linkedHashMap19;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayListB, 10));
                    Iterator it10 = arrayListB.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(this.f221643a.c((BalanceWrapper) it10.next(), str, true));
                        it10 = it10;
                        linkedHashMap24 = linkedHashMap24;
                    }
                    linkedHashMap2 = linkedHashMap24;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_balance_picker_section_favourites_title, null, null, 14);
                    ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_star_filled, Integer.valueOf(R$attr.uikit_colorGrey20), fValueOf, fValueOf, 16);
                    Clause[] clauseArr = new Clause[2];
                    clauseArr[z3 ? 1 : 0] = textLocalisedClause;
                    clauseArr[1] = imageClause;
                    collectionG = yp0.b.g(arrayList3, a(new CompositeClause(v.k(clauseArr), sx4.g.e(1), null, null, 12), null, z3, null), e0.OUTSIDE_BOX, 0, 0, 124);
                }
                Collection collection = collectionG;
                Integer num = extraConfig.f170614g;
                int iIntValue = num != null ? num.intValue() : R$string.move_money_picker_section_savings_title;
                g1j.c cVar = g1j.c.ACCOUNTS;
                pie.g gVar3 = pie.g.e;
                LinkedHashMap linkedHashMap27 = linkedHashMap2;
                LinkedHashMap linkedHashMap28 = linkedHashMap;
                Pair pair4 = new Pair(cVar, f(linkedHashMap14, (List) sortedAccountIdsByProductSubSpace.get(gVar3), str, R$string.move_money_picker_section_accounts_title, extraConfig.f170611a));
                Pair pair5 = new Pair(g1j.c.VAULTS, h(this, linkedHashMap21, (List) sortedAccountIdsByProductSubSpace.get(pie.i.e), str, R$string.payments_balance_picker_section_vaults_title, null, 16));
                g1j.c cVar2 = g1j.c.SAVINGS;
                if (extraConfig.f) {
                    ArrayList arrayListB2 = b((List) sortedAccountIdsByProductSubSpace.get(pie.j.e), linkedHashMap22);
                    pair = pair5;
                    listH = j(arrayListB2, iIntValue, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new j1j.c(arrayListB2), str, null);
                } else {
                    pair = pair5;
                    listH = h(this, linkedHashMap22, (List) sortedAccountIdsByProductSubSpace.get(pie.j.e), str, iIntValue, null, 16);
                }
                Pair pair6 = new Pair(cVar2, listH);
                Pair pair7 = new Pair(g1j.c.CREDIT_CARDS, h(this, linkedHashMap15, (List) sortedAccountIdsByProductSubSpace.get(pie.h.e), str, R$string.payments_balance_picker_section_credit_title, null, 16));
                g1j.c cVar3 = g1j.c.CRYPTO;
                LinkedHashMap linkedHashMapZ3 = r0.z(r0.p(linkedHashMap25, linkedHashMap23));
                if (extraConfig.i) {
                    ArrayList arrayListB3 = b((List) sortedAccountIdsByProductSubSpace.get(gVar3), linkedHashMapZ3);
                    pair2 = pair7;
                    listH2 = j(arrayListB3, R$string.payments_balance_picker_section_crypto_with_locked_balances, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new j1j.a(arrayListB3), str, extraConfig.f170612b);
                } else {
                    pair2 = pair7;
                    listH2 = h(this, linkedHashMapZ3, null, str, R$string.payments_balance_picker_section_crypto_title, extraConfig.f170612b, 2);
                }
                Pair pair8 = new Pair(cVar3, listH2);
                g1j.c cVar4 = g1j.c.DEFI;
                Iterator it11 = linkedHashMap26.values().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        BalanceWrapper balanceWrapper2 = (BalanceWrapper) it11.next();
                        deFiBalanceWrapper = balanceWrapper2 instanceof BalanceWrapper.DeFiBalanceWrapper ? (BalanceWrapper.DeFiBalanceWrapper) balanceWrapper2 : null;
                        if (deFiBalanceWrapper != null) {
                        }
                    } else {
                        deFiBalanceWrapper = null;
                    }
                }
                String str2 = deFiBalanceWrapper != null ? deFiBalanceWrapper.o : null;
                if (str2 == null) {
                    str2 = "";
                }
                Map sectionItems = r0.k(pair4, pair, pair6, pair2, pair8, new Pair(cVar4, g(linkedHashMap26, null, str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null)), new Pair(g1j.c.INVESTMENTS, d(str, linkedHashMap27)), new Pair(g1j.c.COMMODITIES, h(this, linkedHashMap17, null, str, R$string.payments_balance_picker_section_commodities_title, extraConfig.f170613c, 2)), new Pair(g1j.c.SPOT_MARGIN_COLLATERAL, h(this, linkedHashMap28, null, str, R$string.move_money_picker_section_spot_margin_title, null, 18)), new Pair(g1j.c.FUTURES_COLLATERAL, h(this, linkedHashMap20, null, str, R$string.move_money_picker_section_derivatives_title, null, 18)));
                List customOrder = extraConfig.f170615h;
                List order = e.f221627a;
                Intrinsics.checkNotNullParameter(customOrder, "customOrder");
                if (!customOrder.isEmpty()) {
                    List listU = d0.U(customOrder);
                    if (listU.size() == g1j.c.a().size()) {
                        order = listU;
                    } else {
                        List list2 = listU;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : order) {
                            if (!listU.contains((g1j.c) obj5)) {
                                arrayList4.add(obj5);
                            }
                        }
                        order = d0.E0(arrayList4, list2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Intrinsics.checkNotNullParameter(sectionItems, "sectionItems");
                Intrinsics.checkNotNullParameter(order, "order");
                ArrayList arrayList6 = new ArrayList();
                Iterator it12 = order.iterator();
                while (it12.hasNext()) {
                    Iterable iterable = (List) sectionItems.get((g1j.c) it12.next());
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    a0.x(iterable, arrayList6);
                }
                a0.x(arrayList6, arrayList5);
                a0.x(h(this, linkedHashMap16, null, str, R$string.balance_picker_rev_points_header, null, 18), arrayList5);
                if (!arrayList5.isEmpty()) {
                    arrayList5.add(0, a(new TextLocalisedClause(R$string.payments_balance_picker_section_personal_title, null, null, 14), null, false, null));
                }
                ArrayList arrayListE0 = d0.E0(arrayList5, collection);
                ArrayList arrayList7 = new ArrayList();
                a0.x(f(linkedHashMap8, (List) sortedAccountIdsByProductSubSpace.get(pie.b.e), str, R$string.move_money_picker_section_accounts_title, extraConfig.d), arrayList7);
                a0.x(h(this, linkedHashMap9, (List) sortedAccountIdsByProductSubSpace.get(pie.d.e), str, R$string.payments_balance_picker_section_vaults_title, null, 16), arrayList7);
                a0.x(h(this, linkedHashMap10, (List) sortedAccountIdsByProductSubSpace.get(pie.e.e), str, R$string.move_money_picker_section_savings_title, null, 16), arrayList7);
                ArrayList arrayList8 = new ArrayList(linkedHashMap11.size());
                for (Map.Entry entry : linkedHashMap11.entrySet()) {
                    TradingAccount tradingAccount = (TradingAccount) entry.getKey();
                    List list3 = (List) entry.getValue();
                    if (!(tradingAccount instanceof TradingAccount.GIA)) {
                        throw new IllegalStateException(("Unsupported group title for joint trading account " + tradingAccount.W()).toString());
                    }
                    int i = R$string.payments_balance_picker_section_investment_title;
                    List list4 = list3;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        pair3 = new Pair(null, null);
                    } else {
                        Iterator it13 = list4.iterator();
                        while (it13.hasNext()) {
                            if (i(((BalanceWrapper.TradingAccountBalanceWrapper) it13.next()).i.f105108a)) {
                                pair3 = new Pair(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new j1j.e(tradingAccount));
                            }
                        }
                        pair3 = new Pair(null, null);
                    }
                    arrayList8.add(j(list3, i, (ResourceImage) pair3.f186385a, (j1j.e) pair3.f186386b, str, null));
                }
                a0.x(w.u(arrayList8), arrayList7);
                if (!arrayList7.isEmpty()) {
                    arrayList7.add(0, a(new TextLocalisedClause(R$string.payments_balance_picker_section_joint_title, null, null, 14), null, false, null));
                }
                ArrayList arrayListE02 = d0.E0(arrayList7, arrayListE0);
                ArrayList arrayList9 = new ArrayList();
                a0.x(f(linkedHashMap12, (List) sortedAccountIdsByProductSubSpace.get(pie.k.e), str, R$string.move_money_picker_section_accounts_title, extraConfig.e), arrayList9);
                a0.x(h(this, linkedHashMap13, (List) sortedAccountIdsByProductSubSpace.get(pie.l.e), str, R$string.payments_balance_picker_section_vaults_title, null, 16), arrayList9);
                if (!arrayList9.isEmpty()) {
                    arrayList9.add(0, a(new TextLocalisedClause(R$string.payments_balance_picker_section_pro_title, null, null, 14), null, false, null));
                }
                ArrayList arrayListE03 = d0.E0(arrayList9, arrayListE02);
                LinkedHashMap linkedHashMap29 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                    Object value = entry2.getValue();
                    BalanceWrapper.JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = value instanceof BalanceWrapper.JuniorPocketBalanceWrapper ? (BalanceWrapper.JuniorPocketBalanceWrapper) value : null;
                    if (juniorPocketBalanceWrapper != null) {
                        linkedHashMap29.put(entry2.getKey(), juniorPocketBalanceWrapper);
                    }
                }
                LinkedHashMap linkedHashMap30 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                    Object value2 = entry3.getValue();
                    BalanceWrapper.JuniorVaultBalanceWrapper juniorVaultBalanceWrapper = value2 instanceof BalanceWrapper.JuniorVaultBalanceWrapper ? (BalanceWrapper.JuniorVaultBalanceWrapper) value2 : null;
                    if (juniorVaultBalanceWrapper != null) {
                        linkedHashMap30.put(entry3.getKey(), juniorVaultBalanceWrapper);
                    }
                }
                LinkedHashMap linkedHashMap31 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap5.entrySet()) {
                    Object value3 = entry4.getValue();
                    BalanceWrapper.JuniorSavingsBalanceWrapper juniorSavingsBalanceWrapper = value3 instanceof BalanceWrapper.JuniorSavingsBalanceWrapper ? (BalanceWrapper.JuniorSavingsBalanceWrapper) value3 : null;
                    if (juniorSavingsBalanceWrapper != null) {
                        linkedHashMap31.put(entry4.getKey(), juniorSavingsBalanceWrapper);
                    }
                }
                Collection collectionValues = linkedHashMap29.values();
                Collection collectionValues2 = linkedHashMap30.values();
                Collection collectionValues3 = linkedHashMap31.values();
                Collection collectionValues4 = linkedHashMap6.values();
                Collection collection2 = collectionValues;
                ArrayList arrayList10 = new ArrayList(w.t(collection2, 10));
                Iterator it14 = collection2.iterator();
                while (it14.hasNext()) {
                    JuniorInfo juniorInfo = ((BalanceWrapper.JuniorPocketBalanceWrapper) it14.next()).k;
                    arrayList10.add(new h(juniorInfo.f99454a, juniorInfo.f99455b));
                }
                Collection collection3 = collectionValues2;
                ArrayList arrayList11 = new ArrayList(w.t(collection3, 10));
                Iterator it15 = collection3.iterator();
                while (it15.hasNext()) {
                    JuniorInfo juniorInfo2 = ((BalanceWrapper.JuniorVaultBalanceWrapper) it15.next()).k;
                    arrayList11.add(new h(juniorInfo2.f99454a, juniorInfo2.f99455b));
                }
                ArrayList arrayListE04 = d0.E0(arrayList11, arrayList10);
                Collection collection4 = collectionValues3;
                ArrayList arrayList12 = new ArrayList(w.t(collection4, 10));
                Iterator it16 = collection4.iterator();
                while (it16.hasNext()) {
                    JuniorInfo juniorInfo3 = ((BalanceWrapper.JuniorSavingsBalanceWrapper) it16.next()).i;
                    arrayList12.add(new h(juniorInfo3.f99454a, juniorInfo3.f99455b));
                }
                ArrayList arrayListE05 = d0.E0(arrayList12, arrayListE04);
                Collection<BalanceWrapper.TradingAccountBalanceWrapper> collection5 = collectionValues4;
                ArrayList arrayList13 = new ArrayList(w.t(collection5, 10));
                for (BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper : collection5) {
                    String string = tradingAccountBalanceWrapper.f99447h.getF().f105175a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList13.add(new h(string, tradingAccountBalanceWrapper.f99447h.getF().f105176b));
                }
                ArrayList arrayListE06 = d0.E0(arrayList13, arrayListE05);
                HashSet hashSet = new HashSet();
                ArrayList<h> arrayList14 = new ArrayList();
                for (Object obj6 : arrayListE06) {
                    if (hashSet.add(((h) obj6).f221631a)) {
                        arrayList14.add(obj6);
                    }
                }
                ArrayList arrayList15 = new ArrayList();
                for (h hVar : arrayList14) {
                    ArrayList arrayList16 = new ArrayList();
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                    for (Map.Entry entry5 : linkedHashMap29.entrySet()) {
                        if (Intrinsics.f(((BalanceWrapper.JuniorPocketBalanceWrapper) entry5.getValue()).k.f99454a, hVar.f221631a)) {
                            linkedHashMap32.put(entry5.getKey(), entry5.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap33 = new LinkedHashMap();
                    for (Map.Entry entry6 : linkedHashMap30.entrySet()) {
                        if (Intrinsics.f(((BalanceWrapper.JuniorVaultBalanceWrapper) entry6.getValue()).k.f99454a, hVar.f221631a)) {
                            linkedHashMap33.put(entry6.getKey(), entry6.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap34 = new LinkedHashMap();
                    for (Map.Entry entry7 : linkedHashMap31.entrySet()) {
                        if (Intrinsics.f(((BalanceWrapper.JuniorSavingsBalanceWrapper) entry7.getValue()).i.f99454a, hVar.f221631a)) {
                            linkedHashMap34.put(entry7.getKey(), entry7.getValue());
                        }
                    }
                    Collection collectionValues5 = linkedHashMap6.values();
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj7 : collectionValues5) {
                        ArrayList arrayList18 = arrayList16;
                        if (Intrinsics.f(((BalanceWrapper.TradingAccountBalanceWrapper) obj7).f99447h.getF().f105175a.toString(), hVar.f221631a)) {
                            arrayList17.add(obj7);
                        }
                        arrayList16 = arrayList18;
                    }
                    ArrayList arrayList19 = arrayList16;
                    LinkedHashMap linkedHashMap35 = new LinkedHashMap();
                    for (Object obj8 : arrayList17) {
                        TradingAccount tradingAccount2 = ((BalanceWrapper.TradingAccountBalanceWrapper) obj8).f99447h;
                        Object arrayList20 = linkedHashMap35.get(tradingAccount2);
                        if (arrayList20 == null) {
                            arrayList20 = new ArrayList();
                            linkedHashMap35.put(tradingAccount2, arrayList20);
                        }
                        ((List) arrayList20).add(obj8);
                    }
                    LinkedHashMap linkedHashMapZ4 = r0.z(linkedHashMap32);
                    pie.p pVar = pie.p.e;
                    LinkedHashMap linkedHashMap36 = linkedHashMap29;
                    LinkedHashMap linkedHashMap37 = linkedHashMap30;
                    a0.x(h(this, linkedHashMapZ4, (List) sortedAccountIdsByProductSubSpace.get(pVar), str, R$string.move_money_picker_section_accounts_title, null, 16), arrayList19);
                    a0.x(h(this, r0.z(linkedHashMap33), (List) sortedAccountIdsByProductSubSpace.get(pVar), str, R$string.payments_balance_picker_section_vaults_title, null, 16), arrayList19);
                    a0.x(h(this, r0.z(linkedHashMap34), (List) sortedAccountIdsByProductSubSpace.get(pVar), str, R$string.move_money_picker_section_savings_title, null, 16), arrayList19);
                    a0.x(d(str, linkedHashMap35), arrayList19);
                    if (!arrayList19.isEmpty()) {
                        arrayList19.add(0, a(new TextLocalisedClause(R$string.move_money_picker_section_junior_title, u.c(hVar.f221632b), null, 12), null, false, null));
                    }
                    a0.x(arrayList19, arrayList15);
                    linkedHashMap29 = linkedHashMap36;
                    linkedHashMap30 = linkedHashMap37;
                }
                l lVar = this;
                String str3 = str;
                ArrayList arrayListE07 = d0.E0(arrayList15, arrayListE03);
                LinkedHashMap linkedHashMap38 = new LinkedHashMap();
                for (Map.Entry entry8 : linkedHashMap7.entrySet()) {
                    Object value4 = entry8.getValue();
                    BalanceWrapper.TeenPocketBalanceWrapper teenPocketBalanceWrapper = value4 instanceof BalanceWrapper.TeenPocketBalanceWrapper ? (BalanceWrapper.TeenPocketBalanceWrapper) value4 : null;
                    if (teenPocketBalanceWrapper != null) {
                        linkedHashMap38.put(entry8.getKey(), teenPocketBalanceWrapper);
                    }
                }
                LinkedHashMap linkedHashMap39 = new LinkedHashMap();
                for (Map.Entry entry9 : linkedHashMap7.entrySet()) {
                    Object value5 = entry9.getValue();
                    BalanceWrapper.TeenVaultBalanceWrapper teenVaultBalanceWrapper = value5 instanceof BalanceWrapper.TeenVaultBalanceWrapper ? (BalanceWrapper.TeenVaultBalanceWrapper) value5 : null;
                    if (teenVaultBalanceWrapper != null) {
                        linkedHashMap39.put(entry9.getKey(), teenVaultBalanceWrapper);
                    }
                }
                Collection collectionValues6 = linkedHashMap38.values();
                Collection collectionValues7 = linkedHashMap39.values();
                Collection collection6 = collectionValues6;
                ArrayList arrayList21 = new ArrayList(w.t(collection6, 10));
                Iterator it17 = collection6.iterator();
                while (it17.hasNext()) {
                    arrayList21.add(((BalanceWrapper.TeenPocketBalanceWrapper) it17.next()).k);
                }
                Collection collection7 = collectionValues7;
                ArrayList arrayList22 = new ArrayList(w.t(collection7, 10));
                Iterator it18 = collection7.iterator();
                while (it18.hasNext()) {
                    arrayList22.add(((BalanceWrapper.TeenVaultBalanceWrapper) it18.next()).i);
                }
                Set<TeenInfo> setI1 = d0.i1(d0.E0(arrayList22, arrayList21));
                ArrayList arrayList23 = new ArrayList(w.t(setI1, 10));
                for (TeenInfo teenInfo : setI1) {
                    ArrayList arrayList24 = new ArrayList();
                    LinkedHashMap linkedHashMap40 = new LinkedHashMap();
                    for (Map.Entry entry10 : linkedHashMap38.entrySet()) {
                        if (Intrinsics.f(((BalanceWrapper.TeenPocketBalanceWrapper) entry10.getValue()).k, teenInfo)) {
                            linkedHashMap40.put(entry10.getKey(), entry10.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap41 = new LinkedHashMap();
                    for (Map.Entry entry11 : linkedHashMap39.entrySet()) {
                        if (Intrinsics.f(((BalanceWrapper.TeenVaultBalanceWrapper) entry11.getValue()).i, teenInfo)) {
                            linkedHashMap41.put(entry11.getKey(), entry11.getValue());
                        }
                    }
                    a0.x(h(lVar, r0.z(linkedHashMap40), (List) sortedAccountIdsByProductSubSpace.get(pie.m.e), str3, R$string.move_money_picker_section_accounts_title, null, 16), arrayList24);
                    a0.x(h(this, r0.z(linkedHashMap41), (List) sortedAccountIdsByProductSubSpace.get(pie.n.e), str, R$string.payments_balance_picker_section_vaults_title, null, 16), arrayList24);
                    if (!arrayList24.isEmpty()) {
                        arrayList24.add(0, a(new TextLocalisedClause(R$string.payments_balance_picker_section_teen_title, u.c(teenInfo.f99461b), null, 12), null, false, null));
                    }
                    arrayList23.add(arrayList24);
                    lVar = this;
                    str3 = str;
                }
                return d0.E0(w.u(arrayList23), arrayListE07);
            }
            Map.Entry entry12 = (Map.Entry) it9.next();
            i iVar2 = iVar;
            String str4 = (String) entry12.getKey();
            BalanceWrapper balanceWrapper3 = (BalanceWrapper) entry12.getValue();
            switch (k.f221642a[balanceWrapper3.getF99407g().ordinal()]) {
                case 1:
                case 2:
                    linkedHashMap14.put(str4, balanceWrapper3);
                    break;
                case 3:
                case 4:
                    linkedHashMap23.put(str4, balanceWrapper3);
                    break;
                case 5:
                    linkedHashMap21.put(str4, balanceWrapper3);
                    break;
                case 6:
                    linkedHashMap15.put(str4, balanceWrapper3);
                    break;
                case 7:
                case 8:
                    linkedHashMap12.put(str4, balanceWrapper3);
                    break;
                case 9:
                    linkedHashMap13.put(str4, balanceWrapper3);
                    break;
                case 10:
                    linkedHashMap22.put(str4, balanceWrapper3);
                    break;
                case 11:
                    linkedHashMap21.put(str4, balanceWrapper3);
                    break;
                case 12:
                    linkedHashMap16.put(str4, balanceWrapper3);
                    break;
                case 13:
                case 14:
                    linkedHashMap17.put(str4, balanceWrapper3);
                    break;
                case 15:
                case 16:
                    linkedHashMap8.put(str4, balanceWrapper3);
                    break;
                case 17:
                    linkedHashMap9.put(str4, balanceWrapper3);
                    break;
                case 18:
                    linkedHashMap10.put(str4, balanceWrapper3);
                    break;
                case 19:
                    linkedHashMap5.put(str4, balanceWrapper3);
                    break;
                case 20:
                    linkedHashMap5.put(str4, balanceWrapper3);
                    break;
                case 21:
                    linkedHashMap5.put(str4, balanceWrapper3);
                    break;
                case 22:
                    linkedHashMap7.put(str4, balanceWrapper3);
                    break;
                case 23:
                    linkedHashMap7.put(str4, balanceWrapper3);
                    break;
                case 24:
                    BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper2 = (BalanceWrapper.TradingAccountBalanceWrapper) (!(balanceWrapper3 instanceof BalanceWrapper.TradingAccountBalanceWrapper) ? null : balanceWrapper3);
                    if (tradingAccountBalanceWrapper2 != null) {
                        TradingAccount tradingAccount3 = tradingAccountBalanceWrapper2.f99447h;
                        if (tradingAccount3 instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                            linkedHashMap6.put(str4, tradingAccountBalanceWrapper2);
                        } else {
                            Object obj9 = linkedHashMap24.get(tradingAccount3);
                            Object obj10 = obj9;
                            if (obj9 == null) {
                                ArrayList arrayList25 = new ArrayList();
                                Intrinsics.checkNotNullParameter(linkedHashMap24, "<this>");
                                linkedHashMap24.put(tradingAccount3, arrayList25);
                                obj10 = arrayList25;
                            }
                            ((List) obj10).add(tradingAccountBalanceWrapper2);
                        }
                    }
                    break;
                case 25:
                    BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper3 = (BalanceWrapper.TradingAccountBalanceWrapper) (!(balanceWrapper3 instanceof BalanceWrapper.TradingAccountBalanceWrapper) ? null : balanceWrapper3);
                    if (tradingAccountBalanceWrapper3 != null) {
                        TradingAccount tradingAccount4 = tradingAccountBalanceWrapper3.f99447h;
                        Object obj11 = linkedHashMap11.get(tradingAccount4);
                        Object obj12 = obj11;
                        if (obj11 == null) {
                            ArrayList arrayList26 = new ArrayList();
                            Intrinsics.checkNotNullParameter(linkedHashMap11, "<this>");
                            linkedHashMap11.put(tradingAccount4, arrayList26);
                            obj12 = arrayList26;
                        }
                        ((List) obj12).add(tradingAccountBalanceWrapper3);
                    }
                    break;
                case 26:
                    break;
                case 27:
                    linkedHashMap19.put(str4, balanceWrapper3);
                    break;
                case 28:
                    linkedHashMap20.put(str4, balanceWrapper3);
                    break;
                case 29:
                    linkedHashMap25.put(str4, balanceWrapper3);
                    break;
                case 30:
                    linkedHashMap26.put(str4, balanceWrapper3);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            z = z3 ? 1 : 0;
            it8 = it9;
            gVar = gVar2;
            jVar = jVar2;
            linkedHashMapZ2 = linkedHashMap18;
            iVar = iVar2;
        }
    }

    public final List f(Map map, List list, String str, int i, qv0.i iVar) {
        return g(map, list, str, new TextLocalisedClause(i, null, null, 14), iVar);
    }

    public final List g(Map map, List list, String str, Clause clause, qv0.i iVar) {
        ArrayList arrayListB = b(list, map);
        if (arrayListB.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(w.t(arrayListB, 10));
        Iterator it8 = arrayListB.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f221643a.c((BalanceWrapper) it8.next(), str, false));
        }
        eVarB.addAll(arrayList);
        if (iVar != null) {
            eVarB.add(iVar);
        }
        return yp0.b.g(u.a(eVarB), a(clause, null, false, null), e0.INSIDE_BOX, R$attr.uikit_dp0, 0, SyslogConstants.LOG_CLOCK);
    }

    public final List j(List list, int i, Image image, Object obj2, String str, qv0.i iVar) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f221643a.c((BalanceWrapper) it8.next(), str, false));
        }
        eVarB.addAll(arrayList);
        if (iVar != null) {
            eVarB.add(iVar);
        }
        return yp0.b.g(u.a(eVarB), a(new TextLocalisedClause(i, null, null, 14), image, true, obj2), e0.INSIDE_BOX, R$attr.uikit_dp0, 0, SyslogConstants.LOG_CLOCK);
    }
}
