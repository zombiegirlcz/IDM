package xjl;

import a31.w;
import com.revolut.sso.impl.domain.models.AuthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import okl.n1;
import skm.e0;
import skm.p0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f306570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cjl.g f306571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, cjl.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f306570w = mVar;
        this.f306571x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f306570w, this.f306571x, continuation);
        lVar.v = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        n1 n1Var = this.f306570w.f306572a;
        cjl.s sVar = cjl.s.GLOBAL;
        f0 f0Var = f0.f322471a;
        AuthAction.OperationBoundAuthentication operationBoundAuthentication = new AuthAction.OperationBoundAuthentication(sVar, str, f0Var, null, f0Var, null, null, 15360);
        jkl.i iVar = jkl.i.APP_LINK;
        this.v = null;
        this.u = 1;
        akl.h hVar = (akl.h) n1Var.f226220a;
        hVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new w(4, hVar, operationBoundAuthentication, iVar, this.f306571x, (Continuation) null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
