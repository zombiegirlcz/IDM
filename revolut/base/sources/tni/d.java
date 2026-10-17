package tni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mni.b f272456a;

    public d(mni.b otpMethod) {
        Intrinsics.checkNotNullParameter(otpMethod, "otpMethod");
        this.f272456a = otpMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f272456a == ((d) obj2).f272456a;
    }

    public final int hashCode() {
        return this.f272456a.hashCode();
    }
}
