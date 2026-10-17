package jlh;

import kotlin.jvm.internal.Intrinsics;
import tv5.a;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements nih.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv5.b f175836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9h.d f175837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f175838c;

    public w(tv5.b currencyDiscoveryInteractor, e9h.d performanceAssetsTransformer, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f175836a = currencyDiscoveryInteractor;
        this.f175837b = performanceAssetsTransformer;
        this.f175838c = uiKitResources;
    }

    public final efm.r a(String str) {
        return pd.b.r(nim.a.w(((xv5.h) this.f175836a).a(a.C1526a.f274716a), new je2.d(str, this, 22)), new g(this, 1));
    }
}
