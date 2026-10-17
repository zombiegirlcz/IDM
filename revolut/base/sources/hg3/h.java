package hg3;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements c {
    public final cg3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f152083p;

    public h(b inputData, cg3.a sdkHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sdkHelper, "sdkHelper");
        this.o = sdkHelper;
        this.f152083p = mra.d.b(this, new a(inputData.f152079a), new a54.b(12), null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152083p;
    }
}
