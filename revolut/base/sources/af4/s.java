package af4;

import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f3875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f3875w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f3875w, continuation, 0);
            case 1:
                return new s(this.f3875w, continuation, 1);
            default:
                return new s(this.f3875w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        u uVar = this.f3875w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                qx3.a aVar2 = uVar.f3878p;
                h1 h1VarF = w0.F(uVar.o.f68059a);
                this.v = 1;
                u34.b bVar = aVar2.f250014a;
                bVar.getClass();
                u34.a aVar3 = new u34.a(bVar, h1VarF, continuation, i2);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, aVar3, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                qx3.a aVar5 = uVar.f3878p;
                h1 h1VarF2 = w0.F(uVar.o.f68059a);
                this.v = 1;
                u34.b bVar2 = aVar5.f250014a;
                bVar2.getClass();
                u34.a aVar6 = new u34.a(bVar2, h1VarF2, continuation, 0);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, aVar6, this);
                return objJ2 == aVar4 ? aVar4 : objJ2;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(uVar, continuation, i2);
                    this.v = 1;
                    obj2 = uVar.p2(this, sVar);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                uVar.C2(new n((it3.d) obj2));
                return Unit.f186387a;
        }
    }
}
