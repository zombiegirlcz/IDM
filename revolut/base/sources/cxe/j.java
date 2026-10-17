package cxe;

import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutContext f109946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutScreenContract$CheckoutTarget f109947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109948c;

    public j(CheckoutContext checkoutContext, CheckoutScreenContract$CheckoutTarget checkoutTarget, List list) {
        Intrinsics.checkNotNullParameter(checkoutContext, "checkoutContext");
        Intrinsics.checkNotNullParameter(checkoutTarget, "checkoutTarget");
        this.f109946a = checkoutContext;
        this.f109947b = checkoutTarget;
        this.f109948c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f109946a, jVar.f109946a) && Intrinsics.f(this.f109947b, jVar.f109947b) && Intrinsics.f(this.f109948c, jVar.f109948c);
    }

    public final int hashCode() {
        int iHashCode = (this.f109947b.hashCode() + (this.f109946a.hashCode() * 31)) * 31;
        List list = this.f109948c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
