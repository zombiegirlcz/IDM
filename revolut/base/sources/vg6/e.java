package vg6;

import aii.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function1 {
    public k u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f288761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f288762x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f288761w = kVar;
        this.f288762x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f288761w, this.f288762x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            k kVar2 = this.f288761w;
            zfe.e eVar = kVar2.f288772s;
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(this.f288762x, null), ProductId.LINKED);
            MainScreenTab mainScreenTab = ibb.c.f160140a;
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(R$string.external_institutions_linking_success_toast_title, null, null, 14), null));
            this.u = kVar2;
            this.v = 1;
            Object objB = ((cge.e) eVar).b(main, mainScreenTab, action, this);
            if (objB == aVar) {
                return aVar;
            }
            kVar = kVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.u;
            yhm.o.b(obj2);
        }
        return kVar.C1((u) obj2);
    }
}
