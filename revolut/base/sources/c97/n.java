package c97;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f22336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22337b;

    public n(m mVar, LinkedHashMap overrides) {
        Intrinsics.checkNotNullParameter(mVar, "default");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.f22336a = mVar;
        this.f22337b = overrides;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f22336a.equals(nVar.f22336a) && this.f22337b.equals(nVar.f22337b);
    }

    public final int hashCode() {
        return this.f22337b.hashCode() + (this.f22336a.hashCode() * 31);
    }
}
