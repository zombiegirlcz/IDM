package kmb;

import jmb.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f185748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hmb.a f185749b;

    public e(h highlightsMapper, rkb.b extraProductInformationItemMapper, k48.a partnerSectionItemsMapper, hmb.a productDetailsDisclaimersProvider, hqb.a savingsUpgradeBannerFactory) {
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        Intrinsics.checkNotNullParameter(extraProductInformationItemMapper, "extraProductInformationItemMapper");
        Intrinsics.checkNotNullParameter(partnerSectionItemsMapper, "partnerSectionItemsMapper");
        Intrinsics.checkNotNullParameter(productDetailsDisclaimersProvider, "productDetailsDisclaimersProvider");
        Intrinsics.checkNotNullParameter(savingsUpgradeBannerFactory, "savingsUpgradeBannerFactory");
        this.f185748a = highlightsMapper;
        this.f185749b = productDetailsDisclaimersProvider;
    }
}
