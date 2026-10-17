package r0e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxCertificateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaxCertificateScreen taxCertificateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxCertificateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((m) this.v.Q.getValue()).I2(model.f53228a);
        return Unit.f186387a;
    }
}
