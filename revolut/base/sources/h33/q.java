package h33;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_order_new.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("FIRST_NAME_ID", new TextClause(domainState.f149024a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_delivery_delivery_to_form_first_name_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LAST_NAME_ID", new TextClause(domainState.f149025b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_delivery_delivery_to_form_last_name_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("PHONE_ID", new TextClause(domainState.f149026c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_delivery_delivery_to_form_phone_label, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 3, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -538968072, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        return new k(v.k(model, model2, model3), (d0.W(domainState.f149024a) || d0.W(domainState.f149025b) || d0.W(domainState.f149026c)) ? false : true);
    }
}
