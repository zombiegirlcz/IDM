package aeh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eeh.b f3586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eeh.c f3587b;

    public d(eeh.b controllerExtension, eeh.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f3586a = controllerExtension;
        this.f3587b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f3586a.equals(dVar.f3586a) && this.f3587b.equals(dVar.f3587b);
    }

    public final int hashCode() {
        return this.f3587b.hashCode() + (this.f3586a.hashCode() * 31);
    }
}
