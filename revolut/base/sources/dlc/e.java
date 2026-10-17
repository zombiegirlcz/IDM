package dlc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hmc.c f115727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hmc.e f115728b;

    public e(hmc.c controllerExtension, hmc.e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f115727a = controllerExtension;
        this.f115728b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f115727a.equals(eVar.f115727a) && this.f115728b.equals(eVar.f115728b);
    }

    public final int hashCode() {
        return this.f115728b.hashCode() + (this.f115727a.hashCode() * 31);
    }
}
