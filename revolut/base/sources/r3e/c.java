package r3e;

import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StoreSearchScreen f251280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StoreSearchScreen storeSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251280w = storeSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f251280w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f251280w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StoreSearchScreen storeSearchScreen = this.f251280w;
        switch (i) {
            case 0:
                String searchQuery = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = storeSearchScreen.e3();
                Intrinsics.h(searchQuery);
                com.revolut.feature.store.impl.ui.search.a aVar2 = (com.revolut.feature.store.impl.ui.search.a) kVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                j2 j2Var = aVar2.f88738s;
                j2Var.getClass();
                j2Var.g(null, searchQuery);
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.store.impl.ui.search.a aVar4 = (com.revolut.feature.store.impl.ui.search.a) storeSearchScreen.e3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                aVar4.f88737r.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
