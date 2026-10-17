package ymh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f314995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f314996b;

    public b(e controllerExtension, g controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f314995a = controllerExtension;
        this.f314996b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f314995a.equals(bVar.f314995a) && this.f314996b.equals(bVar.f314996b);
    }

    public final int hashCode() {
        return this.f314996b.hashCode() + (this.f314995a.hashCode() * 31);
    }
}
