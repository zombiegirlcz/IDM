package fg8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f134940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f134941x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134940w = mVar;
        this.f134941x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f134940w, this.f134941x, continuation, 0);
            case 1:
                return new k(this.f134940w, this.f134941x, continuation, 1);
            default:
                return new k(this.f134940w, this.f134941x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                te8.r rVar = this.f134940w.u;
                this.v = 1;
                Object objA = te8.r.a(rVar, this.f134941x, this);
                return objA == aVar ? aVar : objA;
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
                te8.v vVar = this.f134940w.v;
                this.v = 1;
                String str = this.f134941x;
                Object objX = vkm.q.x(mo3.a.e(vVar.b(str, null, w4l.h.f294642c), new f28.b0(str, 22), new tc6.b(13)), this);
                return objX == aVar2 ? aVar2 : objX;
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
                te8.r rVar2 = this.f134940w.u;
                this.v = 1;
                Object objA2 = te8.r.a(rVar2, this.f134941x, this);
                return objA2 == aVar3 ? aVar3 : objA2;
        }
    }
}
