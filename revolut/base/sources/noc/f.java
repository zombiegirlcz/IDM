package noc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f217981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f217982b;

    public f(l controllerModelExtension, j controllerExtension) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        this.f217981a = controllerModelExtension;
        this.f217982b = controllerExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f217981a.equals(fVar.f217981a) && this.f217982b.equals(fVar.f217982b);
    }

    public final int hashCode() {
        return this.f217982b.hashCode() + (this.f217981a.hashCode() * 31);
    }
}
