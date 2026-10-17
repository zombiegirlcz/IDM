package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 extends yji.n {

    @NotNull
    public static final i2 Companion = new i2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xlf.a f237088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final elf.u0 f237089n;
    public final rhf.d o;

    public k2(klf.h0 commonDataSource, xlf.a cryptoWithdrawLinkedTransactionMapper, elf.u0 linkedTransactionClickHandler, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoWithdrawLinkedTransactionMapper, "cryptoWithdrawLinkedTransactionMapper");
        Intrinsics.checkNotNullParameter(linkedTransactionClickHandler, "linkedTransactionClickHandler");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f237087l = commonDataSource;
        this.f237088m = cryptoWithdrawLinkedTransactionMapper;
        this.f237089n = linkedTransactionClickHandler;
        this.o = entryPoint;
    }
}
