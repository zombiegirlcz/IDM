package pdg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235210a;

    public n(List backgroundImages) {
        Intrinsics.checkNotNullParameter(backgroundImages, "backgroundImages");
        this.f235210a = backgroundImages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f235210a, ((n) obj2).f235210a);
    }

    public final int hashCode() {
        return this.f235210a.hashCode();
    }
}
