package xhj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimHelpItem$Action;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreenContract$ModalStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xec.c0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimHelpScreen esimHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.T.getValue();
        Object obj3 = model.u;
        com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.help.b) gVar;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.u;
        Continuation continuation = null;
        EsimHelpItem$Action esimHelpItem$Action = obj3 instanceof EsimHelpItem$Action ? (EsimHelpItem$Action) obj3 : null;
        if (esimHelpItem$Action != null) {
            if (esimHelpItem$Action instanceof EsimHelpItem$Action.OpenLink) {
                bVar.A1(new c0(bVar, ((EsimHelpItem$Action.OpenLink) esimHelpItem$Action).f100273a, continuation, 9), new yi5.b(25));
            } else {
                boolean z = esimHelpItem$Action instanceof EsimHelpItem$Action.ShowBottomSheet;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    oki.h.v2(aVar2, new EsimHelpScreenContract$ModalStep.Info(((EsimHelpItem$Action.ShowBottomSheet) esimHelpItem$Action).f100275a), bottom_dialog);
                } else if (esimHelpItem$Action instanceof EsimHelpItem$Action.InstallEsim) {
                    bVar.l2(new com.revolut.retail.feature.esim.impl.ui.screens.help.a(bVar, ((EsimHelpItem$Action.InstallEsim) esimHelpItem$Action).f100271a, null), new yi5.b(26));
                } else if (esimHelpItem$Action instanceof EsimHelpItem$Action.ReinstallEsim) {
                    oki.h.v2(aVar2, new EsimHelpScreenContract$ModalStep.ReinstallEsim(((EsimHelpItem$Action.ReinstallEsim) esimHelpItem$Action).f100274a), bottom_dialog);
                } else {
                    if (!(esimHelpItem$Action instanceof EsimHelpItem$Action.LostOrStolenDevice)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.LostDevice.f85382a, false, (String) null, false, 30));
                }
            }
        }
        return Unit.f186387a;
    }
}
