package fgb;

import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryPromotion;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.g;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f135026a = y0.b("incentives/plan-salary-promotion");

    @Override // xii.b
    public final Set a() {
        return this.f135026a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        return new SalaryAccountDestination$SalaryPromotion(g.a("code", linkedHashMap), g.a("campaignType", linkedHashMap));
    }
}
