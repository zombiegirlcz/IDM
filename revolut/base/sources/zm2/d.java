package zm2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323324a;

    public d(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        this.f323324a = imagePath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f323324a, ((d) obj2).f323324a);
    }

    public final int hashCode() {
        return this.f323324a.hashCode();
    }
}
