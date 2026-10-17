package zm2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323325a;

    public e(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        this.f323325a = imagePath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f323325a, ((e) obj2).f323325a);
    }

    public final int hashCode() {
        return this.f323325a.hashCode();
    }
}
