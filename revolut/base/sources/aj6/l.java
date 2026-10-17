package aj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5415b;

    public l(String clientId, String requestUri) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        this.f5414a = clientId;
        this.f5415b = requestUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f5414a, lVar.f5414a) && Intrinsics.f(this.f5415b, lVar.f5415b);
    }

    public final int hashCode() {
        return this.f5415b.hashCode() + (this.f5414a.hashCode() * 31);
    }
}
