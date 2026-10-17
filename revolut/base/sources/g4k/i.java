package g4k;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements oim.p {
    public /* synthetic */ Pair u;
    public /* synthetic */ long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ PaymentPocketInfo f140553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ r f140554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ f2k.h f140555y;

    public i(Continuation continuation) {
        super(6, continuation);
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        long jLongValue = ((Number) obj3).longValue();
        i iVar = new i((Continuation) obj7);
        iVar.u = (Pair) obj2;
        iVar.v = jLongValue;
        iVar.f140553w = (PaymentPocketInfo) obj4;
        iVar.f140554x = (r) obj5;
        iVar.f140555y = (f2k.h) obj6;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = this.u;
        long j2 = this.v;
        PaymentPocketInfo paymentPocketInfo = this.f140553w;
        r rVar = this.f140554x;
        f2k.h hVar = this.f140555y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new f((Data) pair.f186385a, (kq2.f) pair.f186386b, j2, paymentPocketInfo, rVar, hVar);
    }
}
