package xl9;

import aw0.n6;
import cli.y;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreen;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayWithSmileConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PayWithSmileConsentScreen payWithSmileConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payWithSmileConsentScreen;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayWithSmileConsentScreen payWithSmileConsentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                payWithSmileConsentScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) ((j) payWithSmileConsentScreen.R.getValue());
                y yVar = oVar.f306970q;
                oVar.C2(new g((BigDecimal) ((e) ((j2) yVar.f22677a).getValue()).f306958b.getContent(), ((e) ((j2) yVar.f22677a).getValue()).f306959c));
                break;
        }
        return Unit.f186387a;
    }
}
