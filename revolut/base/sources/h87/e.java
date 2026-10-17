package h87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f149951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.n f149952b;

    public e(p controllerExtension, yji.n controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f149951a = controllerExtension;
        this.f149952b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f149951a.equals(eVar.f149951a) && Intrinsics.f(this.f149952b, eVar.f149952b);
    }

    public final int hashCode() {
        return this.f149952b.hashCode() + (this.f149951a.hashCode() * 31);
    }
}
