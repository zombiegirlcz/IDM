package mmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f207221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f207222b;

    public b(i controllerExtension, j controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f207221a = controllerExtension;
        this.f207222b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f207221a.equals(bVar.f207221a) && this.f207222b.equals(bVar.f207222b);
    }

    public final int hashCode() {
        return this.f207222b.hashCode() + (this.f207221a.hashCode() * 31);
    }
}
