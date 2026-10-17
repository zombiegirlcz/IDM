package ikl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements rj0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj0.a f162000a;

    public b(rj0.a appNetworkToggles) {
        Intrinsics.checkNotNullParameter(appNetworkToggles, "appNetworkToggles");
        this.f162000a = appNetworkToggles;
    }

    @Override // rj0.a
    public final boolean a() {
        return true;
    }

    @Override // rj0.a
    public final boolean b() {
        return this.f162000a.b();
    }

    @Override // rj0.a
    public final boolean c() {
        return this.f162000a.c();
    }
}
