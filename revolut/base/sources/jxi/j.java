package jxi;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$ModalStep;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AirportLoungesHomeScreen airportLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) vVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int i = 0;
        if (kotlin.text.a0.H(str, "ID_NEARBY_AIRPORT_ITEM_", false)) {
            Object obj3 = model.u;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null) {
                throw new IllegalArgumentException("id is missing for clicked nearby airport");
            }
            cVar.C2(new s(str2));
        } else if (str.equals("ID_ENABLE_LOCATION_SERVICES_ITEM")) {
            cVar.C1(new ExternalDestination.ByIntent(((s70.b) cVar.u).c(), null));
        } else if (str.equals("ID_GRANT_LOCATION_PERMISSION_ITEM")) {
            yji.l.i2(cVar, new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_COARSE_LOCATION", new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.airport_lounges_allow_location_prompt_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_allow_location_prompt_description, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_allow_location_prompt_button, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D027", null, null, null, 30), (TextClause) null, 48)))), null, new z(cVar, i), 1);
        } else if (str.equals("ID_NEARBY_AIRPORTS_ERROR_ITEM")) {
            cVar.E.a();
        } else if (str.equals("ID_PASS_ACTIVITY_ERROR_ITEM")) {
            cVar.F.a();
        } else if (str.equals("ID_HELP_ITEM")) {
            cli.y yVar = cVar.G;
            svi.k kVar = (svi.k) ((r) ((j2) yVar.f22677a).getValue()).f179219c.getContent();
            if (kVar == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AirportLoungesHomeScreenModel", "Can't launch help dialog: no pass data in the screen state", null, h0Var);
            } else {
                oki.h.v2(cVar.H, new AirportLoungesHomeScreenContract$ModalStep.HelpBottomSheet(kVar, (svi.w) ((r) ((j2) yVar.f22677a).getValue()).d.getContent()), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
