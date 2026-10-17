package q6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q6c.k;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f242538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f242539c;
    public final LocalDateTime d;
    public final ArrayList e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f242540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f242541h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f242542j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xi0.b f242543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f242544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f242545n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f242546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f242547q;

    public h(String orderToken, m state, LocalDateTime createdDate, LocalDateTime expirationDate, ArrayList lineItems, long j2, long j3, long j5, long j16, long j22, long j42, xi0.b currency, f merchant, boolean z, boolean z3, ArrayList availableCardBrands, ArrayList payments) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(availableCardBrands, "availableCardBrands");
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f242537a = orderToken;
        this.f242538b = state;
        this.f242539c = createdDate;
        this.d = expirationDate;
        this.e = lineItems;
        this.f = j2;
        this.f242540g = j3;
        this.f242541h = j5;
        this.i = j16;
        this.f242542j = j22;
        this.k = j42;
        this.f242543l = currency;
        this.f242544m = merchant;
        this.f242545n = z;
        this.o = z3;
        this.f242546p = availableCardBrands;
        this.f242547q = payments;
    }

    public final CardPaymentAvailability a(PaymentConfiguration paymentConfiguration) {
        return (paymentConfiguration != null ? paymentConfiguration.f84342a : null) != null ? CardPaymentAvailability.NotAvailable.f84364a : this.f242545n ? new CardPaymentAvailability.Available(this.f242546p) : new CardPaymentAvailability.DisabledAtMerchant(this.f242544m.f242536c);
    }

    public final k b(PaymentConfiguration paymentConfiguration) {
        j jVar;
        n nVar;
        SplitBillPaymentParams splitBillPaymentParams;
        Object obj2 = null;
        String str = (paymentConfiguration == null || (splitBillPaymentParams = paymentConfiguration.f84343b) == null) ? null : splitBillPaymentParams.f84347c;
        String str2 = paymentConfiguration != null ? paymentConfiguration.f84342a : null;
        ArrayList arrayList = this.f242547q;
        if (str != null) {
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((j) next).f242550c, str)) {
                    obj2 = next;
                    break;
                }
            }
            jVar = (j) obj2;
        } else if (str2 != null) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (Intrinsics.f(((j) next2).f242548a, str2)) {
                    obj2 = next2;
                    break;
                }
            }
            jVar = (j) obj2;
        } else {
            jVar = (j) d0.d0(arrayList);
        }
        m mVar = m.PROCESSING;
        m mVar2 = this.f242538b;
        if (mVar2 != mVar || str == null || jVar != null) {
            if (mVar2 == mVar && jVar != null) {
                return new l(jVar.f242548a);
            }
            m mVar3 = m.PENDING;
            if (mVar2 == mVar3 && jVar != null && ((nVar = jVar.f242549b) == n.AUTHENTICATION_CHALLENGE || nVar == n.SOFT_DECLINED)) {
                return new l(jVar.f242548a);
            }
            if (mVar2 != mVar3) {
                return k.a.f242551a;
            }
        }
        return k.b.f242552a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f242537a, hVar.f242537a) && this.f242538b == hVar.f242538b && Intrinsics.f(this.f242539c, hVar.f242539c) && Intrinsics.f(this.d, hVar.d) && this.e.equals(hVar.e) && this.f == hVar.f && this.f242540g == hVar.f242540g && this.f242541h == hVar.f242541h && this.i == hVar.i && this.f242542j == hVar.f242542j && this.k == hVar.k && this.f242543l.equals(hVar.f242543l) && this.f242544m.equals(hVar.f242544m) && this.f242545n == hVar.f242545n && this.o == hVar.o && this.f242546p.equals(hVar.f242546p) && this.f242547q.equals(hVar.f242547q);
    }

    public final int hashCode() {
        return this.f242547q.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f242546p, j6.a.c(j6.a.c((this.f242544m.hashCode() + h30.l.j(this.f242543l, a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, v7.i(this.d, v7.i(this.f242539c, (this.f242538b.hashCode() + (this.f242537a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f), 31, this.f242540g), 31, this.f242541h), 31, this.i), 31, this.f242542j), 31, this.k), 31)) * 31, 31, this.f242545n), 31, this.o), 31);
    }
}
