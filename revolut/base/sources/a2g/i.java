package a2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f839a;

    public i(List backgroundImages) {
        Intrinsics.checkNotNullParameter(backgroundImages, "backgroundImages");
        this.f839a = backgroundImages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f839a, ((i) obj2).f839a);
    }

    public final int hashCode() {
        return this.f839a.hashCode();
    }
}
