package cu8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f108837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.kyc.impl.e f108838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt8.a f108839c;
    public final gte.a d;

    public g(f01.c uiKitResources, com.revolut.feature.kyc.impl.e kycPromptNaviCommandFactory, mt8.a kycFeatureToggleProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(kycPromptNaviCommandFactory, "kycPromptNaviCommandFactory");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f108837a = uiKitResources;
        this.f108838b = kycPromptNaviCommandFactory;
        this.f108839c = kycFeatureToggleProvider;
        this.d = featureToggleInteractor;
    }

    public final String a(TextLocalisedClause textLocalisedClause) {
        return this.f108837a.b(textLocalisedClause).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ks8.i b(cu8.e r21, ks8.c r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu8.g.b(cu8.e, ks8.c, java.util.List, boolean):ks8.i");
    }

    public final FeatureCommand c() {
        return new FeatureCommand(new KycFeatureConfig.InitKyc(null, ((pt8.a) this.f108839c).a(), 15));
    }

    public final SlotChecklist.Terms d() {
        return new SlotChecklist.Terms(a(new TextLocalisedClause(R$string.kyc_checklist_youth_graduation_footer_access_to_balance, null, null, 14)), zhm.u.c(new SlotChecklist.Terms.TextArgument(a(new TextLocalisedClause(R$string.kyc_checklist_youth_graduation_footer_transfer_to_parent, null, null, 14)), "revolut://app/youth/graduation/assets-migration")));
    }
}
