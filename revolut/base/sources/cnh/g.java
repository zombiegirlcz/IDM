package cnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f25429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25430b;

    public g(d controllerExtension, f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f25429a = controllerExtension;
        this.f25430b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f25429a.equals(gVar.f25429a) && this.f25430b.equals(gVar.f25430b);
    }

    public final int hashCode() {
        return this.f25430b.hashCode() + (this.f25429a.hashCode() * 31);
    }
}
