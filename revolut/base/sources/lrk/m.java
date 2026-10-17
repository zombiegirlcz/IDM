package lrk;

import com.revolut.retail.feature.stockdetails.impl.data.network.StockInsightsService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import m2l.i0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f199539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f199540x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f199540x = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(this.f199540x, continuation, 0);
                mVar.f199539w = str;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(this.f199540x, continuation, 1);
                mVar2.f199539w = str;
                return mVar2.invokeSuspend(Unit.f186387a);
            case 2:
                m mVar3 = new m(this.f199540x, continuation, 2);
                mVar3.f199539w = str;
                return mVar3.invokeSuspend(Unit.f186387a);
            default:
                m mVar4 = new m(this.f199540x, continuation, 3);
                mVar4.f199539w = str;
                return mVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f199539w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    StockInsightsService stockInsightsService = this.f199540x.f199542a;
                    this.f199539w = null;
                    this.v = 1;
                    obj2 = stockInsightsService.getIndexMarketSentiment(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return hx7.l.C((jrk.r) obj2);
            case 1:
                String str2 = this.f199539w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar = this.f199540x;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        StockInsightsService stockInsightsService2 = oVar.f199542a;
                        this.f199539w = str2;
                        this.v = 1;
                        obj2 = stockInsightsService2.getInsights(str2, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return hx7.i.T((m2l.r) obj2);
                } catch (HttpException e) {
                    Integer numM = n14.e.m(e);
                    if (numM != null && numM.intValue() == 404) {
                        oVar.f199543b.remove(o.b(str2));
                        oVar.d.I0(o.b(str2));
                    }
                    throw e;
                }
            case 2:
                String str3 = this.f199539w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    StockInsightsService stockInsightsService3 = this.f199540x.f199542a;
                    this.f199539w = null;
                    this.v = 1;
                    obj2 = stockInsightsService3.getInsightsHistory(str3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return hx7.q.e0((List) obj2);
            default:
                String str4 = this.f199539w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    StockInsightsService stockInsightsService4 = this.f199540x.f199542a;
                    this.f199539w = null;
                    this.v = 1;
                    obj2 = stockInsightsService4.getTechnicalInsights(str4, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return i26.l.x((i0) obj2);
        }
    }
}
