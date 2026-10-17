package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends yji.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f237032n;
    public final wnf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fbj.a f237033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final elf.b0 f237034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final elf.c0 f237035r;

    public d0(klf.h0 commonDataSource, vlf.b commonUiMapper, f0 cryptoDepositDetailsItemsMapper, wnf.b commonTransactionContentMapper, fbj.a cryptoDepositsInteractor, elf.b0 confirmationClickHandler, elf.c0 cryptoRemittanceFieldClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(cryptoDepositDetailsItemsMapper, "cryptoDepositDetailsItemsMapper");
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        Intrinsics.checkNotNullParameter(cryptoRemittanceFieldClickHandler, "cryptoRemittanceFieldClickHandler");
        this.f237030l = commonDataSource;
        this.f237031m = commonUiMapper;
        this.f237032n = cryptoDepositDetailsItemsMapper;
        this.o = commonTransactionContentMapper;
        this.f237033p = cryptoDepositsInteractor;
        this.f237034q = confirmationClickHandler;
        this.f237035r = cryptoRemittanceFieldClickHandler;
    }
}
