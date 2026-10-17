package hp3;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWallet;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.push_to_card.api.model.AdditionalField;
import com.revolut.feature.push_to_card.api.model.AdditionalFieldOption;
import com.revolut.feature.push_to_card.api.model.CardEligibility;
import com.revolut.feature.push_to_card.api.model.CardIneligibleReason;
import com.revolut.feature.push_to_card.api.model.DropdownFieldContent;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.shared.feature.wealth.models.config.Links;
import dp5.a0;
import dp5.h1;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import lqa.a;
import retrofit2.HttpException;
import z0h.e0;
import z0h.p1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154430a;

    public /* synthetic */ r(int i) {
        this.f154430a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        wk5.a aVar;
        boolean z;
        List list;
        Parcelable dropdownField;
        Iterator it8;
        String str;
        boolean z3;
        wk5.h hVar = null;
        switch (this.f154430a) {
            case 0:
                t1 wealthDisclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                Links links = wealthDisclaimersData.f318563a;
                hel.b bVar = wealthDisclaimersData.f318564b;
                return new p1(zhm.u.c(new e0(links, bVar)), bVar);
            case 1:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return m.a(update, null, null, null, false, null, null, null, null, false, false, new Data(null, null, false, 3, null), null, 28671);
            case 2:
                l page = (l) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                List list2 = (List) page.f154412c.getContent();
                if (list2 != null) {
                    return (kp3.b) d0.o0(list2);
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return y.b();
            case 4:
                l it9 = (l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Iterable iterable = (List) it9.f154412c.component1();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                return iterable;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it10.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                pb0 pb0Var = new pb0("LOADING_STATE_ID_4");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0Var);
                return new hp4.i(zhm.u.a(eVarB));
            case 6:
                a0 it11 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return uj3.b.z(it11);
            case 7:
                Map it12 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(it12.size()));
                for (Map.Entry entry : it12.entrySet()) {
                    String str2 = (String) entry.getKey();
                    wk5.a[] aVarArrValues = wk5.a.values();
                    int length = aVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            aVar = aVarArrValues[i];
                            if (!kotlin.text.a0.z(aVar.name(), str2, true)) {
                                i++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        aVar = wk5.a.UNSPECIFIED;
                    }
                    linkedHashMap.put(aVar, entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    h1 h1Var = (h1) entry2.getValue();
                    Intrinsics.checkNotNullParameter(h1Var, "<this>");
                    long j2 = h1Var.f116762b;
                    xi0.a aVar2 = xi0.b.Companion;
                    String str3 = h1Var.f116761a;
                    aVar2.getClass();
                    dj0.d dVar = new dj0.d(j2, xi0.a.a(str3));
                    Long l2 = h1Var.f116763c;
                    dj0.d dVar2 = l2 != null ? new dj0.d(l2.longValue(), xi0.a.a(str3)) : null;
                    Long l3 = h1Var.d;
                    dj0.d dVar3 = l3 != null ? new dj0.d(l3.longValue(), xi0.a.a(str3)) : null;
                    Long l4 = h1Var.e;
                    dj0.d dVar4 = l4 != null ? new dj0.d(l4.longValue(), xi0.a.a(str3)) : null;
                    dj0.d dVar5 = new dj0.d(h1Var.f, xi0.a.a(str3));
                    List list3 = h1Var.f116764g;
                    if (list3 != null) {
                        List list4 = list3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it13 = list4.iterator();
                        while (it13.hasNext()) {
                            arrayList3.add(hx7.e.r((dl5.a) it13.next()));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    linkedHashMap2.put(key, new CryptoWithdrawFeesBreakdown(dVar, dVar2, dVar3, dVar4, dVar5, arrayList));
                }
                return linkedHashMap2;
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return wk5.n.NOT_RESTRICTED;
            case 9:
                a0 it14 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return uj3.b.z(it14);
            case 10:
                dp5.i it15 = (dp5.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                String str4 = it15.f116765a;
                String str5 = it15.f116766b;
                wk5.h[] hVarArrValues = wk5.h.values();
                int length2 = hVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        wk5.h hVar2 = hVarArrValues[i2];
                        if (kotlin.text.a0.z(hVar2.name(), str5, true)) {
                            hVar = hVar2;
                        } else {
                            i2++;
                        }
                    }
                }
                if (hVar == null) {
                    hVar = wk5.h.UNKNOWN;
                }
                return new CryptoAddressHostingCheckResult.Found(str4, hVar, it15.f116767c, false);
            case 11:
                Intrinsics.checkNotNullParameter((CryptoAddress) obj2, "it");
                return Boolean.FALSE;
            case 12:
                cl5.a it16 = (cl5.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return el5.a.a(it16);
            case 13:
                dp5.u it17 = (dp5.u) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj3 = cp5.a.f107873a;
                Intrinsics.checkNotNullParameter(it17, "<this>");
                return new ko5.f(it17.f116813a, it17.f116814b);
            case 14:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "CACHE_KEY_CURRENCIES_RELEVANCE";
            case 16:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return ((error instanceof HttpException) && ((HttpException) error).code() == 404) ? efm.d0.m(CryptoAddressHostingCheckResult.NotFound.f71075a) : efm.d0.l(error);
            case 17:
                Intrinsics.checkNotNullParameter((hp5.e) obj2, "it");
                return Boolean.TRUE;
            case 18:
                String str6 = (String) obj2;
                return a10.b.t(str6, "transactionGroupId", "CACHE_KEY_CRYPTO_TRANSACTION_FEE_V2_", str6);
            case 19:
                dp5.d0 limitsDto = (dp5.d0) obj2;
                Intrinsics.checkNotNullParameter(limitsDto, "limitsDto");
                return v04.b.s(limitsDto);
            case 20:
                List list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                List<dp5.r> list6 = list5;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                for (dp5.r rVar : list6) {
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    String str7 = rVar.f116803a;
                    String str8 = rVar.f116804b;
                    wk5.j jVar = wk5.k.Companion;
                    String str9 = rVar.f116805c;
                    jVar.getClass();
                    wk5.k kVarA = wk5.j.a(str9);
                    if (kVarA == null) {
                        kVarA = wk5.k.UNKNOWN;
                    }
                    wk5.k kVar = kVarA;
                    bl5.b bVar2 = rVar.d;
                    CryptoAddressRecipientDetails cryptoAddressRecipientDetailsX = bVar2 != null ? n14.k.x(bVar2) : null;
                    List list7 = rVar.e;
                    boolean z4 = rVar.f;
                    ko5.d dVar6 = ko5.e.Companion;
                    String str10 = rVar.f116806g;
                    dVar6.getClass();
                    ko5.e eVarA = ko5.d.a(str10);
                    if (eVarA == null) {
                        eVarA = ko5.e.UNKNOWN;
                    }
                    ko5.e eVar = eVarA;
                    dp5.d0 d0Var = rVar.f116807h;
                    arrayList4.add(new CryptoWallet(str7, str8, kVar, cryptoAddressRecipientDetailsX, list7, z4, eVar, d0Var != null ? v04.b.s(d0Var) : null, rVar.i));
                }
                return arrayList4;
            case 21:
                List suggestions = (List) obj2;
                Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                return d0.P0(suggestions, new hp8.a());
            case 22:
                RoboPortfolioInfo it18 = (RoboPortfolioInfo) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new hpc.a(it18);
            case 23:
                RowDelegate.Model it19 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = AllFormsScreen.Q;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.u instanceof Bill);
            case 24:
                LargeActionButtonDelegate.Model it20 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Object obj4 = it20.i;
                if (obj4 instanceof CancellationDialogProvider$CancellationConfirmationOption) {
                    return (CancellationDialogProvider$CancellationConfirmationOption) obj4;
                }
                return null;
            case 25:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0VarB = nb0.b(pb0.Companion, "ROW_LOADING_ITEM_0", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                s7 s7Var = new s7("CELL_DETAILS_LOADING_ITEM_1", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                List listK = zhm.v.k(pb0VarB, s7Var);
                List listK2 = zhm.v.k(new s7("CELL_DETAILS_LOADING_ITEM_2", 0, 0, 0, 0, false, null, 126), new s7("CELL_DETAILS_LOADING_ITEM_3", 0, 0, 0, 0, false, null, 126), new s7("CELL_DETAILS_LOADING_ITEM_4", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return d0.E0(listK2, listK);
            case 27:
                lqa.t dto = (lqa.t) obj2;
                Intrinsics.checkNotNullParameter(dto, "it");
                String str11 = "dto";
                Intrinsics.checkNotNullParameter(dto, "dto");
                boolean z6 = dto.f199270a;
                boolean z11 = dto.f199271b;
                String str12 = dto.f199272c;
                String str13 = dto.d;
                String str14 = dto.e;
                String str15 = dto.f;
                String str16 = dto.f199273g;
                boolean z12 = dto.f199274h;
                lqa.w wVar = dto.i;
                CardIneligibleReason cardIneligibleReason = wVar != null ? new CardIneligibleReason(wVar.f199277a) : null;
                List list8 = dto.f199275j;
                if (list8 != null) {
                    List list9 = list8;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list9, 10));
                    Iterator it21 = list9.iterator();
                    while (it21.hasNext()) {
                        lqa.a aVar3 = (lqa.a) it21.next();
                        Intrinsics.checkNotNullParameter(aVar3, str11);
                        if (aVar3 instanceof a.c) {
                            a.c cVar = (a.c) aVar3;
                            String str17 = cVar.f199218b;
                            lqa.e0 e0Var = cVar.f199219c;
                            dropdownField = new AdditionalField.TextField(str17, new TextFieldContent(e0Var.f199236c, e0Var.d, e0Var.e, e0Var.f199234a, e0Var.f199235b));
                            it8 = it21;
                            str = str11;
                            z3 = z6;
                        } else {
                            if (!(aVar3 instanceof a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a.b bVar3 = (a.b) aVar3;
                            String str18 = bVar3.f199215b;
                            lqa.q qVar = bVar3.f199216c;
                            boolean z29 = qVar.f199266a;
                            String str19 = qVar.f199267b;
                            List list10 = qVar.f199268c;
                            it8 = it21;
                            str = str11;
                            z3 = z6;
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(list10, 10));
                            for (Iterator it22 = list10.iterator(); it22.hasNext(); it22 = it22) {
                                lqa.d dVar7 = (lqa.d) it22.next();
                                arrayList6.add(new AdditionalFieldOption(dVar7.f199227a, dVar7.f199228b));
                            }
                            dropdownField = new AdditionalField.DropdownField(str18, new DropdownFieldContent(str19, arrayList6, z29));
                        }
                        arrayList5.add(dropdownField);
                        it21 = it8;
                        str11 = str;
                        z6 = z3;
                    }
                    z = z6;
                    list = arrayList5;
                } else {
                    z = z6;
                    list = f0.f322471a;
                }
                return new CardEligibility(z, z11, str12, str13, str14, str15, str16, z12, cardIneligibleReason, list);
            case 28:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                Intrinsics.checkNotNullParameter("type", "<set-?>");
                Json.f = "type";
                return Unit.f186387a;
            default:
                Pair it23 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return ((fo3.c) it23.f186385a).d;
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f154430a = i;
    }
}
