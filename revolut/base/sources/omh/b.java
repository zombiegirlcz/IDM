package omh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f226847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f226848b;

    public b(e controllerExtension, f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f226847a = controllerExtension;
        this.f226848b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f226847a.equals(bVar.f226847a) && this.f226848b.equals(bVar.f226848b);
    }

    public final int hashCode() {
        return this.f226848b.hashCode() + (this.f226847a.hashCode() * 31);
    }
}
