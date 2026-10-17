package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements oim.n {
    public final /* synthetic */ String A;
    public int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ kotlin.time.b f24270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ kotlin.time.b f24271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f24272y;
    public final /* synthetic */ PaymentMethod z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, PaymentMethod paymentMethod, String str, Continuation continuation) {
        super(4, continuation);
        this.f24272y = qVar;
        this.z = paymentMethod;
        this.A = str;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        PaymentMethod paymentMethod = this.z;
        String str = this.A;
        m mVar = new m(this.f24272y, paymentMethod, str, (Continuation) obj5);
        mVar.v = (String) obj2;
        mVar.f24270w = (kotlin.time.b) obj3;
        mVar.f24271x = (kotlin.time.b) obj4;
        return mVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = this.v;
        kotlin.time.b bVar = this.f24270w;
        kotlin.time.b bVar2 = this.f24271x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = null;
            this.f24270w = null;
            this.f24271x = null;
            this.u = 1;
            if (q.a(this.f24272y, str, bVar, bVar2, this.z, this.A, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
