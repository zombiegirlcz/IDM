package d7c;

import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentOptionsDiscount;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import e7c.g0;
import e7c.m;
import e7c.n;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import u6c.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public static n a(s7c.a request, m environment) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(environment, "environment");
        PaymentMethod paymentMethod = request.f260662a;
        SplitBillPaymentParams splitBillPaymentParams = request.f;
        String strB = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.b(paymentMethod);
        String strD = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.d(paymentMethod);
        PaymentMethod.Card card = paymentMethod instanceof PaymentMethod.Card ? (PaymentMethod.Card) paymentMethod : null;
        String str = card != null ? card.i : null;
        String str2 = request.f260663b;
        u uVar = request.f260664c;
        String strH = uVar != null ? u1.h(uVar, e.f111919a) : null;
        PaymentOptionsDiscount paymentOptionsDiscount = request.i;
        g0 g0VarB = paymentOptionsDiscount != null ? b(paymentOptionsDiscount, request.f260666h) : null;
        String str3 = request.d;
        e7c.e eVar = null;
        String str4 = strH;
        g0 g0Var = g0VarB;
        List list = request.e;
        Long lValueOf = splitBillPaymentParams != null ? Long.valueOf(splitBillPaymentParams.f84345a) : null;
        Long l2 = splitBillPaymentParams != null ? splitBillPaymentParams.f84346b : null;
        String str5 = request.f260665g;
        BuyNowPayLater buyNowPayLater = request.f260667j;
        if (buyNowPayLater != null) {
            Intrinsics.checkNotNullParameter(buyNowPayLater, "<this>");
            eVar = new e7c.e(buyNowPayLater.f84338a, buyNowPayLater.f84339b);
        }
        return new n(strB, strD, str, str2, str4, environment, g0Var, str3, list, lValueOf, l2, str5, eVar);
    }

    public static g0 b(PaymentOptionsDiscount paymentOptionsDiscount, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Trying to initiate rev points payment without quoteToken");
        }
        jo3.a aVarP = mo3.a.p(paymentOptionsDiscount.f84332a);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(paymentOptionsDiscount.f84333b, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "getMajorUnits-impl(...)");
        return new g0(str, new g0.a(aVarP, bigDecimalValueOf));
    }
}
