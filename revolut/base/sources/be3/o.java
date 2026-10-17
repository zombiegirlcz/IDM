package be3;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f14672a;

    public o(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f14672a = amountFormatter;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        uc3.a aVar = domainState.f14656a;
        long j2 = domainState.f14657b;
        String currency = aVar.f278974b.f163147c;
        CurrencyImage currencyImage = new CurrencyImage(currency, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_withdrawal_to_main, null, null, 14);
        io3.d dVar = (io3.d) domainState.d.getContent();
        long j3 = dVar != null ? dVar.i : 0L;
        xi0.b.Companion.getClass();
        f3 f3Var = new f3(currencyImage, textLocalisedClause, new MoneyClause(new dj0.d(j3, xi0.a.a(currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, h3.ACTIVE_NOT_CLICKABLE, false);
        io3.d dVar2 = aVar.f278974b;
        bw0.m mVar = new bw0.m(null, j2 > dVar2.i ? bw0.l.ERROR : bw0.l.INFO, null, false, null, 29);
        Intrinsics.checkNotNullParameter(currency, "currency");
        boolean z = false;
        List listC = u.c(new CenteredAmountDelegate.Model("ID_AMOUNT", null, new bw0.h(this.f14672a.c(j2, null, currency), cp5.d.J(xi0.a.a(currency)), null, j2 > 0, null, Boolean.valueOf(domainState.f14658c), false, false, bw0.e.SuggestionsWhenTextEmptyElseCalculator, null, null, null, 31700), f3Var, mVar, null, null, true, false, xi0.a.a(currency), null, 1378));
        if (j2 > 0 && j2 <= dVar2.i) {
            z = true;
        }
        return new h(listC, z, new TextLocalisedClause(R$string.cashback_withdrawal_balance, u.c(new MoneyClause(io3.h.e(dVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(j2 > dVar2.i ? R$attr.uikit_colorRed : R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), domainState.e);
    }
}
