package kkf;

import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends yji.n implements elf.s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final unf.b f184619m;

    public c(klf.h0 commonDataSource, unf.b adjustedPaymentsDetailMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(adjustedPaymentsDetailMapper, "adjustedPaymentsDetailMapper");
        this.f184618l = commonDataSource;
        this.f184619m = adjustedPaymentsDetailMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "ADJUSTED_PAYMENT_DETAIL_CELL")) {
            if ((obj2 instanceof unf.a ? (unf.a) obj2 : null) != null) {
                A2(zh9.u0.c(new HelpCentreFeatureConfig.Topic("question.why-was-my-payment-updated", "transaction_details_redesign")));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
