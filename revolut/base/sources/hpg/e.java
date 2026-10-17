package hpg;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f154525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pcd.b f154526b;

    public e(f0 revolutCard, pcd.b accountType) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f154525a = revolutCard;
        this.f154526b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154525a, eVar.f154525a) && this.f154526b == eVar.f154526b;
    }

    public final int hashCode() {
        return this.f154526b.hashCode() + (this.f154525a.hashCode() * 31);
    }
}
