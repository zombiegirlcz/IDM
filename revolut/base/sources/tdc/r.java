package tdc;

import com.revolut.data.model.Data;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends yji.n implements q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q7c.g f269963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f269964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zcc.b f269965n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f269966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f269967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f269968r;

    public r(q7c.g paymentMethodsInteractor, e paymentMethodIdentifierProvider, zcc.b savePaymentForMapper, g inputData) {
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodIdentifierProvider, "paymentMethodIdentifierProvider");
        Intrinsics.checkNotNullParameter(savePaymentForMapper, "savePaymentForMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f269963l = paymentMethodsInteractor;
        this.f269964m = paymentMethodIdentifierProvider;
        this.f269965n = savePaymentForMapper;
        this.o = inputData;
        this.f269966p = pyd.c.a(this, new m(a.f269948a, new Data(null, null, true, 3, null), false, null, null));
        this.f269967q = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f269968r = yhm.j.b(new sii.a(this, 28));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f269966p;
    }
}
