package xvc;

import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TrustedLocationsListScreen f309231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TrustedLocationsListScreen trustedLocationsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309231w = trustedLocationsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f309231w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f309231w, continuation, 1);
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
                return ((d) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TrustedLocationsListScreen trustedLocationsListScreen = this.f309231w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = trustedLocationsListScreen.e3();
                Intrinsics.h(itemId);
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a aVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "ADD_NEW_MENU_ITEM_LIST_ID")) {
                    aVar2.C2(g.f309233a);
                }
                return Unit.f186387a;
            default:
                k parcel = (k) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a aVar4 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a) trustedLocationsListScreen.e3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.v2(aVar4.f85698r, new TrustedLocationsListScreenContract$Step.EditLocationDialog(parcel.f309236a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
