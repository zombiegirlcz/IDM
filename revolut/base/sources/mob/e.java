package mob;

import aii.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
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
import she.g;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public com.revolut.feature.retail.savings.impl.ui.add_money.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.add_money.b f207603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f207604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TextLocalisedClause f207605y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.retail.savings.impl.ui.add_money.b bVar, String str, TextLocalisedClause textLocalisedClause, Continuation continuation) {
        super(2, continuation);
        this.f207603w = bVar;
        this.f207604x = str;
        this.f207605y = textLocalisedClause;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f207603w, this.f207604x, this.f207605y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.retail.savings.impl.ui.add_money.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.retail.savings.impl.ui.add_money.b bVar2 = this.f207603w;
            g gVar = bVar2.f83358s;
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(this.f207604x, null), ProductId.SAVINGS);
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(this.f207605y, null));
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
