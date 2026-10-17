package uc0;

import cgi.k;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.remittance.models.CryptoBeneficiaryRecipientAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import com.revolut.retail.feature.api.trips.models.TripTransactionAdjustment;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import dp5.l;
import gu7.q3;
import h9g.f;
import io.reactivex.rxjava3.core.Observable;
import iy1.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.MatchGroup;
import kotlin.text.n;
import kotlinx.coroutines.flow.Flow;
import nx1.e;
import nx4.b0;
import nx4.d1;
import nx4.i2;
import nx4.k1;
import nx4.l1;
import nx4.m0;
import nx4.m1;
import nx4.p1;
import nx4.r1;
import nx4.s1;
import rei.h;
import wvj.i;
import wvj.m;
import xl2.v;
import xl2.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {
    public static final i A(TripTransactionAdjustment tripTransactionAdjustment) {
        String str;
        Intrinsics.checkNotNullParameter(tripTransactionAdjustment, "<this>");
        String str2 = tripTransactionAdjustment.f99267a;
        int i = m.f300532a[tripTransactionAdjustment.f99268b.ordinal()];
        if (i == 1) {
            str = "EXCLUDED";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "INCLUDED";
        }
        return new i(str2, str);
    }

    public static final TextLocalisedClause B(EntityType entityType) {
        Intrinsics.checkNotNullParameter(entityType, "<this>");
        if (entityType instanceof EntityType.Transaction) {
            return new TextLocalisedClause(R$string.form_builder_entities_summary_bottom_sheet_transactions, null, null, 14);
        }
        if (entityType instanceof EntityType.Card) {
            return new TextLocalisedClause(R$string.form_builder_entities_summary_bottom_sheet_cards, null, null, 14);
        }
        if (entityType instanceof EntityType.Device) {
            return new TextLocalisedClause(R$string.form_builder_entities_summary_bottom_sheet_devices, null, null, 14);
        }
        if (entityType instanceof EntityType.Default) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final r1 C(m0 m0Var) {
        if (m0Var instanceof d1) {
            d1 d1Var = (d1) m0Var;
            String title = d1Var.getTitle();
            List<m0> items = d1Var.getItems();
            ArrayList arrayList = new ArrayList();
            for (m0 m0Var2 : items) {
                r1 r1VarC = m0Var2 != null ? C(m0Var2) : null;
                if (r1VarC != null) {
                    arrayList.add(r1VarC);
                }
            }
            return new m1(title, arrayList);
        }
        if (m0Var instanceof i2) {
            i2 i2Var = (i2) m0Var;
            String strG = i2Var.getTitle();
            String strJ = i2Var.getValue();
            if (strJ == null) {
                strJ = "";
            }
            return new l1(strG, strJ, null, null, null, i2Var.getPromoValue(), null, null, null);
        }
        if (m0Var instanceof b0) {
            b0 b0Var = (b0) m0Var;
            return new p1(b0Var.getTitle(), b0Var.getSubtitle(), b0Var.getIcon());
        }
        if (!(m0Var instanceof nx4.b)) {
            return null;
        }
        nx4.b bVar = (nx4.b) m0Var;
        return new k1(bVar.getTitle(), bVar.getSubtitle(), bVar.getIcon(), null, bVar.getAction(), bVar.getImage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final s1 D(mo4.a aVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        String icon = aVar.getIcon();
        List items = aVar.getItems();
        if (items != null) {
            ArrayList arrayListZ = d0.Z(items);
            arrayList = new ArrayList();
            Iterator it8 = arrayListZ.iterator();
            while (it8.hasNext()) {
                r1 r1VarC = C((m0) it8.next());
                if (r1VarC != null) {
                    arrayList.add(r1VarC);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new s1(title, description, icon, f0.f322471a, arrayList, null, null, null, aVar.getActionFooter());
    }

    public static final LocationPoint E(LocationSearchResult locationSearchResult) {
        Intrinsics.checkNotNullParameter(locationSearchResult, "<this>");
        return new LocationPoint(locationSearchResult.f93527c, locationSearchResult.d, locationSearchResult.f93526b);
    }

    public static final SourceUrl a(String path, String name) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        return new SourceUrl(j6.a.s("https://assets.revolut.com/", path, "/", name, ".json"), null);
    }

    public static final StackTraceElement[] b(String str, String str2) {
        return new StackTraceElement[]{new StackTraceElement("com.revolut.core.data.storage.size_checker.StorageSizeChecker", str, "StorageSizeChecker.kt", 0), new StackTraceElement("com.revolut.core.data.storage.size_checker.StorageSizeChecker", j6.a.q("storage_", str2), "StorageSizeChecker.kt", 0)};
    }

    public static Observable c(Flow flow) {
        return Observable.create(new abf.c(g.f186406a, flow, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(BackendScreen backendScreen) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        if (!(backendScreen instanceof v)) {
            return false;
        }
        List<BackendItem> f63468b = ((v) backendScreen).getF();
        if ((f63468b instanceof Collection) && f63468b.isEmpty()) {
            return false;
        }
        for (BackendItem backendItem : f63468b) {
            if (backendItem instanceof CardSelectionItem) {
                List list = ((CardSelectionItem) backendItem).f63347c;
                if (list == null || list.isEmpty()) {
                    return true;
                }
            } else if (backendItem instanceof CardCellItem) {
                if (((CardCellItem) backendItem).d == null) {
                    return true;
                }
            } else if (backendItem instanceof BackendEntityItem) {
                List f63432c = ((BackendEntityItem) backendItem).getF63432c();
                if (f63432c == null || f63432c.isEmpty()) {
                    return true;
                }
            } else if (backendItem instanceof WidgetProgressionItem) {
                if (((WidgetProgressionItem) backendItem).f63722c == null) {
                    return true;
                }
            } else if ((backendItem instanceof TransactionCellItem) && ((TransactionCellItem) backendItem).d == null) {
                return true;
            }
        }
        return false;
    }

    public static final String e(long j2) {
        long j3 = 60;
        return (j2 / j3) + ":" + a0.d.v(new Object[]{Long.valueOf(j2 % j3)}, 1, "%02d", "format(...)");
    }

    public static final String f(String str, im.c mask) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mask, "mask");
        return kotlin.text.d0.H0(mask.b(new jm.a(str, str.length()), true).f162271a.f175891b).toString();
    }

    public static final String g(int i, t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        return localization.getString(i);
    }

    public static final MatchGroup i(n nVar, String name) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        Matcher matchResult = nVar.f187918a.f187919a;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        if (matchResult == null) {
            matchResult = null;
        }
        if (matchResult == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        int iStart = matchResult.start(name);
        IntRange intRange = new IntRange(iStart, matchResult.end(name) - 1, 1);
        if (iStart < 0) {
            return null;
        }
        String strGroup = matchResult.group(name);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRange);
    }

    public static final dj0.d j(dj0.d fromMoney, List exchangeRates, xi0.b baseCurrency) {
        Object next;
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fromMoney, "fromMoney");
        if (Intrinsics.f(fromMoney.f115083b, baseCurrency)) {
            return fromMoney;
        }
        Iterator it8 = exchangeRates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, fromMoney.f115083b) && Intrinsics.f(aVar.f213662b, baseCurrency)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        return new dj0.d(aVar2 != null ? pyd.c.J(fromMoney, aVar2.f213663c, aVar2.f213662b) : 0L, baseCurrency);
    }

    public static final String k(q3 q3Var) {
        Intrinsics.checkNotNullParameter(q3Var, "<this>");
        return a0.d.s("MENU_ITEM_ID_", q3Var.f146814b, "_", q3Var.f146813a);
    }

    public static final int l(List list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                int i = ((JuniorPlanConfiguration) next).e;
                do {
                    Object next2 = it8.next();
                    int i2 = ((JuniorPlanConfiguration) next2).e;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) obj2;
        if (juniorPlanConfiguration != null) {
            return juniorPlanConfiguration.e;
        }
        throw new IllegalArgumentException("No junior configurations found to get maxGuardianAccountCount");
    }

    public static final int m(List list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                int i = ((JuniorPlanConfiguration) next).f;
                do {
                    Object next2 = it8.next();
                    int i2 = ((JuniorPlanConfiguration) next2).f;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) obj2;
        if (juniorPlanConfiguration != null) {
            return juniorPlanConfiguration.f;
        }
        throw new IllegalArgumentException("No junior configurations found to get maxTotalAccountCount");
    }

    public static final h n(List list) {
        cgi.d dVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            dVar = cgi.d.CARD;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!((k) it8.next()).b().a().c().contains(cgi.d.CARD)) {
                    dVar = cgi.d.WALLET;
                    break;
                }
            }
            dVar = cgi.d.CARD;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = f.f150252a[dVar.ordinal()];
        if (i == 1) {
            return h.WALLET;
        }
        if (i == 2) {
            return h.CARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList o(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof com.revolut.feature.junior_profile.api.models.h) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final boolean p(BackendScreen backendScreen) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        return (backendScreen instanceof FormScreen) && (d0.d0(((FormScreen) backendScreen).f63468b) instanceof AddressInputItem);
    }

    public static final boolean q(BackendScreen backendScreen) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        if (!(backendScreen instanceof FormScreen)) {
            return false;
        }
        BackendItem backendItem = (BackendItem) d0.d0(((FormScreen) backendScreen).f63468b);
        return (backendItem instanceof CountrySelectionItem) && ((CountrySelectionItem) backendItem).f63371g == xl2.n.LIST;
    }

    public static final boolean r(BackendScreen backendScreen) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        if (!(backendScreen instanceof FormScreen)) {
            return false;
        }
        List list = ((FormScreen) backendScreen).f63468b;
        if (!(d0.d0(list) instanceof PermissionInputItem)) {
            return false;
        }
        Object objD0 = d0.d0(list);
        PermissionInputItem permissionInputItem = objD0 instanceof PermissionInputItem ? (PermissionInputItem) objD0 : null;
        return (permissionInputItem != null ? permissionInputItem.f63557c : null) != y.META_SSO;
    }

    public static final boolean s(Asset asset) {
        Intrinsics.checkNotNullParameter(asset, "<this>");
        return s5i.c.f260085a[asset.f104719a.ordinal()] == 1;
    }

    public static final boolean t(BackendScreen backendScreen) {
        Intrinsics.checkNotNullParameter(backendScreen, "<this>");
        return (backendScreen instanceof FormScreen) && (d0.d0(((FormScreen) backendScreen).f63468b) instanceof TransactionsSelectionItem);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(1:(3:15|63|64)(2:16|17))(5:18|65|19|55|60))(9:23|24|43|(2:(2:49|47)|69)|50|67|51|(3:54|55|60)|62))(1:25))(3:26|(1:30)|31)|(3:33|(1:35)|(1:39))|42|24|43|(3:45|(1:47)|69)|50|67|51|(0)|62) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
    
        if (r15.O(r0, r8) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b2, code lost:
    
        if (r3.i(r4, r0, r8) != r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[LOOP:0: B:47:0x0102->B:49:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(z9m.k r18, cam.t r19, org.json.JSONObject r20, gim.c r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc0.b.v(z9m.k, cam.t, org.json.JSONObject, gim.c):java.lang.Object");
    }

    public static final List w(qx1.i iVar) {
        if (Intrinsics.f(iVar.getState(), "SUCCEED")) {
            return iVar.getResults();
        }
        return null;
    }

    public static final ggi.a x(dag.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.getDefault();
        List<dag.f> sortingOptions = gVar.getSortingOptions();
        ArrayList arrayList = new ArrayList(w.t(sortingOptions, 10));
        for (dag.f fVar : sortingOptions) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            arrayList.add(new TravelHotelsSortingOption(fVar.getId(), fVar.getLabel()));
        }
        return new ggi.a(str, arrayList);
    }

    public static final e y(qx1.d dVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        iy1.g gVar;
        ArrayList arrayList8;
        ArrayList arrayList9;
        List listW;
        j jVarK;
        List listW2;
        iy1.i iVarJ;
        ArrayList arrayList10;
        iy1.f fVarH;
        List listW3;
        iy1.h hVarI;
        List listW4;
        iy1.e eVarG;
        List listW5;
        iy1.d dVarF;
        List listW6;
        iy1.c cVarE;
        List listW7;
        iy1.b bVarD;
        List listW8;
        jy1.c cVarC;
        List listW9;
        iy1.a aVarA;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        qx1.i aani = dVar.getAani();
        if (aani == null || (listW9 = w(aani)) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList11 = new ArrayList();
            Iterator it8 = listW9.iterator();
            while (it8.hasNext()) {
                try {
                    aVarA = qx1.b.a((qx1.a) it8.next());
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                    aVarA = null;
                }
                if (aVarA != null) {
                    arrayList11.add(aVarA);
                }
            }
            arrayList = arrayList11;
        }
        qx1.i bizum = dVar.getBizum();
        if (bizum == null || (listW8 = w(bizum)) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList12 = new ArrayList();
            Iterator it9 = listW8.iterator();
            while (it9.hasNext()) {
                try {
                    cVarC = qx1.b.c((qx1.a) it9.next());
                } catch (Throwable th11) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var2);
                    cVarC = null;
                }
                if (cVarC != null) {
                    arrayList12.add(cVarC);
                }
            }
            arrayList2 = arrayList12;
        }
        qx1.i blik = dVar.getBlik();
        if (blik == null || (listW7 = w(blik)) == null) {
            arrayList3 = null;
        } else {
            ArrayList arrayList13 = new ArrayList();
            Iterator it10 = listW7.iterator();
            while (it10.hasNext()) {
                try {
                    bVarD = qx1.b.d((qx1.a) it10.next());
                } catch (Throwable th12) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th12, h0Var3);
                    bVarD = null;
                }
                if (bVarD != null) {
                    arrayList13.add(bVarD);
                }
            }
            arrayList3 = arrayList13;
        }
        qx1.i breb = dVar.getBreb();
        if (breb == null || (listW6 = w(breb)) == null) {
            arrayList4 = null;
        } else {
            ArrayList arrayList14 = new ArrayList();
            Iterator it11 = listW6.iterator();
            while (it11.hasNext()) {
                try {
                    cVarE = qx1.b.e((qx1.a) it11.next());
                } catch (Throwable th13) {
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th13, h0Var4);
                    cVarE = null;
                }
                if (cVarE != null) {
                    arrayList14.add(cVarE);
                }
            }
            arrayList4 = arrayList14;
        }
        qx1.i iris = dVar.getIris();
        if (iris == null || (listW5 = w(iris)) == null) {
            arrayList5 = null;
        } else {
            ArrayList arrayList15 = new ArrayList();
            Iterator it12 = listW5.iterator();
            while (it12.hasNext()) {
                try {
                    dVarF = qx1.b.f((qx1.a) it12.next());
                } catch (Throwable th14) {
                    h0 h0Var5 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th14, h0Var5);
                    dVarF = null;
                }
                if (dVarF != null) {
                    arrayList15.add(dVarF);
                }
            }
            arrayList5 = arrayList15;
        }
        qx1.i mbway = dVar.getMbway();
        if (mbway == null || (listW4 = w(mbway)) == null) {
            arrayList6 = null;
        } else {
            ArrayList arrayList16 = new ArrayList();
            Iterator it13 = listW4.iterator();
            while (it13.hasNext()) {
                try {
                    eVarG = qx1.b.g((qx1.a) it13.next());
                } catch (Throwable th15) {
                    h0 h0Var6 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th15, h0Var6);
                    eVarG = null;
                }
                if (eVarG != null) {
                    arrayList16.add(eVarG);
                }
            }
            arrayList6 = arrayList16;
        }
        qx1.i qvik = dVar.getQvik();
        if (qvik == null || (listW3 = w(qvik)) == null) {
            arrayList7 = null;
        } else {
            ArrayList arrayList17 = new ArrayList();
            Iterator it14 = listW3.iterator();
            while (it14.hasNext()) {
                try {
                    hVarI = qx1.b.i((qx1.a) it14.next());
                } catch (Throwable th16) {
                    h0 h0Var7 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th16, h0Var7);
                    hVarI = null;
                }
                if (hVarI != null) {
                    arrayList17.add(hVarI);
                }
            }
            arrayList7 = arrayList17;
        }
        qx1.i pix = dVar.getPix();
        if (pix != null) {
            Integer errorCode = pix.getErrorCode();
            List listW10 = w(pix);
            if (listW10 != null) {
                arrayList10 = new ArrayList();
                Iterator it15 = listW10.iterator();
                while (it15.hasNext()) {
                    try {
                        fVarH = qx1.b.h((qx1.a) it15.next());
                    } catch (Throwable th17) {
                        h0 h0Var8 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, th17, h0Var8);
                        fVarH = null;
                    }
                    if (fVarH != null) {
                        arrayList10.add(fVarH);
                    }
                }
            } else {
                arrayList10 = null;
            }
            gVar = new iy1.g(arrayList10, errorCode);
        } else {
            gVar = null;
        }
        qx1.i spin = dVar.getSpin();
        if (spin == null || (listW2 = w(spin)) == null) {
            arrayList8 = null;
        } else {
            ArrayList arrayList18 = new ArrayList();
            Iterator it16 = listW2.iterator();
            while (it16.hasNext()) {
                try {
                    iVarJ = qx1.b.j((qx1.a) it16.next());
                } catch (Throwable th18) {
                    h0 h0Var9 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th18, h0Var9);
                    iVarJ = null;
                }
                if (iVarJ != null) {
                    arrayList18.add(iVarJ);
                }
            }
            arrayList8 = arrayList18;
        }
        qx1.i wero = dVar.getWero();
        if (wero == null || (listW = w(wero)) == null) {
            arrayList9 = null;
        } else {
            ArrayList arrayList19 = new ArrayList();
            Iterator it17 = listW.iterator();
            while (it17.hasNext()) {
                try {
                    jVarK = qx1.b.k((qx1.a) it17.next());
                } catch (Throwable th19) {
                    h0 h0Var10 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList10 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th19, h0Var10);
                    jVarK = null;
                }
                if (jVarK != null) {
                    arrayList19.add(jVarK);
                }
            }
            arrayList9 = arrayList19;
        }
        return new e(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, gVar, arrayList7, arrayList8, arrayList9);
    }

    public static final l z(CryptoAddressHostingInfo cryptoAddressHostingInfo) {
        Intrinsics.checkNotNullParameter(cryptoAddressHostingInfo, "<this>");
        String str = cryptoAddressHostingInfo.f71079b;
        String strName = cryptoAddressHostingInfo.f71078a.name();
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddressHostingInfo.f71080c;
        Intrinsics.checkNotNullParameter(cryptoAddressRecipientDetails, "<this>");
        String str2 = cryptoAddressRecipientDetails.f70984a;
        String strName2 = cryptoAddressRecipientDetails.f70985b.name();
        String str3 = cryptoAddressRecipientDetails.f70986c;
        CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = cryptoAddressRecipientDetails.d;
        return new l(str, strName, new bl5.b(str2, strName2, str3, cryptoBeneficiaryRecipientAddress != null ? new bl5.a(cryptoBeneficiaryRecipientAddress.f70987a, cryptoBeneficiaryRecipientAddress.f70988b, cryptoBeneficiaryRecipientAddress.f70989c, cryptoBeneficiaryRecipientAddress.d) : null, cryptoAddressRecipientDetails.e));
    }

    public abstract Object h(KClass kClass);

    public abstract b u(KClass kClass, Object obj2);
}
