package ko8;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements dli.b {
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f186275p;

    public i(j stateMapper, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = clipboard;
        this.f186275p = mra.d.b(this, new d(""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f186275p;
    }
}
