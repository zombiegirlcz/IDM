package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6351b;

    public v(String juniorId, String pocketId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f6350a = juniorId;
        this.f6351b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f6350a, vVar.f6350a) && Intrinsics.f(this.f6351b, vVar.f6351b);
    }

    public final int hashCode() {
        return this.f6351b.hashCode() + (this.f6350a.hashCode() * 31);
    }
}
