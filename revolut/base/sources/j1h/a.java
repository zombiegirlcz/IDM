package j1h;

import kotlin.jvm.internal.Intrinsics;
import vel.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f170462a;

    public a(f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f170462a = performanceAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f170462a, ((a) obj2).f170462a);
    }

    public final int hashCode() {
        return this.f170462a.hashCode();
    }
}
