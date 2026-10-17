package zfk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends c.b {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f322024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanSubscription f322025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbk.f f322026c;
    public final String d;

    public i(hha.d selectedPlan, PricingPlanSubscription subscription, kbk.f fVar, String str) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f322024a = selectedPlan;
        this.f322025b = subscription;
        this.f322026c = fVar;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f322024a, iVar.f322024a) && Intrinsics.f(this.f322025b, iVar.f322025b) && Intrinsics.f(this.f322026c, iVar.f322026c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f322025b.hashCode() + (this.f322024a.hashCode() * 31)) * 31;
        kbk.f fVar = this.f322026c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
