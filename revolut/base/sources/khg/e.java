package khg;

import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreen;
import hfg.f0;
import hfg.g0;
import ip0.y;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchResultDetailsScreen f184121w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelMilesFlightSearchResultDetailsScreen travelMilesFlightSearchResultDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184121w = travelMilesFlightSearchResultDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f184121w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f184121w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f184121w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = null;
        final f0 f0Var = null;
        Object obj4 = null;
        final f0 f0Var2 = null;
        TravelMilesFlightSearchResultDetailsScreen travelMilesFlightSearchResultDetailsScreen = this.f184121w;
        switch (i) {
            case 0:
                y clickData = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = travelMilesFlightSearchResultDetailsScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a) nVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.f167226b.f58324n;
                if (obj5 instanceof iig.j) {
                    String str = ((iig.j) obj5).f161617a;
                    g0 g0Var = (g0) ((h) ((j2) aVar2.f94305t.f22677a).getValue()).f184122a.getContent();
                    aVar2.I2(str, g0Var != null ? g0Var.f151839a.f151816b : null);
                } else if (obj5 instanceof iig.a) {
                    aVar2.l2(new r(aVar2, obj5, null), new yi5.b(26));
                }
                break;
            case 1:
                ai model = (ai) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = travelMilesFlightSearchResultDetailsScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a) nVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                cli.y yVar = aVar4.f94305t;
                g0 g0Var2 = (g0) ((h) ((j2) yVar.f22677a).getValue()).f184122a.getContent();
                if (g0Var2 != null) {
                    Iterator it8 = g0Var2.d.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (Intrinsics.f(((f0) next).f151833a.name(), model.f53687a)) {
                                obj4 = next;
                            }
                        }
                    }
                    f0Var2 = (f0) obj4;
                }
                if (f0Var2 != null) {
                    final int i2 = 1;
                    aVar4.H2(yVar, new Function1() { // from class: khg.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i2) {
                                case 0:
                                    h update = (h) obj6;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return h.a(update, null, null, f0Var2, null, 11);
                                default:
                                    h update2 = (h) obj6;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return h.a(update2, null, null, f0Var2, null, 11);
                            }
                        }
                    });
                }
                break;
            default:
                koi.j item = (koi.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE33 = travelMilesFlightSearchResultDetailsScreen.d();
                Intrinsics.h(item);
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar6 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a) nVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                cli.y yVar2 = aVar6.f94305t;
                g0 g0Var3 = (g0) ((h) ((j2) yVar2.f22677a).getValue()).f184122a.getContent();
                if (g0Var3 != null) {
                    Iterator it9 = g0Var3.d.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next2 = it9.next();
                            if (Intrinsics.f(((f0) next2).f151833a.name(), item.getF52550a())) {
                                obj3 = next2;
                            }
                        }
                    }
                    f0Var = (f0) obj3;
                }
                if (f0Var != null) {
                    final int i3 = 0;
                    aVar6.H2(yVar2, new Function1() { // from class: khg.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    h update = (h) obj6;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return h.a(update, null, null, f0Var, null, 11);
                                default:
                                    h update2 = (h) obj6;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return h.a(update2, null, null, f0Var, null, 11);
                            }
                        }
                    });
                }
                break;
        }
        return Unit.f186387a;
    }
}
