package sk2;

import akd.r;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import efm.k;
import ekd.q0;
import ekd.z;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.joda.time.DateTime;
import sl2.m;
import tkd.l;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263760a;

    public /* synthetic */ f(int i) {
        this.f263760a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        do3.c cVar;
        switch (this.f263760a) {
            case 0:
                od0.i.Companion.getClass();
                return od0.h.a((LocationDomain) obj2);
            case 1:
                LocationDomain locationDomain = (LocationDomain) obj2;
                return new b(new co3.a(locationDomain.f78066a, locationDomain.f78067b));
            case 2:
                return new c(false);
            case 3:
                fo3.c it9 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d.f306286a;
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new sk4.d((List) getDefaultLoadingItems.invoke());
            case 5:
                l it10 = (l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f271945a;
            case 6:
                l it11 = (l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (r) d0.d0(it11.e);
            case 7:
                l it12 = (l) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.d;
            case 8:
                l it13 = (l) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f271948g;
            case 9:
                l slotsData = (l) obj2;
                Intrinsics.checkNotNullParameter(slotsData, "slotsData");
                List list = slotsData.f271947c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    q0 q0Var = (q0) obj3;
                    if (!(q0Var instanceof z) || ((z) q0Var).f127029a.f127021c.toEpochMilli() > Instant.now().toEpochMilli()) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 10:
                l it14 = (l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f271946b;
            case 11:
                l oldData = (l) obj2;
                Intrinsics.checkNotNullParameter(oldData, "oldData");
                List list2 = oldData.f271947c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!(((q0) obj4) instanceof z)) {
                        arrayList2.add(obj4);
                    }
                }
                return l.a(oldData, null, null, arrayList2, null, null, null, 123);
            case 12:
                l it15 = (l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (SlotChecklist) d0.d0(it15.f);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "LOADING_COUNTER_LIST_ID", null, 0, 0, 0, 0, 126);
                yp0.b.l(modelB, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                eVarB.add(modelB);
                eVarB.add(new gu("LOADING_SUB_HEADER_LIST_ID", 0, 0, 30));
                aim.e eVarB2 = u.b();
                eVarB2.add(nb0.b(pb0.Companion, "LOADING_ITEM_TITLE_LIST_ID", false, 0, true, 22));
                for (int i = 0; i < 3; i++) {
                    eVarB2.add(t61.a.o("LOADING_ITEM_LIST_ID", i, pb0.Companion, false, 4));
                }
                aim.e eVarA = u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                eVarB.addAll(eVarA);
                return new m(c.b.f63215a, b.C0458b.f63213a, u.a(eVarB));
            case 14:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return (((Boolean) rVar.f314202b).booleanValue() && ((Boolean) rVar.f314203c).booleanValue()) ? bl3.b.GRANTED : !((Boolean) rVar.f314201a).booleanValue() ? bl3.b.DENIED : bl3.b.DENIED_PERMANENTLY;
            case 15:
                od0.i it16 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f224257a, Boolean.TRUE));
            case 16:
                ql3.d dto = (ql3.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return hx7.l.D(dto);
            case 17:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List list3 = it17;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it18 = list3.iterator();
                while (it18.hasNext()) {
                    arrayList3.add(hx7.l.D((ql3.d) it18.next()));
                }
                return arrayList3;
            case 18:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zi0.c.P(it19, false, null, 3);
            case 19:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Data.copy$default(data, null, null, true, 3, null);
            case 20:
                ml3.i it20 = (ml3.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return pu7.a.G(it20);
            case 21:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                List list4 = it21;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it22 = list4.iterator();
                while (it22.hasNext()) {
                    arrayList4.add(pu7.a.H((ml3.i) it22.next()));
                }
                return arrayList4;
            case 22:
                zm3.d it23 = (zm3.d) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return zi0.c.P(it23, false, null, 3);
            case 23:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return Data.copy$default(data2, null, null, true, 3, null);
            case 24:
                ml3.i it24 = (ml3.i) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return pu7.a.G(it24);
            case 25:
                Map result = (Map) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(result.size()));
                Iterator it25 = result.entrySet().iterator();
                while (it25.hasNext()) {
                    Map.Entry entry = (Map.Entry) it25.next();
                    Object key = entry.getKey();
                    ql3.a aVar = (ql3.a) entry.getValue();
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    String registeredAs = aVar.getRegisteredAs();
                    String username = aVar.getUsername();
                    String code = aVar.getCode();
                    String country = aVar.getCountry();
                    boolean newlyJoined = aVar.getNewlyJoined();
                    Long joinDate = aVar.getJoinDate();
                    DateTime dateTime = joinDate != null ? new DateTime(joinDate.longValue()) : null;
                    String birthday = aVar.getBirthday();
                    LocalDate localDate = birthday != null ? LocalDate.parse(birthday) : null;
                    do3.b.Companion.getClass();
                    do3.b bVar = do3.b.FULL;
                    zm3.h hVarI = pw5.a.I(aVar.getPricePlan());
                    String customerType = aVar.getCustomerType();
                    if (customerType != null) {
                        do3.c[] cVarArrValues = do3.c.values();
                        int length = cVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                do3.c cVar2 = cVarArrValues[i2];
                                int i3 = i2;
                                it8 = it25;
                                if (a0.z(cVar2.name(), customerType, true)) {
                                    cVar = cVar2;
                                } else {
                                    i2 = i3 + 1;
                                    it25 = it8;
                                }
                            } else {
                                it8 = it25;
                                cVar = null;
                            }
                        }
                        if (cVar == null) {
                        }
                        linkedHashMap.put(key, new zm3.m(registeredAs, code, username, country, newlyJoined, dateTime, localDate, bVar, hVarI, cVar));
                        it25 = it8;
                    } else {
                        it8 = it25;
                    }
                    cVar = do3.c.PERSONAL;
                    linkedHashMap.put(key, new zm3.m(registeredAs, code, username, country, newlyJoined, dateTime, localDate, bVar, hVarI, cVar));
                    it25 = it8;
                }
                return linkedHashMap;
            case 26:
                List contacts = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                List list5 = contacts;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                Iterator it26 = list5.iterator();
                while (it26.hasNext()) {
                    arrayList5.add(((DeviceContact) it26.next()).f65992c);
                }
                return d0.i1(arrayList5);
            case 27:
                List it27 = (List) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : it27) {
                    if (hashSet.add(((ml3.i) obj5).n())) {
                        arrayList6.add(obj5);
                    }
                }
                return arrayList6;
            case 28:
                List contacts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts2, "contacts");
                ml3.i iVar = (ml3.i) d0.d0(contacts2);
                if (iVar == null) {
                    return rfm.h.f253943a;
                }
                rfm.u uVarG = k.g(iVar);
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                rfm.m mVar = new rfm.m(uVarG, new g(26, new f(24)), 1);
                Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
                return mVar;
            default:
                ml3.i it28 = (ml3.i) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return pu7.a.G(it28);
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f263760a = i;
    }
}
