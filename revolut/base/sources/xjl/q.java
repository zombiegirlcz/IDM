package xjl;

import akl.m0;
import akl.n0;
import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f306580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f306580w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f306580w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n0 n0Var = this.v.f306581a;
            cjl.n nVar = cjl.n.QrPersonal;
            this.u = 1;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, new m0(null, n0Var, nVar, this.f306580w, null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        gkl.g gVar = (gkl.g) obj2;
        if (!(gVar instanceof gkl.e)) {
            if (gVar instanceof gkl.f) {
                return trh.b.f273796a;
            }
            if (gVar instanceof gkl.d) {
                throw ((gkl.d) gVar).f144439a;
            }
            throw new NoWhenBranchMatchedException();
        }
        ConsentChallenge.Qr qr10 = ((gkl.e) gVar).f144442a;
        long f105925b = qr10.getF105925b();
        String str = qr10.getE().f105901b;
        if (str == null) {
            str = "";
        }
        return new trh.a(f105925b, str, qr10.getE().f105900a, qr10.getE().f105902c.f105904b);
    }
}
