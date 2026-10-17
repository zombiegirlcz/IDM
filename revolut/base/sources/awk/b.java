package awk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10796b;

    public b(i controllerExtension, l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f10795a = controllerExtension;
        this.f10796b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f10795a.equals(bVar.f10795a) && this.f10796b.equals(bVar.f10796b);
    }

    public final int hashCode() {
        return this.f10796b.hashCode() + (this.f10795a.hashCode() * 31);
    }
}
