package zze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function1 {
    public xze.d u;
    public ute.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f326714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b f326715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f326716y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f326715x = bVar;
        this.f326716y = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f326715x, this.f326716y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (com.revolut.feature.topup_screen.impl.google_pay.flow.b.K2(r0, r3, r13, r12) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r0.M2(r3, r13, r12) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zze.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
