package j87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f172133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.n f172134b;

    public c(l controllerExtension, a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f172133a = controllerExtension;
        this.f172134b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f172133a.equals(cVar.f172133a) && Intrinsics.f(this.f172134b, cVar.f172134b);
    }

    public final int hashCode() {
        return this.f172134b.hashCode() + (this.f172133a.hashCode() * 31);
    }
}
