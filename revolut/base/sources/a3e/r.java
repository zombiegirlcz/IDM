package a3e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreDealsComponent;
import com.revolut.feature.store.api.model.StoreDealsLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f1117w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1117w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f1117w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f1117w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        t tVar = this.f1117w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.u, new a07.l(data, 5));
                StoreDealsLayout storeDealsLayout = (StoreDealsLayout) data.getContent();
                c3e.c cVar = tVar.f1121q;
                if (storeDealsLayout != null) {
                    ArrayList arrayList = storeDealsLayout.f88485a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (obj3 instanceof StoreDealsComponent.DiscoverMore) {
                            arrayList2.add(obj3);
                        }
                    }
                    StoreDealsComponent.DiscoverMore discoverMore = (StoreDealsComponent.DiscoverMore) d0.d0(arrayList2);
                    if (discoverMore != null && (str = discoverMore.f88471a) != null && !Intrinsics.f(cVar.f20941c, str)) {
                        cVar.f20940b.onNext(new lk0.g(f0.f322471a));
                        Continuation continuation = null;
                        cVar.f20941c = null;
                        a2 a2Var = tVar.f1126x;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        tVar.f1126x = tVar.l2(new p(tVar, str, continuation, 1), new yi5.b(26));
                    }
                }
                break;
            default:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.u, new s(gVar, 0));
                break;
        }
        return Unit.f186387a;
    }
}
