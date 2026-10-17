package ble;

import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kla.a f16555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp.r f16556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f16557c;

    public b(kla.a productIntroToggleResolver, mp.r productIntroInteractor) {
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
        this.f16555a = productIntroToggleResolver;
        this.f16556b = productIntroInteractor;
        this.f16557c = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }
}
