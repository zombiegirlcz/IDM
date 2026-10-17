package ij4;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hw3.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final h0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f161707p;

    public j(h0 interactor, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f161707p = mra.d.b(this, new g(new Data(null, null, true, 3, null), null, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f161707p, new igh.k(23));
        n2(new hy2.e(this, null, 27), new ii4.b(this, 5));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161707p;
    }
}
