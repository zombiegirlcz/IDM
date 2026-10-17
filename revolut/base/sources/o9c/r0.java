package o9c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends gim.i implements oim.o {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f223223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f223224x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj2, Continuation continuation, int i) {
        super(5, continuation);
        this.u = i;
        this.f223224x = obj2;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f223224x, (Continuation) obj6, 0);
                r0Var.v = (Data) obj3;
                r0Var.f223223w = (Data) obj4;
                return r0Var.invokeSuspend(Unit.f186387a);
            case 1:
                ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).booleanValue();
                r0 r0Var2 = new r0((pv5.b) this.f223224x, (Continuation) obj6, 1);
                r0Var2.v = (CryptoInvestmentsSortingType) obj4;
                r0Var2.f223223w = (st5.b) obj5;
                return r0Var2.invokeSuspend(Unit.f186387a);
            default:
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                r0 r0Var3 = new r0((qv5.b) this.f223224x, (Continuation) obj6, 2);
                r0Var3.v = (CryptoInvestmentsSortingType) obj4;
                r0Var3.f223223w = (st5.b) obj5;
                return r0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n0 n0Var;
        int i = this.u;
        Object obj3 = this.f223224x;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                Data data2 = (Data) this.f223223w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) obj3;
                Data dataT = t1.t(data, data2);
                try {
                    Object content = dataT.getContent();
                    if (content != null) {
                        Pair pair = (Pair) content;
                        q6c.h hVar = (q6c.h) pair.f186385a;
                        pec.e eVar = (pec.e) pair.f186386b;
                        n0Var = new n0(hVar, eVar, fVar.I2(hVar, eVar));
                    } else {
                        n0Var = null;
                    }
                    return new Data(n0Var, dataT.getError(), dataT.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, dataT.getLoading());
                }
            case 1:
                CryptoInvestmentsSortingType cryptoInvestmentsSortingType = (CryptoInvestmentsSortingType) this.v;
                st5.b bVar = (st5.b) this.f223223w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((pv5.b) obj3).f239980b.a(bVar, cryptoInvestmentsSortingType);
            default:
                CryptoInvestmentsSortingType sortingType = (CryptoInvestmentsSortingType) this.v;
                st5.b itemsLimit = (st5.b) this.f223223w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
                Intrinsics.checkNotNullParameter(sortingType, "sortingType");
                return new go.g(SplitAccountsItemGroup.Empty.f71455a, 2);
        }
    }
}
