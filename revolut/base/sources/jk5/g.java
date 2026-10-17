package jk5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommonRemittanceFieldDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CommonRemittanceFieldDialogController commonRemittanceFieldDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = commonRemittanceFieldDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.Q.getValue();
        Intrinsics.h(model);
        i iVar = (i) cVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        iVar.n2(new h(iVar, model, null), new whi.b(6));
        return Unit.f186387a;
    }
}
