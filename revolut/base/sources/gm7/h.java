package gm7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.mta.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r15 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r15 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        if (r15 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        if (r15 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b6, code lost:
    
        if (r15 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b8, code lost:
    
        return r3;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm7.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
