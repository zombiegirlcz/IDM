package bh8;

import au6.a3;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreenContract$InputData;
import cu8.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import vkm.z1;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends jki.g implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorMigrationAssetDetailsScreenContract$InputData f15258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rul.e f15259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yg8.e f15260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yg8.c f15261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mt8.d f15262t;
    public final j60.a u;
    public final r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kye.e f15263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dh8.a f15264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f15265y;
    public final z1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jki.p stateMapper, JuniorMigrationAssetDetailsScreenContract$InputData inputData, rul.e juniorGraduationInteractor, yg8.e juniorMigrationAssetUiModelsProvider, yg8.c juniorAppNaviCommandProvider, mt8.d kycInteractor, j60.a bottomExpandableDialogControllerExtension, r0 kycRequiredActionTransformer, kye.e juniorGraduationDebugRepository, dh8.a juniorAssetMigrationConfirmationDestinationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(juniorMigrationAssetUiModelsProvider, "juniorMigrationAssetUiModelsProvider");
        Intrinsics.checkNotNullParameter(juniorAppNaviCommandProvider, "juniorAppNaviCommandProvider");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(juniorGraduationDebugRepository, "juniorGraduationDebugRepository");
        Intrinsics.checkNotNullParameter(juniorAssetMigrationConfirmationDestinationProvider, "juniorAssetMigrationConfirmationDestinationProvider");
        this.f15258p = inputData;
        this.f15259q = juniorGraduationInteractor;
        this.f15260r = juniorMigrationAssetUiModelsProvider;
        this.f15261s = juniorAppNaviCommandProvider;
        this.f15262t = kycInteractor;
        this.u = bottomExpandableDialogControllerExtension;
        this.v = kycRequiredActionTransformer;
        this.f15263w = juniorGraduationDebugRepository;
        this.f15264x = juniorAssetMigrationConfirmationDestinationProvider;
        this.f15265y = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(bh8.u r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof bh8.p
            if (r0 == 0) goto L13
            r0 = r7
            bh8.p r0 = (bh8.p) r0
            int r1 = r0.f15252w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15252w = r1
            goto L18
        L13:
            bh8.p r0 = new bh8.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15252w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L5b
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            kye.e r7 = r6.f15263w
            r0.f15252w = r4
            r7.getClass()
            od0.a r2 = od0.a.f224253a
            boolean r2 = od0.a.e()
            if (r2 == 0) goto L56
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            og8.a r4 = new og8.a
            r5 = 0
            r4.<init>(r7, r3, r5)
            java.lang.Object r7 = skm.e0.J(r2, r4, r0)
            if (r7 != r1) goto L53
            goto L58
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            goto L58
        L56:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L58:
            if (r7 != r1) goto L5b
            return r1
        L5b:
            dh8.a r7 = r6.f15264x
            r7.getClass()
            com.revolut.kompot.common.ExternalDestination$ByIntent r7 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "revolut://app/youth/graduation/details?action=confirmMigration&source=details"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r1)
            r7.<init>(r0, r3)
            r6.C1(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bh8.u.y2(bh8.u, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.z, new a3(continuation, this, 20)), null, null, new b74.e(this, continuation, 27), 3);
        JuniorGraduationFeatureConfig.MigrationAssetDetails.Action action = this.f15258p.f76936a;
        if (Intrinsics.f(action, JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.ApproveAssetMigration.f76918a)) {
            n2(new o(this, continuation, 0), new whi.b(6));
        } else if (Intrinsics.f(action, JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.RejectAssetMigrationConfirmation.f76919a)) {
            this.f15260r.getClass();
            yji.l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_rejected_title, null, null, 14), new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_rejected_message, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, 7);
        } else if (action != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f15265y;
    }

    public final void z2() {
        ig8.i iVar = (ig8.i) ((f) t2()).f15241a.getContent();
        boolean z = iVar != null ? iVar.e : false;
        this.f15260r.getClass();
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_declined_confirmation_bottom_sheet_title, null, null, 14), new TextLocalisedClause(z ? R$string.junior_graduation_migration_asset_details_transfer_declined_confirmation_bottom_sheet_description : R$string.junior_graduation_migration_asset_details_transfer_declined_confirmation_bottom_sheet_account_not_closed_description, null, null, 14), new rp0.v("ICON_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D083", null, null, null, 30)), 24);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("DECLINE_TRANSFER_BUTTON_LIST_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_declined_confirmation_bottom_sheet_primary_action_title, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CLOSE_BOTTOM_SHEET_BUTTON_LIST_ITEM_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_declined_confirmation_bottom_sheet_secondary_action_title, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp16, 0, 0, 13);
        this.u.x(new y(zhm.v.k(model, model2), tVar, null, null, null, null, "DELEGATES_KEY_JUNIOR_MIGRATION_ASSET", null, null, null, 3836));
    }
}
