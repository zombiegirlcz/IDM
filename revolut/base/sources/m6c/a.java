package m6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import q6c.h;
import u6c.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f203040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f203041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckoutMode f203042c;
    public final h d;
    public final f0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PaymentConfiguration f203043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f203044h;
    public final n6c.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f203045j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f203046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f203047m;

    public a(dj0.d dVar, i paymentMethod, CheckoutMode checkoutMode, h hVar, f0 usageCheck, boolean z, PaymentConfiguration paymentConfiguration, f shippingValidation, n6c.a aVar, List appDisclaimers, c paymentAction, b checkoutType, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        Intrinsics.checkNotNullParameter(usageCheck, "usageCheck");
        Intrinsics.checkNotNullParameter(shippingValidation, "shippingValidation");
        Intrinsics.checkNotNullParameter(appDisclaimers, "appDisclaimers");
        Intrinsics.checkNotNullParameter(paymentAction, "paymentAction");
        Intrinsics.checkNotNullParameter(checkoutType, "checkoutType");
        this.f203040a = dVar;
        this.f203041b = paymentMethod;
        this.f203042c = checkoutMode;
        this.d = hVar;
        this.e = usageCheck;
        this.f = z;
        this.f203043g = paymentConfiguration;
        this.f203044h = shippingValidation;
        this.i = aVar;
        this.f203045j = appDisclaimers;
        this.k = paymentAction;
        this.f203046l = checkoutType;
        this.f203047m = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f203040a, aVar.f203040a) && Intrinsics.f(this.f203041b, aVar.f203041b) && Intrinsics.f(this.f203042c, aVar.f203042c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f203043g, aVar.f203043g) && Intrinsics.f(this.f203044h, aVar.f203044h) && this.i == aVar.i && Intrinsics.f(this.f203045j, aVar.f203045j) && this.k == aVar.k && this.f203046l == aVar.f203046l && this.f203047m == aVar.f203047m;
    }

    public final int hashCode() {
        dj0.d dVar = this.f203040a;
        int iHashCode = (this.f203042c.hashCode() + r6.b.f(this.f203041b, (dVar == null ? 0 : dVar.hashCode()) * 31, 31)) * 31;
        h hVar = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31, this.f);
        PaymentConfiguration paymentConfiguration = this.f203043g;
        int iHashCode2 = (this.f203044h.hashCode() + ((iC + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31)) * 31;
        n6c.a aVar = this.i;
        return Boolean.hashCode(this.f203047m) + ((this.f203046l.hashCode() + ((this.k.hashCode() + p.a.d((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f203045j)) * 31)) * 31);
    }
}
