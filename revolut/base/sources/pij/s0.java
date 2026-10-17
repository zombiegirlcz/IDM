package pij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimPhoneNumberPortingProgress.Action.Data f236576w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, EsimPhoneNumberPortingProgress.Action.Data data, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f236576w = data;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.v, this.f236576w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            EsimPhoneNumberPortingProgress.Action.Data data = this.f236576w;
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.v;
            r0 r0Var = new r0(bVar, data, null);
            this.u = 1;
            if (bVar.p2(this, r0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
