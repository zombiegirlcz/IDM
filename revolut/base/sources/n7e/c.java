package n7e;

import aii.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public com.revolut.feature.subaccount.impl.ui.add_money.flow.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.add_money.flow.b f213072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Subaccount f213073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TextLocalisedClause f213074y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.subaccount.impl.ui.add_money.flow.b bVar, Subaccount subaccount, TextLocalisedClause textLocalisedClause, Continuation continuation) {
        super(2, continuation);
        this.f213072w = bVar;
        this.f213073x = subaccount;
        this.f213074y = textLocalisedClause;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f213072w, this.f213073x, this.f213074y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.subaccount.impl.ui.add_money.flow.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.subaccount.impl.ui.add_money.flow.b bVar2 = this.f213072w;
            she.g gVar = bVar2.f88996r;
            ProductId productId = ProductId.SUBACCOUNT;
            Subaccount subaccount = this.f213073x;
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(subaccount.getF88959a().f234881a, com.revolut.feature.subaccount.api.models.a.b(subaccount.c())), productId);
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(this.f213074y, null));
            this.u = bVar2;
            this.v = 1;
            Object objC = gVar.c(main, action, this);
            if (objC == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            o.b(obj2);
        }
        return bVar.C1((u) obj2);
    }
}
