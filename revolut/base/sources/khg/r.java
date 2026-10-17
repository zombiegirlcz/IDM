package khg;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import hfg.c0;
import hfg.e0;
import hfg.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a f184138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f184138w = aVar;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f184138w, this.v, continuation);
            default:
                r rVar = new r(this.f184138w, continuation);
                rVar.v = obj2;
                return rVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c0 c0Var;
        c0 c0Var2;
        Data data;
        TravelMilesProvider travelMilesProvider;
        Object next;
        int i = this.u;
        String str = null;
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar = this.f184138w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var = (g0) ((h) ((j2) aVar.f94305t.f22677a).getValue()).f184122a.getContent();
                ArrayList arrayList = g0Var != null ? g0Var.f151839a.f151816b : null;
                TravelMilesProvider travelMilesProvider2 = ((iig.a) this.v).f161612a;
                String str2 = (arrayList == null || (c0Var2 = (c0) d0.M0(arrayList)) == null) ? null : c0Var2.f151809a;
                if (arrayList != null && (c0Var = (c0) d0.M0(arrayList)) != null) {
                    str = c0Var.f151811c;
                }
                aVar.C2(new k(travelMilesProvider2, str2, str));
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) pair.f186385a;
                Data data3 = (Data) pair.f186386b;
                if (data2.getLoading() || data3.getLoading()) {
                    data = new Data(null, null, true, 3, null);
                } else {
                    Data dataT = t1.t(data2, data3);
                    try {
                        Object content = dataT.getContent();
                        if (content != null) {
                            Pair pair2 = (Pair) content;
                            g0 g0Var2 = (g0) pair2.f186385a;
                            Iterator it8 = ((List) pair2.f186386b).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((TravelMilesProvider) next).f94103a, g0Var2.f151840b)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            travelMilesProvider = (TravelMilesProvider) next;
                            if (travelMilesProvider == null) {
                                throw new IllegalStateException("Can't find Miles Provider for id: " + g0Var2.f151840b);
                            }
                        } else {
                            travelMilesProvider = null;
                        }
                        data = new Data(travelMilesProvider, dataT.getError(), dataT.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, dataT.getLoading());
                    }
                }
                Throwable error = data2.getError();
                if (error == null) {
                    error = data.getError();
                }
                if (error != null) {
                    aVar.X1(aVar.f94302q.a(error));
                }
                EnumEntries enumEntriesA = e0.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : enumEntriesA) {
                    if (aVar.o.d.contains(((e0) obj3).name())) {
                        arrayList2.add(obj3);
                    }
                }
                aVar.H2(aVar.f94305t, new s(data2, 0, data, arrayList2));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f184138w = aVar;
    }
}
