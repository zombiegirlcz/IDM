package ih8;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lg8.a f161303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f161304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f161305r;

    public i(n stateMapper, d0 juniorPersonalisationInteractor, lg8.a inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorPersonalisationInteractor, "juniorPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.o = juniorPersonalisationInteractor;
        this.f161303p = inputData;
        this.f161304q = phoneToolsProvider;
        Intrinsics.checkNotNullParameter("https://assets.revolut.com/published-assets-v3/4dd61b5d-8ec4-4654-90f3-90624669bfc2/4d8124e7-7a34-40a2-bc93-de5292c6f0fc.mp4", "backgroundVideoUrl");
        this.f161305r = mra.d.b(this, new f(), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161305r;
    }
}
