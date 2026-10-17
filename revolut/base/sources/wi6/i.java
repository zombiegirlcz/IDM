package wi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f297815b;

    public i(String clientId, String request) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f297814a = clientId;
        this.f297815b = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f297814a, iVar.f297814a) && Intrinsics.f(this.f297815b, iVar.f297815b);
    }

    public final int hashCode() {
        return this.f297815b.hashCode() + (this.f297814a.hashCode() * 31);
    }
}
