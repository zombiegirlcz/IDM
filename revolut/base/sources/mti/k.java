package mti;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f208858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bti.o f208859x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bti.o oVar, Continuation continuation) {
        super(2, continuation);
        this.f208858w = lVar;
        this.f208859x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f208858w, this.f208859x, continuation);
        kVar.v = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (mti.l.a(r1, r2, r3, r4, r6, r8) == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r2.emit(zsi.f.a.f324933a, r10) == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (r2.emit(zsi.f.c.f324935a, r10) == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
    
        if (r2.emit(zsi.f.b.f324934a, r10) == r9) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: Exception -> 0x001e, CancellationException -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0023, Exception -> 0x001e, blocks: (B:7:0x0018, B:13:0x0028, B:24:0x005d, B:29:0x006d), top: B:63:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: Exception -> 0x008e, CancellationException -> 0x0091, TRY_ENTER, TryCatch #6 {CancellationException -> 0x0091, Exception -> 0x008e, blocks: (B:22:0x0055, B:27:0x0069, B:32:0x0079, B:31:0x0071, B:26:0x0061, B:19:0x0043), top: B:61:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: Exception -> 0x001e, CancellationException -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0023, Exception -> 0x001e, blocks: (B:7:0x0018, B:13:0x0028, B:24:0x005d, B:29:0x006d), top: B:63:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: Exception -> 0x008e, CancellationException -> 0x0091, TRY_ENTER, TryCatch #6 {CancellationException -> 0x0091, Exception -> 0x008e, blocks: (B:22:0x0055, B:27:0x0069, B:32:0x0079, B:31:0x0071, B:26:0x0061, B:19:0x0043), top: B:61:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mti.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
