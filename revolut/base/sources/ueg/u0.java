package ueg;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import mx0.q9;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f279421w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u0 u0Var = new u0(0, this.f279421w, continuation);
                u0Var.v = obj2;
                return u0Var;
            case 1:
                u0 u0Var2 = new u0(1, this.f279421w, continuation);
                u0Var2.v = obj2;
                return u0Var2;
            case 2:
                u0 u0Var3 = new u0(2, this.f279421w, continuation);
                u0Var3.v = obj2;
                return u0Var3;
            case 3:
                u0 u0Var4 = new u0(3, this.f279421w, continuation);
                u0Var4.v = obj2;
                return u0Var4;
            case 4:
                u0 u0Var5 = new u0(4, this.f279421w, continuation);
                u0Var5.v = obj2;
                return u0Var5;
            case 5:
                u0 u0Var6 = new u0(5, this.f279421w, continuation);
                u0Var6.v = obj2;
                return u0Var6;
            case 6:
                u0 u0Var7 = new u0(6, this.f279421w, continuation);
                u0Var7.v = obj2;
                return u0Var7;
            case 7:
                u0 u0Var8 = new u0(7, this.f279421w, continuation);
                u0Var8.v = obj2;
                return u0Var8;
            case 8:
                u0 u0Var9 = new u0(8, this.f279421w, continuation);
                u0Var9.v = obj2;
                return u0Var9;
            case 9:
                u0 u0Var10 = new u0(9, this.f279421w, continuation);
                u0Var10.v = obj2;
                return u0Var10;
            case 10:
                u0 u0Var11 = new u0(10, this.f279421w, continuation);
                u0Var11.v = obj2;
                return u0Var11;
            default:
                u0 u0Var12 = new u0(11, this.f279421w, continuation);
                u0Var12.v = obj2;
                return u0Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u0) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u0) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((u0) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((u0) create((LocationData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((u0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((u0) create((dgi.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((u0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((u0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((u0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((u0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        List list;
        HotelsProperty hotelsProperty;
        Object next;
        vfi.a aVar;
        dgi.c cVar;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar;
        q9 q9Var;
        int i = this.u;
        int i2 = 22;
        Object[] objArr = 0;
        int i3 = 0;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = this.f279421w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new ud3.a0(data, 9));
                break;
            case 1:
                cli.y yVar = bVar2.W;
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(gVar);
                c0 c0VarE = x5d.b.e(gVar);
                List list2 = gVar.f196174a;
                lk0.e eVar = (lk0.e) zhm.d0.o0(list2);
                String str2 = (eVar == null || (aVar = (vfi.a) eVar.f196172b) == null || (cVar = aVar.f288659a) == null) ? null : cVar.f114677l;
                z = (((v) ((j2) yVar.f22677a).getValue()).u != null || str2 == null || !c0VarE.f279373a.isEmpty() || c0VarE.f279375c || c0VarE.f || c0VarE.d) ? false : true;
                if (list2.isEmpty()) {
                    str = null;
                } else {
                    String str3 = ((v) ((j2) yVar.f22677a).getValue()).f279431p;
                    if (str3 == null) {
                        lk0.e eVar2 = (lk0.e) zhm.d0.d0(list2);
                        if (eVar2 != null && (list = eVar2.f196171a) != null && (hotelsProperty = (HotelsProperty) zhm.d0.d0(list)) != null) {
                            str3 = hotelsProperty.f97981a;
                        }
                        str = null;
                    }
                    str = str3;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f186409a = ((v) ((j2) yVar.f22677a).getValue()).f279429m;
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it8 = list3.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (!((lk0.e) it8.next()).f196173c) {
                                if (ref$ObjectRef.f186409a == i0.SEARCH_AREA_BUTTON) {
                                    ref$ObjectRef.f186409a = i0.FILTERS_EXPANDED;
                                }
                            }
                        }
                    }
                }
                bVar2.f94066x.getClass();
                if (z) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    bVar2.Q2(str2, ((v) ((j2) yVar.f22677a).getValue()).f279436w, false);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    zhm.a0.x(((lk0.e) it9.next()).f196171a, arrayList);
                }
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (((HotelsProperty) next).B != null) {
                        }
                    } else {
                        next = null;
                    }
                }
                HotelsProperty hotelsProperty2 = (HotelsProperty) next;
                bVar2.H2(yVar, new sc7.b((Object) gVar, (Object) (hotelsProperty2 != null ? hotelsProperty2.B : null), str, (Serializable) ref$ObjectRef, 7));
                break;
            case 2:
                LocalDate localDate = (LocalDate) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new t5g.h(3, localDate));
                break;
            case 3:
                LocalDate localDate2 = (LocalDate) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new t5g.h(4, localDate2));
                break;
            case 4:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar3 = this.f279421w;
                cli.y yVar2 = bVar3.W;
                LocationData locationData = (LocationData) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.f186407a = true;
                LocationMapBoundaries locationMapBoundaries = locationData instanceof LocationMapBoundaries ? (LocationMapBoundaries) locationData : null;
                if (locationMapBoundaries != null && (q9Var = bVar3.K) != null) {
                    GmsLatLngBounds gmsLatLngBounds = q9Var.f209962a;
                    if (Intrinsics.f(locationMapBoundaries.f98132b, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b.J2(bVar3, gmsLatLngBounds.b())) && Intrinsics.f(locationMapBoundaries.f98133c, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b.J2(bVar3, gmsLatLngBounds.c()))) {
                        z = false;
                    }
                    ref$BooleanRef.f186407a = z;
                }
                LocationData locationData2 = ((v) ((j2) yVar2.f22677a).getValue()).k;
                Intrinsics.h(locationData);
                ffi.a aVarV = locationData2 != null ? ta6.a.v(locationData2) : null;
                ffi.a aVarV2 = ta6.a.v(locationData);
                if (locationData2 == null || aVarV != aVarV2) {
                    a2 a2Var = bVar3.O;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    bVar3.H2(yVar2, new ud3.m(27));
                    vkm.d dVarB = rd0.e.b(bVar3.f94063s.i(aVarV2));
                    u0 u0Var = new u0(i3, bVar3, objArr == true ? 1 : 0);
                    bVar = bVar3;
                    bVar.O = yji.l.a1(bVar, dVarB, null, null, u0Var, 3);
                } else {
                    bVar = bVar3;
                }
                bVar.H2(yVar2, new u69.g(locationData, ref$BooleanRef, i2));
                break;
            case 5:
                List list4 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new s78.n(list4, 24));
                break;
            case 6:
                dgi.c cVar2 = (dgi.c) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar3 = bVar2.W;
                bVar2.M = -1;
                Intrinsics.h(cVar2);
                if (!(bVar2.T == null ? false : !r3.equals(dgi.c.a(cVar2, null, null, null, null, null, null, null, false, r3.i, null, null, null, null, 16646143))) || (((v) ((j2) yVar3.f22677a).getValue()).f279435t == h0.LOADING && cVar2.f114677l != null)) {
                    z = false;
                }
                if (z) {
                    bVar2.S++;
                    a2 a2Var2 = bVar2.R;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    bVar2.R = null;
                    bVar2.T = null;
                    bVar2.Q = null;
                    bVar2.H2(yVar3, new p0(3));
                    bVar2.L2();
                }
                break;
            case 7:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new djc.z(22, iVar));
                break;
            case 8:
                Data data2 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new ud3.a0(data2, 10));
                break;
            case 9:
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new ud3.a0(data3, 11));
                break;
            case 10:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar2.H2(bVar2.W, new toh.h((zfi.a) rVar.f314203c, 18, (Data) rVar.f314201a, (Data) rVar.f314202b));
                break;
            default:
                String str4 = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(str4);
                bVar2.O2(str4);
                break;
        }
        return Unit.f186387a;
    }
}
