package wl8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorContactPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorContactPickerScreen juniorContactPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorContactPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "NO_CONTACTS_STATE_ID");
        JuniorContactPickerScreen juniorContactPickerScreen = this.v;
        if (zF) {
            KProperty[] kPropertyArr = JuniorContactPickerScreen.S;
            juniorContactPickerScreen.d3().f144575c.i0();
        }
        i iVarE3 = juniorContactPickerScreen.d();
        String listId = model.f52373a;
        com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar2 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) iVarE3;
        vii.b bVar = aVar2.f77222t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "NO_CONTACTS_STATE_ID")) {
            j2 j2Var = aVar2.f77221s;
            m70.a.c(t0.f186434a);
            j2Var.getClass();
            j2Var.g(null, "");
            bVar.a();
        } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            bVar.a();
        }
        return Unit.f186387a;
    }
}
