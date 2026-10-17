package ox5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b f230583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f230584x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f230583w = bVar;
        this.f230584x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f230583w, continuation);
                k0Var.f230584x = obj2;
                return k0Var;
            default:
                return new k0(this.f230583w, this.f230584x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = this.f230583w;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f230584x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Object value = bVar.J.getValue();
                    this.f230584x = null;
                    this.v = 1;
                    if (flowCollector.emit(value, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = this.f230584x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l3d.h0 h0Var = bVar.f71570t;
                    ifd.g gVar = (ifd.g) obj3;
                    FavouritesAssetTypeKey favouritesAssetTypeKey = gVar.a().f86898a.d;
                    Pair pair = new Pair(gVar.a().f86898a.f86863a, gVar.a().f86899b);
                    this.v = 1;
                    if (h0Var.h(favouritesAssetTypeKey, pair, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                String str = ((ifd.g) obj3).a().f86898a.f86864b;
                f0 f0Var = com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b.Companion;
                bVar.X1(new mii.k("DIALOG_ID_REMOVED_FROM_WATCHLIST", new TextLocalisedClause(R$string.shared_watchlist_remove_item_from_watchlist_toast_with_asset_title, zhm.u.c(str), null, 12), null, null, null, 28));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f230583w = bVar;
    }
}
