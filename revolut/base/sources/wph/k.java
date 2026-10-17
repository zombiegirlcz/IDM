package wph;

import com.revolut.feature.wealth_discovery.impl.screener.screens.common.ScreenerIconOption;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EditScreenerScreen f299331w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(EditScreenerScreen editScreenerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299331w = editScreenerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f299331w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f299331w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((ScreenerIconOption) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditScreenerScreen editScreenerScreen = this.f299331w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "DELETE_COLLECTION_ITEM_ID")) {
                    oki.h.v2(((com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) editScreenerScreen.e3()).u, EditScreenerScreenContract$ModalStep.DeleteConfirmation.f96235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ScreenerIconOption screenerIconOption = (ScreenerIconOption) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = editScreenerScreen.e3();
                String icon = screenerIconOption.f96233a;
                com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) mVarE3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(icon, "icon");
                aVar3.H2(aVar3.f96239s, new wb3.k(icon, 17));
                break;
        }
        return Unit.f186387a;
    }
}
