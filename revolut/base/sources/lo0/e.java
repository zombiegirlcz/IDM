package lo0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import ho.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import uo.o0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f197331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0 f197332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f197333y;
    public final /* synthetic */ AnalyticsProduct z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Object obj2, o0 o0Var, String str, AnalyticsProduct analyticsProduct, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f197331w = obj2;
        this.f197332x = o0Var;
        this.f197333y = str;
        this.z = analyticsProduct;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f197331w, this.f197332x, this.f197333y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o0 o0Var = this.f197332x;
        f fVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            mo.c cVar = fVar.f197336c;
            Class<?> cls = this.f197331w.getClass();
            String str = o0Var.f281497b;
            this.u = 1;
            obj2 = cVar.a(cls, str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        t tVar = fVar.f;
        String str2 = o0Var.f281496a;
        tVar.e2(new ho.k(this.f197333y, str2, this.z, (mo.e) obj2));
        return Unit.f186387a;
    }
}
