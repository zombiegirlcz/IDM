package fgb;

import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f135025a = y0.b("salary-account");

    @Override // xii.b
    public final Set a() {
        return this.f135025a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return SalaryAccountDestination$SalaryHub.f82951a;
    }
}
