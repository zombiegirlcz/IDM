package z2j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    public c(a accountFieldFallbackNameHelper) {
        Intrinsics.checkNotNullParameter(accountFieldFallbackNameHelper, "accountFieldFallbackNameHelper");
    }

    public final TextLocalisedClause a(String accountFieldType) {
        Intrinsics.checkNotNullParameter(accountFieldType, "accountFieldType");
        Locale locale = Locale.UK;
        String fieldType = p.a.r(locale, "UK", accountFieldType, locale, "toLowerCase(...)");
        String strV = a0.d.v(new Object[]{fieldType}, 1, "bank.transfer.beneficiary.account.field.%s", "format(...)");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        return new TextLocalisedClause(strV, (List) null, (Clause) new TextClause(jli.g.c(a0.D(fieldType, "_", " ", false)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22);
    }
}
