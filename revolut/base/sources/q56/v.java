package q56;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.remittances.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    public final CompositeClause a(wk5.a aVar) {
        int i = R$drawable.uikit_icn_16_check;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        Float fValueOf = Float.valueOf(12.0f);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.crypto_defi_send_add_beneficiary_address_helper_address_type, zhm.u.c(ik5.d.a(wk5.m.a(aVar))), null, 12), new TextLocalisedClause(R$string.crypto_defi_send_add_beneficiary_address_helper_address_type_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "DEFI_SEND_ADD_BENEFICIARY_ADDRESS_TYPE_LEARN_MORE_ID", false), 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r61) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q56.v.c(cli.j):cli.o");
    }
}
