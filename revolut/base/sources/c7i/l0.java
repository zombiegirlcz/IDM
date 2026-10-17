package c7i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.i implements Function1 {
    public o u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c f22013x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature_move_money.impl.automation.screen.c cVar, Continuation continuation) {
        super(1, continuation);
        this.f22013x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l0(this.f22013x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e3, code lost:
    
        if (com.revolut.feature_move_money.impl.automation.screen.c.I2(r2, r4, r27) == r9) goto L44;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7i.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
