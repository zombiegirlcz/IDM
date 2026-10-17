package z88;

import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final JuniorProductAccountIdPayload a(ProductAccountId productAccountId) {
        Intrinsics.checkNotNullParameter(productAccountId, "<this>");
        ProductAccountId.Payload payload = productAccountId.f89730b;
        JuniorProductAccountIdPayload juniorProductAccountIdPayload = payload instanceof JuniorProductAccountIdPayload ? (JuniorProductAccountIdPayload) payload : null;
        if (juniorProductAccountIdPayload != null) {
            return juniorProductAccountIdPayload;
        }
        IllegalStateException illegalStateException = new IllegalStateException("JuniorProductAccountIdPayload required");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return new JuniorProductAccountIdPayload(productAccountId.f89729a, null);
    }
}
