package j87;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.ui_kit_globe_view.delegate.GlobeDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f172131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobeDelegate f172132b;

    public b(FullScreenStateDelegate fullScreenStateDelegate, GlobeDelegate globeDelegate) {
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        Intrinsics.checkNotNullParameter(globeDelegate, "globeDelegate");
        this.f172131a = fullScreenStateDelegate;
        this.f172132b = globeDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f172131a, bVar.f172131a) && Intrinsics.f(this.f172132b, bVar.f172132b);
    }

    public final int hashCode() {
        return this.f172132b.hashCode() + (this.f172131a.hashCode() * 31);
    }
}
