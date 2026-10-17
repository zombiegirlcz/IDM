package r84;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import r4k.x;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddDebtScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddDebtScreen addDebtScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addDebtScreen;
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

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.X.getValue();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        j jVar = (j) gVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        int i = 5;
        if (Intrinsics.f(listId, "id_credit_provider")) {
            jVar.x2(new n0(text, i));
        } else if (Intrinsics.f(listId, "id_value_amount")) {
            jVar.x2(new x(text, jVar, i));
        }
        return Unit.f186387a;
    }
}
