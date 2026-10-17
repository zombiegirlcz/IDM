package mw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209326a;

    public f(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f209326a = applicationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f209326a, ((f) obj2).f209326a);
    }

    public final int hashCode() {
        return this.f209326a.hashCode();
    }
}
