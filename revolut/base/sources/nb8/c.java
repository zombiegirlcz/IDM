package nb8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214012a;

    public c(String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        this.f214012a = registeredIdentityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f214012a, ((c) obj2).f214012a);
    }

    public final int hashCode() {
        return this.f214012a.hashCode();
    }
}
