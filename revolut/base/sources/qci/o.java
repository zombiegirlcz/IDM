package qci;

import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionCountriesScreen f244807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(TransactionCountriesScreen transactionCountriesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244807w = transactionCountriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f244807w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f244807w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransactionCountriesScreen transactionCountriesScreen = this.f244807w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = transactionCountriesScreen.e3();
                Intrinsics.h(id10);
                com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar2 = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) gVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "SKIP_ITEM_ID")) {
                    aVar2.C2(e.f244794a);
                }
                break;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = transactionCountriesScreen.e3();
                Intrinsics.h(query);
                com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar4 = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) gVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar4.H2(aVar4.f97762p, new w(query, 6));
                break;
        }
        return Unit.f186387a;
    }
}
