package fi8;

import aii.r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f135348a;

    public g(Map consents) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f135348a = consents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f135348a, ((g) obj2).f135348a);
    }

    public final int hashCode() {
        return this.f135348a.hashCode();
    }
}
