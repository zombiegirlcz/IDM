package mk5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.impl.R$string;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CurrencyChooserScreen f206184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CurrencyChooserScreen currencyChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206184w = currencyChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f206184w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f206184w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CurrencyChooserScreen currencyChooserScreen = this.f206184w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = currencyChooserScreen.d();
                Intrinsics.h(query);
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) nVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar2.C = query;
                aVar2.H2(aVar2.F, new lu6.p(query, 24));
                break;
            default:
                String selectedId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = CurrencyChooserScreen.W;
                currencyChooserScreen.f3().setHint(new TextLocalisedClause(Intrinsics.f(selectedId, "WALLETS_TAB") ? R$string.crypto_withdrawals_common_search_currencies_placeholder : R$string.crypto_withdrawals_common_search_contacts_placeholder, null, null, 14));
                currencyChooserScreen.f3().i0();
                n nVarE32 = currencyChooserScreen.d();
                Intrinsics.h(selectedId);
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar4 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) nVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                aVar4.H2(aVar4.F, new lu6.p(selectedId, 23));
                break;
        }
        return Unit.f186387a;
    }
}
