package xr3;

import com.revolut.feature.credit.application.models.credit_health.CreditHealthContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ CreditHealthContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f308230w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CreditHealthContext creditHealthContext, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = creditHealthContext;
        this.f308230w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f308230w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r12 == r0) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr3.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
