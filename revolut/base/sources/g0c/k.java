package g0c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f139431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f139432x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.u;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        Continuation continuation = (Continuation) obj5;
        switch (i) {
            case 0:
                k kVar = new k(4, 0, continuation);
                kVar.v = zBooleanValue;
                kVar.f139431w = zBooleanValue2;
                kVar.f139432x = zBooleanValue3;
                return kVar.invokeSuspend(Unit.f186387a);
            default:
                k kVar2 = new k(4, 1, continuation);
                kVar2.v = zBooleanValue;
                kVar2.f139431w = zBooleanValue2;
                kVar2.f139432x = zBooleanValue3;
                return kVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                boolean z = this.v;
                boolean z3 = this.f139431w;
                boolean z4 = this.f139432x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(z && z3 && z4);
            default:
                boolean z6 = this.v;
                boolean z11 = this.f139431w;
                boolean z12 = this.f139432x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z6 && !z11 && !z12) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
