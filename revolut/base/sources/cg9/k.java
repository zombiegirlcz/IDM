package cg9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f23877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f23878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f23877w = nVar;
        this.f23878x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f23877w, this.f23878x, continuation, 0);
            default:
                return new k(this.f23877w, this.f23878x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f23878x;
        n nVar = this.f23877w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wo1.b bVar = nVar.o;
                    this.v = 1;
                    rp1.b bVar2 = new rp1.b(((vp1.c) bVar).f291042a, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar2, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    k kVar = new k(nVar, str, continuation, 0);
                    this.v = 1;
                    if (u0.b0(nVar.X(), "CANCEL_BUTTON_LOADING_TAG", kVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
