package yxe;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.edit_label.EditStoredMethodLabelScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ EditStoredMethodLabelScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditStoredMethodLabelScreen editStoredMethodLabelScreen, Continuation continuation) {
        super(2, continuation);
        this.u = editStoredMethodLabelScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) this.u.R2();
        mVar.H2(mVar.f317676r, new yv8.j(19));
        return Unit.f186387a;
    }
}
