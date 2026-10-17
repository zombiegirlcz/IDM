package t44;

import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditAddressSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditAddressSelectionScreen creditAddressSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditAddressSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditAddressSelectionScreen creditAddressSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) creditAddressSelectionScreen.e3();
                n nVar = ((f) ((j2) pVar.f267891r.f22677a).getValue()).e;
                if (!Intrinsics.f(nVar, m.f267885a)) {
                    if (Intrinsics.f(nVar, l.f267884a)) {
                        pVar.C2(new h(f0.f322471a));
                    } else {
                        if (!(nVar instanceof k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pVar.C2(new h(u.c(((k) nVar).f267883a)));
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) creditAddressSelectionScreen.e3()).C2(g.f267881a);
                return Unit.f186387a;
        }
    }
}
