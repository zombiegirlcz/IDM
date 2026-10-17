package neg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n68.w;
import n68.x;
import nii.l1;
import nii.n1;
import vkm.j2;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c f214538w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214538w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f214538w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f214538w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f214538w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map mapG;
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar = this.f214538w;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) rVar.f314201a;
                zfi.a aVar2 = (zfi.a) rVar.f314202b;
                Data data2 = (Data) rVar.f314203c;
                zfi.c cVar2 = (zfi.c) data.getContent();
                if (cVar2 != null) {
                    Intrinsics.h(aVar2);
                    aim.f builder = new aim.f();
                    for (zfi.b bVar : cVar2.f321957b) {
                        if (bVar instanceof zfi.j) {
                            zfi.j jVar = (zfi.j) bVar;
                            builder.put(jVar.f321975a, d0.V0(d0.P0(jVar.f321977c.f321979b, new bm8.a(aVar2, jVar, 18)), 3));
                        } else if (bVar instanceof zfi.r) {
                            zfi.r rVar2 = (zfi.r) bVar;
                            builder.put(rVar2.f321994a, d0.V0(d0.P0(rVar2.f321996c.f321998b, new bm8.a(aVar2, rVar2, 19)), 3));
                        } else {
                            if (!(bVar instanceof zfi.g) && !(bVar instanceof zfi.o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Unit unit = Unit.f186387a;
                        }
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    mapG = builder.b();
                } else {
                    mapG = r0.g();
                }
                cVar.H2(cVar.f94039x, new w(aVar2, data2, data, mapG));
                return Unit.f186387a;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = data3.getContent() != null;
                if (((l) ((j2) cVar.f94039x.f22677a).getValue()).f214519j) {
                    Boolean bool = (Boolean) j6.a.k(Boolean.TYPE, cVar.o.f159781a.f133331b, "TRAVEL_HOTELS_HAS_SHOWN_SMART_FILTERS_INFO");
                    if (!(bool != null ? bool.booleanValue() : false) && z) {
                        oki.h.v2(cVar.f94040y, TravelHotelsFiltersScreenContract$ModalStep.SmartFiltersInfo.f94028a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        cVar.l2(new x(cVar, null, 9), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    cVar.L2();
                }
                return Unit.f186387a;
        }
    }
}
