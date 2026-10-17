package rnj;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreenContract$ModalStep;
import dfj.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimConnectivityTroubleshootingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimConnectivityTroubleshootingScreen;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        String id10 = model.f53228a;
        com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) eVar;
        y yVar = aVar2.u;
        Intrinsics.checkNotNullParameter(id10, "id");
        switch (id10.hashCode()) {
            case -1649900776:
                if (id10.equals("RESET_ESIM_ID")) {
                    EsimConnectivityTroubleshootingInfo esimConnectivityTroubleshootingInfo = (EsimConnectivityTroubleshootingInfo) ((c) ((j2) yVar.f22677a).getValue()).f255703b.getContent();
                    oki.h.v2(aVar2.v, new EsimConnectivityTroubleshootingScreenContract$ModalStep.ResetConfirmation(esimConnectivityTroubleshootingInfo != null ? esimConnectivityTroubleshootingInfo.d : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case -454752145:
                if (id10.equals("RESET_NETWORK_SELECTION_ID")) {
                    EsimInstructionType.INSTANCE.getClass();
                    aVar2.K2("RESET_NETWORK_SELECTION");
                }
                break;
            case -291877276:
                if (id10.equals("ENSURE_ESIM_TURNED_ON_ID")) {
                    EsimInstructionType.INSTANCE.getClass();
                    aVar2.K2("ACTIVATION");
                }
                break;
            case 75694948:
                if (id10.equals("INSTALL_ESIM_ID")) {
                    EsimProfile esimProfile = (EsimProfile) ((c) ((j2) yVar.f22677a).getValue()).f255702a.getContent();
                    if (esimProfile != null) {
                        q qVar = ((c) ((j2) yVar.f22677a).getValue()).f255704c;
                        dfj.o oVar = qVar instanceof dfj.o ? (dfj.o) qVar : null;
                        if (oVar != null) {
                            aVar2.I2(esimProfile, oVar.f114056a);
                        } else {
                            com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a.J2("Triggered eSIM installation but installation is not available");
                        }
                    } else {
                        com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a.J2("Triggered eSIM installation but eSIM profile is missing");
                    }
                }
                break;
            case 304133450:
                id10.equals("CONTACT_SUPPORT_ID");
                break;
        }
        return Unit.f186387a;
    }
}
