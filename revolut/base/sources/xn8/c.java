package xn8;

import com.revolut.feature.junior_settings.impl.ui_kompot.account_closure_confirmation.JuniorAccountClosureConfirmationController;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorAccountClosureConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorAccountClosureConfirmationController;
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
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorAccountClosureConfirmationController juniorAccountClosureConfirmationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) juniorAccountClosureConfirmationController.P.getValue();
                hVar.C2(new kn8.b(((d) ((j2) hVar.o.f22677a).getValue()).f307338b));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) juniorAccountClosureConfirmationController.P.getValue();
                hVar2.C2(new kn8.c(((d) ((j2) hVar2.o.f22677a).getValue()).f307338b));
                break;
        }
        return Unit.f186387a;
    }
}
