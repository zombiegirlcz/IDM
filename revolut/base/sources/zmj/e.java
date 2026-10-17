package zmj;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ip0.y yVar = (ip0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0VarE3 = this.v.d();
        ActionsView.Item item = yVar.f167226b;
        String listId = item.f58316a;
        Object obj3 = item.f58324n;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE3;
        cli.y yVar2 = aVar2.J;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.L;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj3 instanceof EsimDescriptorValue.Link)) {
            switch (listId.hashCode()) {
                case -434217143:
                    if (listId.equals("ID_SUBSCRIPTION_DETAILS_ESIM_INSTALL") && (obj3 instanceof EsimProfileEntry)) {
                        EsimProfileEntry esimProfileEntry = (EsimProfileEntry) obj3;
                        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = esimProfileEntry.f100443g;
                        if (esimMigrationFromDataPlansOnly == null) {
                            aVar2.J2(esimProfileEntry);
                        } else {
                            oki.h.v2(aVar3, new EsimSubscriptionDetailsScreenContract$ModalStep.EsimMigration(esimMigrationFromDataPlansOnly.f100292a, esimProfileEntry), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                    }
                    break;
                case -303943997:
                    if (listId.equals("ID_SUBSCRIPTION_DETAILS_ACTIVATE_ESIM")) {
                        EsimInstructionType.INSTANCE.getClass();
                        EsimProfileEntry esimProfileEntryI2 = com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a.I2((n) ((j2) yVar2.f22677a).getValue());
                        aVar2.C1(new EsimInstructionsDestination("ACTIVATION", esimProfileEntryI2 != null ? esimProfileEntryI2.f100440a : 0));
                    }
                    break;
                case 1623198655:
                    if (listId.equals("ID_SUBSCRIPTION_DETAILS_INSTALLATION_TROUBLESHOOTER")) {
                        EsimProfileEntry esimProfileEntryI22 = com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a.I2((n) ((j2) yVar2.f22677a).getValue());
                        aVar2.C1(new EsimFeatureConfig.ConnectivityTroubleshootingDestination(esimProfileEntryI22 != null ? esimProfileEntryI22.f100440a : null));
                    }
                    break;
                case 1756098870:
                    if (listId.equals("ID_ESIM_SHARE") && (obj3 instanceof EsimProfileEntry)) {
                        oki.h.v2(aVar3, new EsimSubscriptionDetailsScreenContract$ModalStep.ShareEsim(((EsimProfileEntry) obj3).f100440a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    }
                    break;
            }
        } else {
            aVar2.l2(new zah.f(aVar2, ((EsimDescriptorValue.Link) obj3).f100253a, str, 19), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
