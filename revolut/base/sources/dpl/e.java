package dpl;

import akl.e1;
import akl.o0;
import akl.x0;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar = this.v;
            o0 o0Var = aVar.f106719p;
            String str = aVar.o.f106716a.f105928a;
            this.u = 1;
            e1 e1Var = (e1) o0Var;
            e1Var.getClass();
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, new x0(e1Var, str, null), this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
