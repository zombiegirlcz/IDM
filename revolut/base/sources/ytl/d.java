package ytl;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import skm.e0;
import vkm.d2;
import vkm.h2;
import vkm.j2;
import vkm.q;
import vkm.t1;
import wtl.e;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o7.b f316842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final usc.a f316843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bul.a f316844n;
    public final CoroutineScope o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f316845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f316846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f316847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t1 f316848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1 f316849t;
    public final t1 u;

    public d(tkm.e dispatcher, o7.b orderQuoteInteractor, usc.a fiatExchangeOrderQuoteInteractor, bul.a convertedInputAmountProvider) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteInteractor, "fiatExchangeOrderQuoteInteractor");
        Intrinsics.checkNotNullParameter(convertedInputAmountProvider, "convertedInputAmountProvider");
        this.f316842l = orderQuoteInteractor;
        this.f316843m = fiatExchangeOrderQuoteInteractor;
        this.f316844n = convertedInputAmountProvider;
        CoroutineScope coroutineScopeA = rd0.e.a(dispatcher);
        this.o = coroutineScopeA;
        j2 j2VarY = m72.b.y(null, null, false, 7, null);
        this.f316845p = j2VarY;
        j2 j2VarY2 = m72.b.y(null, null, false, 7, null);
        this.f316846q = j2VarY2;
        Continuation continuation = null;
        j2 j2VarY3 = m72.b.y(null, null, false, 7, null);
        this.f316847r = j2VarY3;
        Flow flowH = xam.a.h(new c(this, continuation, 2), j2VarY);
        d2.Companion.getClass();
        this.f316848s = q.M(flowH, coroutineScopeA, new h2(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L), 1);
        this.f316849t = q.M(xam.a.h(new c(this, continuation, 1), j2VarY2), coroutineScopeA, new h2(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L), 1);
        this.u = q.M(xam.a.h(new c(this, continuation, 0), j2VarY3), coroutineScopeA, new h2(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L), 1);
    }

    @Override // yji.n
    public final void E2() {
        e0.n(this.o.getF100596a());
    }

    @Override // wtl.e
    public final t1 Z2() {
        return this.u;
    }

    @Override // wtl.e
    public final t1 b3() {
        return this.f316849t;
    }

    @Override // wtl.e
    public final t1 c3() {
        return this.f316848s;
    }

    @Override // wtl.e
    public final void d3(Data orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f316847r.setValue(orderQuoteParams);
    }

    @Override // wtl.e
    public final void e3(Data params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f316845p.setValue(params);
    }

    @Override // wtl.e
    public final void f3(Data orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f316846q.setValue(orderQuoteParams);
    }
}
