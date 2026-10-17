package pij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimPhoneNumberPortingProgress.Action.Data f236575w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, EsimPhoneNumberPortingProgress.Action.Data data, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f236575w = data;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r0(this.v, this.f236575w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            EsimPhoneNumberPortingProgress.Action.Data.CreatePorting createPorting = (EsimPhoneNumberPortingProgress.Action.Data.CreatePorting) this.f236575w;
            String str = createPorting.f100389b;
            String str2 = createPorting.f100388a;
            this.u = 1;
            if (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.I2(this.v, str, str2, this) == aVar) {
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
