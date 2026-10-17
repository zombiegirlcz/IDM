package hml;

import akl.m0;
import akl.n0;
import cjl.n;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.sso.impl.ui.consent.qr.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.sso.impl.ui.consent.qr.b bVar = this.v;
        n0 n0Var = bVar.f106480t;
        QrConsentFlowContract$InputData qrConsentFlowContract$InputData = bVar.f106477q;
        n nVar = qrConsentFlowContract$InputData.f106466a;
        String str = qrConsentFlowContract$InputData.f106467b;
        this.u = 1;
        n0Var.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new m0(null, n0Var, nVar, str, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
