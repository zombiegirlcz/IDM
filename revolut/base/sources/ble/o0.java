package ble;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.i implements oim.n {
    public /* synthetic */ Boolean u;
    public /* synthetic */ Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f16585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16586x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(4, continuation);
        this.f16586x = fVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        o0 o0Var = new o0(this.f16586x, (Continuation) obj5);
        o0Var.u = (Boolean) obj2;
        o0Var.v = (Boolean) obj3;
        o0Var.f16585w = zBooleanValue;
        return o0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Boolean bool = this.u;
        Boolean bool2 = this.v;
        boolean z = this.f16585w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.f16586x;
        fVar.H2(fVar.f89873e0, new a09.z(bool, z, bool2, 8));
        return Unit.f186387a;
    }
}
