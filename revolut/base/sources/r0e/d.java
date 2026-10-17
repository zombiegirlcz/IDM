package r0e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TaxCertificateScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxCertificateScreen taxCertificateScreen, Continuation continuation) {
        super(2, continuation);
        this.u = taxCertificateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) this.u.Q.getValue();
        mVar.H2(mVar.f250782r, new qz9.b(29));
        mVar.l2(new qc8.b(mVar, null, 20), new yi5.b(26));
        return Unit.f186387a;
    }
}
