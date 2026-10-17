package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266287a;

    public f0(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.f266287a = videoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f266287a, ((f0) obj2).f266287a);
    }

    public final int hashCode() {
        return this.f266287a.hashCode();
    }
}
