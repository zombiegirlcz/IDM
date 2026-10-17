package yv1;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends oki.h implements i {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sv1.d f317094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gw1.g f317095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317096r;

    public l(e inputData, sv1.d dialogsProvider, gw1.g replaceExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(replaceExtension, "replaceExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f317094p = dialogsProvider;
        this.f317095q = replaceExtension;
        this.f317096r = mra.d.b(this, new d(inputData.f317086a, inputData.f317087b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317096r;
    }
}
