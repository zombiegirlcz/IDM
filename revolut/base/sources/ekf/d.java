package ekf;

import java.io.Serializable;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements oim.q {
    public /* synthetic */ j1 A;
    public final /* synthetic */ f B;
    public int u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ t3 f127058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ do3.n f127059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f127060y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(7, continuation);
        this.B = fVar;
    }

    @Override // oim.q
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        d dVar = new d(this.B, (Continuation) obj8);
        dVar.v = (a3) obj2;
        dVar.f127058w = (t3) obj3;
        dVar.f127059x = (do3.n) obj4;
        dVar.f127060y = zBooleanValue;
        dVar.z = zBooleanValue2;
        dVar.A = (j1) obj7;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 a3Var = this.v;
        t3 t3Var = this.f127058w;
        do3.n nVar = this.f127059x;
        boolean z = this.f127060y;
        boolean z3 = this.z;
        j1 j1Var = this.A;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        fkf.i iVar = this.B.f127073r;
        fkf.f fVar = new fkf.f(a3Var, t3Var, nVar, z, z3, j1Var);
        this.v = null;
        this.f127058w = null;
        this.f127059x = null;
        this.A = null;
        this.f127060y = z;
        this.z = z3;
        this.u = 1;
        Serializable serializableA = iVar.a(fVar, this);
        return serializableA == aVar ? aVar : serializableA;
    }
}
