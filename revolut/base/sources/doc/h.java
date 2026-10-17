package doc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f116502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f116503b;

    public h(t controllerModelExtension, n controllerExtension) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        this.f116502a = controllerModelExtension;
        this.f116503b = controllerExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f116502a.equals(hVar.f116502a) && this.f116503b.equals(hVar.f116503b);
    }

    public final int hashCode() {
        return this.f116503b.hashCode() + (this.f116502a.hashCode() * 31);
    }
}
