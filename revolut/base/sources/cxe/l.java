package cxe;

import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams f109951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109953c;
    public final boolean d;
    public final yt8.i e;
    public final jxe.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jxe.m f109954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f109955h;
    public final CheckoutScreenContract$CheckoutTarget i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CheckoutScreenContract$CheckoutContent$Order f109956j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CheckoutCardPlan f109957l;

    public l(CheckoutParams.CardOrder cardOrder, boolean z, boolean z3, boolean z4, yt8.i kycStatus, jxe.l lVar, jxe.m selectedTopUpMethodData, dj0.d moneyLeftToTopUp, CheckoutScreenContract$CheckoutTarget checkoutTarget, CheckoutScreenContract$CheckoutContent$Order checkoutOrder, List list, CheckoutCardPlan checkoutCardPlan) {
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(selectedTopUpMethodData, "selectedTopUpMethodData");
        Intrinsics.checkNotNullParameter(moneyLeftToTopUp, "moneyLeftToTopUp");
        Intrinsics.checkNotNullParameter(checkoutTarget, "checkoutTarget");
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        this.f109951a = cardOrder;
        this.f109952b = z;
        this.f109953c = z3;
        this.d = z4;
        this.e = kycStatus;
        this.f = lVar;
        this.f109954g = selectedTopUpMethodData;
        this.f109955h = moneyLeftToTopUp;
        this.i = checkoutTarget;
        this.f109956j = checkoutOrder;
        this.k = list;
        this.f109957l = checkoutCardPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f109951a, lVar.f109951a) && this.f109952b == lVar.f109952b && this.f109953c == lVar.f109953c && this.d == lVar.d && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f109954g, lVar.f109954g) && Intrinsics.f(this.f109955h, lVar.f109955h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f109956j, lVar.f109956j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f109957l, lVar.f109957l);
    }

    public final int hashCode() {
        CheckoutParams checkoutParams = this.f109951a;
        int iHashCode = (this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c((checkoutParams == null ? 0 : checkoutParams.hashCode()) * 31, 31, this.f109952b), 31, this.f109953c), 31, this.d)) * 31;
        jxe.l lVar = this.f;
        int iHashCode2 = (this.f109956j.hashCode() + ((this.i.hashCode() + v7.c((this.f109954g.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31, 31, this.f109955h)) * 31)) * 31;
        List list = this.k;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutCardPlan checkoutCardPlan = this.f109957l;
        return iHashCode3 + (checkoutCardPlan != null ? checkoutCardPlan.hashCode() : 0);
    }
}
