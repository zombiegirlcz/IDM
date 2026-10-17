package ymh;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeroBannerDelegate f314993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HeroBannerLoadingDelegate f314994b;

    public a(HeroBannerDelegate bannerDelegate, HeroBannerLoadingDelegate bannerLoadingDelegate) {
        Intrinsics.checkNotNullParameter(bannerDelegate, "bannerDelegate");
        Intrinsics.checkNotNullParameter(bannerLoadingDelegate, "bannerLoadingDelegate");
        this.f314993a = bannerDelegate;
        this.f314994b = bannerLoadingDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314993a, aVar.f314993a) && Intrinsics.f(this.f314994b, aVar.f314994b);
    }

    public final int hashCode() {
        return this.f314994b.hashCode() + (this.f314993a.hashCode() * 31);
    }
}
