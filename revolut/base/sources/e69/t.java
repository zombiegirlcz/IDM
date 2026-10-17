package e69;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f122955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122956x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f122955w = uVar;
        this.f122956x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.f122955w, this.f122956x, continuation);
        tVar.v = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        mii.q qVar = (mii.q) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (qVar instanceof mii.p) {
                u.Companion.getClass();
                long jF = kotlin.time.b.f(u.f122957r);
                this.v = null;
                this.u = 1;
                if (k0.b(jF, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        ExternalDestination.Browser browser = new ExternalDestination.Browser(this.f122956x, null);
        u uVar = this.f122955w;
        uVar.C1(browser);
        uVar.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(null, null), (AccountCreationTransitionAnimation) null, 12));
        return Unit.f186387a;
    }
}
