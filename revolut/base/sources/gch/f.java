package gch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f142475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f142476b;

    public f(j controllerExtension, k controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f142475a = controllerExtension;
        this.f142476b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f142475a.equals(fVar.f142475a) && this.f142476b.equals(fVar.f142476b);
    }

    public final int hashCode() {
        return this.f142476b.hashCode() + (this.f142475a.hashCode() * 31);
    }
}
