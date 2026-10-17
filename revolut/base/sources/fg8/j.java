package fg8;

import com.revolut.feature.junior.accounts.models.JuniorAccountPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f134938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f134939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f134938w = mVar;
        this.f134939x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.f134938w, this.f134939x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            m mVar2 = this.f134938w;
            q78.e eVar = mVar2.A;
            String str = this.f134939x;
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new JuniorAccountPayload.AccountClose(str));
            this.u = mVar2;
            this.v = 1;
            Object objB = u68.b.b(eVar, str, null, action, this, 10);
            if (objB == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.u;
            yhm.o.b(obj2);
        }
        mVar.g((NaviCommand) obj2);
        return Unit.f186387a;
    }
}
