package fg8;

import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.api.navigation.JuniorBlankCardDeliveryConsentDestination;
import com.revolut.feature.junior_consent.api.navigation.JuniorConsentRequestPromptDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135009a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f135010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f135011c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w(c0 c0Var, String str, boolean z) {
        this.f135010b = c0Var;
        this.f135011c = str;
        this.d = z;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f135009a) {
            case 0:
                FeatureCommand featureCommandF = u0.f(new JuniorBlankCardDeliveryConsentDestination(this.f135011c));
                if (this.d) {
                    featureCommandF = c0.a(featureCommandF);
                }
                this.f135010b.f134911a.c(featureCommandF);
                break;
            default:
                sri.m mVar = this.f135010b.f134911a;
                FeatureCommand featureCommandF2 = gc0.c.f(new KompotOverlayFeatureConfig(new JuniorConsentRequestPromptDestination(this.f135011c, new ConsentTypeId.ConsentName(v6d.a.PERSONAL_DATA_PROCESSING), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D254", null, null, null, 30)), yhi.b.POPUP, (Integer) null, 12));
                if (this.d) {
                    featureCommandF2 = c0.a(featureCommandF2);
                }
                mVar.c(featureCommandF2);
                break;
        }
    }

    public /* synthetic */ w(String str, boolean z, c0 c0Var) {
        this.f135011c = str;
        this.d = z;
        this.f135010b = c0Var;
    }
}
