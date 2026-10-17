package e3h;

import i4h.n;
import i4h.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f122270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f122271b;

    public a(n controllerExtension, p0 controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f122270a = controllerExtension;
        this.f122271b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f122270a.equals(aVar.f122270a) && this.f122271b.equals(aVar.f122271b);
    }

    public final int hashCode() {
        return this.f122271b.hashCode() + (this.f122270a.hashCode() * 31);
    }
}
