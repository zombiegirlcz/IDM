package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import dej.r1;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function1 {
    public final /* synthetic */ dj0.d A;
    public final /* synthetic */ EsimContractMetadata B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public int u;
    public final /* synthetic */ r1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Instant f24259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f24260y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r1 r1Var, u0 u0Var, Instant instant, String str, String str2, dj0.d dVar, EsimContractMetadata esimContractMetadata, boolean z, String str3, Continuation continuation) {
        super(1, continuation);
        this.v = r1Var;
        this.f24258w = u0Var;
        this.f24259x = instant;
        this.f24260y = str;
        this.z = str2;
        this.A = dVar;
        this.B = esimContractMetadata;
        this.C = z;
        this.D = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f24258w, this.f24259x, this.f24260y, this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        r1 r1Var = this.v;
        PaymentMethod.Pocket pocket = r1Var.f113639c;
        this.u = 1;
        Object objK3 = u0.k3(this.f24258w, this.f24259x, this.f24260y, this.z, r1Var, pocket, this.A, this.B, this.C, this.D, this);
        return objK3 == aVar ? aVar : objK3;
    }
}
