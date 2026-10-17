package yai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312031b;

    public j(String email, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f312030a = email;
        this.f312031b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f312030a, jVar.f312030a) && this.f312031b == jVar.f312031b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f312031b) + (this.f312030a.hashCode() * 31);
    }
}
