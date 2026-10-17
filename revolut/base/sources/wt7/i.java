package wt7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements dli.b {
    public final DocumentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f299834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ij0.a f299835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ys7.h f299836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f299837s;

    public i(n stateMapper, DocumentsScreenContract$InputData inputData, x deeplinkHandler, ij0.a coreNetworkConfiguration, ys7.h detailsRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(detailsRepository, "detailsRepository");
        this.o = inputData;
        this.f299834p = deeplinkHandler;
        this.f299835q = coreNetworkConfiguration;
        this.f299836r = detailsRepository;
        this.f299837s = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.n(ys7.h.a(this.f299836r, this.o.f75842a), h0.f322473a), null, null, new wka.e(this, null, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f299837s;
    }
}
