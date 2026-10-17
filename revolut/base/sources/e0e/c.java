package e0e;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StatementPeriodSelectorBottomSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.v = statementPeriodSelectorBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.P;
        d field = obj3 instanceof d ? (d) obj3 : null;
        if (field != null) {
            h hVarM3 = this.v.R2();
            hVarM3.getClass();
            Intrinsics.checkNotNullParameter(field, "field");
            hVarM3.H2(hVarM3.f121576s, new dug.a(field, 23));
        }
        return Unit.f186387a;
    }
}
