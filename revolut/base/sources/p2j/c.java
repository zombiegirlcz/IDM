package p2j;

import ang.f;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.balance.picker.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f232262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1j.f f232263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1j.c f232264c;

    public c(f userInteractor, w1j.f tradingDisclaimerProvider, w1j.c savingsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingDisclaimerProvider, "tradingDisclaimerProvider");
        Intrinsics.checkNotNullParameter(savingsDisclaimerProvider, "savingsDisclaimerProvider");
        this.f232262a = userInteractor;
        this.f232263b = tradingDisclaimerProvider;
        this.f232264c = savingsDisclaimerProvider;
    }

    public static CompositeClause a(Clause clause, xi0.b bVar, xi0.b bVar2) {
        int i = R$string.currency_picker_fx_title;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        return new CompositeClause(v.k(new TextLocalisedClause(i, v.k(new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(bVar2, ticker, null, 4)), custom, 8), clause), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j1j.d r10, xi0.b r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2j.c.b(j1j.d, xi0.b, gim.c):java.lang.Object");
    }
}
