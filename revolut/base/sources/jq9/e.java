package jq9;

import kotlin.jvm.internal.Intrinsics;
import oq9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f177499a;

    public e(c0 settlement) {
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        this.f177499a = settlement;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177499a.c().getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return !Intrinsics.f(oi0.d.k(this.f177499a.b()), userCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f177499a, ((e) obj2).f177499a);
    }

    public final int hashCode() {
        return this.f177499a.hashCode();
    }
}
