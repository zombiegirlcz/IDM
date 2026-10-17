package de4;

import aw0.n6;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConfirmationBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ConfirmationBottomSheetController confirmationBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = confirmationBottomSheetController;
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
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConfirmationBottomSheetController confirmationBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) confirmationBottomSheetController.S.getValue()).I2(a.f113285a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) confirmationBottomSheetController.S.getValue()).I2(b.f113286a);
                break;
        }
        return Unit.f186387a;
    }
}
