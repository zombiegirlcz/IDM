package bec;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PayWithAnyScreen payWithAnyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        Object obj3 = model.f52715m;
        com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
        k6c.c cVar = aVar2.f84724p;
        cli.y yVar = aVar2.v;
        if (obj3 instanceof e) {
            LinkedHashSet linkedHashSetJ = a1.j(((i) ((j2) yVar.f22677a).getValue()).f14785b, ((e) obj3).f14768a);
            aVar2.H2(yVar, new an9.t(linkedHashSetJ, 3));
            ((q7c.l) cVar).a(linkedHashSetJ);
        } else if (obj3 instanceof d) {
            LinkedHashSet linkedHashSetM = a1.m(((i) ((j2) yVar.f22677a).getValue()).f14785b, ((d) obj3).f14766a);
            aVar2.H2(yVar, new an9.t(linkedHashSetM, 4));
            ((q7c.l) cVar).a(linkedHashSetM);
        } else if (obj3 instanceof f) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
