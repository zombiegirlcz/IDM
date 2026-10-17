package vmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f290581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f290582b;

    public b(h controllerExtension, k controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f290581a = controllerExtension;
        this.f290582b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f290581a.equals(bVar.f290581a) && this.f290582b.equals(bVar.f290582b);
    }

    public final int hashCode() {
        return this.f290582b.hashCode() + (this.f290581a.hashCode() * 31);
    }
}
