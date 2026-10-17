package sx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends com.revolut.feature.card_design.impl.card_design.carousel.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266317a;

    public n0(String designId) {
        Intrinsics.checkNotNullParameter(designId, "designId");
        this.f266317a = designId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f266317a, ((n0) obj2).f266317a);
    }

    public final int hashCode() {
        return this.f266317a.hashCode();
    }
}
