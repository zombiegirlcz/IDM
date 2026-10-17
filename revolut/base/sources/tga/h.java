package tga;

import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpgradeEntryPointItemContract$ItemType f271117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f271119c;

    public h(UpgradeEntryPointItemContract$ItemType type, boolean z, List availablePlansForUpgrade) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(availablePlansForUpgrade, "availablePlansForUpgrade");
        this.f271117a = type;
        this.f271118b = z;
        this.f271119c = availablePlansForUpgrade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f271117a, hVar.f271117a) && this.f271118b == hVar.f271118b && Intrinsics.f(this.f271119c, hVar.f271119c);
    }

    public final int hashCode() {
        return this.f271119c.hashCode() + j6.a.c(this.f271117a.hashCode() * 31, 31, this.f271118b);
    }
}
