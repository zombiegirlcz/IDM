package aie;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.spaces.i f5251w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f5251w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f5251w, continuation);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(1, this.f5251w, continuation);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(2, this.f5251w, continuation);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = this.f5251w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iVar.H2(iVar.I, new a26.j(list, 11));
                break;
            case 1:
                List list2 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iVar.H2(iVar.I, new acb.f(iVar, list2, 22));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iVar.H2(iVar.I, new af4.t(data, 16));
                break;
        }
        return Unit.f186387a;
    }
}
