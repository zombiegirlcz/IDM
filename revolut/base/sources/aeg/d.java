package aeg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3579a;

    public d(List backgroundImages) {
        Intrinsics.checkNotNullParameter(backgroundImages, "backgroundImages");
        this.f3579a = backgroundImages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f3579a, ((d) obj2).f3579a);
    }

    public final int hashCode() {
        return this.f3579a.hashCode();
    }
}
