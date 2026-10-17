package cbk;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function3 {
    public Data u;
    public sak.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f22877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ FundingSource f22878y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Continuation continuation) {
        super(3, continuation);
        this.z = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = new k(this.z, (Continuation) obj4);
        kVar.f22877x = (Data) obj2;
        kVar.f22878y = (FundingSource) obj3;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        sak.g gVar;
        Throwable th10;
        Data data = this.f22877x;
        FundingSource fundingSource = this.f22878y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f22876w;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar = this.z;
            try {
                Object content = data.getContent();
                if (content == null) {
                    pair = null;
                    return new Data(pair, data.getError(), data.getLoading());
                }
                gVar = (sak.g) content;
                if (fundingSource == null) {
                    this.f22877x = null;
                    this.f22878y = null;
                    this.u = data;
                    this.v = gVar;
                    this.f22876w = 1;
                    obj2 = ((q12.d) oVar.f22885n).c(AccountId.Personal.f51414a, this, gVar.d);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                pair = new Pair(gVar, fundingSource);
                return new Data(pair, data.getError(), data.getLoading());
            } catch (Throwable th11) {
                th10 = th11;
                return new Data(null, th10, data.getLoading());
            }
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sak.g gVar2 = this.v;
        Data data2 = this.u;
        try {
            yhm.o.b(obj2);
            gVar = gVar2;
            data = data2;
        } catch (Throwable th12) {
            th10 = th12;
            data = data2;
            return new Data(null, th10, data.getLoading());
        }
        fundingSource = (FundingSource) obj2;
        pair = new Pair(gVar, fundingSource);
        return new Data(pair, data.getError(), data.getLoading());
    }
}
