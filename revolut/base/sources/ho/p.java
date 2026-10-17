package ho;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f154191b;

    public p(String eventName, Map params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f154190a = eventName;
        this.f154191b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f154190a, pVar.f154190a) && Intrinsics.f(this.f154191b, pVar.f154191b);
    }

    public final int hashCode() {
        return this.f154191b.hashCode() + (this.f154190a.hashCode() * 31);
    }

    public /* synthetic */ p(String str) {
        this(str, r0.g());
    }
}
