package u37;

import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxHubCreateProfileScreen f276791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TaxHubCreateProfileScreen taxHubCreateProfileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276791w = taxHubCreateProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f276791w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f276791w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        TaxHubCreateProfileScreen taxHubCreateProfileScreen = this.f276791w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = taxHubCreateProfileScreen.R2();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) kVarE3;
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = aVar2.v;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("LIST_ID_SKIP_MENU_ITEM")) {
                    aVar2.C2(new h(taxHubCreateProfileScreenContract$InputData.f74340c));
                } else if (listId.equals("LIST_ID_NOTIFICATION_MENU_ITEM") && (str = taxHubCreateProfileScreenContract$InputData.d) != null) {
                    oki.h.v2(aVar2.f74352y, new TaxHubCreateProfileScreenContract$ModalStep.NotificationToggle(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = taxHubCreateProfileScreen.R2();
                String listId2 = aVar3.f275445a;
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar5 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) kVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "LIST_ID_TAX_AUTHORITY_URL") && (str2 = (String) ((g) ((j2) aVar5.f74351x.f22677a).getValue()).f276793b.getContent()) != null) {
                    aVar5.C1(new ExternalDestination.Browser(str2, null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
