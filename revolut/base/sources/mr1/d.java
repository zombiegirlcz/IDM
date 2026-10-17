package mr1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FormScreen formScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formScreen;
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

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.P.getValue();
        String listId = textData.f52597a;
        String newValue = textData.f52598b.toString();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (a0.H(listId, "ACCOUNT_FIELD_ID_PREFIX_", false)) {
            hVar.H2(hVar.o, new avj.o(d0.e0(listId, "ACCOUNT_FIELD_ID_PREFIX_"), newValue, 19));
        }
        return Unit.f186387a;
    }
}
