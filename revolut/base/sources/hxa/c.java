package hxa;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$ReferralsProductForYouWidget;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import ghk.a0;
import go.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l80.e;
import of1.d;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements mf1.c {

    @NotNull
    public static final a Companion = new a();
    public static final qf1.a d = new qf1.a(new CdnImage("referrals", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwa.b f156418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f156419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f156420c;

    public c(wwa.b inviteCampaignHomeInteractor, gte.a featureToggleInteractor, e dateProvider) {
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f156418a = inviteCampaignHomeInteractor;
        this.f156419b = featureToggleInteractor;
        this.f156420c = dateProvider;
    }

    @Override // mf1.c
    public final Flow a() {
        return q.q(nim.a.v(rd0.e.b(wwa.b.d(this.f156418a, false, null, 6)), new hwf.b(this)));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new d(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, null, 15));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp addNewProductFeatureAvailabilityApi$Toggles$P4URevamp = AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c;
        jte.d dVar = (jte.d) this.f156419b;
        return (dVar.c(addNewProductFeatureAvailabilityApi$Toggles$P4URevamp) && dVar.c(AddNewProductFeatureAvailabilityApi$Toggles$ReferralsProductForYouWidget.f60849c)) ? q.q(new a0(rd0.e.b(wwa.b.d(this.f156418a, false, null, 6)), this, 22)) : new g(Boolean.FALSE, 2);
    }
}
