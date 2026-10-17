package qe1;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc0.w;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditTaxRateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditTaxRateScreen editTaxRateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editTaxRateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.O.getValue();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a) fVar;
        y yVar = aVar2.f60813r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "TAX_RATE_NAME_INPUT_ID")) {
            aVar2.H2(yVar, new w(text, 8));
        } else if (Intrinsics.f(listId, "TAX_RATE_INPUT_ID")) {
            aVar2.H2(yVar, new w(text, 9));
        }
        return Unit.f186387a;
    }
}
