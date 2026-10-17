package owf;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends oki.h implements dli.b {
    public final ouf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f230448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TransportTermsScreenContract$InputData f230449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f230450r;

    public m(ouf.a transportInteractor, hk0.a networkFileRepository, TransportTermsScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transportInteractor;
        this.f230448p = networkFileRepository;
        this.f230449q = inputData;
        this.f230450r = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str = this.f230449q.f92556a.f;
        if (str != null) {
            l2(new j(this, str, null), new yi5.b(26));
        } else {
            H2(this.f230450r, new oqk.c(this, 24));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230450r;
    }
}
