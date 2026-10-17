package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f227043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f227044c;
    public final wi0.b d;

    public h(List allTripAnalytics, b extraParams, wi0.b bVar, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(allTripAnalytics, "allTripAnalytics");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        this.f227042a = allTripAnalytics;
        this.f227043b = extraParams;
        this.f227044c = bVar;
        this.d = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f227042a, hVar.f227042a) && Intrinsics.f(this.f227043b, hVar.f227043b) && Intrinsics.f(this.f227044c, hVar.f227044c) && Intrinsics.f(this.d, hVar.d);
    }

    @Override // ood.i
    public final b h() {
        return this.f227043b;
    }

    public final int hashCode() {
        int iHashCode = (this.f227043b.hashCode() + (this.f227042a.hashCode() * 31)) * 31;
        wi0.b bVar = this.f227044c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        wi0.b bVar2 = this.d;
        return iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }

    @Override // ood.i
    public final List i() {
        return this.f227042a;
    }
}
