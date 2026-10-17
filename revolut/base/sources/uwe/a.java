package uwe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import e93.j0;
import ip0.v7;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutScreenContract$CheckoutContent$Order f283629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f283630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Optional f283631c;
    public final fo3.c d;
    public final yt8.i e;
    public final CheckoutScreenContract$CheckoutTarget f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f283632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f283633h;
    public final CheckoutCardPlan i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f283634j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f283635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f283636m;

    public a(CheckoutScreenContract$CheckoutContent$Order order, dj0.d balance, Optional postActivationConfig, fo3.c wallet, yt8.i kycStatus, CheckoutScreenContract$CheckoutTarget checkoutTarget, boolean z, dj0.d discount, CheckoutCardPlan checkoutCardPlan, n contextType, dj0.d dVar, j0 j0Var, x xVar) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(postActivationConfig, "postActivationConfig");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(checkoutTarget, "checkoutTarget");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f283629a = order;
        this.f283630b = balance;
        this.f283631c = postActivationConfig;
        this.d = wallet;
        this.e = kycStatus;
        this.f = checkoutTarget;
        this.f283632g = z;
        this.f283633h = discount;
        this.i = checkoutCardPlan;
        this.f283634j = contextType;
        this.k = dVar;
        this.f283635l = j0Var;
        this.f283636m = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283629a, aVar.f283629a) && Intrinsics.f(this.f283630b, aVar.f283630b) && Intrinsics.f(this.f283631c, aVar.f283631c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && this.f283632g == aVar.f283632g && Intrinsics.f(this.f283633h, aVar.f283633h) && Intrinsics.f(this.i, aVar.i) && this.f283634j == aVar.f283634j && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f283635l, aVar.f283635l) && Intrinsics.f(this.f283636m, aVar.f283636m);
    }

    public final int hashCode() {
        int iC = v7.c(j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f283631c.hashCode() + v7.c(this.f283629a.hashCode() * 31, 31, this.f283630b)) * 31)) * 31)) * 31)) * 31, 31, this.f283632g), 31, this.f283633h);
        CheckoutCardPlan checkoutCardPlan = this.i;
        int iHashCode = (this.f283634j.hashCode() + ((iC + (checkoutCardPlan == null ? 0 : checkoutCardPlan.hashCode())) * 31)) * 31;
        dj0.d dVar = this.k;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        j0 j0Var = this.f283635l;
        int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        x xVar = this.f283636m;
        return iHashCode3 + (xVar != null ? xVar.hashCode() : 0);
    }
}
