package cpb;

import com.revolut.feature.retail.savings.impl.ui.edit_account_name.SavingsAccountEditNameScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SavingsAccountEditNameScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SavingsAccountEditNameScreen savingsAccountEditNameScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = savingsAccountEditNameScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) savingsAccountEditNameScreen.S.getValue()).C2(f.f107916a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) savingsAccountEditNameScreen.S.getValue();
                kVar.getClass();
                kVar.l2(new bv4.h(kVar, null, 29), new cn7.c(1, kVar, k.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 4));
                break;
        }
        return Unit.f186387a;
    }
}
