package yf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChangeRepaymentDayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ChangeRepaymentDayScreen changeRepaymentDayScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = changeRepaymentDayScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChangeRepaymentDayScreen changeRepaymentDayScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) changeRepaymentDayScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) changeRepaymentDayScreen.e3();
                jVar.C2(new f(((hu3.a) zi0.c.I(((e) ((j2) jVar.f313182r.f22677a).getValue()).f313173a)).f155549c));
                break;
        }
        return Unit.f186387a;
    }
}
