package zr2;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.hd0;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import ip0.ry;
import ip0.s7;
import ip0.sy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import le.u1;
import nel.z;
import org.joda.time.DateTime;
import z0h.t1;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zsk.d;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324547a;

    public /* synthetic */ o(int i) {
        this.f324547a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [mr8.c] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [mr8.c] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [mr8.d] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v37 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        mr8.a aVar;
        ?? dVar;
        ?? r162;
        switch (this.f324547a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 1:
                List requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requests");
                List list = requests;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    xr8.b bVar = (xr8.b) it8.next();
                    Map map = vr8.a.f291516a;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String str = bVar.f308295a;
                    long j2 = bVar.f308296b;
                    xi0.a aVar2 = xi0.b.Companion;
                    String str2 = bVar.f308297c;
                    aVar2.getClass();
                    dj0.d dVar2 = new dj0.d(j2, xi0.a.a(str2));
                    mr8.e eVar = (mr8.e) u1.u(bVar.f308298g, vr8.a.f291516a);
                    DateTime dateTime = new DateTime(bVar.f308299h);
                    String str3 = bVar.d;
                    String str4 = bVar.e;
                    String str5 = bVar.f;
                    String str6 = bVar.i;
                    String str7 = bVar.f308300j;
                    y1 y1Var = y1Var;
                    xr8.a aVar3 = bVar.k;
                    Iterator it9 = it8;
                    mr8.a aVar4 = new mr8.a(aVar3.getId(), aVar3.getFirstName(), aVar3.getLastName());
                    xr8.a aVar5 = bVar.f308301l;
                    mr8.a aVar6 = new mr8.a(aVar5.getId(), aVar5.getFirstName(), aVar5.getLastName());
                    xr8.c cVar = bVar.f308302m;
                    if (cVar != null) {
                        String str8 = cVar.f308303a;
                        mr8.c[] cVarArrValues = mr8.c.values();
                        int length = cVarArrValues.length;
                        aVar = aVar6;
                        int i = 0;
                        ?? r4 = cVarArrValues;
                        while (true) {
                            if (i < length) {
                                r162 = r4[i];
                                int i2 = i;
                                ?? r192 = r4;
                                z = true;
                                if (!a0.z(r162.name(), str8, true)) {
                                    i = i2 + 1;
                                    r4 = r192;
                                }
                            } else {
                                z = true;
                                r162 = y1Var;
                            }
                        }
                        if (r162 == 0) {
                            r162 = mr8.c.FIRST_TRANSFER_BETWEEN;
                        }
                        ?? r110 = r162;
                        jo3.b bVar2 = cVar.f308304b;
                        dVar = new mr8.d(r110, bVar2 != null ? hx7.a.v(bVar2) : y1Var);
                    } else {
                        z = true;
                        aVar = aVar6;
                        dVar = y1Var;
                    }
                    arrayList.add(new mr8.b(str, dVar2, eVar, dateTime, str3, str4, str5, str6, str7, aVar4, aVar, dVar));
                    it8 = it9;
                    y1Var = y1Var;
                }
                return arrayList;
            case 2:
                PaymentGroup group = (PaymentGroup) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                return new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupDetails(group, false));
            case 3:
                PaymentGroup group2 = (PaymentGroup) obj2;
                Intrinsics.checkNotNullParameter(group2, "group");
                return new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.BillSelection(group2, f0.f322471a));
            case 4:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : it10) {
                    if (((RecipientPaymentsSettings) obj3).f79673b == iy9.d.COMPANY) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 5:
                zrd.a state = (zrd.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return (zrd.c) state.f324678a.getContent();
            case 6:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new zrd.c((List) rVar.f314201a, (xi0.b) rVar.f314202b, (yld.c) rVar.f314203c);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                eVarB.add(new hd0("CHART_ID", null, 6));
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    arrayList3.add(new pb0(String.valueOf(it11.nextInt())));
                }
                int i3 = R$attr.uikit_dp16;
                yp0.b.k(arrayList3, i3, i3, 0, 0, 28);
                eVarB.addAll(arrayList3);
                return new zrd.g(u.a(eVarB));
            case 8:
                zrf.k it12 = (zrf.k) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                zrf.i iVar = it12 instanceof zrf.i ? (zrf.i) it12 : null;
                if (iVar != null) {
                    return Integer.valueOf(iVar.f324732a);
                }
                return null;
            case 9:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 12:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return do3.q.y(it13);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ejb.b bVar3 = (ejb.b) pair.f186385a;
                Set set = (Set) pair.f186386b;
                List list2 = bVar3.f126837b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!set.contains(((SavingsAccountDetails) obj4).f86460a.f234881a)) {
                        arrayList4.add(obj4);
                    }
                }
                ejb.b bVarA = ejb.b.a(bVar3, arrayList4);
                od0.i.Companion.getClass();
                return od0.h.a(bVarA);
            case 14:
                d.a aVar7 = zsk.d.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 15:
                nel.n it14 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.f214597c == z.SPAC);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                eVarB2.add(CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "id_credit_card_boleto_text_counter", null, 0, 0, 0, 0, 126));
                List listK = v.k(new s7("id_credit_card_boleto_copy_boleto_code", 0, 0, 0, 0, false, null, 126), new s7("id_credit_card_boleto_copy_pix_code", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                eVarB2.add(new s7("id_credit_card_boleto_share", 0, 0, 0, 0, false, null, 126));
                eVarB2.add(nb0.b(pb0.Companion, "id_credit_card_boleto_cancel", false, 0, false, 30));
                return new zt4.i(u.a(eVarB2), zt4.g.f325074a);
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new SecurityHubDestination((SecurityHubStartScreen) new SecurityHubStartScreen.LinkedWalletDetailsFromDeeplink((h93.f0) pair2.f186385a, (DigitizedCard) pair2.f186386b), true, (String) null, true, 16);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ytk.a.a(4);
            case 19:
                mel.p it15 = (mel.p) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            case 20:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                aim.e eVarB3 = u.b();
                eVarB3.add(new qi("LOADING_TABS_LIST_ID", zug.c.a().size()));
                eVarB3.addAll((Collection) getDefaultLoadingItems2.invoke());
                return u.a(eVarB3);
            case 21:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                return com.google.android.gms.internal.mlkit_vision_face.a.o((String) entry.getKey(), "=", (String) entry.getValue());
            case 22:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return null;
            case 23:
                zuj.n update = (zuj.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return zuj.n.a(update, null, null, null, null, 13);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB4 = u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "CONCIERGE_LOADING_LIST_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB4.add(pb0VarB);
                ArrayList arrayList5 = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    arrayList5.add(new sy(a0.d.n("ITEM_LOADING_LIST_ID_", i5), ry.DEFAULT, 60));
                }
                eVarB4.addAll(yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("ITEMS_SUBHEADER_LOADING_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                return new zuj.w(u.a(eVarB4), zuj.r.f325507a, f0.f322471a);
            case 25:
                CandleStickGraphDelegate.a state2 = (CandleStickGraphDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                od0.h hVar = od0.i.Companion;
                y1Var = state2 instanceof y1 ? (y1) state2 : null;
                hVar.getClass();
                return od0.h.a(y1Var);
            case 26:
                t1 it16 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return u.c(new WealthDisclaimersContract$Disclaimer$Investment.InvestmentPlanProjections(it16.f318563a, it16.f318564b));
            case 27:
                zul.n it17 = (zul.n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f325541b;
            case 28:
                tel.d it18 = (tel.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f270124b;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ o(cli.n nVar, int i) {
        this.f324547a = i;
    }
}
