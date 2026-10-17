package xsf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    public d0(a validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
    }

    public static TextClause a(AdditionalInfoField additionalInfoField) {
        String str = additionalInfoField.f92408c;
        if (str != null) {
            String str2 = !kotlin.text.d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return null;
    }

    public static Clause b(AdditionalInfoField additionalInfoField, y yVar) {
        v vVar = yVar instanceof v ? (v) yVar : null;
        if (vVar != null) {
            return vVar.f308483a;
        }
        Clause[] elements = {!additionalInfoField.e ? new TextLocalisedClause(R$string.transfer_reasons_additional_info_field_optional, null, null, 14) : null, a(additionalInfoField)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            listL = null;
        }
        if (listL != null) {
            return v1.c.f(listL, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r65) {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsf.d0.c(cli.j):cli.o");
    }
}
