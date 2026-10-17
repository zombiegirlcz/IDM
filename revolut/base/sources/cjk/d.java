package cjk;

import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static Date a(PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        DateTime dateTime = subscription.f81132g;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = subscription.f81134j;
        Long l2 = pricingPlanNextPlanInfo != null ? pricingPlanNextPlanInfo.e : null;
        Long l3 = pricingPlanNextPlanInfo != null ? pricingPlanNextPlanInfo.d : null;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            DateTime dateTime2 = subscription.f81132g;
            lValueOf = Long.valueOf(Math.min(jLongValue, dateTime2 != null ? dateTime2.getMillis() : Long.MAX_VALUE));
        } else {
            if (lValueOf != null) {
                if (l3 == null || lValueOf.longValue() < l3.longValue()) {
                }
                return null;
            }
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new Date(lValueOf.longValue());
        }
        return null;
    }
}
