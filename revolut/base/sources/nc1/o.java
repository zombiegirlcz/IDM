package nc1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f214142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f214143b;

    public o(qd0.b languageProvider, w80.b amountFormatter, cfc.a cardReaderUiListItemsInteractor) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(cardReaderUiListItemsInteractor, "cardReaderUiListItemsInteractor");
        this.f214142a = languageProvider;
        this.f214143b = amountFormatter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ?? r56;
        TextLocalisedClause textLocalisedClause;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f214122a;
        d dVar = domainState.e;
        xi0.b bVar = domainState.f214123b;
        dj0.d dVar2 = new dj0.d(this.f214143b.b(str, bVar.f306286a), bVar);
        boolean z = dVar2.compareTo(domainState.f) < 0;
        boolean z3 = (dVar2.k() || domainState.d || !z) ? false : true;
        if (dVar2.k()) {
            textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_amount_input_button_title, null, null, 14);
            r56 = 0;
        } else {
            r56 = 0;
            textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_amount_input_button_title_amount, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        boolean z4 = z;
        boolean z6 = z3;
        AmountEditDelegate.Model model = new AmountEditDelegate.Model("amount_id", new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new bw0.h(domainState.f214122a, cp5.d.J(bVar), z4, m72.b.u(9), Boolean.valueOf(dVar == d.AMOUNT), false, false, false, false, null, 8132), nx0.e.NONE, null, null, !z4 ? new bw0.m(new TextLocalisedClause(R$string.merchant_card_reader_flow_amount_input_exceeds_limit, u.c(new MoneyClause(domainState.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), r56, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 24) : r56, false, new yb1.a(((s80.b) this.f214142a).b(), bVar), null, 1680);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("description_id", new TextClause(domainState.f214124c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.merchant_card_reader_common_title_description, r56, r56, 14), null, false, null, false, new TextLocalisedClause(R$string.merchant_card_reader_common_title_optional, r56, r56, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, dVar == d.DESCRIPTION, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67109000, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        Object[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f(kotlin.collections.d.L(elements), z6, textLocalisedClause, u.a(u.b()));
    }
}
