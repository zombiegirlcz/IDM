package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 extends yji.n {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f237161n;
    public final ap5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final elf.c0 f237162p;

    public y1(klf.h0 commonDataSource, vlf.b commonUiMapper, a2 cryptoWithdrawBlockchainItemsMapper, ap5.b cryptoWithdrawInteractor, elf.c0 cryptoRemittanceFieldClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(cryptoWithdrawBlockchainItemsMapper, "cryptoWithdrawBlockchainItemsMapper");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoRemittanceFieldClickHandler, "cryptoRemittanceFieldClickHandler");
        this.f237159l = commonDataSource;
        this.f237160m = commonUiMapper;
        this.f237161n = cryptoWithdrawBlockchainItemsMapper;
        this.o = cryptoWithdrawInteractor;
        this.f237162p = cryptoRemittanceFieldClickHandler;
    }
}
