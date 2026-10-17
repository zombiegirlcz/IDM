package c42;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f20987w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20987w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f20987w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f20987w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = this.f20987w;
                lVar.H2(lVar.f20992t, new byi.i(data, 20));
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                l lVar2 = this.f20987w;
                lVar2.H2(lVar2.f20992t, new a82.n(zBooleanValue, zBooleanValue2, 3));
                yji.l.a1(lVar2, lVar2.f20988p.g2(lVar2.o.f62262a), null, null, new k(lVar2, null, 0), 3);
                break;
        }
        return Unit.f186387a;
    }
}
