package k25;

import ahe.m0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mjf.b0;
import org.joda.time.DateTime;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.ob;
import tof.ua;
import tof.v6;
import tof.y6;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((ll4.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ll4.u uVar = (ll4.u) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.domain.interactors.transactions.a aVar2 = this.v.f180352h;
        i7 i7VarA = fc.a(fc.a(new ua(uVar.f196537c), new ob(new DateTime(uVar.f196548t), true)), new cc(zhm.v.k(y6.CARD_PAYMENT, y6.REV_PAYMENT)));
        i7.c cVar = i7.Companion;
        v6[] v6VarArr = {v6.COMPLETED};
        cVar.getClass();
        i7 i7VarA2 = fc.a(i7VarA, i7.c.c(v6VarArr));
        b0 b0Var = (b0) aVar2;
        Priority.STANDARD standard = Priority.STANDARD.f60263b;
        b0Var.h(standard);
        return new m0(rd0.e.e(rd0.e.b(((xif.s) b0Var.f205982a).e(i7VarA2, standard, new BreadcrumbException())), h0.f322473a, new i23.c(3, 15, null)), 6);
    }
}
