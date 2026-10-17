package inh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aah.g f162940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f162941b;

    public b(aah.g controllerExtension, h controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f162940a = controllerExtension;
        this.f162941b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f162940a.equals(bVar.f162940a) && this.f162941b.equals(bVar.f162941b);
    }

    public final int hashCode() {
        return this.f162941b.hashCode() + (this.f162940a.hashCode() * 31);
    }
}
