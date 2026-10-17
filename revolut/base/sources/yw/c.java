package yw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f317228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f317229c;

    public c(int i, m maxSideResolution, j compressionType) {
        Intrinsics.checkNotNullParameter(maxSideResolution, "maxSideResolution");
        Intrinsics.checkNotNullParameter(compressionType, "compressionType");
        this.f317227a = i;
        this.f317228b = maxSideResolution;
        this.f317229c = compressionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f317227a == cVar.f317227a && Intrinsics.f(this.f317228b, cVar.f317228b) && this.f317229c == cVar.f317229c;
    }

    public final int hashCode() {
        return this.f317229c.hashCode() + ((this.f317228b.hashCode() + (Integer.hashCode(this.f317227a) * 31)) * 31);
    }
}
