package mme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207205b;

    public a(String slotId, boolean z) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.f207204a = slotId;
        this.f207205b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207204a, aVar.f207204a) && this.f207205b == aVar.f207205b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207205b) + (this.f207204a.hashCode() * 31);
    }
}
