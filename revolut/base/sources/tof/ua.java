package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ua extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273108a;

    public ua(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f273108a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ua) && Intrinsics.f(this.f273108a, ((ua) obj2).f273108a);
    }

    public final String getPocketId() {
        return this.f273108a;
    }

    public final int hashCode() {
        return this.f273108a.hashCode();
    }
}
