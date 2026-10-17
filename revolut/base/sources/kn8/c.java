package kn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186031a;

    public c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f186031a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f186031a, ((c) obj2).f186031a);
    }

    public final int hashCode() {
        return this.f186031a.hashCode();
    }
}
