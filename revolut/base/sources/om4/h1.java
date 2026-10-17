package om4;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class h1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f226592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f226593y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(r1 r1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226592x = r1Var;
        this.f226593y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h1 h1Var = new h1(this.f226592x, this.f226593y, continuation, 0);
                h1Var.f226591w = obj2;
                return h1Var;
            default:
                h1 h1Var2 = new h1(this.f226592x, this.f226593y, continuation, 1);
                h1Var2.f226591w = obj2;
                return h1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        r1 r1Var = this.f226592x;
        String str = this.f226593y;
        int i2 = 4;
        int i3 = 2;
        int i5 = 1;
        int i6 = 3;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f226591w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                skm.g0[] g0VarArr = {skm.e0.g(coroutineScope, null, null, new c1(r1Var, str, continuation, i6), 3), skm.e0.g(coroutineScope, null, null, new d1(r1Var, continuation, i5), 3), skm.e0.g(coroutineScope, null, null, new c1(r1Var, str, continuation, i2), 3)};
                this.f226591w = null;
                this.v = 1;
                Object objI = skm.e0.i(g0VarArr, this);
                return objI == aVar ? aVar : objI;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f226591w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                List listK = zhm.v.k(skm.e0.g(coroutineScope2, null, null, new d1(r1Var, continuation, i3), 3), skm.e0.g(coroutineScope2, null, null, new d1(r1Var, continuation, i6), 3), skm.e0.g(coroutineScope2, null, null, new d1(r1Var, continuation, i2), 3), skm.e0.g(coroutineScope2, null, null, new c1(r1Var, str, continuation, 5), 3), skm.e0.g(coroutineScope2, null, null, new c1(r1Var, str, continuation, 6), 3), skm.e0.g(coroutineScope2, null, null, new c1(r1Var, str, continuation, 7), 3));
                this.f226591w = null;
                this.v = 1;
                Object objH = skm.e0.h(listK, this);
                return objH == aVar2 ? aVar2 : objH;
        }
    }
}
