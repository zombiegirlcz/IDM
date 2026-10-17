package y2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310640b;

    public e(String filterId, String valueId) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(valueId, "valueId");
        this.f310639a = filterId;
        this.f310640b = valueId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f310639a, eVar.f310639a) && Intrinsics.f(this.f310640b, eVar.f310640b);
    }

    public final int hashCode() {
        return this.f310640b.hashCode() + (this.f310639a.hashCode() * 31);
    }
}
