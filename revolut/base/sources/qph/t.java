package qph;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a f248420w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f248420w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f248420w, continuation);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(1, this.f248420w, continuation);
                tVar2.v = obj2;
                return tVar2;
            case 2:
                t tVar3 = new t(2, this.f248420w, continuation);
                tVar3.v = obj2;
                return tVar3;
            case 3:
                t tVar4 = new t(3, this.f248420w, continuation);
                tVar4.v = obj2;
                return tVar4;
            case 4:
                t tVar5 = new t(4, this.f248420w, continuation);
                tVar5.v = obj2;
                return tVar5;
            case 5:
                t tVar6 = new t(5, this.f248420w, continuation);
                tVar6.v = obj2;
                return tVar6;
            case 6:
                t tVar7 = new t(6, this.f248420w, continuation);
                tVar7.v = obj2;
                return tVar7;
            default:
                t tVar8 = new t(7, this.f248420w, continuation);
                tVar8.v = obj2;
                return tVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((t) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((t) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar = this.f248420w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qna.p(data, 6));
                break;
            case 1:
                n nVar = (n) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.C2(nVar);
                break;
            case 2:
                String str = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qc0.w(str, 16));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qna.p(data2, 7));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qna.p(data3, 8));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qna.p(data4, 9));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new qna.p(data5, 10));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.B.k(new n(aVar.o.f96208a, list));
                break;
        }
        return Unit.f186387a;
    }
}
