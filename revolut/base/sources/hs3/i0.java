package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f154897a;

    public i0(r1 signatureType) {
        Intrinsics.checkNotNullParameter(signatureType, "signatureType");
        this.f154897a = signatureType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && this.f154897a == ((i0) obj2).f154897a;
    }

    public final int hashCode() {
        return this.f154897a.hashCode();
    }
}
