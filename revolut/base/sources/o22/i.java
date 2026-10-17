package o22;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmNewAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ApmNewAliasScreen apmNewAliasScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmNewAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVarE3 = this.v.R2();
        String text = textData.f52598b.toString();
        n nVar = (n) dVarE3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        nVar.H2(nVar.u, new nj8.b(text, 24));
        return Unit.f186387a;
    }
}
