package jlc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final upc.c f175710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f88.f f175711b;

    public z(upc.c controllerExtension, f88.f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f175710a = controllerExtension;
        this.f175711b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f175710a.equals(zVar.f175710a) && this.f175711b.equals(zVar.f175711b);
    }

    public final int hashCode() {
        return this.f175711b.hashCode() + (this.f175710a.hashCode() * 31);
    }
}
