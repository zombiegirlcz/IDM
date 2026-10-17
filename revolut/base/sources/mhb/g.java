package mhb;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.PayrollManagerInputController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.z;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayrollManagerInputController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PayrollManagerInputController payrollManagerInputController, Continuation continuation) {
        super(2, continuation);
        this.v = payrollManagerInputController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        h hVar = (h) bVarE3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Integer numM = z.m(d0.x0(listId, "_", listId));
        if (numM != null) {
            hVar.H2(hVar.o, new a94.e(numM.intValue(), listId, text, 6));
        }
        return Unit.f186387a;
    }
}
