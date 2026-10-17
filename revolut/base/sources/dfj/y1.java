package dfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDataPlan f114160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114161b;

    public y1(List plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Iterator it8 = plans.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            int iA = bfj.a.a((EsimDataPlan) next);
            do {
                Object next2 = it8.next();
                int iA2 = bfj.a.a((EsimDataPlan) next2);
                if (iA < iA2) {
                    next = next2;
                    iA = iA2;
                }
            } while (it8.hasNext());
        }
        EsimDataPlan topPriorityPlan = (EsimDataPlan) next;
        Intrinsics.checkNotNullParameter(topPriorityPlan, "topPriorityPlan");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f114160a = topPriorityPlan;
        this.f114161b = plans;
        if (plans.isEmpty()) {
            throw new IllegalArgumentException("Group should contain plans");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f114160a, y1Var.f114160a) && Intrinsics.f(this.f114161b, y1Var.f114161b);
    }

    public final int hashCode() {
        return this.f114161b.hashCode() + (this.f114160a.hashCode() * 31);
    }
}
