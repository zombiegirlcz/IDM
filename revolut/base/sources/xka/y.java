package xka;

import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f306653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f306653w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f306653w, continuation, 0);
            default:
                return new y(this.f306653w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar;
        aka.a aVar;
        List listO;
        aka.g gVar;
        switch (this.u) {
            case 0:
                z zVar = this.f306653w;
                ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = zVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str = null;
                    if (productArticleDetailsControllerContract$InputData.f81289b && (qVar = (q) ((r) ((j2) zVar.f306659w.f22677a).getValue()).f306646a.getContent()) != null && (aVar = qVar.f306644a) != null && (listO = aVar.o()) != null && (gVar = (aka.g) d0.d0(listO)) != null) {
                        str = gVar.f5752b;
                    }
                    if (str != null) {
                        this.v = 1;
                        Object objL1 = zVar.f306655q.L1(str, lg0.a.OPEN_BROWSER, Boolean.FALSE, this);
                        if (objL1 != aVar2) {
                            objL1 = Unit.f186387a;
                        }
                        if (objL1 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (productArticleDetailsControllerContract$InputData.e) {
                    zVar.C2(s.NEXT_CLICK);
                } else {
                    kka.a aVar3 = zVar.f306654p;
                    yja.b bVar = yja.b.NEXT_CLICK;
                    this.v = 2;
                    if (((kka.h) aVar3).h(bVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = this.f306653w;
                    y yVar = new y(zVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(zVar2.X(), "PRODUCT_ARTICLE_CTA_BUTTON_LOADING_TAG", yVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
