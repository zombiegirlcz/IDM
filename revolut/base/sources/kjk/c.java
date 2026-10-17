package kjk;

import com.revolut.retail.feature.pricing_plans.ui.impl.widget.PricingPlanHomeBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f184423a;

    public c(xe0.e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f184423a = storage;
    }

    public static String a(PricingPlanHomeBanner.CancelScheduledDowngrade cancelScheduledDowngrade) {
        String str = cancelScheduledDowngrade.f103645a;
        String str2 = cancelScheduledDowngrade.f103646b;
        Long l2 = cancelScheduledDowngrade.f103647c;
        StringBuilder sbM = v0.a.m("cancel_downgrade_plan_", str, "_next_", str2, "_date_");
        sbM.append(l2);
        return sbM.toString();
    }
}
