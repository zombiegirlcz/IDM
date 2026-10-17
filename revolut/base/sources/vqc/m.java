package vqc;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.salary_switch.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.b f291382a;

    public m(hp.b cnpjValidator) {
        Intrinsics.checkNotNullParameter(cnpjValidator, "cnpjValidator");
        this.f291382a = cnpjValidator;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f291373b;
        hp.b bVar = this.f291382a;
        boolean z = bVar.b(str).length() >= 14 && !bVar.c(str);
        InputTextDelegate.Model model = new InputTextDelegate.Model("EMPLOYER_NAME_INPUT_ID", new TextClause(domainState.f291372a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.salary_switch_br_employer_details_field_employer_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("CNPJ_INPUT_ID", new TextClause(domainState.f291373b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.salary_switch_br_employer_details_field_cnpj_number, null, null, 14), g.f291375b, true, null, false, z ? new TextLocalisedClause(R$string.salary_switch_common_validation_input_incomplete_or_invalid, null, null, 14) : new TextLocalisedClause(R$string.salary_switch_br_employer_details_field_cnpj_number_help, null, new Click(30, (Integer) null, (Object) null, "CNPJ_HELP_CLAUSE_ID", false), 10), null, null, null, null, null, false, null, null, z, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, g.f291374a, null, null, 0, 0, 0, 0, -537002144, 65023);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new k(v.k(model, model2), bVar.c(domainState.f291373b) & (!d0.W(domainState.f291372a)));
    }
}
