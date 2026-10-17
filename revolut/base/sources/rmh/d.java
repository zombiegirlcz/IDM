package rmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aah.g f255324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f255325b;

    public d(aah.g controllerExtension, b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f255324a = controllerExtension;
        this.f255325b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f255324a.equals(dVar.f255324a) && this.f255325b.equals(dVar.f255325b);
    }

    public final int hashCode() {
        return this.f255325b.hashCode() + (this.f255324a.hashCode() * 31);
    }
}
