package hea;

import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 implements cli.n {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.pockets.impl.details_v2.pocket_actions.a f151643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f151644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wda.b f151645c;
    public final zjh.j d;
    public final PocketDetailsScreenContract$InputData e;
    public final gte.a f;

    public n0(vda.c expectingLargeTransferBannerMapper, com.revolut.feature.pockets.impl.details_v2.pocket_actions.a pocketDetailsActionFactory, vda.d listOfPocketsBannerMapper, vda.a accountDetailsSwitchBannerProvider, f01.a uiKitResources, wda.b accountDetailsCommonMapper, zjh.j legalEntityDisclaimerMapper, a accountBalanceLimitItemMapper, PocketDetailsScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(expectingLargeTransferBannerMapper, "expectingLargeTransferBannerMapper");
        Intrinsics.checkNotNullParameter(pocketDetailsActionFactory, "pocketDetailsActionFactory");
        Intrinsics.checkNotNullParameter(listOfPocketsBannerMapper, "listOfPocketsBannerMapper");
        Intrinsics.checkNotNullParameter(accountDetailsSwitchBannerProvider, "accountDetailsSwitchBannerProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(accountBalanceLimitItemMapper, "accountBalanceLimitItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f151643a = pocketDetailsActionFactory;
        this.f151644b = uiKitResources;
        this.f151645c = accountDetailsCommonMapper;
        this.d = legalEntityDisclaimerMapper;
        this.e = inputData;
        this.f = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.TextDelegate.Model a(hea.o r18) {
        /*
            r0 = r18
            hea.d r0 = r0.k
            boolean r1 = r0 instanceof hea.b
            r2 = 0
            if (r1 == 0) goto Lc
            hea.b r0 = (hea.b) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            return r2
        L10:
            xjg.l r0 = r0.f151623a
            com.revolut.feature.uipersonalisation.api.models.AppTheme r1 = r0.f306520a
            xjg.m r1 = r1.f94562b
            int[] r3 = hea.m0.f151642a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            java.lang.String r4 = "logo_dark"
            if (r1 == r3) goto L2f
            r5 = 2
            java.lang.String r6 = "logo_light"
            if (r1 == r5) goto L31
            r5 = 3
            if (r1 != r5) goto L33
            boolean r0 = r0.f306521b
            if (r0 == 0) goto L31
        L2f:
            r5 = r4
            goto L39
        L31:
            r5 = r6
            goto L39
        L33:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L39:
            ip0.ak0 r0 = new ip0.ak0
            com.revolut.core.ui_kit_core.displayers.image.models.CdnImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.CdnImage
            com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations r6 = new com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations
            r1 = 48
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r1 = 65
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 31
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r11 = 228(0xe4, float:3.2E-43)
            r8 = r6
            java.lang.String r6 = "mobile/fscs"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.<init>(r2, r4, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.tab.accounts.api.R$string.home_footer_legal_disclaimer_description
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.tab.accounts.api.R$string.home_footer_legal_disclaimer_learn_more
            com.revolut.core.ui_kit.models.Click r9 = new com.revolut.core.ui_kit.models.Click
            int r5 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r10 = 14
            r12 = 0
            java.lang.String r13 = "FSCS_FOOTER_CLICK_ID"
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r5 = 10
            r3.<init>(r4, r2, r9, r5)
            java.util.List r3 = zhm.u.c(r3)
            r4 = 12
            r8.<init>(r1, r3, r2, r4)
            com.revolut.core.ui_kit.delegates.TextDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.TextDelegate$Model
            r16 = 0
            r17 = 2036(0x7f4, float:2.853E-42)
            java.lang.String r7 = "FSCS_FOOTER_ITEM_ID"
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hea.n0.a(hea.o):com.revolut.core.ui_kit.delegates.TextDelegate$Model");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause b(hea.o r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hea.n0.b(hea.o, boolean):com.revolut.core.ui_kit.models.CompositeClause");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r14) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hea.n0.c(cli.j):cli.o");
    }
}
