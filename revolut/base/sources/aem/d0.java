package aem;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class d0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public Throwable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Throwable f3708y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(List list, int i, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.z = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        fem.b bVar = (fem.b) obj2;
        Throwable th10 = (Throwable) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.z, 0, continuation);
                d0Var.f3707x = bVar;
                d0Var.f3708y = th10;
                return d0Var.invokeSuspend(Unit.f186387a);
            default:
                d0 d0Var2 = new d0(this.z, 1, continuation);
                d0Var2.f3707x = bVar;
                d0Var2.f3708y = th10;
                return d0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fem.b bVar = (fem.b) this.f3707x;
                Throwable th10 = this.f3708y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f3706w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th11 = this.v;
                    yhm.o.b(obj2);
                    return th11;
                }
                yhm.o.b(obj2);
                Throwable thA = iem.a.a(th10);
                this.f3707x = null;
                this.f3708y = null;
                this.v = thA;
                this.f3706w = 1;
                return h0.a(this.z, thA, bVar, this) == aVar ? aVar : thA;
            default:
                fem.b bVar2 = (fem.b) this.f3707x;
                Throwable th12 = this.f3708y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f3706w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th13 = this.v;
                    yhm.o.b(obj2);
                    return th13;
                }
                yhm.o.b(obj2);
                Throwable thA2 = iem.a.a(th12);
                this.f3707x = null;
                this.f3708y = null;
                this.v = thA2;
                this.f3706w = 1;
                return h0.a(this.z, thA2, bVar2, this) == aVar2 ? aVar2 : thA2;
        }
    }
}
