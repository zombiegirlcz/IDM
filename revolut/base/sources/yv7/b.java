package yv7;

import bu7.b0;
import bu7.u;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EmbeddedInsuranceGetHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EmbeddedInsuranceGetHelpScreen embeddedInsuranceGetHelpScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = embeddedInsuranceGetHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmbeddedInsuranceGetHelpScreen embeddedInsuranceGetHelpScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                embeddedInsuranceGetHelpScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) ((g) embeddedInsuranceGetHelpScreen.f76136a0.getValue());
                b0 b0Var = (b0) ((f) kVar.t2()).f317128a.getContent();
                if (b0Var != null) {
                    u uVar = b0Var.f18700m;
                    String str = null;
                    if (uVar.f18739b) {
                        String str2 = b0Var.f18693a;
                        kVar.l2(new j(kVar, str2, null), new yea.l(1, kVar, pu7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 16));
                    } else {
                        String str3 = uVar.f18738a;
                        if (str3 != null && str3.length() != 0) {
                            str = str3;
                        }
                        if (str != null) {
                            kVar.C1(nu7.a.a(str));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
