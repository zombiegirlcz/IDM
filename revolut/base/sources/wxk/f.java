package wxk;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import w38.t;
import ybl.l;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qka.c f301007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f301008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f301009c;
    public final l d;

    public f(qka.c productArticleNavigationProvider, r0 jointAccountsInteractor, t pendingAccountBottomSheetProvider, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f301007a = productArticleNavigationProvider;
        this.f301008b = jointAccountsInteractor;
        this.f301009c = pendingAccountBottomSheetProvider;
        this.d = tradingConfigInteractor;
    }
}
