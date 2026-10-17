package fo1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f136740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ro1.b f136741x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, ro1.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f136740w = e0Var;
        this.f136741x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f136740w, this.f136741x, continuation, 0);
            default:
                return new d0(this.f136740w, this.f136741x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        ro1.b bVar = this.f136741x;
        e0 e0Var = this.f136740w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xn1.b bVar2 = e0Var.f136745s;
                this.v = 1;
                xn1.e eVar = (xn1.e) bVar2;
                eVar.getClass();
                xn1.d dVar = new xn1.d(eVar, bVar, null, 2);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, dVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0Var = new d0(e0Var, bVar, continuation, 0);
                this.v = 1;
                Object objB0 = u0.b0(e0Var.X(), "GOTO_BUTTON_TAG", d0Var, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
