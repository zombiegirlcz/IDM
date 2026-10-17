package r00;

import e10.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f250676a;

    public d(l faceValidationResult) {
        Intrinsics.checkNotNullParameter(faceValidationResult, "faceValidationResult");
        this.f250676a = faceValidationResult;
    }

    @Override // r00.e
    public final l a() {
        return this.f250676a;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f250676a, ((d) obj2).f250676a);
    }

    public final int hashCode() {
        return this.f250676a.hashCode();
    }
}
