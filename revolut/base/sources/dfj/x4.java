package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class x4 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ dej.p0 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public Ref$ObjectRef u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f114157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b5 f114158y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(b5 b5Var, String str, String str2, dej.p0 p0Var, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.f114158y = b5Var;
        this.z = str;
        this.A = str2;
        this.B = p0Var;
        this.C = str3;
        this.D = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x4 x4Var = new x4(this.f114158y, this.z, this.A, this.B, this.C, this.D, continuation);
        x4Var.f114157x = obj2;
        return x4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x4) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (r7.emit(r2, r14) == r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (r7.emit(r9, r14) == r8) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:30:0x009a, B:36:0x00ae, B:41:0x00c0, B:44:0x00d2, B:33:0x00a2, B:26:0x0085), top: B:59:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:30:0x009a, B:36:0x00ae, B:41:0x00c0, B:44:0x00d2, B:33:0x00a2, B:26:0x0085), top: B:59:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006f A[EXC_TOP_SPLITTER, PHI: r0 r14
      0x006f: PHI (r0v14 java.lang.Object) = (r0v13 java.lang.Object), (r0v23 java.lang.Object) binds: [B:22:0x006b, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r14v5 dfj.x4) = (r14v4 dfj.x4), (r14v6 dfj.x4) binds: [B:22:0x006b, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.x4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
