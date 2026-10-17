package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f303844x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(LoginFragment loginFragment, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303843w = loginFragment;
        this.f303844x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f303843w, this.f303844x, continuation, 0);
            case 1:
                return new q(this.f303843w, this.f303844x, continuation, 1);
            default:
                return new q(this.f303843w, this.f303844x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                cmi.n nVar = (cmi.n) this.f303843w.L0.getValue();
                String str = this.f303844x;
                this.v = 1;
                Object objQ3 = ((cmi.m) nVar).q3(str, this);
                return objQ3 == aVar ? aVar : objQ3;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f303843w.f82676e0 = true;
                cmi.n nVar2 = (cmi.n) this.f303843w.L0.getValue();
                String str2 = this.f303844x;
                wli.a aVar3 = wli.a.CONTINUE;
                this.v = 1;
                Enum enumO3 = ((cmi.m) nVar2).o3(str2, aVar3, this);
                return enumO3 == aVar2 ? aVar2 : enumO3;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                cmi.n nVar3 = (cmi.n) this.f303843w.L0.getValue();
                String str3 = this.f303844x;
                wli.a aVar5 = wli.a.CANCEL;
                this.v = 1;
                Enum enumO32 = ((cmi.m) nVar3).o3(str3, aVar5, this);
                return enumO32 == aVar4 ? aVar4 : enumO32;
        }
    }
}
