package ty;

import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends oki.h implements dli.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f275443p;

    public g(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f275443p = mra.d.b(this, k.f25028a, new hog.d(this, 8), null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f275443p;
    }
}
