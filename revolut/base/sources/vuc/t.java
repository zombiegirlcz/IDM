package vuc;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a f292340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f292340w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f292340w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f292340w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((do3.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar = this.f292340w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = aVar.u;
                aVar.H2(yVar, new pud.b(data, ((f) ((j2) yVar.f22677a).getValue()).d, aVar, 24));
                break;
            default:
                do3.n nVar = (do3.n) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new vrl.n(aVar, nVar, 6));
                break;
        }
        return Unit.f186387a;
    }
}
