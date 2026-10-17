package ska;

import com.revolut.feature.product_article.impl.network.ProductArticleService;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nka.p;
import nka.q;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ q f263793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f263794x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f263794x = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(this.f263794x, continuation, 0);
                iVar.f263793w = qVar;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(this.f263794x, continuation, 1);
                iVar2.f263793w = qVar;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                q qVar = this.f263793w;
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
                ProductArticleService productArticleService = this.f263794x.f263796a;
                String str = qVar.f216797a;
                Map<String, String> map = qVar.f216798b;
                this.f263793w = null;
                this.v = 1;
                Object productArticle = productArticleService.getProductArticle(str, map, this);
                return productArticle == aVar ? aVar : productArticle;
            default:
                q params = this.f263793w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                k kVar = this.f263794x;
                if (i2 == 0) {
                    o.b(obj2);
                    ProductArticleService productArticleService2 = kVar.f263796a;
                    String str2 = params.f216797a;
                    Intrinsics.checkNotNullParameter(params, "params");
                    p pVar = new p(params.f216798b);
                    this.f263793w = null;
                    this.v = 1;
                    obj2 = productArticleService2.getProductArticleV2(str2, pVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return kVar.d.c((nka.o) obj2);
        }
    }
}
