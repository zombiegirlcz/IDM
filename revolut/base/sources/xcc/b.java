package xcc;

import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import rul.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f304110a;

    public b(e rampOrderDetailsParser) {
        Intrinsics.checkNotNullParameter(rampOrderDetailsParser, "rampOrderDetailsParser");
        this.f304110a = rampOrderDetailsParser;
    }

    public final RevolutPayOrderParameters a(HashMap parameters) {
        String str;
        SplitBillPaymentParams splitBillPaymentParams;
        RampOrderDetails rampOrderDetailsP;
        String str2;
        p6c.b bVar;
        Object obj2;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        String str3 = (String) parameters.get("publicKey");
        if (str3 == null || (str = (String) parameters.get("orderToken")) == null) {
            return null;
        }
        String str4 = (String) parameters.get("returnUrl");
        String str5 = (String) parameters.get("mobileReturnUrl");
        String str6 = (String) parameters.get("mobileBrowser");
        CheckoutMode regular = Intrinsics.f(parameters.get("saveFor"), "merchant") ? CheckoutMode.MerchantInitiated.f84336b : Boolean.parseBoolean((String) parameters.get("spm")) ? CheckoutMode.CustomerInitiated.f84335b : new CheckoutMode.Regular(Boolean.parseBoolean((String) parameters.get("requestShipping")));
        String str7 = (String) parameters.get("src");
        boolean z = Boolean.parseBoolean((String) parameters.get("bnpl"));
        boolean zF = Intrinsics.f(parameters.get("returnParamsType"), "hash");
        String str8 = (String) parameters.get("paymentToken");
        String str9 = (String) parameters.get("amt");
        Long lN = str9 != null ? z.n(str9) : null;
        String str10 = (String) parameters.get("tipAmt");
        Long lN2 = str10 != null ? z.n(str10) : null;
        String str11 = (String) parameters.get("payKey");
        if (lN != null) {
            long jLongValue = lN.longValue();
            if (str11 == null) {
                throw new IllegalArgumentException("Idempotency key is required for split payment amount");
            }
            splitBillPaymentParams = new SplitBillPaymentParams(str11, jLongValue, lN2);
        } else {
            splitBillPaymentParams = null;
        }
        String str12 = (String) parameters.get("pi");
        PaymentConfiguration paymentConfiguration = (str8 == null && splitBillPaymentParams == null && str12 == null) ? null : new PaymentConfiguration(str8, splitBillPaymentParams, str12);
        String str13 = (String) parameters.get("rampOrder");
        if (str13 == null) {
            rampOrderDetailsP = null;
        } else {
            try {
                rampOrderDetailsP = this.f304110a.p(str13);
            } catch (Exception unused) {
                rampOrderDetailsP = null;
            }
        }
        String text = (String) parameters.get("preferredMode");
        if (text != null) {
            p6c.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            Iterator it8 = p6c.b.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    str2 = str3;
                    obj2 = null;
                    break;
                }
                Object next = it8.next();
                String strB = ((p6c.b) next).b();
                Iterator it9 = it8;
                Locale locale = Locale.ROOT;
                str2 = str3;
                if (Intrinsics.f(strB, p.a.r(locale, "ROOT", text, locale, "toLowerCase(...)"))) {
                    obj2 = next;
                    break;
                }
                it8 = it9;
                str3 = str2;
            }
            bVar = (p6c.b) obj2;
        } else {
            str2 = str3;
            bVar = null;
        }
        return new RevolutPayOrderParameters(str2, str, str4, str5, str6, regular, str7, z, zF, paymentConfiguration, rampOrderDetailsP, bVar);
    }
}
