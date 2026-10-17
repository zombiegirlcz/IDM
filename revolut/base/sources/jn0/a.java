package jn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176644a;

    public a(String identityId) {
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        this.f176644a = identityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f176644a, ((a) obj2).f176644a);
    }

    public final int hashCode() {
        return this.f176644a.hashCode();
    }
}
