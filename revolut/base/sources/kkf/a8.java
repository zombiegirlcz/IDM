package kkf;

import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a8 extends yji.n implements elf.s0 {

    @NotNull
    public static final t7 Companion = new t7();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y45.i f184604n;

    public a8(klf.h0 commonDataSource, klf.m1 juniorDataSource, y45.i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.f184602l = commonDataSource;
        this.f184603m = juniorDataSource;
        this.f184604n = loanProductInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_RELATED_LOAN")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.kompot.details.block_provider.TaxableLoanBlockProvider.TaxContentLoanParcel");
            A2(zh9.u0.c(new LoanHomeFeatureConfig(((u7) obj2).f184971a)));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
