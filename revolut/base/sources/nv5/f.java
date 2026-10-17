package nv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.q;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements q {
    public final /* synthetic */ h A;
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ CryptoInvestmentsSortingType f219488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ st5.b f219489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Data f219490y;
    public /* synthetic */ dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(7, continuation);
        this.A = hVar;
    }

    @Override // oim.q
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        f fVar = new f(this.A, (Continuation) obj8);
        fVar.u = zBooleanValue;
        fVar.v = zBooleanValue2;
        fVar.f219488w = (CryptoInvestmentsSortingType) obj4;
        fVar.f219489x = (st5.b) obj5;
        fVar.f219490y = (Data) obj6;
        fVar.z = (dj0.d) obj7;
        return fVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        boolean z3 = this.v;
        CryptoInvestmentsSortingType cryptoInvestmentsSortingType = this.f219488w;
        st5.b bVar = this.f219489x;
        Data data = this.f219490y;
        dj0.d dVar = this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.A;
        return new e(hVar.f219493b.a(cryptoInvestmentsSortingType, bVar, z3, hVar.f.f(cryptoInvestmentsSortingType)), this.A, data, dVar, z);
    }
}
