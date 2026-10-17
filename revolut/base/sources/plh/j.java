package plh;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(2, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((TradingLegalEntityInformation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        hel.b bVar = tradingLegalEntityInformation.f105106a;
        int i = bVar == null ? -1 : i.f237408a[bVar.ordinal()];
        return new qf1.m(new TextLocalisedClause(i != 1 ? i != 2 ? R$string.wealth_add_new_widget_stocks_account_title : R$string.wealth_add_new_widget_investment_account_title : R$string.wealth_add_new_widget_brokerage_account_title, null, null, 14), new TextLocalisedClause(R$string.wealth_add_new_widget_subtitle, null, null, 14), new TextLocalisedClause(R$string.wealth_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_wealth, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6);
    }
}
