package b8d;

import com.revolut.core.model.faq.FaqAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13162w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f13162w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(0, this.f13162w, continuation);
            case 1:
                return new g0(1, this.f13162w, continuation);
            case 2:
                return new g0(2, this.f13162w, continuation);
            default:
                return new g0(3, this.f13162w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        int i2 = 2;
        com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = this.f13162w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l lVar = (l) ((m) cVar.t2()).f13178c.getContent();
                    if (lVar == null || (list = lVar.f13175b) == null) {
                        return Unit.f186387a;
                    }
                    if (list.size() == 1) {
                        FaqAction faqAction = (FaqAction) zhm.d0.b0(list);
                        this.v = 1;
                        if (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.z2(cVar, faqAction, this) == aVar) {
                            return aVar;
                        }
                    } else if (list.size() > 1) {
                        this.v = 2;
                        if (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.A2(cVar, list, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        this.v = 3;
                        if (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.y2(cVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c.y2(cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    hg0.b bVar = cVar.f86240t;
                    String str = cVar.f86243y;
                    this.v = 1;
                    Object objA = ((hg0.c) bVar).f152043a.a(str, this);
                    if (objA != aVar3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    g0 g0Var = new g0(i2, cVar, null);
                    p0 p0Var = p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    this.v = 1;
                    if (skm.e0.J(fVar, g0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
