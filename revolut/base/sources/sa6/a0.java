package sa6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya6.e0 f261299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f261300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya6.n f261301c;

    public a0(ya6.e0 pendingDonationsRepository, l80.e dateProvider, ya6.n donationsConfigRepository) {
        Intrinsics.checkNotNullParameter(pendingDonationsRepository, "pendingDonationsRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(donationsConfigRepository, "donationsConfigRepository");
        this.f261299a = pendingDonationsRepository;
        this.f261300b = dateProvider;
        this.f261301c = donationsConfigRepository;
    }

    public final pfm.h a(Set pendingDonationIds) {
        Intrinsics.checkNotNullParameter(pendingDonationIds, "pendingDonationIds");
        ya6.h0 h0Var = (ya6.h0) this.f261299a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(pendingDonationIds, "pendingDonationIds");
        ufm.c cVar = new ufm.c(new ya6.f0(h0Var, pendingDonationIds, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        pfm.h hVar = new pfm.h(te0.w.i0(cVar), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }
}
