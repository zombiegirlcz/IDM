package l27;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements dli.b {
    public final FreelancerQrShareScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f191694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c90.c f191695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f191696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f191697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f191698t;

    public i(FreelancerQrShareScreenContract$InputData inputData, fkg.a qrCodeGenerator, c90.c uiResources, ang.f userInteractor, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f191694p = qrCodeGenerator;
        this.f191695q = uiResources;
        this.f191696r = userInteractor;
        this.f191697s = new vii.b();
        this.f191698t = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f74199a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f191697s, new g(kli.a.k(this.f191695q.f22265a, 263.0f), 0, this, null)), null, null, new h(0, null, this), 3);
        l.a1(this, rd0.e.b(this.f191696r.k(false)), null, null, new h(1, null, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191698t;
    }
}
