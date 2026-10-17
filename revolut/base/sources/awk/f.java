package awk;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f10801c;

    public f(Set preselectedAssetStatsIdSet, e filter, hel.b bVar) {
        Intrinsics.checkNotNullParameter(preselectedAssetStatsIdSet, "preselectedAssetStatsIdSet");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f10799a = preselectedAssetStatsIdSet;
        this.f10800b = filter;
        this.f10801c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f10799a, fVar.f10799a) && Intrinsics.f(this.f10800b, fVar.f10800b) && this.f10801c == fVar.f10801c;
    }

    public final int hashCode() {
        int iHashCode = (this.f10800b.hashCode() + (this.f10799a.hashCode() * 31)) * 31;
        hel.b bVar = this.f10801c;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
