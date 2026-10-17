package fm5;

import gm5.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public l u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f136026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f136026w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f136026w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        l lVar2 = this.f136026w;
        if (i == 0) {
            o.b(obj2);
            gm5.b bVar = lVar2.o;
            b.a.C0838b c0838b = new b.a.C0838b();
            this.u = lVar2;
            this.v = 1;
            obj2 = bVar.e3(c0838b, this);
            if (obj2 == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l lVar3 = this.u;
            o.b(obj2);
            lVar = lVar3;
        }
        return yji.l.a1(lVar, q.P((Flow) obj2, 1), null, null, new f(lVar2, null), 3);
    }
}
