package g1l;

import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f139726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f139727b;

    public n(ybl.k tradingAccountsInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f139726a = tradingAccountsInteractor;
        this.f139727b = kycRequiredActionTransformer;
    }
}
