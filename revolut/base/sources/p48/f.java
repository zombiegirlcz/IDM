package p48;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o9a.v;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.close_flow.a f232844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.joint.impl.ui.close_flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f232844w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f232844w, continuation, 0);
            case 1:
                return new f(this.f232844w, continuation, 1);
            default:
                return new f(this.f232844w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.joint.impl.ui.close_flow.a aVar2 = this.f232844w;
                e eVar = new e(aVar2, null);
                this.v = 1;
                Object objF0 = ue8.c.f0(aVar2, eVar, this);
                return objF0 == aVar ? aVar : objF0;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                v vVar = new v(4);
                ku1.v vVar2 = new ku1.v(13);
                com.revolut.feature.joint.impl.ui.close_flow.a aVar4 = this.f232844w;
                f fVar = new f(aVar4, null, 0);
                this.v = 1;
                Object objV = n14.k.V(aVar4, null, vVar, vVar2, fVar, this, 1);
                return objV == aVar3 ? aVar3 : objV;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.joint.impl.ui.close_flow.a.I2(this.f232844w, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
