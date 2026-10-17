package mll;

import com.revolut.sso.impl.domain.models.AuthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AuthAction.SignIn f207069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ jkl.i f207070y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, AuthAction.SignIn signIn, jkl.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f207068w = cVar;
        this.f207069x = signIn;
        this.f207070y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.f207068w, this.f207069x, this.f207070y, continuation);
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
        akl.d dVar = this.f207068w.B;
        AuthAction.SignIn signInB = AuthAction.SignIn.b(this.f207069x, str);
        this.v = null;
        this.u = 1;
        akl.h hVar = (akl.h) dVar;
        hVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new a31.w(4, hVar, signInB, this.f207070y, (Object) null, (Continuation) null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
