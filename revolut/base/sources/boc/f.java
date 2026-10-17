package boc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f17378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f17379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17378w = hVar;
        this.f17379x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f17378w, this.f17379x, continuation, 0);
            default:
                return new f(this.f17378w, this.f17379x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                String str = this.f17379x;
                h hVar = this.f17378w;
                e eVar = new e(hVar, str, null);
                this.v = 1;
                Object objY2 = hVar.Y2(this, eVar);
                return objY2 == aVar ? aVar : objY2;
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
                String str2 = this.f17379x;
                h hVar2 = this.f17378w;
                g gVar = new g(hVar2, str2, null);
                this.v = 1;
                Object objY22 = hVar2.Y2(this, gVar);
                return objY22 == aVar2 ? aVar2 : objY22;
        }
    }
}
