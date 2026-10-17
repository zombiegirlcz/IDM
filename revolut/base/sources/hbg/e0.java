package hbg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import skm.a2;
import vkm.j2;
import vkm.q0;
import vkm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b f150697w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150697w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f150697w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f150697w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(this.f150697w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0(this.f150697w, continuation, 3);
                e0Var4.v = obj2;
                return e0Var4;
            case 4:
                e0 e0Var5 = new e0(this.f150697w, continuation, 4);
                e0Var5.v = obj2;
                return e0Var5;
            case 5:
                e0 e0Var6 = new e0(this.f150697w, continuation, 5);
                e0Var6.v = obj2;
                return e0Var6;
            default:
                e0 e0Var7 = new e0(this.f150697w, continuation, 6);
                e0Var7.v = obj2;
                return e0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((TravelHotelsBookingAmendmentStatus) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarW;
        rei.g gVar;
        rei.c cVar;
        a2 a2Var;
        HotelsPropertyBookingRequestStatus hotelsPropertyBookingRequestStatus;
        int i = this.u;
        int i2 = 8;
        int i3 = 7;
        int i5 = 3;
        Continuation continuation = null;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = this.f150697w;
        int i6 = 1;
        int i21 = 6;
        switch (i) {
            case 0:
                TravelHotelsBookingAmendmentStatus travelHotelsBookingAmendmentStatus = (TravelHotelsBookingAmendmentStatus) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i22 = d0.f150695a[travelHotelsBookingAmendmentStatus.f97875c.ordinal()];
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar2 = this.f150697w;
                if (i22 == 1) {
                    bVar2.n2(new z(bVar2, continuation, i5), new whi.b(6));
                } else if (i22 != 2) {
                    Unit unit = Unit.f186387a;
                } else {
                    m0 m0Var = bVar2.f93856y;
                    k0 k0Var = k0.AMENDMENT;
                    m0Var.getClass();
                    yji.l.a1(bVar2, bVar2.X1(new y0(null, m0.a(k0Var), false, 5)), null, null, null, 7);
                }
                qei.m mVar = travelHotelsBookingAmendmentStatus.f97875c;
                if (mVar == qei.m.CONFIRMED || mVar == qei.m.FAILED) {
                    bVar2.l2(new z(bVar2, continuation, 4), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar3 = this.f150697w;
                cli.y yVar = bVar3.P;
                if (((l) ((j2) yVar.f22677a).getValue()).i && (gVar = (rei.g) data.getContent()) != null && (cVar = gVar.o) != null && cVar.f253598b == qei.m.PENDING && ((a2Var = bVar3.N) == null || !a2Var.d())) {
                    bVar3.H2(yVar, new hb4.k(8));
                    i9g.h hVar = bVar3.K;
                    qei.n params = new qei.n(gVar.f253604a, cVar.f253597a);
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    fag.o oVar = hVar.f159796a;
                    Intrinsics.checkNotNullParameter(params, "params");
                    bVar3.N = yji.l.a1(bVar3, new q0(vkm.q.q(new v1(new fag.n(oVar, params, null))), new dmf.b(hVar, params, null), 1), null, null, null, 7);
                }
                bVar3.H2(yVar, new h1k.k(data, 22));
                rei.g gVar2 = (rei.g) data.getContent();
                if (gVar2 != null) {
                    ArrayList arrayList = gVar2.f253611m;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((rei.p) it8.next()).d);
                    }
                    Set setI1 = zhm.d0.i1(arrayList2);
                    a2 a2Var2 = bVar3.R;
                    if (a2Var2 == null || !a2Var2.d() || !Intrinsics.f(bVar3.O, setI1)) {
                        bVar3.O = setI1;
                        a2 a2Var3 = bVar3.R;
                        if (a2Var3 != null) {
                            a2Var3.f(null);
                        }
                        if (((i9g.v) bVar3.f93850q).b()) {
                            efm.r rVarO2 = bVar3.O2(gVar2);
                            nyb.m0 m0Var2 = bVar3.f93851r;
                            f1 f1Var = f1.STAYS;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                rei.p pVar = (rei.p) obj3;
                                if (pVar.f253629b == rei.n.LOYALTY && pVar.f253630c == rei.m.LOYALTY_ORIGIN_ID) {
                                    arrayList3.add(obj3);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it9 = arrayList3.iterator();
                            while (it9.hasNext()) {
                                arrayList4.add(((rei.p) it9.next()).d);
                            }
                            rVarW = nim.a.w(kli.a.h(rVarO2, nim.a.w(m0Var2.c(new RevPointsTransactionPageParams(0, null, null, null, f1Var, null, null, zhm.d0.F0(bVar3.o.f93646a, arrayList4), null, 367)), new hb4.k(11))), new hb4.k(6));
                        } else {
                            rVarW = nim.a.w(bVar3.O2(gVar2), new hb4.k(7));
                        }
                        bVar3.R = yji.l.a1(bVar3, rd0.e.b(rVarW), null, null, new e0(bVar3, continuation, i21), 3);
                    }
                }
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar4 = this.f150697w;
                cli.y yVar2 = bVar4.P;
                Intrinsics.h(data2);
                HotelsPropertyBookingRequestStatus hotelsPropertyBookingRequestStatus2 = (HotelsPropertyBookingRequestStatus) data2.getContent();
                if (hotelsPropertyBookingRequestStatus2 != null) {
                    int i32 = x.f150724a[hotelsPropertyBookingRequestStatus2.f97888b.ordinal()];
                    if (i32 == 1 || i32 == 2 || i32 == 3) {
                        bVar4.l2(new z(bVar4, continuation, i3), new yi5.b(26));
                    }
                }
                m0 m0Var3 = bVar4.f93856y;
                if (bVar4.o.f93647b && !((l) ((j2) yVar2.f22677a).getValue()).f150706g && (hotelsPropertyBookingRequestStatus = (HotelsPropertyBookingRequestStatus) data2.getContent()) != null) {
                    int i33 = x.f150724a[hotelsPropertyBookingRequestStatus.f97888b.ordinal()];
                    if (i33 == 1) {
                        bVar4.n2(new z(bVar4, continuation, i2), new whi.b(6));
                    } else if (i33 == 2) {
                        k0 k0Var2 = k0.CREATION;
                        m0Var3.getClass();
                        yji.l.a1(bVar4, bVar4.X1(new y0(null, m0.a(k0Var2), false, 5)), null, null, null, 7);
                        bVar4.H2(yVar2, new hb4.k(9));
                    } else if (i33 == 3) {
                        m0Var3.getClass();
                        yji.l.a1(bVar4, bVar4.X1(new y0(null, new nii.l0(new TextLocalisedClause(R$string.hotels_booking_details_partially_completed_title, null, null, 14), null, null, new TextLocalisedClause(R$string.hotels_common_action_learn_more, null, null, 14), null, null, false, null, 1014), false, 5)), null, null, new b0(bVar4, continuation, i6), 3);
                        bVar4.H2(yVar2, new hb4.k(10));
                    }
                }
                bVar4.H2(yVar2, new h1k.k(data2, 23));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.P, new h1k.k(data3, 24));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.P, new h1k.k(data4, 25));
                return Unit.f186387a;
            case 5:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof m1) {
                    bVar.n2(new y(bVar, null), new whi.b(6));
                } else if (n1Var instanceof l1) {
                    bVar.s1();
                } else if (!(n1Var instanceof k1) && !(n1Var instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.P, new h1k.k(data5, 26));
                return Unit.f186387a;
        }
    }
}
