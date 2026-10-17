package nje;

import bzg.r;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f216466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Continuation continuation, n nVar) {
        super(2, continuation);
        this.u = i;
        this.f216466w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(0, continuation, this.f216466w);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(1, continuation, this.f216466w);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(2, continuation, this.f216466w);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(3, continuation, this.f216466w);
                lVar4.v = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l(4, continuation, this.f216466w);
                lVar5.v = obj2;
                return lVar5;
            default:
                l lVar6 = new l(5, continuation, this.f216466w);
                lVar6.v = obj2;
                return lVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((yh5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((SplitAccountsItemGroupsResult) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f216466w;
        switch (i) {
            case 0:
                yh5.a aVar = (yh5.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new nfj.l(aVar, 19));
                break;
            case 1:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new r(disclaimerParams, 4));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new nci.q(data, 10));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new nci.q(data2, 11));
                break;
            case 4:
                SplitAccountsItemGroupsResult splitAccountsItemGroupsResult = (SplitAccountsItemGroupsResult) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new a26.f(splitAccountsItemGroupsResult, 1));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.x2(new lsl.d(list, 29));
                break;
        }
        return Unit.f186387a;
    }
}
