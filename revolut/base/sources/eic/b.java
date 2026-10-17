package eic;

import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import com.revolut.feature.rewards.impl.ui.concierge.screen.details.ConciergeAlbertineDetailsScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConciergeAlbertineDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = conciergeAlbertineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dgc.e eVar;
        AdditionalInfoBottomSheet additionalInfoBottomSheet;
        String str;
        int i = this.u;
        ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) conciergeAlbertineDetailsScreen.d()).C2(m.f126477a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) conciergeAlbertineDetailsScreen.d();
                dgc.i iVar = (dgc.i) ((h) ((j2) tVar.f126486r.f22677a).getValue()).f126471a.getContent();
                if (iVar != null && (eVar = iVar.f114632a.d) != null && (additionalInfoBottomSheet = eVar.f114624b) != null) {
                    tVar.C2(new n(additionalInfoBottomSheet));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = (t) conciergeAlbertineDetailsScreen.d();
                dgc.i iVar2 = (dgc.i) ((h) ((j2) tVar2.f126486r.f22677a).getValue()).f126471a.getContent();
                if (iVar2 != null && (str = iVar2.d.f114614b) != null) {
                    tVar2.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                }
                break;
        }
        return Unit.f186387a;
    }
}
