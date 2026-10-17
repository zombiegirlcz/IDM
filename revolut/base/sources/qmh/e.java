package qmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aah.g f247845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f247846b;

    public e(aah.g controllerExtension, j controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f247845a = controllerExtension;
        this.f247846b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f247845a.equals(eVar.f247845a) && this.f247846b.equals(eVar.f247846b);
    }

    public final int hashCode() {
        return this.f247846b.hashCode() + (this.f247845a.hashCode() * 31);
    }
}
