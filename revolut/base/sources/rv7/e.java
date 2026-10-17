package rv7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ InsuranceDocumentsLayoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = insuranceDocumentsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.u.R.getValue();
        jVar.getClass();
        jVar.n2(new rbh.k(jVar, null, 20), new whi.b(6));
        return Unit.f186387a;
    }
}
