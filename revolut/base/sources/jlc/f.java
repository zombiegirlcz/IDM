package jlc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoc.f f175682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qoc.r f175683b;

    public f(qoc.f controllerExtension, qoc.r controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f175682a = controllerExtension;
        this.f175683b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f175682a.equals(fVar.f175682a) && this.f175683b.equals(fVar.f175683b);
    }

    public final int hashCode() {
        return this.f175683b.hashCode() + (this.f175682a.hashCode() * 31);
    }
}
