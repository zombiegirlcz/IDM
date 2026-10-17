package ys1;

import com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.BizumRegistrationConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yo7.p;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BizumRegistrationConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BizumRegistrationConfirmationScreen bizumRegistrationConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bizumRegistrationConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BizumRegistrationConfirmationScreen bizumRegistrationConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bizumRegistrationConfirmationScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) ((f) bizumRegistrationConfirmationScreen.Z.getValue());
                at1.d dVar = kVar.f316391p;
                p onComplete = new p(kVar, 17);
                at1.j jVar = (at1.j) dVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter("BIZUM_REG_CONFIRMATION_CTA_BUTTON_TAG", "tag");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                jVar.T2(new ald.l(jVar, onComplete, null, 11), new yi5.b(27));
                break;
        }
        return Unit.f186387a;
    }
}
