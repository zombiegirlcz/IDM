package kpb;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f188216a;

    public f(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f188216a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f188216a, ((f) obj2).f188216a);
    }

    public final int hashCode() {
        return this.f188216a.hashCode();
    }
}
