package xka;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ueg.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f306652w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306652w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f306652w, continuation, 0);
            case 1:
                return new x(this.f306652w, continuation, 1);
            default:
                return new x(this.f306652w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVar = this.f306652w;
                    kka.a aVar2 = zVar.f306654p;
                    boolean zBooleanValue = ((Boolean) zVar.v.getValue()).booleanValue();
                    ProductArticleParams productArticleParams = zVar.o.f81288a;
                    this.v = 1;
                    if (((kka.h) aVar2).g(zBooleanValue, productArticleParams, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar2 = this.f306652w;
                y yVar = new y(zVar2, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(zVar2.k, "HANDLE_ACTION_TASK_NAME", yVar, this);
                return objB == aVar3 ? aVar3 : objB;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                z zVar3 = this.f306652w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    b bVar = zVar3.f306658t;
                    this.v = 1;
                    obj2 = bVar.a(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zVar3.H2(zVar3.f306659w, new y0((AnalyticsContext) obj2, 1));
                return Unit.f186387a;
        }
    }
}
