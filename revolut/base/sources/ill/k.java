package ill;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(jkl.i iVar) {
        TextLocalisedClause textLocalisedClause;
        LayeredImage layeredImageB;
        String strQ = j6.a.q("LIST_ID_CHALLENGE_", iVar.getValue());
        int[] iArr = l.f162268a;
        switch (iArr[iVar.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_bankid, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_cardpin, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_dap, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_email, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_selfie, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_selfie, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_id_doc, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_outsms, null, null, 14);
                break;
            case 9:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_okta, null, null, 14);
                break;
            case 10:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_password, null, null, 14);
                break;
            case 11:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_passcode, null, null, 14);
                break;
            case 12:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_sms, null, null, 14);
                break;
            case 13:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_phone, null, null, 14);
                break;
            case 14:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_passkey, null, null, 14);
                break;
            case 15:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_whatsapp, null, null, 14);
                break;
            case 16:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_qr_code, null, null, 14);
                break;
            case 17:
                textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_method_google, null, null, 14);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                throw new IllegalStateException(iVar + " is not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[iVar.ordinal()]) {
            case 1:
                layeredImageB = b(R$drawable.uikit_icn_24_bankid);
                break;
            case 2:
                layeredImageB = b(R$drawable.uikit_icn_24_card);
                break;
            case 3:
                layeredImageB = b(R$drawable.uikit_icn_24_national_id);
                break;
            case 4:
                layeredImageB = b(R$drawable.uikit_icn_24_envelope);
                break;
            case 5:
                layeredImageB = b(R$drawable.uikit_icn_24_camera);
                break;
            case 6:
                layeredImageB = b(R$drawable.uikit_icn_24_camera);
                break;
            case 7:
                layeredImageB = b(R$drawable.uikit_icn_24_national_id);
                break;
            case 8:
                layeredImageB = b(R$drawable.uikit_icn_24_message);
                break;
            case 9:
                layeredImageB = b(R$drawable.uikit_icn_24_okta);
                break;
            case 10:
                layeredImageB = b(R$drawable.uikit_icn_24_change_passcode);
                break;
            case 11:
                layeredImageB = b(R$drawable.uikit_icn_24_change_passcode);
                break;
            case 12:
                layeredImageB = b(R$drawable.uikit_icn_24_message);
                break;
            case 13:
                layeredImageB = b(R$drawable.uikit_icn_24_call);
                break;
            case 14:
                layeredImageB = b(R$drawable.uikit_icn_24_passkey);
                break;
            case 15:
                layeredImageB = b(R$drawable.uikit_icn_24_logo_whatsapp);
                break;
            case 16:
                layeredImageB = b(R$drawable.uikit_icn_24_qr);
                break;
            case 17:
                layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_google, null, R$attr.uikit_colorBackground_10, 8.0f, null, null, 48);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                throw new IllegalStateException(iVar + " is not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(layeredImageB, null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532675576);
    }

    public static LayeredImage b(int i) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, null, null, 48);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ill.a domainState = (ill.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (jkl.i iVar : domainState.f162262a) {
            switch (l.f162268a[iVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    arrayList.add(a(iVar));
                    break;
                case 17:
                    arrayList2.add(a(iVar));
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Not supported challenge received: " + iVar, null, h0Var);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(arrayList2, arrayList);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_CAN_NOT_VERIFY", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_bottom_action_can_not_verify, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        return new e(d0.F0(model, arrayListE0));
    }
}
