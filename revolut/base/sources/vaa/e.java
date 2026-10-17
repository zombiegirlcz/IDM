package vaa;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixAreaScreen pixAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ip0.y yVar = (ip0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarE3 = this.v.R2();
        ActionsView.Item item = yVar.f167226b;
        f0 f0Var = (f0) a0VarE3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.f58324n;
        if (obj3 instanceof a) {
            f0Var.I2((a) obj3);
        }
        return Unit.f186387a;
    }
}
