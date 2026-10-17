package o3d;

import com.revolut.feature.separate_favourites.impl.watchlist.ui.quick_actions.WatchlistQuickActionsPresenterDelegate$QuickActionParcel;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f221787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f221787w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f221787w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        um0 um0Var = (um0) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = this.f221787w;
            j60.a.v(eVar.o, false, null, 3);
            Object obj3 = um0Var.d;
            WatchlistQuickActionsPresenterDelegate$QuickActionParcel.AllAssetPairsDeletion allAssetPairsDeletion = obj3 instanceof WatchlistQuickActionsPresenterDelegate$QuickActionParcel.AllAssetPairsDeletion ? (WatchlistQuickActionsPresenterDelegate$QuickActionParcel.AllAssetPairsDeletion) obj3 : null;
            if (allAssetPairsDeletion != null) {
                FavouritesAssetTypeKey favouritesAssetTypeKey = allAssetPairsDeletion.f86018a;
                String str = allAssetPairsDeletion.f86019b;
                this.v = null;
                this.u = 1;
                if (eVar.h3(favouritesAssetTypeKey, str, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
