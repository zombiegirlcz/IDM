package woc;

import au.c0;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tx0.z4;
import wnc.x;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xoc.b f298925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f298926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, xoc.b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f298925w = bVar;
        this.f298926x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, this.f298925w, this.f298926x, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((TradingAccount.Portfolio) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        akg.n nVarV;
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = this.v;
        zjh.f fVar = rVar.f298929c;
        UUID uuid = portfolio.f105210a;
        String string = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        w4l.h hVar = w4l.h.f294642c;
        Flow flowH = xam.a.h(new p(2, rVar.d, emc.e.class, "observeTemplateProjection", "observeTemplateProjection(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 4, 0), rd0.e.b(nim.a.w(fVar.B(string, hVar), new x(13))));
        int[] iArr = n.f298922a;
        xoc.b currencyMode = this.f298925w;
        int i = iArr[currencyMode.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            qmc.d dVar = rVar.f298928b;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            nVarV = nim.a.v(dVar.b(string2), new x(14));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String string3 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            nVarV = nim.a.v(xam.a.h(new o(rVar, portfolio, null), rd0.e.b(fVar.B(string3, hVar))), new x(15));
        }
        uvl.c cVar = rVar.e;
        String portfolioId = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(portfolioId, "toString(...)");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        return u0.i(flowH, nVarV, xam.a.h(new c0(this.f298926x, rVar, continuation, 26), xam.a.h(new z4(currencyMode, cVar, portfolioId, continuation, 7), rd0.e.b(t1j.b.m((t1j.b) cVar.f283491a, portfolioId)))));
    }
}
