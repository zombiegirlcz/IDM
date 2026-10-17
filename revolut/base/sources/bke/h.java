package bke;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = ((Boolean) obj2).booleanValue();
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((h) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarW;
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = 2;
        x xVar = this.v;
        if (z) {
            xVar.f16373l.c(new bjg.c(22));
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        kwg.l lVar = xVar.f16382x;
        iwg.a analyticsProductType = iwg.a.CRYPTO;
        eel.c timeSpan = eel.c.ONE_WEEK;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        a0i.a aVar2 = new a0i.a(lVar, 27, analyticsProductType, timeSpan);
        switch (kwg.k.f190351a[analyticsProductType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                rVarW = nim.a.w(rd0.e.c(ybl.k.k(lVar.f190354b, null, null, null, 7), kotlin.coroutines.g.f186406a), new kp0.q(lVar, analyticsProductType, 19));
                break;
            case 6:
                rVarW = rd0.e.c(nim.a.v(tzg.m.a(lVar.f190359l, WealthAccountType.ROBO), new kvg.j(24)), kotlin.coroutines.g.f186406a);
                break;
            case 7:
            case 8:
                rVarW = zi0.c.j(Optional.empty());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return rd0.e.b(nim.a.w(pd.b.r(kli.a.i(lVar.f190353a.k(false), rVarW, rd0.e.c(lVar.f190361n.J(), kotlin.coroutines.g.f186406a)), new kv7.g(aVar2, 8)), new b(xVar, i)));
    }
}
