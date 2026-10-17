package ef5;

import aw0.k4;
import aw0.m4;
import cli.y;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenContract$ModalStep;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EarnAssetsScreenController f125278w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EarnAssetsScreenController earnAssetsScreenController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f125278w = earnAssetsScreenController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f125278w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f125278w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f125278w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((k4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EarnAssetsScreenController earnAssetsScreenController = this.f125278w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarE3 = earnAssetsScreenController.d();
                Intrinsics.h(id10);
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar2 = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) aVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("INFO_NAV_BAR_MENU_ITEM_ID")) {
                    oki.h.v2(aVar2.f70802y, EarnAssetsScreenContract$ModalStep.Clarification.f70792a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarE32 = earnAssetsScreenController.d();
                Intrinsics.h(clickData);
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar4 = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) aVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) aVar4.v).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    aVar4.C1(cryptoFcaRisksDestinationD);
                }
                break;
            default:
                k4 selection = (k4) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarE33 = earnAssetsScreenController.d();
                Intrinsics.h(selection);
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar6 = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) aVarE33;
                y yVar = aVar6.f70801x;
                Intrinsics.checkNotNullParameter(selection, "selection");
                if (selection instanceof m4) {
                    List list = (List) ((b) ((j2) yVar.f22677a).getValue()).f125270a.getContent();
                    Object obj3 = null;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (Intrinsics.f(((we5.a) next).f296622a.d.f306286a, ((m4) selection).f10423a.a())) {
                                    obj3 = next;
                                }
                            }
                        }
                        obj3 = (we5.a) obj3;
                    }
                    aVar6.H2(yVar, new e87.e(obj3, 21));
                } else {
                    aVar6.H2(yVar, new ebi.i(27));
                }
                break;
        }
        return Unit.f186387a;
    }
}
