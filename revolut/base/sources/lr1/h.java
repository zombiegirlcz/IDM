package lr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.bills.postal_check.impl.ui.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PostalCheckQrScanResult.TermsRequired f199374w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar, PostalCheckQrScanResult.TermsRequired termsRequired, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f199374w = termsRequired;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f199374w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PostalCheckQrScanResult.TermsRequired termsRequired = this.f199374w;
            com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar = this.v;
            g gVar = new g(bVar, termsRequired, null);
            this.u = 1;
            if (bVar.p2(this, gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
