package q97;

import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i2 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwa.b f243711a;

    public i2(t97.c productCellProvider, wwa.b inviteCampaignHomeInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        this.f243711a = inviteCampaignHomeInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.REFERRALS;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r map = m70.a.g(wwa.b.e(this.f243711a, null, 3), null, new q92.f(27), 1).map(new h2(0, new l1(this, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        if (productCell.f234280a == t97.d.REFERRALS) {
            ufm.b bVarM = efm.d0.m(new o97.l(new FeatureCommand(new ReferralsBizFeatureConfig.InviteCampaignHomeFeatureConfig(null, 31))));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.c cVarL = efm.d0.l(new IllegalStateException(prk.o.q("Unsupported type: ", productCell.f234280a)));
        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
        return cVarL;
    }
}
