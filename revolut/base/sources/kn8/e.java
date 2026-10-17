package kn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186032a;

    public e(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f186032a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f186032a, ((e) obj2).f186032a);
    }

    public final int hashCode() {
        return this.f186032a.hashCode();
    }
}
