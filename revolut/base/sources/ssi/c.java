package ssi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f265406a;

    public c(k71.i descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f265406a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f265406a, ((c) obj2).f265406a);
    }

    public final int hashCode() {
        return this.f265406a.hashCode();
    }
}
