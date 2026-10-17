package g64;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a f140844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f140845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, PluginPayload pluginPayload, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f140844w = aVar;
        this.f140845x = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f140844w, this.f140845x, continuation, 0);
            default:
                return new g(this.f140844w, this.f140845x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar2 = this.f140844w;
                PluginPayload pluginPayload = this.f140845x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    nw3.d dVar = aVar2.f67203p;
                    this.v = 1;
                    if (dVar.b(pluginPayload, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                it3.d dVar2 = pluginPayload.f66247a;
                hs3.v vVar = dVar2.e;
                if (!(vVar instanceof hs3.q)) {
                    List list = dVar2.f;
                    obj3 = null;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (next instanceof hs3.q) {
                                    obj3 = next;
                                }
                            }
                        }
                        obj3 = (hs3.v) obj3;
                    }
                } else {
                    if (vVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
                    }
                    obj3 = (hs3.q) vVar;
                }
                hs3.q qVar = (hs3.q) obj3;
                if (qVar == null || qVar.f154929a) {
                    this.v = 2;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Q2(aVar2, qVar, pluginPayload, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.v = 3;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.R2(aVar2, pluginPayload, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar4 = this.f140844w;
                    g gVar = new g(aVar4, this.f140845x, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, gVar) == aVar3) {
                        return aVar3;
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
