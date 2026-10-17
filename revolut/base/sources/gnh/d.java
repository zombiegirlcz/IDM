package gnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f144993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cc7.l f144994b;

    public d(s controllerExtension, cc7.l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f144993a = controllerExtension;
        this.f144994b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f144993a.equals(dVar.f144993a) && this.f144994b.equals(dVar.f144994b);
    }

    public final int hashCode() {
        return this.f144994b.hashCode() + (this.f144993a.hashCode() * 31);
    }
}
