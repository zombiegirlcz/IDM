package v44;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f285956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285957b;

    public l(Map headers, String userAgentString) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(userAgentString, "userAgentString");
        this.f285956a = headers;
        this.f285957b = userAgentString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f285956a.equals(lVar.f285956a) && Intrinsics.f(this.f285957b, lVar.f285957b);
    }

    public final int hashCode() {
        return this.f285957b.hashCode() + (this.f285956a.hashCode() * 31);
    }
}
