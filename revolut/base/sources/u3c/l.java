package u3c;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import u3c.f;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function1 {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f276908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f276909x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Continuation continuation) {
        super(1, continuation);
        this.f276909x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f276909x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        Iterator it8;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.f276908w;
        o oVar = this.f276909x;
        if (i2 == 0) {
            yhm.o.b(obj2);
            i = 0;
            it8 = oVar.f276918t.entrySet().iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.v;
            it8 = this.u;
            yhm.o.b(obj2);
        }
        while (it8.hasNext()) {
            Job job2 = (Job) ((Map.Entry) it8.next()).getValue();
            this.u = it8;
            this.v = i;
            this.f276908w = 1;
            if (job2.u(this) == aVar) {
                return aVar;
            }
        }
        oVar.C2(f.a.f276898a);
        return Unit.f186387a;
    }
}
