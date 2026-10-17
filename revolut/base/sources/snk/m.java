package snk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import ip0.lr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StudentEmailValidationScreenContract$InputData f264644a;

    public m(StudentEmailValidationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f264644a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = this.f264644a;
        TextLocalisedClause textLocalisedClause = studentEmailValidationScreenContract$InputData.f103639b ? new TextLocalisedClause(R$string.student_plans_register_email_subtitle_reverify, null, null, 14) : null;
        List listC = !studentEmailValidationScreenContract$InputData.f103639b ? zhm.u.c(new TextNavBarMenuItem("NOT_A_STUDENT_MENU_ID", new TextLocalisedClause(R$string.student_plans_register_email_action_not_a_student, null, null, 14), null, null, 12)) : null;
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.student_plans_terms_promotional_agreement, zhm.u.c(new TextLocalisedClause(R$string.student_plans_terms_promotional_link, null, new Click(30, (Integer) null, (Object) null, "ID_STUDENT_TERMS_CLAUSE", false), 10)), null, 12);
        InputTextDelegate.Model model = new InputTextDelegate.Model("EMAIL_INPUT_FIELD_ID", new TextClause(domainState.f264634a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.student_plans_register_email_email_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, new lr(33), 0, null, null, false, domainState.f264636c, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -69206024, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp48, 0, 0, null, false, 61);
        return new l(textLocalisedClause2, textLocalisedClause3, listC, zhm.u.c(model), domainState.f264635b);
    }
}
