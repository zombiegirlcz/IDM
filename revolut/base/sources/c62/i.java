package c62;

import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1.a f21592a;

    public i(fx1.a apmOnboardingRepository) {
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        this.f21592a = apmOnboardingRepository;
    }

    public static f b(ApmPaymentProfile apmPaymentProfile) {
        int i = g.f21589b[apmPaymentProfile.ordinal()];
        if (i == 1) {
            return new f(ApmIris.f61811c, i02.c.PERSONAL);
        }
        if (i == 2) {
            return new f(ApmIris.b.f61812a, i02.c.PRO);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile r9, i02.j r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c62.i.a(com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile, i02.j, gim.c):java.lang.Object");
    }
}
