package mv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import hd.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mul.k;
import oim.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements n {
    public final /* synthetic */ CryptoInvestmentsSortingType A;
    public /* synthetic */ Data u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f209152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f209153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ st5.b f209154y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, st5.b bVar, boolean z, CryptoInvestmentsSortingType cryptoInvestmentsSortingType, Continuation continuation) {
        super(4, continuation);
        this.f209153x = rVar;
        this.f209154y = bVar;
        this.z = z;
        this.A = cryptoInvestmentsSortingType;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z = this.z;
        CryptoInvestmentsSortingType cryptoInvestmentsSortingType = this.A;
        i iVar = new i(this.f209153x, this.f209154y, z, cryptoInvestmentsSortingType, (Continuation) obj5);
        iVar.u = (Data) obj2;
        iVar.v = (List) obj3;
        iVar.f209152w = (List) obj4;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        List list = this.v;
        List list2 = this.f209152w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return iii.c.f(data, new k(2), new h(0), new en6.b(this.f209153x, list2, list, this.f209154y, this.z, this.A, 4));
    }
}
