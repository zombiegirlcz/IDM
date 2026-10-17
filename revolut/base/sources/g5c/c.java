package g5c;

import bjl.q0;
import ds4.y;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import xjl.m;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f140740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140740w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f140740w, continuation, 0);
            default:
                return new c(this.f140740w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        int i = this.u;
        boolean z = false;
        f fVar = this.f140740w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    q0 q0Var = fVar.e;
                    this.v = 1;
                    obj2 = ((m) q0Var).a(cjl.e.f24710a, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                cjl.d dVar = obj2 instanceof cjl.d ? (cjl.d) obj2 : null;
                return (dVar == null || (str = dVar.f24709a) == null) ? "" : str;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    e5c.a aVar3 = fVar.f140746c;
                    this.v = 1;
                    aVar3.getClass();
                    y yVar = new y(aVar3, z ? 1 : 0, 23);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, yVar, this);
                    Object obj3 = objJ;
                    if (objJ != aVar2) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 == aVar2) {
                        return aVar2;
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
