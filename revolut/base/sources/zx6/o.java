package zx6;

import cli.y;
import et6.p1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements i {
    public final gr6.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jr6.m f326060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p1 f326061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f326062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f326063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f326064t;

    public o(gr6.i freelancerCurrencyInteractor, jr6.m freelancerDialogFactory, p1 freelancerInvoiceInteractor, wsg.n walletInteractor, q stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCurrencyInteractor;
        this.f326060p = freelancerDialogFactory;
        this.f326061q = freelancerInvoiceInteractor;
        this.f326062r = walletInteractor;
        this.f326063s = new vii.b();
        this.f326064t = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f326063s, new z6e.g(continuation, this, 24)), null, null, new zt4.l(this, continuation, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f326064t;
    }
}
