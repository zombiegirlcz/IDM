package g48;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f140408w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140408w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f140408w, continuation, 0);
            case 1:
                return new s(this.f140408w, continuation, 1);
            default:
                return new s(this.f140408w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                r0 r0Var = this.f140408w.f140417a;
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
                w4l.h hVar = w4l.h.f294642c;
                r rVar = new r(mo3.a.g(u0.m(r0Var.j(null, hVar), r0Var.h(hVar)), null, new g3e.s(7), 1), 0);
                this.v = 1;
                Object objX = vkm.q.x(rVar, this);
                return objX == aVar ? aVar : objX;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jhi.b bVarG = mo3.a.g(this.f140408w.f140417a.h(w4l.i.f294643c), null, new g3e.s(8), 1);
                this.v = 1;
                Object objX2 = vkm.q.x(bVarG, this);
                return objX2 == aVar2 ? aVar2 : objX2;
            default:
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
                r0 r0Var2 = this.f140408w.f140417a;
                n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                jhi.b bVarG2 = mo3.a.g(r0Var2.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), null, new g3e.s(13), 1);
                this.v = 1;
                Object objX3 = vkm.q.x(bVarG2, this);
                return objX3 == aVar3 ? aVar3 : objX3;
        }
    }
}
