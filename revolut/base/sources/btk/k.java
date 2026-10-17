package btk;

import au6.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f18638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f18639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final udf.a f18640n;
    public final c4h.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f18641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f18642q;

    public k(e inputData, n domainStateProvider, udf.a createTradingOrderCommandProvider, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(domainStateProvider, "domainStateProvider");
        Intrinsics.checkNotNullParameter(createTradingOrderCommandProvider, "createTradingOrderCommandProvider");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f18638l = inputData;
        this.f18639m = domainStateProvider;
        this.f18640n = createTradingOrderCommandProvider;
        this.o = stockOnboardingInteractor;
        d dVar = new d(null);
        this.f18641p = dVar;
        this.f18642q = pyd.c.a(this, dVar);
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, q.Q(this.o.a(), new a3((Continuation) null, this, 27)), null, null, 7);
    }

    @Override // btk.b
    public final void Z2(f parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        V2(new j(this, parcel, null, 0), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f18642q;
    }
}
