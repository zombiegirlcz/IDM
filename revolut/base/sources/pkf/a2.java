package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.b f237019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mo5.a f237020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uj5.a f237021c;

    public a2(sj5.b cryptoRemittanceValuesShortener, mo5.a cryptoWithdrawAddressTagClauseProvider, uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(cryptoRemittanceValuesShortener, "cryptoRemittanceValuesShortener");
        Intrinsics.checkNotNullParameter(cryptoWithdrawAddressTagClauseProvider, "cryptoWithdrawAddressTagClauseProvider");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f237019a = cryptoRemittanceValuesShortener;
        this.f237020b = cryptoWithdrawAddressTagClauseProvider;
        this.f237021c = blockchainUiMapper;
    }
}
