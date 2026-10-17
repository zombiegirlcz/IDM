package en8;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pcd.s;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f127775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f127775w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(0, this.f127775w, continuation);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(1, this.f127775w, continuation);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(2, this.f127775w, continuation);
                kVar3.v = obj2;
                return kVar3;
            default:
                k kVar4 = new k(3, this.f127775w, continuation);
                kVar4.v = obj2;
                return kVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f127775w;
        switch (i) {
            case 0:
                ejb.b bVar = (ejb.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = bVar.f126837b;
                if (!list.isEmpty()) {
                    List<SavingsAccountDetails> list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    for (SavingsAccountDetails savingsAccountDetails : list2) {
                        bn2.p pVar = nVar.f127782r;
                        s sVar = savingsAccountDetails.f86460a;
                        arrayList.add(nim.a.v(pVar.g(new RetailBackgroundKey.SavingsAccount(sVar.f234881a, kii.e.u(sVar, xi0.b.Companion), new EntityInfo(md6.e.SAVINGS, null, null, 6))), new j(savingsAccountDetails, 0)));
                    }
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.u, new ec6.l(data, 25));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.u, new ec6.l(data2, 26));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.u, new ec6.l(data3, 27));
                break;
        }
        return Unit.f186387a;
    }
}
