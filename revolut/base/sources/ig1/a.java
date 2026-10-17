package ig1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f161071a;

    public a(Map extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        this.f161071a = extraParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f161071a.equals(((a) obj2).f161071a);
    }

    public final int hashCode() {
        return this.f161071a.hashCode();
    }
}
