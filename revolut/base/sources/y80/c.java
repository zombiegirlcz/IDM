package y80;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f311616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f311617b;

    public c(LinkedHashMap permissionStatuses, boolean z) {
        Intrinsics.checkNotNullParameter(permissionStatuses, "permissionStatuses");
        this.f311616a = z;
        this.f311617b = permissionStatuses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f311616a == cVar.f311616a && this.f311617b.equals(cVar.f311617b);
    }

    public final int hashCode() {
        return this.f311617b.hashCode() + (Boolean.hashCode(this.f311616a) * 31);
    }
}
