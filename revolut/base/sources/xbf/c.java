package xbf;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wbf.n;
import ybl.k;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f304070w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304070w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f304070w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f304070w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((wbf.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((TradingLegalEntityInformation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        vkm.i iVar = vkm.i.f290039a;
        d dVar = this.f304070w;
        switch (i) {
            case 0:
                wbf.d dVar2 = (wbf.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                int i2 = b.f304069a[dVar2.ordinal()];
                if (i2 == 1) {
                    return rd0.e.b(pd.b.s(((n) dVar.f304071a).b(lbf.f.TRADING_PRO, false), new x8h.d(dVar, 22)));
                }
                if (i2 == 2 || i2 == 3) {
                    return iVar;
                }
                throw new NoWhenBranchMatchedException();
            default:
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (tradingLegalEntityInformation.f105106a == null) {
                    return iVar;
                }
                wbf.g gVar = (wbf.g) dVar.f304073c;
                return xam.a.h(new c(dVar, null, 0), boh.f.e(k.g(gVar.f296147a, new w6h.f(20)), new w3c.n(gVar, 23)));
        }
    }
}
