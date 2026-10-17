package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class aa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272632a;

    public aa(String juniorUserId) {
        Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
        this.f272632a = juniorUserId;
    }

    public final String a() {
        return this.f272632a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof aa) && Intrinsics.f(this.f272632a, ((aa) obj2).f272632a);
    }

    public final int hashCode() {
        return this.f272632a.hashCode();
    }
}
