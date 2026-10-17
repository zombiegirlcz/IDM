package ohe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.jvm.internal.Intrinsics;
import yfe.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f225361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f225362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yfe.h f225363c;

    public f(TotalWealthCategoryKey categoryKey, r0 state, yfe.h snapshot) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f225361a = categoryKey;
        this.f225362b = state;
        this.f225363c = snapshot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f225361a, fVar.f225361a) && Intrinsics.f(this.f225362b, fVar.f225362b) && Intrinsics.f(this.f225363c, fVar.f225363c);
    }

    public final int hashCode() {
        return this.f225363c.hashCode() + ((this.f225362b.hashCode() + (this.f225361a.hashCode() * 31)) * 31);
    }
}
