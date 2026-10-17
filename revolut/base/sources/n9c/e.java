package n9c;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import java.util.List;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements p {
    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.addAll(v.k(new ListSubheaderDelegate.Model("LIST_ID_REVOLUT_PAY_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_shops_showcase_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61434), new TextDelegate.Model("LIST_ID_REVOLUT_PAY_DESCRIPTION", new TextLocalisedClause(R$string.revolut_pay_shops_showcase_subtitle, null, null, 14), false, new ck0(0), null, null, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 1652)));
        List listK = v.k(new RowDelegate.Model("LIST_ID_REVOLUT_PAY_INFO_1", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature1_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature1_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_REVOLUT_PAY_INFO_2", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature3_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature3_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_REVOLUT_PAY_INFO_3", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature2_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_shops_showcase_feature2_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_REVOLUT_PAY_CTA_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, 0, R$attr.uikit_dp32, 0, 0, null, false, 61);
        eVarB.add(model);
        return new c(u.a(eVarB));
    }
}
