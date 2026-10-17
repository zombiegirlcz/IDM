package i23;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ do3.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f157810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f157811x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(3, continuation);
        this.f157811x = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        b bVar = new b(this.f157811x, (Continuation) obj4);
        bVar.v = (do3.n) obj2;
        bVar.f157810w = zBooleanValue;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        do3.n nVar = this.v;
        boolean z = this.f157810w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        this.v = null;
        this.f157810w = z;
        this.u = 1;
        Object objA = d.a(this.f157811x, nVar, z, this);
        return objA == aVar ? aVar : objA;
    }
}
