package blf;

import elf.w1;
import klf.h0;
import klf.z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f16631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f16632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f16633c;

    public k(h0 commonDataSource, z1 savingsDataSource, w1 savingsWithdrawalTaxClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(savingsDataSource, "savingsDataSource");
        Intrinsics.checkNotNullParameter(savingsWithdrawalTaxClickHandler, "savingsWithdrawalTaxClickHandler");
        this.f16631a = commonDataSource;
        this.f16632b = savingsDataSource;
        this.f16633c = savingsWithdrawalTaxClickHandler;
    }
}
