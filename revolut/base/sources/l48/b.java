package l48;

import g48.r0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l2c.v;
import n38.q;
import w4l.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f192070w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192070w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f192070w, continuation, 0);
            default:
                return new b(this.f192070w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                r0 r0Var = this.f192070w.f192074a;
                q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                jhi.b bVarG = mo3.a.g(r0Var.e(kotlin.collections.d.y0(elements), w4l.i.f294643c), null, new v(9), 1);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar ? aVar : objX;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                jhi.b bVarG2 = mo3.a.g(this.f192070w.f192074a.j(null, h.f294642c), null, new v(10), 1);
                this.v = 1;
                Object objX2 = vkm.q.x(bVarG2, this);
                return objX2 == aVar2 ? aVar2 : objX2;
        }
    }
}
