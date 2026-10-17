package p4j;

import a0.d;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import n61.j;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2j.c f232952a;

    public b(z2j.c beneficiaryAccountFieldTypeHelper, s4j.a backendFieldIdGenerator, n4j.c utils) {
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldTypeHelper, "beneficiaryAccountFieldTypeHelper");
        Intrinsics.checkNotNullParameter(backendFieldIdGenerator, "backendFieldIdGenerator");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.f232952a = beneficiaryAccountFieldTypeHelper;
    }

    public final TextLocalisedClause a(Field$BackendDefinition.DropdownDefinition field, String choice) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(choice, "choice");
        String accountFieldType = field.f99713a.f60271a;
        Intrinsics.checkNotNullParameter(accountFieldType, "accountFieldType");
        Intrinsics.checkNotNullParameter(choice, "choice");
        Locale locale = Locale.ROOT;
        return new TextLocalisedClause(d.v(new Object[]{p.a.r(locale, "ROOT", accountFieldType, locale, "toLowerCase(...)"), p.a.r(locale, "ROOT", choice, locale, "toLowerCase(...)")}, 2, "beneficiary_creation.field.%s.choices.%s", "format(...)"), (List) null, (Clause) new TextClause(field.f99713a.f60280p ? j.b(AccountFieldType.COLOMBIA_ACH_ACCOUNT_TYPE, choice) : choice, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22);
    }
}
