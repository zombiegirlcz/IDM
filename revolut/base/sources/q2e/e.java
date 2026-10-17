package q2e;

import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StoreBrandDetailFlow f241572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StoreBrandDetailFlow storeBrandDetailFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241572w = storeBrandDetailFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f241572w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f241572w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StoreBrandDetailFlow storeBrandDetailFlow = this.f241572w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = storeBrandDetailFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) gVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                ((lzb.a) cVar.f88665r).b3(id10, m1c.e0.SHOPS);
                break;
            default:
                String tabId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = storeBrandDetailFlow.e3();
                Intrinsics.h(tabId);
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar2 = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) gVarE32;
                cli.y yVar = cVar2.T;
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                switch (tabId.hashCode()) {
                    case -899118594:
                        if (tabId.equals("STORE_BRAND_DETAIL_TAB_REDEEM")) {
                            cVar2.H2(yVar, new q2a.a(3));
                        }
                        break;
                    case 288862499:
                        if (tabId.equals("STORE_BRAND_DETAIL_TAB_DISCOUNT")) {
                            cVar2.H2(yVar, new q2a.a(5));
                        }
                        break;
                    case 1075767482:
                        if (tabId.equals("STORE_BRAND_DETAIL_TAB_EARN")) {
                            cVar2.H2(yVar, new q2a.a(2));
                        }
                        break;
                    case 1835825729:
                        if (tabId.equals("STORE_BRAND_DETAIL_TAB_MSI")) {
                            cVar2.H2(yVar, new q2a.a(4));
                        }
                        break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
