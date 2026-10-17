package nya;

import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowReferralsBusinessButton;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 implements cli.n {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl.c0 f220750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mya.l f220751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mya.c f220752c;
    public final InviteCampaignHomeControllerContract$InputData d;
    public final boolean e;
    public final boolean f;

    public n0(mya.a bottomBoxProvider, kl.c0 invitesOrBannerWidgetProvider, mya.o tnCItemProvider, mya.m timelineSubheaderProvider, mya.d descriptionProvider, mya.h menuItemProvider, mya.j multilevelCampaignChevronProvider, mya.l stepsOrBenefitsSectionProvider, mya.e howItWorksSectionProvider, mya.c conditionsSectionProvider, InviteCampaignHomeControllerContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(bottomBoxProvider, "bottomBoxProvider");
        Intrinsics.checkNotNullParameter(invitesOrBannerWidgetProvider, "invitesOrBannerWidgetProvider");
        Intrinsics.checkNotNullParameter(tnCItemProvider, "tnCItemProvider");
        Intrinsics.checkNotNullParameter(timelineSubheaderProvider, "timelineSubheaderProvider");
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        Intrinsics.checkNotNullParameter(menuItemProvider, "menuItemProvider");
        Intrinsics.checkNotNullParameter(multilevelCampaignChevronProvider, "multilevelCampaignChevronProvider");
        Intrinsics.checkNotNullParameter(stepsOrBenefitsSectionProvider, "stepsOrBenefitsSectionProvider");
        Intrinsics.checkNotNullParameter(howItWorksSectionProvider, "howItWorksSectionProvider");
        Intrinsics.checkNotNullParameter(conditionsSectionProvider, "conditionsSectionProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f220750a = invitesOrBannerWidgetProvider;
        this.f220751b = stepsOrBenefitsSectionProvider;
        this.f220752c = conditionsSectionProvider;
        this.d = inputData;
        jte.d dVar = (jte.d) featureToggleInteractor;
        this.e = dVar.c(SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c);
        this.f = dVar.c(SharedReferralsUiApi$Toggles$ShowReferralsBusinessButton.f81822c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04df  */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(nya.l r63, nya.i r64, boolean r65) {
        /*
            Method dump skipped, instruction units count: 3470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nya.n0.a(nya.l, nya.i, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ee  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r47) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nya.n0.c(cli.j):cli.o");
    }
}
