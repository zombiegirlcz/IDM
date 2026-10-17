package vaa;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PixAreaScreen pixAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((HeaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeaderDelegate.Model model = (HeaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarE3 = this.v.R2();
        Intrinsics.h(model);
        f0 f0Var = (f0) a0VarE3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52397a, "PIX_MAIN_KEY_HEADER_ID")) {
            f0Var.C2(l.f287204a);
        }
        return Unit.f186387a;
    }
}
