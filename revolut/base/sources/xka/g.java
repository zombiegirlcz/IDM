package xka;

import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductArticleDetailsController f306636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ProductArticleDetailsController productArticleDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306636w = productArticleDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f306636w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f306636w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f306636w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f306636w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            default:
                g gVar5 = new g(this.f306636w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ProductArticleDetailsController productArticleDetailsController = this.f306636w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = productArticleDetailsController.e3();
                Intrinsics.h(aVar);
                ((z) tVarE3).I2(new k(aVar));
                break;
            case 1:
                p pVar = (p) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) productArticleDetailsController.e3()).I2(pVar);
                break;
            case 2:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE32 = productArticleDetailsController.e3();
                Intrinsics.h(aVar4);
                ((z) tVarE32).I2(new o(aVar4));
                break;
            case 3:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE33 = productArticleDetailsController.e3();
                Intrinsics.h(aVar6);
                ((z) tVarE33).I2(new m(aVar6));
                break;
            default:
                p pVar2 = (p) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) productArticleDetailsController.e3()).I2(pVar2);
                break;
        }
        return Unit.f186387a;
    }
}
