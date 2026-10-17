package fij;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f135451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimDataPlan f135452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f135453c;

    public p(o id10, EsimDataPlan selectedPlan, List plans) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f135451a = id10;
        this.f135452b = selectedPlan;
        this.f135453c = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f135451a, pVar.f135451a) && Intrinsics.f(this.f135452b, pVar.f135452b) && Intrinsics.f(this.f135453c, pVar.f135453c);
    }

    public final int hashCode() {
        return this.f135453c.hashCode() + ((this.f135452b.hashCode() + (this.f135451a.hashCode() * 31)) * 31);
    }
}
