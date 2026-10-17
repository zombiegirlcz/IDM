package d63;

import f63.d;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f111443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f111444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f111445n;

    public c(d scanNfcManager) {
        Intrinsics.checkNotNullParameter(scanNfcManager, "scanNfcManager");
        this.f111443l = scanNfcManager;
        this.f111444m = ta6.a.a(0);
        this.f111445n = ta6.a.a(0);
    }

    @Override // yji.n
    public final void H2() {
        d dVar = this.f111443l;
        this.f111444m.k(!dVar.b() ? z53.a.NOT_SUPPORTED : !dVar.a() ? z53.a.DISABLED : z53.a.ENABLED);
    }
}
