package fih;

import gjh.d;
import gjh.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f135421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f135422b;

    public a(d controllerExtension, e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f135421a = controllerExtension;
        this.f135422b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f135421a.equals(aVar.f135421a) && this.f135422b.equals(aVar.f135422b);
    }

    public final int hashCode() {
        return this.f135422b.hashCode() + (this.f135421a.hashCode() * 31);
    }
}
