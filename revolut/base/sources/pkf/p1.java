package pkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends yji.n implements elf.s0 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fbj.a f237107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1 f237108n;
    public final yp.a o;

    public p1(klf.h0 commonDataSource, fbj.a cryptoDepositsInteractor, q1 updateAppBannerItemsMapper, yp.a appStoreCommandFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(updateAppBannerItemsMapper, "updateAppBannerItemsMapper");
        Intrinsics.checkNotNullParameter(appStoreCommandFactory, "appStoreCommandFactory");
        this.f237106l = commonDataSource;
        this.f237107m = cryptoDepositsInteractor;
        this.f237108n = updateAppBannerItemsMapper;
        this.o = appStoreCommandFactory;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "TransactionDetails_CryptoRemittance_UpdateAppBanner_Action")) {
            return Boolean.FALSE;
        }
        A2(((yp.b) this.o).b(null));
        return Boolean.TRUE;
    }
}
