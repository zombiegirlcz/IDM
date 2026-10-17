package do8;

import a83.p0;
import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d f116469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f116469w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f116469w, continuation);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(1, this.f116469w, continuation);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = this.f116469w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.f77293x, new t(data, 0));
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.f77293x, new p0((Data) pair.f186385a, (Data) pair.f186386b, 12));
                break;
        }
        return Unit.f186387a;
    }
}
