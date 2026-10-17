package dx8;

import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncodeDocumentProcessingConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incodeDocumentProcessingConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            default:
                return new j(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((f) incodeDocumentProcessingConsentScreen.Q.getValue())).C2(a.f120915a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = IncodeDocumentProcessingConsentScreen.S;
                incodeDocumentProcessingConsentScreen.d3().f300082b.setExpanded(false);
                ((dli.c) incodeDocumentProcessingConsentScreen.R.getValue()).h().scrollToPosition(((dli.c) r3.getValue()).w().getItemCount() - 1);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((f) incodeDocumentProcessingConsentScreen.Q.getValue())).C2(b.f120916a);
                break;
        }
        return Unit.f186387a;
    }
}
