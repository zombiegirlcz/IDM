package wl8;

import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorContactPickerScreen f298445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(JuniorContactPickerScreen juniorContactPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298445w = juniorContactPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f298445w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f298445w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorContactPickerScreen juniorContactPickerScreen = this.f298445w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = juniorContactPickerScreen.e3();
                Intrinsics.h(menuItemId);
                com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar2 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                oki.h.v2(aVar2.u, JuniorContactPickerScreenContract$ModalStep.AddNewContact.f77213a, ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                String searchQuery = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = juniorContactPickerScreen.e3();
                Intrinsics.h(searchQuery);
                com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar4 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) iVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                j2 j2Var = aVar4.f77221s;
                j2Var.getClass();
                j2Var.g(null, searchQuery);
                break;
        }
        return Unit.f186387a;
    }
}
