package rd4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_manual_underwriting_intro_screen_title, u.c(new TextClause(domainState.f253333a.f66473a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextClause textClause = new TextClause(domainState.f253333a.f66474b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ArrayList arrayList = domainState.f253334b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
            ManualUnderwritingReferralFlag manualUnderwritingReferralFlag = (ManualUnderwritingReferralFlag) it8.next();
            String str = manualUnderwritingReferralFlag.f66477c;
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_documents_pair, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.credit_manual_underwriting_intro_screen_referral_flag_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(R$string.credit_manual_underwriting_intro_screen_referral_flag_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, manualUnderwritingReferralFlag, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList2, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 28);
        return new h(textLocalisedClause, textClause, arrayList2);
    }
}
