package dlf;

import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f115745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co9.b f115746b;

    public j(h0 commonDataSource, co9.b paymentCounterpartyInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        this.f115745a = commonDataSource;
        this.f115746b = paymentCounterpartyInteractor;
    }

    public final cmf.p a() {
        return new cmf.p(new cqh.m(vkm.q.Q(this.f115745a.d(), new cvi.i((Continuation) null, this, 21)), this, 11), new dkd.a(16), f0.f322471a, "PaymentCounterpartyInfo");
    }
}
