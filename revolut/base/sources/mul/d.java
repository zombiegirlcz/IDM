package mul;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ SecurityAssetBalanceBreakdownScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SecurityAssetBalanceBreakdownScreen securityAssetBalanceBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.u = securityAssetBalanceBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        vii.c cVar = ((j) this.u.S.getValue()).f209059q;
        Unit unit = Unit.f186387a;
        cVar.b(unit);
        return unit;
    }
}
