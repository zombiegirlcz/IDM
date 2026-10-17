package fwj;

import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pjl.a1;
import pjl.b1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f138684w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f138684w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f138684w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (this.v) {
                p pVar = this.f138684w;
                if (((jte.d) pVar.B).c(RevolutSsoApi$Toggles.SignUpEnabled.f105880c)) {
                    b1 b1Var = pVar.f138697s;
                    this.u = 1;
                    a1 a1Var = new a1(b1Var, null);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, a1Var, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
