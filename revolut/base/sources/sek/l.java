package sek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262212a;

    public l(String podNomineeId) {
        Intrinsics.checkNotNullParameter(podNomineeId, "podNomineeId");
        this.f262212a = podNomineeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f262212a, ((l) obj2).f262212a);
    }

    public final int hashCode() {
        return this.f262212a.hashCode();
    }
}
