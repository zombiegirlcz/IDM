package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e13.a f211699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h93.l0 f211700b;

    public e(e13.a flowType, h93.l0 subProductType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        this.f211699a = flowType;
        this.f211700b = subProductType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f211699a == eVar.f211699a && this.f211700b == eVar.f211700b;
    }

    public final int hashCode() {
        return this.f211700b.hashCode() + (this.f211699a.hashCode() * 31);
    }
}
