package kdc;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(int i, String str, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return new TextLocalisedClause(i, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new x6c.a(url2), str, false), 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration b(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket r13, n6c.a r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kdc.d.b(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket, n6c.a):com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration");
    }
}
