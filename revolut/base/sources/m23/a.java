package m23;

import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e13.a f201685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f201686b;

    public a(e13.a flowType, l0 subProductType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        this.f201685a = flowType;
        this.f201686b = subProductType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f201685a == aVar.f201685a && this.f201686b == aVar.f201686b;
    }

    public final int hashCode() {
        return this.f201686b.hashCode() + (this.f201685a.hashCode() * 31);
    }
}
