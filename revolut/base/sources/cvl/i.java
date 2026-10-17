package cvl;

import cul.n2;
import cul.r1;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.pocket_picker.b f109487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.trading.orders.ui.screens.pocket_picker.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109487w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f109487w, continuation, 0);
            case 1:
                return new i(this.f109487w, continuation, 1);
            default:
                return new i(this.f109487w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = this.f109487w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(bVar.getState().B(new n2(25)), null, new r1(10), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Set set = (Set) obj2;
                xi0.b bVar2 = ((l) ((j2) bVar.getState().f22677a).getValue()).f109489a;
                if (bVar2 != null && !set.contains(bVar2)) {
                    bVar.H2(bVar.getState(), new a94.q(17, bVar2));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar3 = this.f109487w;
                a54.g gVar = new a54.g(bVar3, null, 11);
                this.v = 1;
                Object objB = pu7.a.B(bVar3.k, "onBackClick", gVar, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar4 = this.f109487w;
                com.revolut.trading.orders.ui.screens.pocket_picker.a aVar4 = new com.revolut.trading.orders.ui.screens.pocket_picker.a(bVar4, null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar4.k, "showCurrencyPicker", aVar4, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
