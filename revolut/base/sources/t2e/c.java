package t2e;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StoreBrandDetailEarnScreen f267543w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StoreBrandDetailEarnScreen storeBrandDetailEarnScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267543w = storeBrandDetailEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f267543w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f267543w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f267543w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = this.f267543w;
        switch (i) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = storeBrandDetailEarnScreen.d();
                String tabId = g6Var.f54199a;
                com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a aVar2 = (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) kVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                Iterator<E> it8 = f.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((f) next).name(), tabId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                f fVar = (f) next;
                if (fVar == null) {
                    fVar = f.NONE;
                }
                aVar2.H2(aVar2.u, new sx8.a(fVar, 14));
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = storeBrandDetailEarnScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a aVar4 = (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) kVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                aVar4.C2(new i(clickData));
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a aVar6 = (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) storeBrandDetailEarnScreen.d();
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                aVar6.f88681s.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
