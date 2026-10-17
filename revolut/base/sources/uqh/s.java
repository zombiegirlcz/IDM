package uqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f282173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f282174b;

    public s(o controllerExtension, u controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f282173a = controllerExtension;
        this.f282174b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f282173a.equals(sVar.f282173a) && this.f282174b.equals(sVar.f282174b);
    }

    public final int hashCode() {
        return this.f282174b.hashCode() + (this.f282173a.hashCode() * 31);
    }
}
