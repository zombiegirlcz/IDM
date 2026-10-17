package ljg;

import aw0.n6;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogController;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.a;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TrustedMerchantsConfirmDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TrustedMerchantsConfirmDialogController trustedMerchantsConfirmDialogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = trustedMerchantsConfirmDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TrustedMerchantsConfirmDialogController trustedMerchantsConfirmDialogController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.b) ((a) trustedMerchantsConfirmDialogController.S.getValue())).C2(a.b.f94430a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.b) ((a) trustedMerchantsConfirmDialogController.S.getValue())).C2(a.C0579a.f94429a);
                break;
        }
        return Unit.f186387a;
    }
}
