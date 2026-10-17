package v44;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285941b;

    public f(String documentHtmlUrl, String str) {
        Intrinsics.checkNotNullParameter(documentHtmlUrl, "documentHtmlUrl");
        this.f285940a = documentHtmlUrl;
        this.f285941b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f285940a, fVar.f285940a) && Intrinsics.f(this.f285941b, fVar.f285941b);
    }

    public final int hashCode() {
        int iHashCode = this.f285940a.hashCode() * 31;
        String str = this.f285941b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
