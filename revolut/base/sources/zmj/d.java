package zmj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimSubscriptionDetailsScreen f323550w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323550w = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f323550w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f323550w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f323550w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f323550w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 19;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = this.f323550w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarE3 = esimSubscriptionDetailsScreen.d();
                String listId = aVar.f275445a;
                Object obj3 = aVar.d;
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ID_AUTO_RENEWAL_LEARN_MORE_CLAUSE") && (obj3 instanceof EsimAutoRenewalTerms)) {
                    oki.h.v2(aVar3.L, new EsimSubscriptionDetailsScreenContract$ModalStep.AutoRenewalInfo((EsimAutoRenewalTerms) obj3), bottom_dialog);
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarE32 = esimSubscriptionDetailsScreen.d();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar5 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                EsimDescriptorValue.Link link = obj4 instanceof EsimDescriptorValue.Link ? (EsimDescriptorValue.Link) obj4 : null;
                if (link != null) {
                    aVar5.l2(new zah.f(aVar5, link.f100253a, objArr == true ? 1 : 0, i2), new yi5.b(26));
                }
                break;
            case 2:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarE33 = esimSubscriptionDetailsScreen.d();
                Object obj5 = aVar6.d;
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar8 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE33;
                if (obj5 instanceof t) {
                    t tVar = (t) obj5;
                    oki.h.v2(aVar8.L, new EsimSubscriptionDetailsScreenContract$ModalStep.DataPlanAssignedToVoiceAndData(tVar.f323591a, tVar.f323592b), bottom_dialog);
                } else if (obj5 instanceof EsimDescriptorValue.Link) {
                    aVar8.getClass();
                    aVar8.l2(new zah.f(aVar8, ((EsimDescriptorValue.Link) obj5).f100253a, objArr2 == true ? 1 : 0, i2), new yi5.b(26));
                } else {
                    aVar8.getClass();
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarE34 = esimSubscriptionDetailsScreen.d();
                Intrinsics.h(id10);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar10 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE34;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("HELP_MENU_ITEM_ID")) {
                    EsimProfileEntry esimProfileEntryI2 = com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a.I2((n) ((j2) aVar10.J.f22677a).getValue());
                    aVar10.C2(new x(esimProfileEntryI2 != null ? esimProfileEntryI2.f100440a : null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
