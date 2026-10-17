package ve1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.NewTaxRateScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vb2.r;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewTaxRateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewTaxRateScreen newTaxRateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newTaxRateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Y.getValue();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "TAX_RATE_NAME_INPUT_ID")) {
            gVar.x2(new r(text, 4));
        } else if (Intrinsics.f(listId, "TAX_RATE_INPUT_ID")) {
            gVar.x2(new r(text, 5));
        }
        return Unit.f186387a;
    }
}
