package jv5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import g5b.k;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f178782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ st5.b f178783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f178784y;
    public final /* synthetic */ CryptoInvestmentsSortingType z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a5h.g gVar, st5.b bVar, boolean z, CryptoInvestmentsSortingType cryptoInvestmentsSortingType, Continuation continuation) {
        super(3, continuation);
        this.f178782w = gVar;
        this.f178783x = bVar;
        this.f178784y = z;
        this.z = cryptoInvestmentsSortingType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean z = this.f178784y;
        CryptoInvestmentsSortingType cryptoInvestmentsSortingType = this.z;
        h hVar = new h(this.f178782w, this.f178783x, z, cryptoInvestmentsSortingType, (Continuation) obj4);
        hVar.u = (Data) obj2;
        hVar.v = (List) obj3;
        return hVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        List list = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return iii.c.f(data, new jt2.d(12), new jul.c(5), new k(this.f178782w, list, this.f178783x, this.f178784y, this.z, 1));
    }
}
