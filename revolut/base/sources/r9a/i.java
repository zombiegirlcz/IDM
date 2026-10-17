package r9a;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n8a.q;
import n8a.r;
import n8a.s;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f252552w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252552w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f252552w, continuation, 0);
            default:
                return new i(this.f252552w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f252552w;
        switch (i) {
            case 0:
                y yVar = kVar.f252556r;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ryc.a aVar2 = kVar.f252555q;
                    String str = kVar.f252554p.f80600a;
                    dj0.d dVar = ((d) ((j2) yVar.f22677a).getValue()).f252545b;
                    this.v = 1;
                    s sVar = (s) aVar2.f258289a;
                    sVar.getClass();
                    r rVar = new r(sVar, str, dVar, null, 1);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, rVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.C2(new e(((d) ((j2) yVar.f22677a).getValue()).f252545b));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    ryc.a aVar4 = kVar.f252555q;
                    String str2 = kVar.f252554p.f80600a;
                    this.v = 1;
                    s sVar2 = (s) aVar4.f258289a;
                    sVar2.getClass();
                    q qVar = new q(sVar2, str2, null, 3);
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, qVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.C2(f.f252548a);
                return Unit.f186387a;
        }
    }
}
