package wed;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedAlertsScreen f296736w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.f296736w = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f296736w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVarI3 = this.f296736w.T2();
            RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
            boolean z = model.f53306c == qd0.SELECTED;
            this.v = null;
            this.u = 1;
            f0 f0Var = (f0) qVarI3;
            f0Var.getClass();
            Object obj3 = model2.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey");
            FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj3;
            f0Var.x2(new an9.t(z ? a1.j(((l) f0Var.t2()).f296744c, favouritesAssetTypeKey) : a1.m(((l) f0Var.t2()).f296744c, favouritesAssetTypeKey), 15));
            f0Var.n2(new w3k.i(f0Var, new s(f0Var, 0), null, 24), new whi.b(6));
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
