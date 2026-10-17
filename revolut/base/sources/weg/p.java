package weg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rag.e f296789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pag.a f296790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xcg.f f296791c;

    public p(rag.e hotelsPropertyItemMapper, pag.a itemFactory, xcg.f packageRatesUnlockedBannerFactory, e commissionDisclaimerItemMapper) {
        Intrinsics.checkNotNullParameter(hotelsPropertyItemMapper, "hotelsPropertyItemMapper");
        Intrinsics.checkNotNullParameter(itemFactory, "itemFactory");
        Intrinsics.checkNotNullParameter(packageRatesUnlockedBannerFactory, "packageRatesUnlockedBannerFactory");
        Intrinsics.checkNotNullParameter(commissionDisclaimerItemMapper, "commissionDisclaimerItemMapper");
        this.f296789a = hotelsPropertyItemMapper;
        this.f296790b = itemFactory;
        this.f296791c = packageRatesUnlockedBannerFactory;
    }

    public static List a(String str) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(str, new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
