package m8d;

import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PigeonContentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PigeonContentScreen pigeonContentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pigeonContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsTwinButtonsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsTwinButtonsDelegate.Model model = (CellDetailsTwinButtonsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarT2 = this.v.T2();
        String itemId = model.f51938a;
        h0 h0Var = (h0) uVarT2;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        h0Var.n2(new f0(h0Var, null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
