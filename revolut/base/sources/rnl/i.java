package rnl;

import au0.q0;
import aw0.n6;
import aw0.o9;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.impl.domain.models.ChallengeClient;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreenContract$InputData;
import ip0.ak0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import tll.r;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MerchantPermissionsScreenContract$InputData f255724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f255725b;

    public i(MerchantPermissionsScreenContract$InputData inputData, r revolutAccountsUiFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
        this.f255724a = inputData;
        this.f255725b = revolutAccountsUiFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        ?? r62;
        List listA;
        ?? ValueOf;
        RowDelegate.Model model;
        ?? ValueOf2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        MerchantPermissionsScreenContract$InputData merchantPermissionsScreenContract$InputData = this.f255724a;
        Image imageA = this.f255725b.a(merchantPermissionsScreenContract$InputData.f106588a);
        ChallengeClient challengeClient = merchantPermissionsScreenContract$InputData.f106589b;
        String str = challengeClient.f106104b;
        boolean z = false;
        q0 q0Var = null;
        UrlImage urlImage = str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : null;
        if (urlImage != null) {
            r62 = 0;
            q0Var = new q0(new AvatarModel.Default(imageA, null, new AvatarModel.Border.StaticGradient(UiKitGradient.b.e, com.revolut.core.ui_kit.models.avatar.c.OVAL), null, null, null, 122), new AvatarModel.Default(urlImage, null, null, null, null, null, 126), new TagViewData(null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, R$attr.uikit_colorTransparent, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        } else {
            r62 = 0;
        }
        e eVar = new e(q0Var, new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_title, u.c(challengeClient.f106103a), r62, 12), new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_description, r62, r62, 14));
        ArrayList arrayList = merchantPermissionsScreenContract$InputData.f106590c;
        ArrayList<ConsentedClient.Consent> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ConsentedClient.Consent) obj2).f105931a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ?? r64 = r62;
        for (ConsentedClient.Consent consent : arrayList2) {
            ArrayList<ConsentedClient.Consent.Claim> arrayList4 = consent.d;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            ?? r67 = r64;
            for (ConsentedClient.Consent.Claim claim : arrayList4) {
                com.revolut.sso.api.models.c cVar = claim.f105934a;
                int[] iArr = j.f255726a;
                switch (iArr[cVar.ordinal()]) {
                    case 1:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_address);
                        break;
                    case 2:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_date_of_birth);
                        break;
                    case 3:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_email);
                        break;
                    case 4:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_name);
                        break;
                    case 5:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_phone);
                        break;
                    case 6:
                        ValueOf = Integer.valueOf(R$string.revolut_sso_merchant_permissions_consent_screen_permission_citizenship);
                        break;
                    case 7:
                        ValueOf = r67;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (ValueOf != 0) {
                    int iIntValue = ValueOf.intValue();
                    switch (iArr[cVar.ordinal()]) {
                        case 1:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_utilities);
                            break;
                        case 2:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_cake);
                            break;
                        case 3:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_envelope);
                            break;
                        case 4:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_profile);
                            break;
                        case 5:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_call);
                            break;
                        case 6:
                            ValueOf2 = Integer.valueOf(R$drawable.uikit_icn_24_flag);
                            break;
                        case 7:
                            ValueOf2 = r67;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    String str2 = "LIST_ID_CLAIM_PREFIX_" + cVar + "_claim_of_" + consent.f105932b + "_consent";
                    RowDelegate.Model.MainImage.Image24 image24 = ValueOf2 != 0 ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(ValueOf2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6) : null;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iIntValue, null, null, 14);
                    String str3 = claim.f105936c;
                    model = new RowDelegate.Model(str2, image24, textLocalisedClause, null, 0, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                } else {
                    model = null;
                }
                arrayList5.add(model);
                r67 = 0;
            }
            a0.x(arrayList5, arrayList3);
            r64 = 0;
        }
        ArrayList arrayListZ = d0.Z(arrayList3);
        if (arrayListZ.isEmpty()) {
            listA = f0.f322471a;
        } else {
            aim.e eVarB = u.b();
            yp0.b.k(arrayListZ, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayListZ);
            eVarB.add(new TextDelegate.Model("PLAIN_TEXT_LIST_ID", new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_terms_main, u.c(new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_terms_terms_and_policy, v.k(new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_terms_terms_and_conditions, null, new Click(28, (Integer) null, (Object) challengeClient.d, "TERMS_AND_CONDITIONS_LIST_ID", false), 10), new TextLocalisedClause(R$string.revolut_sso_merchant_permissions_consent_screen_terms_privacy_policy, null, new Click(28, (Integer) null, (Object) challengeClient.f106105c, "PRIVACY_POLICY_LIST_ID", false), 10)), null, 12)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
            listA = u.a(eVarB);
        }
        return new f(eVar, new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CONFIRM_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), listA);
    }
}
