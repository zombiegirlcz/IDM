package pij;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f236553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f236553w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i1(this.v, this.f236553w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        wli.x xVar = this.v.K;
        String str = ((EsimDescriptorValue.Link) this.f236553w).f100253a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }
}
