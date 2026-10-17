package mhb;

import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.domain.model.Contact;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.PayrollManagerInputController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mhb.a;
import vkm.j2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayrollManagerInputController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PayrollManagerInputController payrollManagerInputController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payrollManagerInputController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayrollManagerInputController payrollManagerInputController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) payrollManagerInputController.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) payrollManagerInputController.e3();
                List list = ((a) ((j2) hVar.o.f22677a).getValue()).f205470a;
                ArrayList<a.C1165a> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((a.C1165a) obj3).f205471a.length() > 0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (a.C1165a c1165a : arrayList) {
                    arrayList2.add(new Contact(c1165a.f205471a, c1165a.f205472b));
                }
                hVar.C2(new c(arrayList2));
                break;
        }
        return Unit.f186387a;
    }
}
