package ai4;

import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$SelectedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSelectorInputDetailsScreenContract$SelectedValue f5186a;

    public g(SingleSelectorInputDetailsScreenContract$SelectedValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5186a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f5186a, ((g) obj2).f5186a);
    }

    public final int hashCode() {
        return this.f5186a.hashCode();
    }
}
