package gq1;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ FormsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FormsListScreen formsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = formsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) ((i) this.u.Q.getValue());
        lVar.getClass();
        lVar.C1(new com.revolut.kompot.common.b(new AllFormsScreen(new AllFormsScreenContract$InputData(((h) ((j2) lVar.f145516q.f22677a).getValue()).f145511a)), (ModalDestination.Style) null, 6));
        return Unit.f186387a;
    }
}
