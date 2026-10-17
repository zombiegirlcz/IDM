package gmj;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData f144874a;

    public j(imj.a labelValidator, EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(labelValidator, "labelValidator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f144874a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_edit_label_hint, null, null, 14);
        String str = domainState.f144863a;
        List listC = u.c(new InputTextDelegate.Model("ID_LABEL_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, textLocalisedClause, false, null, false, null, null, null, null, null, null, false, null, null, str != null ? !imj.a.a(str) : false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -131084, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        boolean zA = imj.a.a(str);
        String str2 = this.f144874a.f101391b.f;
        return new g(listC, zA, (str2 == null || str2.length() == 0) ? f0.f322471a : u.c(new TextNavBarMenuItem("ID_REMOVE_TEXT", new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_action_remove_cta, null, null, 14), null, null, 12)));
    }
}
