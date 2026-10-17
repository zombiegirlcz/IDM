package qgg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAccountRegistrationScreenContract$InputData f245847a;

    public p(TravelMilesAccountRegistrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245847a = inputData;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        String strO;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listW = ehe.n.w(20);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_account_registration_section_membership_title, null, null, 14);
        int i = R$string.miles_account_registration_section_membership_footer;
        g gVar = domainState.f245833a;
        if (gVar == null || (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(gVar.f245831a, " ", gVar.f245832b)) == null) {
            m70.a.c(t0.f186434a);
            strO = "";
        }
        List listC = u.c(new InputTextDelegate.Model("MEMBERSHIP_NUMBER_INPUT_ITEM_ID", null, textLocalisedClause, null, false, new TextLocalisedClause(i, u.c(strO), null, 12), null, null, null, null, null, false, null, null, false, false, 2, 6, null, false, true, null, true, listW, false, false, false, null, null, 0, -1684013190, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List listK = v.k(new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_title, null, null, 14), new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_link_placeholder, null, new Click(30, (Integer) null, (Object) null, "SIGN_UP_ITEM_ID", false), 10));
        m70.a.t(t0.f186434a);
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        boolean z = !d0.W(domainState.f245834b);
        String str = this.f245847a.f94260b;
        return new j(listC, compositeClause, z, str != null ? new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null);
    }
}
