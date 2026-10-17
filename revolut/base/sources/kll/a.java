package kll;

import akl.i0;
import akl.z;
import k7c.l0;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f185650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f185651m;

    public a(i0 pendingAuthenticationRepository, z configurationRepository) {
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f185650l = pendingAuthenticationRepository;
        this.f185651m = configurationRepository;
    }

    @Override // yji.n
    public final void H2() {
        V2(new l0(this, null, 20), new yi5.b(29));
    }
}
