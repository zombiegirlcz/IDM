package wl8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n68.t;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorContactPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorContactPickerScreen juniorContactPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorContactPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar2 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.H2(aVar2.f77220r, new t(model, 1));
        return Unit.f186387a;
    }
}
