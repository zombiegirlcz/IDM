package tne;

import bw0.l;
import bw0.m;
import cli.j;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f272438a;

    public i(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f272438a = amountFormatter;
    }

    public static m a(int i, dj0.d dVar, boolean z) {
        return new m(new TextLocalisedClause(i, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), z ? l.ERROR : l.INFO, new ResourceImage(z ? R$drawable.uikit_icn_16_exclamation_mark_outline : R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        m mVarA;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f272429a.e.f115083b;
        dj0.d dVar = new dj0.d(this.f272438a.b(domainState.f272430b, bVar.f306286a), bVar);
        TaxExemptionAggregate taxExemptionAggregate = domainState.f272429a;
        dj0.d dVar2 = taxExemptionAggregate.f89972c;
        dj0.d dVar3 = taxExemptionAggregate.e;
        dj0.d dVar4 = dj0.d.e;
        boolean z = false;
        boolean z3 = dVar.f(dVar4) && dVar.compareTo(dVar2) > 0 && dVar.compareTo(dVar3) <= 0;
        if (dVar.compareTo(dVar3) > 0) {
            mVarA = a(R$string.tax_exemption_limit_order_edit_error_high_amount, dVar3, true);
        } else {
            dj0.d dVar5 = taxExemptionAggregate.f89972c;
            if (dVar5.f115082a > 0) {
                int i = R$string.tax_exemption_limit_order_edit_error_low_amount;
                if (dVar.compareTo(dVar5) <= 0 && dVar.f(dVar4)) {
                    z = true;
                }
                mVarA = a(i, dVar5, z);
            } else {
                mVarA = null;
            }
        }
        return new e(u.c(new CenteredAmountDelegate.Model("AMOUNT_EDIT_ID", null, new bw0.h(domainState.f272430b, o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, z3, null, Boolean.TRUE, false, false, null, null, null, null, 32724), null, mVarA, null, null, true, false, null, null, 1898)), z3);
    }
}
