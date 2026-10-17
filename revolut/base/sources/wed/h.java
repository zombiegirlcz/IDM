package wed;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedAlertsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarI3 = this.v.T2();
        Object obj3 = model.f52715m;
        f0 f0Var = (f0) qVarI3;
        if (!(obj3 instanceof FavouritesAssetTypeKey)) {
            f0Var.getClass();
        } else if (((l) f0Var.t2()).d == mgd.d.COMPLETED) {
            f0Var.v2(new o((FavouritesAssetTypeKey) obj3));
        }
        return Unit.f186387a;
    }
}
