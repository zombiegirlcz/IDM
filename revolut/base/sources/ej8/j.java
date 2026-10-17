package ej8;

import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorPaymentLinkCustomAmountScreenContract$Input f126787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f126788b;

    public j(JuniorPaymentLinkCustomAmountScreenContract$Input input, w80.b amountFormatter, o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f126787a = input;
        this.f126788b = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f126779a;
        Lazy lazy = domainState.f126781c;
        String strD = this.f126788b.d(dVar.f115082a, dVar.f115083b.f306286a);
        dj0.d dVar2 = domainState.f126779a;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(strD, o.b(new u80.g(new dj0.d(dVar2.f115082a, dVar2.f115083b), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, ehe.n.w(11), Boolean.TRUE, false, false, null, null, null, null, 32708), null, null, null, null, false, false, dVar2.f115083b, null, 1530);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_NOTE_INPUT_ID", new TextClause(domainState.f126780b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_note_add_note, null, null, 14), null, false, null, false, null, null, null, null, null, null, true, 100, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, m72.b.u(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610661896, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model2, R$attr.uikit_dp0, 0, 0, 0, 14);
        boolean z = false;
        koi.j[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input = this.f126787a;
        TextLocalisedClause textLocalisedClause = juniorPaymentLinkCustomAmountScreenContract$Input.f77096a.a() ? new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_primary_button_create_link, null, null, 14) : new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_primary_button_update_link, null, null, 14);
        if (!((PaymentLinkCustomAmountBundle) lazy.getValue()).a() && !Intrinsics.f((PaymentLinkCustomAmountBundle) lazy.getValue(), juniorPaymentLinkCustomAmountScreenContract$Input.f77096a)) {
            z = true;
        }
        return new g(textLocalisedClause, listL, z);
    }
}
