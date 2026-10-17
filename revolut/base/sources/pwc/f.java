package pwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthProtectionLimitChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = wealthProtectionLimitChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.e3();
        String listId = model.f53228a;
        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar2 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -944340981) {
            if (iHashCode != -95766823) {
                if (iHashCode == 297060921 && listId.equals("STREET_MODE_TRUSTED_WIFIS_ITEM_LIST_ID")) {
                    aVar2.C2(n.f240412a);
                }
            } else if (listId.equals("STREET_MODE_TRUSTED_LOCATIONS_ITEM_LIST_ID")) {
                aVar2.C2(m.f240411a);
            }
        } else if (listId.equals("STREET_MODE_SECURITY_DELAY_ITEM_LIST_ID")) {
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.E;
            Data data = ((g) ((j2) aVar2.D.f22677a).getValue()).f240404h;
            List list = data != null ? ((StreetModeInfo) zi0.c.I(data)).f : null;
            if (list == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            oki.h.v2(aVar3, new WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurations(list), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
