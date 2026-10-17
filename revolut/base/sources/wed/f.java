package wed;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedAlertsScreen f296724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SharedAlertsScreen sharedAlertsScreen, Continuation continuation) {
        super(2, continuation);
        this.f296724w = sharedAlertsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f296724w, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVarI3 = this.f296724w.T2();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            f0 f0Var = (f0) qVarI3;
            f0Var.getClass();
            Object obj3 = model.u;
            if (obj3 instanceof AlertItem) {
                f0Var.v2(new n((AlertItem) obj3));
            } else if (obj3 instanceof FavouritesAssetTypeKey) {
                f0.y2(f0Var, null, (FavouritesAssetTypeKey) obj3, 1);
            }
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
