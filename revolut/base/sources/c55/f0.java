package c55;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l35.h f21439a;

    public f0(l35.h repaymentV2AvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(repaymentV2AvailabilityInteractor, "repaymentV2AvailabilityInteractor");
        this.f21439a = repaymentV2AvailabilityInteractor;
    }

    public static MoneyClause a(dj0.d dVar) {
        return sx4.f.b(1, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), null, dVar);
    }
}
