package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class rb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273032a;

    public rb(String recipientId) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        this.f273032a = recipientId;
    }

    public final String a() {
        return this.f273032a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof rb) && Intrinsics.f(this.f273032a, ((rb) obj2).f273032a);
    }

    public final int hashCode() {
        return this.f273032a.hashCode();
    }
}
