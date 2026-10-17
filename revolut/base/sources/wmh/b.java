package wmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzh.d f298667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f298668b;

    public b(vzh.d controllerExtension, f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f298667a = controllerExtension;
        this.f298668b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f298667a.equals(bVar.f298667a) && this.f298668b.equals(bVar.f298668b);
    }

    public final int hashCode() {
        return this.f298668b.hashCode() + (this.f298667a.hashCode() * 31);
    }
}
