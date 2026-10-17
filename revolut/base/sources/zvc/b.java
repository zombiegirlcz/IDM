package zvc;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import vkm.j2;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedWifisListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TrustedWifisListScreen trustedWifisListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = trustedWifisListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarD3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) fVarD3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f85709y;
        y yVar = aVar2.f85708x;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = 0;
        boolean zH = a0.H(listId, "TRUSTED_WIFI_ITEM_", false);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zH) {
            String strE0 = d0.e0(listId, "TRUSTED_WIFI_ITEM_");
            StreetModeInfo streetModeInfo = (StreetModeInfo) zi0.c.I(((d) ((j2) yVar.f22677a).getValue()).f325643a);
            List list = streetModeInfo.e;
            if (list == null) {
                list = f0.f322471a;
            }
            oki.h.v2(aVar3, (list.size() == 1 && streetModeInfo.d.isEmpty()) ? new TrustedWifisListScreenContract$Step.RemoveLastWifi(strE0) : new TrustedWifisListScreenContract$Step.RemoveWifi(strE0), bottom_dialog);
        } else if (listId.equals("CONNECTED_WIFI_ITEM_ID")) {
            ConnectedWifi connectedWifi = ((d) ((j2) yVar.f22677a).getValue()).f325644b;
            if (connectedWifi == null) {
                throw new IllegalArgumentException("Connected WiFi cannot be null at this point");
            }
            aVar2.A1(new k(aVar2, connectedWifi.f85467a, null, i), new yi5.b(25));
        } else if (listId.equals("UNSECURED_NETWORK_ITEM_ID")) {
            oki.h.v2(aVar3, TrustedWifisListScreenContract$Step.UnsecuredNetwork.f85701a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
