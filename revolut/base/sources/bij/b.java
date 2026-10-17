package bij;

import bij.e;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen;
import dej.h0;
import dej.i0;
import dej.m0;
import dej.o0;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimHelpScreen esimHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimProfile esimProfile;
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        String id10 = model.f51822a;
        k kVar = (k) fVar;
        y yVar = kVar.f15526r;
        Intrinsics.checkNotNullParameter(id10, "id");
        switch (id10.hashCode()) {
            case -1873084168:
                if (id10.equals("ID_INSTALL_ESIM_ITEM")) {
                    Optional optional = (Optional) ((d) ((j2) yVar.f22677a).getValue()).f15509a.getContent();
                    o0 o0Var = optional != null ? (o0) optional.orElse(null) : null;
                    if (o0Var instanceof h0) {
                        esimProfile = ((h0) o0Var).f113546a;
                    } else if (o0Var instanceof i0) {
                        esimProfile = ((i0) o0Var).f113555a;
                    } else {
                        if (!(o0Var instanceof m0) && o0Var != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        esimProfile = null;
                    }
                    if (esimProfile != null) {
                        ViewController viewControllerE1 = kVar.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(esimProfile, EsimInstallationFlowDescriptor$Start.InstallationPicker, false)));
                        h block = new h(kVar, 1);
                        Intrinsics.checkNotNullParameter(block, "block");
                        viewControllerE1.H = block;
                        yji.l.j2(kVar, viewControllerE1, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                    }
                }
                break;
            case -1011139232:
                if (id10.equals("ID_FAQ_ITEM")) {
                    kVar.C2(e.c.f15513a);
                }
                break;
            case -983084311:
                if (id10.equals("ID_LOST_OR_STOLEN_DEVICE_ITEM")) {
                    kVar.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.LostDevice.f85382a, false, (String) null, false, 30));
                }
                break;
            case -955491754:
                if (id10.equals("ID_REFUND_ITEM")) {
                    kVar.C2(e.C0100e.f15515a);
                }
                break;
            case -68350628:
                if (id10.equals("ID_CONNECTIVITY_TROUBLESHOOTING_ITEM")) {
                    kVar.C2(new e.b((String) ((d) ((j2) yVar.f22677a).getValue()).f15510b.getContent()));
                }
                break;
            case 1371035432:
                if (id10.equals("ID_ACTIVATION_INSTRUCTIONS_ITEM")) {
                    kVar.C2(e.a.f15511a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
