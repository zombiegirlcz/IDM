package y5b;

import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f311034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f311035x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, Map map, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311034w = jVar;
        this.f311035x = map;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f311034w, this.f311035x, continuation, 0);
            default:
                return new e(this.f311034w, this.f311035x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j jVar = this.f311034w;
                    d dVar = new d(jVar, this.f311035x, null, 0);
                    y4b.b bVar = new y4b.b(18);
                    this.v = 1;
                    if (j.a(jVar, dVar, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
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
                j jVar2 = this.f311034w;
                d dVar2 = new d(jVar2, this.f311035x, null, 1);
                y4b.b bVar2 = new y4b.b(19);
                this.v = 1;
                Object objA = j.a(jVar2, dVar2, bVar2, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
