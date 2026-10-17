package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f227039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fod.c f227040c;

    public g(List allTripAnalytics, b extraParams, fod.c selectedTripAnalytics) {
        Intrinsics.checkNotNullParameter(allTripAnalytics, "allTripAnalytics");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        Intrinsics.checkNotNullParameter(selectedTripAnalytics, "selectedTripAnalytics");
        this.f227038a = allTripAnalytics;
        this.f227039b = extraParams;
        this.f227040c = selectedTripAnalytics;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f227038a, gVar.f227038a) && Intrinsics.f(this.f227039b, gVar.f227039b) && Intrinsics.f(this.f227040c, gVar.f227040c);
    }

    @Override // ood.i
    public final b h() {
        return this.f227039b;
    }

    public final int hashCode() {
        return this.f227040c.hashCode() + ((this.f227039b.hashCode() + (this.f227038a.hashCode() * 31)) * 31);
    }

    @Override // ood.i
    public final List i() {
        return this.f227038a;
    }
}
