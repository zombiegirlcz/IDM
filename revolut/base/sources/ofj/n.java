package ofj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundBreakdown;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import dej.h3;
import java.time.Instant;
import kfj.l4;
import kfj.m4;
import kfj.o4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n {
    public static final EsimSubscriptionRefund a(m4 m4Var) {
        h3 h3Var;
        EsimSubscriptionRefundBreakdown esimSubscriptionRefundBreakdown;
        EsimSubscriptionRefundProration esimSubscriptionRefundProrationB;
        Intrinsics.checkNotNullParameter(m4Var, "<this>");
        String strategy = m4Var.getStrategy();
        h3[] h3VarArrValues = h3.values();
        int length = h3VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                h3Var = null;
                break;
            }
            h3Var = h3VarArrValues[i];
            if (a0.z(h3Var.name(), strategy, true)) {
                break;
            }
            i++;
        }
        if (h3Var == null) {
            h3Var = h3.UNKNOWN;
        }
        h3 h3Var2 = h3Var;
        dj0.d dVarO = mo3.a.o(m4Var.getAmount());
        String token = m4Var.getToken();
        Long expirationDate = m4Var.getExpirationDate();
        Instant instantOfEpochMilli = expirationDate != null ? Instant.ofEpochMilli(expirationDate.longValue()) : null;
        Long cancellationDate = m4Var.getCancellationDate();
        Instant instantOfEpochMilli2 = cancellationDate != null ? Instant.ofEpochMilli(cancellationDate.longValue()) : null;
        double d = Double.parseDouble(m4Var.getPoints());
        boolean zJ = pd.b.j(m4Var.getIsFullRefund());
        l4 breakdown = m4Var.getBreakdown();
        if (breakdown != null) {
            Intrinsics.checkNotNullParameter(breakdown, "<this>");
            o4 primary = breakdown.getPrimary();
            if (primary == null) {
                primary = breakdown.getLocal();
            }
            if (primary != null) {
                Intrinsics.checkNotNullParameter(primary, "<this>");
                esimSubscriptionRefundProrationB = (primary.getTotalDays() == null || primary.getRemainingDays() == null) ? b(primary) : new EsimSubscriptionRefundProration.DaysPassed(primary.getTotalDays().intValue(), primary.getRemainingDays().intValue());
            } else {
                esimSubscriptionRefundProrationB = null;
            }
            o4 roaming = breakdown.getRoaming();
            esimSubscriptionRefundBreakdown = new EsimSubscriptionRefundBreakdown(esimSubscriptionRefundProrationB, roaming != null ? b(roaming) : null);
        } else {
            esimSubscriptionRefundBreakdown = null;
        }
        return new EsimSubscriptionRefund(h3Var2, esimSubscriptionRefundBreakdown, zJ, dVarO, token, instantOfEpochMilli, instantOfEpochMilli2, d);
    }

    public static final EsimSubscriptionRefundProration.DataUsage b(o4 o4Var) {
        Long allowanceBytes = o4Var.getAllowanceBytes();
        if (allowanceBytes != null) {
            long jLongValue = allowanceBytes.longValue();
            Long usageBytes = o4Var.getUsageBytes();
            if (usageBytes != null) {
                long jLongValue2 = usageBytes.longValue();
                jo3.a pricePerGb = o4Var.getPricePerGb();
                return new EsimSubscriptionRefundProration.DataUsage(jLongValue, jLongValue2, pricePerGb != null ? mo3.a.o(pricePerGb) : null);
            }
        }
        return null;
    }
}
