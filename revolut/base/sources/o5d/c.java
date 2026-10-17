package o5d;

import aah.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f222422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5d.c f222423b;

    public c(g controllerExtension, t5d.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f222422a = controllerExtension;
        this.f222423b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f222422a.equals(cVar.f222422a) && this.f222423b.equals(cVar.f222423b);
    }

    public final int hashCode() {
        return this.f222423b.hashCode() + (this.f222422a.hashCode() * 31);
    }
}
