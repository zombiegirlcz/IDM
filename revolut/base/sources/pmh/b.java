package pmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f237569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f237570b;

    public b(k controllerExtension, l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f237569a = controllerExtension;
        this.f237570b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f237569a.equals(bVar.f237569a) && this.f237570b.equals(bVar.f237570b);
    }

    public final int hashCode() {
        return this.f237570b.hashCode() + (this.f237569a.hashCode() * 31);
    }
}
