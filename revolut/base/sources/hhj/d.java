package hhj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDataPlanOption f152414a;

    public d(EsimDataPlanOption selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f152414a = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f152414a, ((d) obj2).f152414a);
    }

    public final int hashCode() {
        return this.f152414a.hashCode();
    }
}
