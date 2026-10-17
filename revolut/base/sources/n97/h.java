package n97;

import i97.l;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f213594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f213595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Class f213596y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, String str, Class cls, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213594w = kVar;
        this.f213595x = str;
        this.f213596y = cls;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f213594w, this.f213595x, this.f213596y, continuation, 0);
            default:
                return new h(this.f213594w, this.f213595x, this.f213596y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
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
                l lVar = this.f213594w.f213602b;
                this.v = 1;
                Object objG = lVar.g(this, this.f213596y, this.f213595x);
                return objG == aVar ? aVar : objG;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        l lVar2 = this.f213594w.f213602b;
                        String str = this.f213595x;
                        Class cls = this.f213596y;
                        this.v = 1;
                        obj2 = lVar2.g(this, cls, str);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return (a97.f) obj2;
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    return null;
                }
        }
    }
}
