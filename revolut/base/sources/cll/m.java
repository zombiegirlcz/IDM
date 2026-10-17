package cll;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Boolean boolValueOf;
        String str;
        ell.b bVar;
        Image imageD;
        String str2;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ell.a aVar = domainState.f25055b;
        if (aVar == null || (str2 = aVar.f127526b) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(str2.length() == 0);
        }
        boolean zK = pd.b.k(boolValueOf);
        boolean z = aVar != null && aVar.f127527c == ell.c.INVALID && aVar.f127526b.length() > 9;
        if (aVar == null || (str = aVar.f127526b) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_CARD_NUMBER", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_number_card_field_title, null, null, 14), new TextClause("0000 0000 0000 0000", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, z ? new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_number_error_invalid_card_number, null, null, 14) : null, null, (aVar == null || (bVar = aVar.f127525a) == null || (imageD = bVar.d()) == null) ? new ResourceImage(R$drawable.uikit_icn_24_card_number, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : imageD, new InputText.Companion.AbstractC0443a.b(false), null, null, false, null, null, z, false, 2, 0, null, false, false, null, !zK, null, false, false, false, null, null, 0, -539102352, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, new PlainTextDelegate.Model("LIST_ID_FORGOT_CARD_NUMBER", (Clause) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_number_forgot_card_number_or_pin, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_FORGOT_CARD_NUMBER", false), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422));
        ell.a aVar2 = domainState.f25055b;
        return new i(domainState.f25054a ? new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_contactless, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_number_option_contactless, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)), null, null, null, 14) : null, listK, (aVar2 != null ? aVar2.f127527c : null) == ell.c.VALID);
    }
}
