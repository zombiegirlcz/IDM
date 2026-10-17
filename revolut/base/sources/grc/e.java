package grc;

import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import g23.q;
import g9i.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AccountDetailsController accountDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountDetailsController;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountDetailsController accountDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                accountDetailsController.R2().B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarR2 = accountDetailsController.R2();
                jrc.f fVar = ((a) ((j2) kVarR2.f145981y.f22677a).getValue()).f145962a;
                Continuation continuation = null;
                if (fVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Bank account details does not contain a valid validation result");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if ((fVar instanceof jrc.c) || (fVar instanceof jrc.d)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Bank account details does not contain a valid number");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                } else {
                    if (!(fVar instanceof jrc.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bqc.a aVar3 = ((jrc.e) fVar).f177988a;
                    kVarR2.n2(new q(kVarR2, aVar3, continuation, 24), new s(1, kVarR2, k.class, "handleSalarySwitchPreviewError", "handleSalarySwitchPreviewError(Ljava/lang/Throwable;)Z", 0, 29));
                }
                return Unit.f186387a;
        }
    }
}
