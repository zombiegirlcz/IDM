package hz4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f157022a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_AUTOPAY_SET_ACCOUNT_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.credit_card_direct_debit_account_type_clabe, null, null, 14), new TextClause("##################", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, true, null, false, m72.b.u(18), false, false, false, null, null, 0, -1142947856, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        l lVar = new l(new TextLocalisedClause(R$string.credit_card_direct_debit_set_account_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_direct_debit_set_account_subtitle, u.c(new TextLocalisedClause(R$string.credit_card_direct_debit_account_type_clabe, null, null, 14)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_direct_debit_set_account_button, null, null, 14);
        String str2 = domainState.f157022a;
        boolean z = false;
        if (str2 != null && str2.length() == 18) {
            z = true;
        }
        return new m(listC, lVar, new k(textLocalisedClause, z));
    }
}
