package p10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231603b;

    public f(String clientId, String revolutToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(revolutToken, "revolutToken");
        this.f231602a = clientId;
        this.f231603b = revolutToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f231602a, fVar.f231602a) && Intrinsics.f(this.f231603b, fVar.f231603b);
    }

    public final int hashCode() {
        return this.f231603b.hashCode() + (this.f231602a.hashCode() * 31);
    }
}
