package aml;

import aw0.n6;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ConsentScreen consentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = consentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConsentScreen consentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) consentScreen.Q.getValue();
                jVar.getClass();
                Intrinsics.checkNotNullParameter("LOADING_TAG_BUTTON_REJECT", "buttonLoadingTag");
                jVar.C2(new e());
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar2 = (j) consentScreen.Q.getValue();
                jVar2.getClass();
                Intrinsics.checkNotNullParameter("LOADING_TAG_BUTTON_CONTINUE", "buttonLoadingTag");
                jVar2.C2(new d());
                break;
        }
        return Unit.f186387a;
    }
}
