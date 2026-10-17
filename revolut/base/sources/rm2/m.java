package rm2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255194a;

    public m(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        this.f255194a = imagePath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f255194a, ((m) obj2).f255194a);
    }

    public final int hashCode() {
        return this.f255194a.hashCode();
    }
}
