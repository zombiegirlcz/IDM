package spc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f264945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c84.c f264946b;

    public c(d controllerExtension, c84.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f264945a = controllerExtension;
        this.f264946b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f264945a.equals(cVar.f264945a) && this.f264946b.equals(cVar.f264946b);
    }

    public final int hashCode() {
        return this.f264946b.hashCode() + (this.f264945a.hashCode() * 31);
    }
}
