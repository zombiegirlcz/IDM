package ja8;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends oki.h implements f {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f172462p;

    public g(i stateMapper, d inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f172462p = mra.d.b(this, c.f172459a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f172462p;
    }
}
