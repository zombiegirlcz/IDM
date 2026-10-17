package y66;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements b {
    public final DeFiAssetPickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k18.c f311197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xv5.c f311198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a76.b f311199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f311200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f311201t;
    public final vii.b u;
    public final y v;

    public o(s stateMapper, DeFiAssetPickerContract$InputData inputData, k18.c accountsInteractor, xv5.c baseCurrencyInteractor, a76.b assetsPagingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(assetsPagingInteractor, "assetsPagingInteractor");
        this.o = inputData;
        this.f311197p = accountsInteractor;
        this.f311198q = baseCurrencyInteractor;
        this.f311199r = assetsPagingInteractor;
        this.f311200s = v0.a.d("create(...)");
        this.u = new vii.b();
        this.v = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new xb4.e(this, continuation, 29), new yi5.b(26));
        i iVar = new i(0, continuation, this);
        vii.b bVar = this.u;
        yji.l.a1(this, vkm.q.Q(bVar, iVar), null, null, new l(0, continuation, this), 3);
        yji.l.a1(this, rd0.e.b(((a76.e) this.f311199r).f1775c), null, null, new l(1, continuation, this), 3);
        yji.l.a1(this, t1.g(new t0(vkm.q.Q(bVar, new i(1, continuation, this)), 1), 300L), null, null, new l(2, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
