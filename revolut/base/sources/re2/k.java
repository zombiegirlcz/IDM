package re2;

import bw0.m;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.swish.api.R$string;
import ip0.b9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f253500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ldd.b f253501b;

    public k(o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f253500a = amountFormatter;
        this.f253501b = focusRequesterDelegate;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String strE = this.f253500a.e(domainState.f253489a);
        dj0.d dVar = domainState.f253489a;
        bw0.h hVar = new bw0.h(strE, o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, null, Boolean.valueOf(this.f253501b.a("ID_AMOUNT_INPUT")), false, false, null, null, null, null, 32724);
        g gVar = domainState.f253491c;
        return new f(new TextLocalisedClause(R$string.swish_update_limits_disclaimer, u.c(new MoneyClause(domainState.f253490b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), u.c(new CenteredAmountDelegate.Model("ID_AMOUNT_INPUT", null, hVar, null, gVar == g.VALUE_OVER_MAX_LIMIT ? new m(new TextLocalisedClause(R$string.swish_update_limits_disclaimer_error, u.c(new MoneyClause(domainState.f253490b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 24) : null, null, b9.MATCH_PARENT, null, null, null, null, new l(dVar.f115083b), null, 6058)), gVar == null);
    }
}
