package fuk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f138230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f138231b;

    public d(l controllerExtension, t controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f138230a = controllerExtension;
        this.f138231b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f138230a.equals(dVar.f138230a) && this.f138231b.equals(dVar.f138231b);
    }

    public final int hashCode() {
        return this.f138231b.hashCode() + (this.f138230a.hashCode() * 31);
    }
}
