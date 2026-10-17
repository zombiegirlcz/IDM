package y2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f310654w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310654w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f310654w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f310654w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f310654w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((g2e.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s sVar = this.f310654w;
        switch (i) {
            case 0:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f310658s, new a3e.s(gVar, 16));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                StoreMegaFiltersResponse storeMegaFiltersResponse = (StoreMegaFiltersResponse) data.getContent();
                if (storeMegaFiltersResponse != null) {
                    sVar.H2(sVar.f310658s, new y1.a(storeMegaFiltersResponse, 8));
                    ArrayList arrayList = storeMegaFiltersResponse.f88545a;
                    g2e.c cVar = (g2e.c) sVar.f310656q;
                    g2e.a aVarA = cVar.a();
                    List list = aVarA.f139971a;
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        String str = (String) obj3;
                        ArrayList arrayListA = g2e.d.a(aVarA);
                        if (!arrayListA.isEmpty()) {
                            Iterator it8 = arrayListA.iterator();
                            while (it8.hasNext()) {
                                if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) ((Pair) it8.next()).f186386b).f88540a, str)) {
                                }
                                break;
                            }
                        }
                        arrayList2.add(obj3);
                    }
                    if (!arrayList2.isEmpty()) {
                        for (String str2 : arrayList2) {
                            Pair pairA = u3e.e.a(str2, arrayList);
                            if (pairA != null) {
                                StoreMegaFilter storeMegaFilter = (StoreMegaFilter) pairA.f186385a;
                                cVar.b(storeMegaFilter.f88537a, str2, true);
                                cVar.d(str2, storeMegaFilter, (StoreMegaFilter.StoreMegaFilterValue) pairA.f186386b);
                            }
                        }
                    }
                }
                break;
            default:
                g2e.a aVar3 = (g2e.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f310658s, new i3e.l(aVar3, 1));
                break;
        }
        return Unit.f186387a;
    }
}
