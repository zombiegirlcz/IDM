package no8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217954a;

    public j(String phoneNumberRemoved) {
        Intrinsics.checkNotNullParameter(phoneNumberRemoved, "phoneNumberRemoved");
        this.f217954a = phoneNumberRemoved;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f217954a, ((j) obj2).f217954a);
    }

    public final int hashCode() {
        return this.f217954a.hashCode();
    }
}
