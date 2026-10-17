package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.b f237048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj5.a f237049b;

    public f0(sj5.b cryptoRemittanceValuesShortener, uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(cryptoRemittanceValuesShortener, "cryptoRemittanceValuesShortener");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f237048a = cryptoRemittanceValuesShortener;
        this.f237049b = blockchainUiMapper;
    }
}
