package sx2;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.i implements oim.s {
    public /* synthetic */ boolean A;
    public /* synthetic */ boolean B;
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f266344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f266345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Data f266346y;
    public /* synthetic */ bla.c z;

    public x(Continuation continuation) {
        super(9, continuation);
    }

    @Override // oim.s
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        boolean zBooleanValue = ((Boolean) obj8).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
        x xVar = new x((Continuation) obj10);
        xVar.u = (Data) obj2;
        xVar.v = (Data) obj3;
        xVar.f266344w = (Data) obj4;
        xVar.f266345x = (Data) obj5;
        xVar.f266346y = (Data) obj6;
        xVar.z = (bla.c) obj7;
        xVar.A = zBooleanValue;
        xVar.B = zBooleanValue2;
        return xVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        Data data2 = this.v;
        Data data3 = this.f266344w;
        Data data4 = this.f266345x;
        Data data5 = this.f266346y;
        bla.c cVar = this.z;
        boolean z = this.A;
        boolean z3 = this.B;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new vf0.g(data, data2, data3, data4, data5, cVar, Boolean.valueOf(z), Boolean.valueOf(z3));
    }
}
