package nol;

import com.revolut.sso.api.models.TelephoneEvidence;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lni.i f218088x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.sso.impl.ui.phone.change_flow.b bVar, String str, lni.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f218087w = str;
        this.f218088x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f218087w, this.f218088x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String secret = ((lni.g) this.f218088x).f197263a;
            Intrinsics.checkNotNullParameter(secret, "secret");
            TelephoneEvidence telephoneEvidence = new TelephoneEvidence(secret);
            this.u = 1;
            if (com.revolut.sso.impl.ui.phone.change_flow.b.I2(this.v, this.f218087w, telephoneEvidence, this) == aVar) {
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
