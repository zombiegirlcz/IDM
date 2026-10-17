package fg8;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends gim.i implements Function2 {
    public sri.m u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f134971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mp.p f134972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f134973y;
    public final /* synthetic */ NaviCommand z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z, mp.p pVar, String str, NaviCommand naviCommand, Continuation continuation) {
        super(2, continuation);
        this.f134971w = z;
        this.f134972x = pVar;
        this.f134973y = str;
        this.z = naviCommand;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.f134971w, this.f134972x, this.f134973y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        mp.p pVar = this.f134972x;
        sri.m mVar = (sri.m) pVar.f207709b;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = this.f134971w;
            NaviCommand naviCommand = this.z;
            if (!z) {
                if (naviCommand != null) {
                    mVar.c(naviCommand);
                }
                return Unit.f186387a;
            }
            q78.e eVar = (q78.e) pVar.d;
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(naviCommand);
            this.u = mVar;
            this.v = 1;
            obj2 = u68.b.b(eVar, this.f134973y, null, action, this, 10);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.u;
            yhm.o.b(obj2);
        }
        mVar.c((NaviCommand) obj2);
        return Unit.f186387a;
    }
}
