package xl9;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreenContract$InputData;
import ip0.iq;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithSmileConsentScreenContract$InputData f306976a;

    public t(PayWithSmileConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f306976a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_title, null, custom, 10);
        f fVar = this.f306976a.f78956a;
        int[] iArr = s.f306975a;
        int i = iArr[fVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_subtitle_enable_and_pay, null, custom, 10);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_subtitle_enable, null, custom, 10);
        }
        UrlVideo urlVideo = new UrlVideo("https://assets.revolut.com/mobile/revolut_pay/biometric_payments/activation.mp4", (String) null, false, oz0.b.FILL, false, (oz0.c) null, LDSFile.EF_DG4_TAG);
        aim.e eVarB = u.b();
        iii.c.f(domainState.f306958b, new p(eVarB, 1), new xce.d(28), new q(eVarB, 1));
        aim.e eVarB2 = u.b();
        int i2 = R$attr.uikit_colorForeground;
        eVarB2.add(new RowDelegate.Model("ID_ROW_SECURITY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_row_security, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        eVarB2.add(new RowDelegate.Model("ID_EARN_X_POINTS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_row_earn_x_points, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        eVarB2.add(new RowDelegate.Model("ID_FREE_FOR_MERCHANT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_row_free_for_merchant, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("ID_CHECKBOX_CONSENT", new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_consent, null, null, 14), domainState.f306957a, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        iii.c.f(domainState.f306958b, new p(eVarB, 0), new xce.d(27), new q(eVarB, 0));
        aim.e eVarA2 = u.a(eVarB);
        m6 m6Var = n6.Companion;
        int i3 = iArr[fVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_action_enable_and_pay, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_enable_pay_with_smile_action_enable, null, null, 14);
        }
        return new k(textLocalisedClause3, textLocalisedClause, urlVideo, eVarA2, new aw0.e(false, null, null, m6.c(m6Var, textLocalisedClause2, LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f306957a, null, null, null, 988), null, null, 55));
    }
}
