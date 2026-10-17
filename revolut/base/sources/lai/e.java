package lai;

import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentOutputData;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.credit_consent.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f193405w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature_retail_user_declarations.credit_consent.flow.a aVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f193405w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f193405w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        boolean z = this.f193405w;
        com.revolut.feature_retail_user_declarations.credit_consent.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f97543p;
            String str = aVar2.o.f97537a;
            MobileScreenParams.CreditConsent creditConsent = new MobileScreenParams.CreditConsent(z);
            this.u = 1;
            if (aVar3.j(str, creditConsent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(new CreditConsentOutputData.Success(z));
        return Unit.f186387a;
    }
}
