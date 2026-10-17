package gca;

import aw0.j8;
import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f142385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f142386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ldd.b f142387c;

    public j(yof.d transferAmountMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f142385a = transferAmountMapper;
        this.f142386b = amountFormatter;
        this.f142387c = focusRequesterDelegate;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String strE = this.f142386b.e(domainState.f142375a);
        dj0.d dVar = domainState.f142375a;
        bw0.h hVar = new bw0.h(strE, o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, ((ppf.c) this.f142385a).f238600b, Boolean.TRUE, false, false, null, null, null, null, 32708);
        xi0.b bVar = dVar.f115083b;
        dj0.d dVar2 = domainState.d;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar, null, (Intrinsics.f(bVar, dVar2.f115083b) && dVar.f(dVar2)) ? new bw0.m(new TextLocalisedClause(R$string.pix_refund_amount_limit_error, u.c(new MoneyClause(domainState.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 24) : null, null, null, false, false, null, null, 2026);
        TextDelegate.Model model2 = new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.pix_refund_amount_suggestion_text, v.k(new MoneyClause(domainState.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), DateTimeFormatter.ofPattern("d MMMM").format(LocalDateTime.ofInstant(domainState.f142378g, ZoneOffset.UTC))), null, 12), "ITEM_SUGGESTION_ID");
        TextClause textClause = new TextClause(domainState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_refund_reference_hint, null, null, 14);
        f0 f0Var = f0.f322471a;
        boolean z = domainState.f.length() > 0;
        ldd.b bVar2 = this.f142387c;
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("ITEM_NOTE_INPUT_ID", textClause, textLocalisedClause, null, null, null, null, false, 140, false, false, 0, true, 0, true, bVar2.a("ITEM_NOTE_INPUT_ID"), z, f0Var, false, false, 0, bVar2.c(0, "ITEM_NOTE_INPUT_ID"), false, null, 855584760, 131007);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, model2, model3);
        j8 j8Var = new j8(new TextLocalisedClause(R$string.pix_refund_amount_title, null, null, 14), new TextLocalisedClause(R$string.pix_refund_amount_subtitle, u.c(new MoneyClause(domainState.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, domainState.f142376b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, 16);
        long j2 = dVar.f115082a;
        return new h(listK, j8Var, j2 > 0 && j2 <= dVar2.f115082a && j2 <= domainState.e.f115082a);
    }
}
