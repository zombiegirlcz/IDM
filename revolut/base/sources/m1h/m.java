package m1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yji.n f201502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.d f201503b;

    public m(yji.n controllerModelExtension, yji.d controllerExtension) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        this.f201502a = controllerModelExtension;
        this.f201503b = controllerExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f201502a, mVar.f201502a) && Intrinsics.f(this.f201503b, mVar.f201503b);
    }

    public final int hashCode() {
        return this.f201503b.hashCode() + (this.f201502a.hashCode() * 31);
    }
}
