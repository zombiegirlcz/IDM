package nol;

import com.revolut.sso.api.models.SmsEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lni.i f218086x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.sso.impl.ui.phone.change_flow.b bVar, String str, lni.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f218085w = str;
        this.f218086x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f218085w, this.f218086x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            lni.f fVar = (lni.f) this.f218086x;
            SmsEvidence smsEvidence = new SmsEvidence(fVar.f197261a, fVar.f197262b);
            this.u = 1;
            if (com.revolut.sso.impl.ui.phone.change_flow.b.I2(this.v, this.f218085w, smsEvidence, this) == aVar) {
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
