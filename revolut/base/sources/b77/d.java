package b77;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDebitFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DirectDebitFormScreen directDebitFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDebitFormScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String newValue = textData.f52598b.toString();
        com.revolut.feature.giro.impl.ui.form.b bVar = (com.revolut.feature.giro.impl.ui.form.b) jVarE3;
        y yVar = bVar.f74552t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (Intrinsics.f(listId, "ID_CONSUMER_ID")) {
            bVar.H2(yVar, new ak7.g(newValue, 24));
        } else if (Intrinsics.f(listId, "ID_SINGLE_TRANSACTION_LIMIT")) {
            bVar.H2(yVar, new b58.f(z.n(newValue), bVar, 14));
        }
        return Unit.f186387a;
    }
}
