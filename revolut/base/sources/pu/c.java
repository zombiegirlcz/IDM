package pu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd9.b f239782a;

    public c(sd9.b controllerDescriptor) {
        Intrinsics.checkNotNullParameter(controllerDescriptor, "controllerDescriptor");
        this.f239782a = controllerDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f239782a.equals(((c) obj2).f239782a);
    }

    public final int hashCode() {
        return this.f239782a.f261835a.hashCode();
    }
}
