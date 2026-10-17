package b1c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f11782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f11783c;
    public final h d;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data revPointsAccountStatus, Data savingsSummary, Data pricingPlan, h collapsibleSectionState, int i) {
        if ((i & 1) != 0) {
            revPointsAccountStatus = iVar.f11781a;
        }
        if ((i & 2) != 0) {
            savingsSummary = iVar.f11782b;
        }
        if ((i & 4) != 0) {
            pricingPlan = iVar.f11783c;
        }
        if ((i & 8) != 0) {
            collapsibleSectionState = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(savingsSummary, "savingsSummary");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(collapsibleSectionState, "collapsibleSectionState");
        return new i(revPointsAccountStatus, savingsSummary, pricingPlan, collapsibleSectionState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f11781a, iVar.f11781a) && Intrinsics.f(this.f11782b, iVar.f11782b) && Intrinsics.f(this.f11783c, iVar.f11783c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f11783c, kii.e.c(this.f11782b, this.f11781a.hashCode() * 31, 31), 31);
    }

    public i(Data revPointsAccountStatus, Data savingsSummary, Data pricingPlan, h collapsibleSectionState) {
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(savingsSummary, "savingsSummary");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(collapsibleSectionState, "collapsibleSectionState");
        this.f11781a = revPointsAccountStatus;
        this.f11782b = savingsSummary;
        this.f11783c = pricingPlan;
        this.d = collapsibleSectionState;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new h(false, false));
    }
}
