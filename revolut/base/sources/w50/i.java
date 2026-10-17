package w50;

import cli.y;
import cli.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends oki.h implements z {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f294660p;

    public i(j dateSelection, kxk.o stateMapper) {
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dateSelection;
        this.f294660p = mra.d.b(this, new a(null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294660p;
    }
}
