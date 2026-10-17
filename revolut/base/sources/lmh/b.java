package lmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f197075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cnh.f f197076b;

    public b(k controllerExtension, cnh.f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f197075a = controllerExtension;
        this.f197076b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f197075a.equals(bVar.f197075a) && this.f197076b.equals(bVar.f197076b);
    }

    public final int hashCode() {
        return this.f197076b.hashCode() + (this.f197075a.hashCode() * 31);
    }
}
