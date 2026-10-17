package ua7;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.api.provider.HideOption$HideFromHome;
import com.revolut.feature.hidden_accounts.api.provider.HideOption$MakeSecret;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import eii.l;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wa7.m;
import yy0.i;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends oa7.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f278556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final za7.b f278557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zja.a f278558n;

    public f(m hiddenAccountsInteractor, za7.b hiddenAccountsDialogProvider, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f278556l = hiddenAccountsInteractor;
        this.f278557m = hiddenAccountsDialogProvider;
        this.f278558n = productArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ua7.f r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ua7.d
            if (r0 == 0) goto L13
            r0 = r6
            ua7.d r0 = (ua7.d) r0
            int r1 = r0.f278554w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278554w = r1
            goto L18
        L13:
            ua7.d r0 = new ua7.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278554w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            zja.a r5 = r5.f278558n
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey r4 = com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey.HIDDEN_ACCOUNTS
            r2.<init>(r4)
            r6.<init>(r2)
            r0.f278554w = r3
            kka.h r5 = (kka.h) r5
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r5.e(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ua7.f.b3(ua7.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oa7.a
    public final void Z2(String actionId, String accountId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (!Intrinsics.f(actionId, "ACTION_HIDE_ID")) {
            if (!Intrinsics.f(actionId, "ACTION_UNHIDE_ID")) {
                hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown action id: ", actionId)));
                return;
            } else {
                V2(new b(this, accountId, null, 2), new yi5.b(29));
                return;
            }
        }
        boolean zD = this.f278556l.d();
        int i = 6;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        za7.b bVar = this.f278557m;
        if (!zD) {
            bVar.getClass();
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i);
            boolean z = false;
            boolean z3 = false;
            RowDelegate.Model.c cVar = null;
            Object obj2 = null;
            boolean z4 = false;
            boolean z6 = false;
            List listK = v.k(new l(new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_folder_title, null, null, 14), new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_folder_subtitle, null, null, 14), image24, z, z3, (RowDelegate.Model.c) null, (Object) null, 488), new l((Clause) new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_analytics_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_analytics_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i), false, false, cVar, obj2, 488), new l(new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_biometrics_title, null, null, 14), new TextLocalisedClause(R$string.hidden_accounts_info_bottom_sheet_item_biometrics_subtitle, null, null, 14), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 6), z4, z6, cVar, obj2, 488));
            k9 k9Var = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            N2(new RowActionsBottomSheetController(new eii.c(aVar, eVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null)), bottom_dialog, new a(this, accountId, 1));
            return;
        }
        bVar.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.hidden_accounts_choose_method_title, null, null, 14), null, null, null, false, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hidden_accounts_choose_method_item_hide_from_home_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hidden_accounts_choose_method_item_hide_from_home_subtitle, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_eye_hide, null, null, 6), null, null, false, null, false, 62);
        i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        boolean z11 = true;
        boolean z12 = true;
        List listK2 = v.k(new l((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (RowDelegate.Model.MainImage) image40, z11, false, (RowDelegate.Model.c) new tf(i.a(resourceImage)), (Object) HideOption$HideFromHome.f74650a, 168), new l((Clause) new TextLocalisedClause(R$string.hidden_accounts_choose_method_item_make_it_secret_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hidden_accounts_choose_method_item_make_it_secret_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6), null, null, false, null, false, 62), z12, false, (RowDelegate.Model.c) new tf(i.a(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), (Object) HideOption$MakeSecret.f74651a, 168));
        k9 k9Var2 = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        N2(new RowActionsBottomSheetController(new eii.c(aVar2, null, listK2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null)), bottom_dialog, new a(this, accountId, i2));
    }
}
