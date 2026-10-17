package m4j;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements i {
    public final n60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f202743p;

    public k(n60.a keyboardExtension, m stateMapper, g inputData) {
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = keyboardExtension;
        m70.a.c(t0.f186434a);
        this.f202743p = mra.d.b(this, new f("", inputData.f202737b, inputData.f202736a, inputData.f202738c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f202743p;
    }
}
