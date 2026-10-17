package qna;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f247924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Continuation continuation, s sVar) {
        super(2, continuation);
        this.u = i;
        this.f247924w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(0, continuation, this.f247924w);
                qVar.v = ((Number) obj2).intValue();
                return qVar;
            case 1:
                return new q(1, continuation, this.f247924w);
            default:
                return new q(2, continuation, this.f247924w);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                break;
        }
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s sVar = this.f247924w;
        switch (i) {
            case 0:
                int i2 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f247932x, new l2c.l(i2, 11));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool = ((f) ((j2) sVar.f247932x.f22677a).getValue()).f247906b;
                    if (bool == null) {
                        return Unit.f186387a;
                    }
                    boolean z = !bool.booleanValue();
                    ekg.g gVar = sVar.f247929s;
                    this.v = 1;
                    Object objB = ((akg.o) gVar.f127161b).b(z, this);
                    if (objB != aVar2) {
                        objB = Unit.f186387a;
                    }
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool2 = ((f) ((j2) sVar.f247932x.f22677a).getValue()).f247905a;
                    if (bool2 == null) {
                        return Unit.f186387a;
                    }
                    boolean z3 = !bool2.booleanValue();
                    ekg.g gVar2 = sVar.f247929s;
                    this.v = 1;
                    if (gVar2.l(z3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
