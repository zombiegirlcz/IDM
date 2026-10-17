package nze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221031a;

    public f(String mandateId) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.f221031a = mandateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f221031a, ((f) obj2).f221031a);
    }

    public final int hashCode() {
        return this.f221031a.hashCode();
    }
}
