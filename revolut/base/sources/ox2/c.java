package ox2;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f230542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f230543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f230544c;

    public c(e93.f cardDesign, Data pricingPlan, Data plans) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f230542a = cardDesign;
        this.f230543b = pricingPlan;
        this.f230544c = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f230542a, cVar.f230542a) && Intrinsics.f(this.f230543b, cVar.f230543b) && Intrinsics.f(this.f230544c, cVar.f230544c);
    }

    public final int hashCode() {
        return this.f230544c.hashCode() + kii.e.c(this.f230543b, this.f230542a.hashCode() * 31, 31);
    }
}
