package bnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f17208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f17209b;

    public p(a0 controllerExtension, c0 controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f17208a = controllerExtension;
        this.f17209b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f17208a.equals(pVar.f17208a) && this.f17209b.equals(pVar.f17209b);
    }

    public final int hashCode() {
        return this.f17209b.hashCode() + (this.f17208a.hashCode() * 31);
    }
}
