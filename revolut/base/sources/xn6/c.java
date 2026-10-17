package xn6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ InstitutionsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InstitutionsListScreen institutionsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = institutionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) this.u.R2();
        oe6.a aVar2 = oVar.f307331q;
        yji.l.b1(oVar, rd0.e.b(((xg6.j) aVar2).i(w4l.i.f294643c, oVar.o.f307320b)), null, new n(oVar, null, 2), 3);
        return Unit.f186387a;
    }
}
