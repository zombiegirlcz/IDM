package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f195331b;

    public e(String planId, hha.i billing) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billing, "billing");
        this.f195330a = planId;
        this.f195331b = billing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f195330a, eVar.f195330a) && this.f195331b == eVar.f195331b;
    }

    public final int hashCode() {
        return this.f195331b.hashCode() + (this.f195330a.hashCode() * 31);
    }
}
