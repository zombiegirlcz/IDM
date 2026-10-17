package m6g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import com.revolut.feature.travel.flights.models.domain.booking.PrimaryContact;
import com.revolut.feature.travel.flights.models.domain.booking.TravelDocument;
import com.revolut.feature.travel.flights.models.domain.booking.TravellerDetails;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.z;
import l7g.y;
import p6g.a0;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsPassengersDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsPassengersDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String strN;
        Object next;
        Object next2;
        Object next3;
        y yVar;
        Object next4;
        Object next5;
        TravelDocument travelDocument;
        String str2;
        String str3;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        String str4;
        y yVar2;
        int i = this.u;
        TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) travelFlightsPassengersDetailsScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) travelFlightsPassengersDetailsScreen.d();
                o6g.b bVar = aVar3.u;
                String offerId = aVar3.o.f93355a;
                cli.y yVar3 = aVar3.D;
                List forms = ((i) ((j2) yVar3.f22677a).getValue()).f203094b;
                Data userData = ((i) ((j2) yVar3.f22677a).getValue()).f203095c;
                o6g.d dVar = bVar.f222594a;
                Intrinsics.checkNotNullParameter(offerId, "offerId");
                Intrinsics.checkNotNullParameter(forms, "forms");
                Intrinsics.checkNotNullParameter(userData, "userData");
                a0 a0Var = (a0) d0.d0(forms);
                l lVar = null;
                if (a0Var == null || (str = a0Var.f233266a) == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected empty passenger forms list");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "TravelFlightsPassengerDetailsOutputMapper", null, illegalArgumentException, h0Var);
                    lVar = null;
                } else {
                    do3.n nVar = (do3.n) userData.getContent();
                    if (nVar == null) {
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unexpected null user data content");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TravelFlightsPassengerDetailsOutputMapper", null, illegalArgumentException2, h0Var2);
                    } else {
                        String str5 = nVar.f116411g;
                        String str6 = "";
                        if (str5 == null) {
                            m70.a.c(t0.f186434a);
                            str5 = "";
                        }
                        String str7 = nVar.i;
                        z80.b bVar2 = bVar.f222595b;
                        String strG = bVar2.g(str7, null);
                        String strI = bVar2.i(str7);
                        Integer numM = strI != null ? z.m(strI) : null;
                        if (numM == null || (strN = a0.d.n("+", numM.intValue())) == null) {
                            m70.a.c(t0.f186434a);
                            strN = "";
                        }
                        if (strG == null) {
                            m70.a.c(t0.f186434a);
                        } else {
                            str6 = strG;
                        }
                        PrimaryContact primaryContact = new PrimaryContact(str, str5, new PhoneNumber(strN, str6));
                        List<a0> list = forms;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (a0 a0Var2 : list) {
                            String str8 = a0Var2.f233266a;
                            ArrayList arrayList2 = a0Var2.f233268c;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((p6g.w) next).d(), o6g.d.b(str8, p7g.b.FIRST_NAME))) {
                                    }
                                } else {
                                    next = lVar;
                                }
                            }
                            p6g.w wVar = (p6g.w) next;
                            Object objF = wVar != null ? wVar.f() : lVar;
                            p6g.u uVar = objF instanceof p6g.u ? (p6g.u) objF : lVar;
                            String str9 = uVar != 0 ? uVar.f233303a : lVar;
                            Iterator it9 = arrayList2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next2 = it9.next();
                                    if (Intrinsics.f(((p6g.w) next2).d(), o6g.d.b(str8, p7g.b.LAST_NAME))) {
                                    }
                                } else {
                                    next2 = lVar;
                                }
                            }
                            p6g.w wVar2 = (p6g.w) next2;
                            Object objF2 = wVar2 != null ? wVar2.f() : lVar;
                            p6g.u uVar2 = objF2 instanceof p6g.u ? (p6g.u) objF2 : lVar;
                            String str10 = uVar2 != 0 ? uVar2.f233303a : lVar;
                            Iterator it10 = arrayList2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next3 = it10.next();
                                    if (Intrinsics.f(((p6g.w) next3).d(), o6g.d.b(str8, p7g.b.GENDER))) {
                                    }
                                } else {
                                    next3 = lVar;
                                }
                            }
                            p6g.w wVar3 = (p6g.w) next3;
                            Object objF3 = wVar3 != null ? wVar3.f() : lVar;
                            p6g.o oVar = objF3 instanceof p6g.o ? (p6g.o) objF3 : lVar;
                            if (oVar == 0 || (str4 = oVar.f233293a) == null) {
                                yVar = null;
                            } else {
                                y.Companion.getClass();
                                y[] yVarArrValues = y.values();
                                int length = yVarArrValues.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        yVar2 = yVarArrValues[i2];
                                        if (!kotlin.text.a0.z(yVar2.name(), str4, true)) {
                                            i2++;
                                        }
                                    } else {
                                        yVar2 = null;
                                    }
                                }
                                if (yVar2 == null) {
                                    yVar2 = y.UNKNOWN;
                                }
                                yVar = yVar2;
                            }
                            Iterator it11 = arrayList2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    next4 = it11.next();
                                    if (Intrinsics.f(((p6g.w) next4).d(), o6g.d.b(str8, p7g.b.DATE_OF_BIRTH))) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            p6g.w wVar4 = (p6g.w) next4;
                            p6g.z zVarF = wVar4 != null ? wVar4.f() : null;
                            p6g.k kVar = zVarF instanceof p6g.k ? (p6g.k) zVarF : null;
                            LocalDate localDate = kVar != null ? kVar.f233288a : null;
                            Iterator it12 = arrayList2.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next5 = it12.next();
                                    if (Intrinsics.f(((p6g.w) next5).d(), o6g.d.b(str8, p7g.b.PASSPORT_NUMBER))) {
                                    }
                                } else {
                                    next5 = null;
                                }
                            }
                            p6g.w wVar5 = (p6g.w) next5;
                            p6g.z zVarF2 = wVar5 != null ? wVar5.f() : null;
                            p6g.u uVar3 = zVarF2 instanceof p6g.u ? (p6g.u) zVarF2 : null;
                            if (uVar3 == null || (str2 = uVar3.f233303a) == null) {
                                travelDocument = null;
                            } else {
                                Iterator it13 = arrayList2.iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        next6 = it13.next();
                                        str3 = str2;
                                        if (!Intrinsics.f(((p6g.w) next6).d(), o6g.d.b(str8, p7g.b.PASSPORT_ISSUING_DATE))) {
                                            str2 = str3;
                                        }
                                    } else {
                                        str3 = str2;
                                        next6 = null;
                                    }
                                }
                                p6g.w wVar6 = (p6g.w) next6;
                                p6g.z zVarF3 = wVar6 != null ? wVar6.f() : null;
                                p6g.k kVar2 = zVarF3 instanceof p6g.k ? (p6g.k) zVarF3 : null;
                                LocalDate localDate2 = kVar2 != null ? kVar2.f233288a : null;
                                Iterator it14 = arrayList2.iterator();
                                while (true) {
                                    if (it14.hasNext()) {
                                        next7 = it14.next();
                                        if (Intrinsics.f(((p6g.w) next7).d(), o6g.d.b(str8, p7g.b.PASSPORT_ISSUING_COUNTRY))) {
                                        }
                                    } else {
                                        next7 = null;
                                    }
                                }
                                p6g.w wVar7 = (p6g.w) next7;
                                p6g.z zVarF4 = wVar7 != null ? wVar7.f() : null;
                                p6g.a aVar4 = zVarF4 instanceof p6g.a ? (p6g.a) zVarF4 : null;
                                String str11 = aVar4 != null ? aVar4.f233265a.f297794a : null;
                                Iterator it15 = arrayList2.iterator();
                                while (true) {
                                    if (it15.hasNext()) {
                                        next8 = it15.next();
                                        if (Intrinsics.f(((p6g.w) next8).d(), o6g.d.b(str8, p7g.b.PASSPORT_ISSUING_CITY))) {
                                        }
                                    } else {
                                        next8 = null;
                                    }
                                }
                                p6g.w wVar8 = (p6g.w) next8;
                                p6g.z zVarF5 = wVar8 != null ? wVar8.f() : null;
                                p6g.u uVar4 = zVarF5 instanceof p6g.u ? (p6g.u) zVarF5 : null;
                                String str12 = uVar4 != null ? uVar4.f233303a : null;
                                Iterator it16 = arrayList2.iterator();
                                while (true) {
                                    if (it16.hasNext()) {
                                        next9 = it16.next();
                                        if (Intrinsics.f(((p6g.w) next9).d(), o6g.d.b(str8, p7g.b.PASSPORT_EXPIRY_DATE))) {
                                        }
                                    } else {
                                        next9 = null;
                                    }
                                }
                                p6g.w wVar9 = (p6g.w) next9;
                                p6g.z zVarF6 = wVar9 != null ? wVar9.f() : null;
                                p6g.k kVar3 = zVarF6 instanceof p6g.k ? (p6g.k) zVarF6 : null;
                                travelDocument = new TravelDocument(str3, localDate2, str11, str12, kVar3 != null ? kVar3.f233288a : null);
                            }
                            arrayList.add(new TravellerDetails(str8, str9, str10, yVar, localDate, travelDocument, null));
                            lVar = null;
                        }
                        lVar = new l(offerId, primaryContact, arrayList);
                    }
                }
                if (lVar != null) {
                    aVar3.C2(lVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
