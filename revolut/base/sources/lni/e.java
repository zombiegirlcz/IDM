package lni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mni.b f197260a;

    public e(mni.b otpMethod) {
        Intrinsics.checkNotNullParameter(otpMethod, "otpMethod");
        this.f197260a = otpMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f197260a == ((e) obj2).f197260a;
    }

    public final int hashCode() {
        return this.f197260a.hashCode();
    }
}
