package moe;

import kotlin.jvm.internal.Intrinsics;
import y7a.w;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f207645a;

    public b(l selectedRule) {
        Intrinsics.checkNotNullParameter(selectedRule, "selectedRule");
        this.f207645a = selectedRule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f207645a, ((b) obj2).f207645a);
    }

    public final int hashCode() {
        return this.f207645a.hashCode();
    }
}
