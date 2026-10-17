package vrc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291575a;

    public f(String legalEntityId) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        this.f291575a = legalEntityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f291575a, ((f) obj2).f291575a);
    }

    public final int hashCode() {
        return this.f291575a.hashCode();
    }
}
