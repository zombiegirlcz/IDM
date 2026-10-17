package pe0;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.z1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends gim.i implements Function2 {
    public q u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f235299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f235301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f235301y = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.f235301y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterator it8;
        int i;
        q qVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.f235300x;
        if (i2 == 0) {
            yhm.o.b(obj2);
            q qVar2 = this.f235301y;
            it8 = ((Iterable) qVar2.f235314h.getValue()).iterator();
            i = 0;
            qVar = qVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f235299w;
            it8 = this.v;
            qVar = this.u;
            yhm.o.b(obj2);
        }
        while (it8.hasNext()) {
            f fVar = (f) it8.next();
            z1 z1Var = qVar.f235313g;
            this.u = qVar;
            this.v = it8;
            this.f235299w = i;
            this.f235300x = 1;
            if (z1Var.emit(fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f186387a;
    }
}
