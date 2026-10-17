package lg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz3.c f195054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195055b;

    public m(bz3.c config, String photoPath) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(photoPath, "photoPath");
        this.f195054a = config;
        this.f195055b = photoPath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f195054a, mVar.f195054a) && Intrinsics.f(this.f195055b, mVar.f195055b);
    }

    public final int hashCode() {
        return this.f195055b.hashCode() + (this.f195054a.hashCode() * 31);
    }
}
