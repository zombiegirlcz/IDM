package hib;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import ip0.lr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.c7;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f152576a;
        boolean z = domainState.f152577b;
        boolean z3 = (str == null || d0.W(str) || z) ? false : true;
        String str2 = domainState.f152576a;
        if (str2 == null) {
            str2 = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("EMAIL_INPUT_ID", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.salaried_growth_work_email_verification_input_text_field_placeholder, null, null, 14), null, false, null, false, z3 ? new TextLocalisedClause(R$string.salaried_growth_work_email_verification_input_text_field_error, null, null, 14) : null, null, null, null, null, null, false, null, null, z3, false, false, false, new lr(33), 6, null, null, false, false, "emailAddress", 1, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -945946760, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new k(u.c(model), new c7(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_footer_caption, u.c(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_footer_privacy_policy, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10)), null, 12), false, null, 6), z);
    }
}
