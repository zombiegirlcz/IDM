package fol;

import akl.l;
import akl.q;
import akl.r;
import com.revolut.sso.impl.domain.models.ClaimToManage;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rqk.k;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            l lVar = dVar.f137011p;
            String str = ((k) dVar.f137012q).f256593p;
            ClaimToManage.WebAuthn webAuthn = dVar.o.f106612a;
            this.u = 1;
            r rVar = (r) lVar;
            rVar.getClass();
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, new q(rVar, webAuthn, str, null), this);
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
