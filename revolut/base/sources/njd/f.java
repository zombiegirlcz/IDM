package njd;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final toa.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f216453p;

    public f(toa.a notificationSettingsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = notificationSettingsInteractor;
        this.f216453p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f216453p;
    }
}
