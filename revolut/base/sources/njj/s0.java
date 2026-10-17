package njj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s0 s0Var = new s0(this.v, continuation);
        s0Var.u = obj2;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
