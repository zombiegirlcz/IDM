package j2c;

import com.revolut.data.model.Data;
import iuj.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a f170829w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f170829w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f170829w, continuation);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(1, this.f170829w, continuation);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(2, this.f170829w, continuation);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar = this.f170829w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new z(data, 22));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new is6.t(data2, aVar, 24));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new z(data3, 23));
                break;
        }
        return Unit.f186387a;
    }
}
