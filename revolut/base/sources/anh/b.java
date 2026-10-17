package anh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7782b;

    public b(m controllerExtension, o controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f7781a = controllerExtension;
        this.f7782b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f7781a.equals(bVar.f7781a) && this.f7782b.equals(bVar.f7782b);
    }

    public final int hashCode() {
        return this.f7782b.hashCode() + (this.f7781a.hashCode() * 31);
    }
}
