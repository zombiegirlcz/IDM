package j03;

import aw0.n6;
import com.revolut.feature.card_management.impl.ui.kompot.replace.dialog.CardReplaceTerminateDialogController;
import gim.i;
import j03.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardReplaceTerminateDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CardReplaceTerminateDialogController cardReplaceTerminateDialogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardReplaceTerminateDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardReplaceTerminateDialogController cardReplaceTerminateDialogController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) ((a) cardReplaceTerminateDialogController.R.getValue())).C2(c.b.f169934a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) ((a) cardReplaceTerminateDialogController.R.getValue())).C2(c.a.f169933a);
                break;
        }
        return Unit.f186387a;
    }
}
