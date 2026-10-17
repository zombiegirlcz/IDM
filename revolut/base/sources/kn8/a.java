package kn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f186028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186029b;

    public a(boolean z, String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f186028a = z;
        this.f186029b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f186028a == aVar.f186028a && Intrinsics.f(this.f186029b, aVar.f186029b);
    }

    public final int hashCode() {
        return this.f186029b.hashCode() + (Boolean.hashCode(this.f186028a) * 31);
    }
}
