package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f171541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f171542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c84.p f171543y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c84.p pVar, PluginPayload pluginPayload, r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f171541w = r0Var;
        this.f171543y = pVar;
        this.f171542x = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0(this.f171541w, this.f171542x, this.f171543y, continuation, 0);
            case 1:
                return new p0(this.f171541w, this.f171542x, this.f171543y, continuation, 1);
            case 2:
                return new p0(this.f171543y, this.f171542x, this.f171541w, continuation);
            case 3:
                return new p0(this.f171541w, this.f171542x, this.f171543y, continuation, 3);
            default:
                return new p0(this.f171541w, this.f171542x, this.f171543y, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r0 r0Var = this.f171541w;
                o0 o0Var = new o0(r0Var, this.f171542x, this.f171543y, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(r0Var.e, "navigate to cancellation", o0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var2 = this.f171541w;
                    o0 o0Var2 = new o0(r0Var2, this.f171542x, this.f171543y, null, 2);
                    this.v = 1;
                    if (r0Var2.Y2(this, o0Var2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PluginPayload pluginPayload = this.f171542x;
                c84.p pVar = this.f171543y;
                r0 r0Var3 = this.f171541w;
                q0 q0Var = new q0(pVar, pluginPayload, r0Var3, null);
                this.v = 1;
                Object objY2 = r0Var3.Y2(this, q0Var);
                return objY2 == aVar3 ? aVar3 : objY2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var4 = this.f171541w;
                    o0 o0Var3 = new o0(r0Var4, this.f171542x, this.f171543y, null, 3);
                    this.v = 1;
                    if (r0Var4.Y2(this, o0Var3) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var5 = this.f171541w;
                    o0 o0Var4 = new o0(r0Var5, this.f171542x, this.f171543y, null, 4);
                    this.v = 1;
                    if (r0Var5.Y2(this, o0Var4) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(r0 r0Var, PluginPayload pluginPayload, c84.p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171541w = r0Var;
        this.f171542x = pluginPayload;
        this.f171543y = pVar;
    }
}
