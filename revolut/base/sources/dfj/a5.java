package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class a5 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ dej.e3 B;
    public final /* synthetic */ String C;
    public Ref$ObjectRef u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f113909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b5 f113910y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(b5 b5Var, String str, String str2, dej.e3 e3Var, String str3, Continuation continuation) {
        super(2, continuation);
        this.f113910y = b5Var;
        this.z = str;
        this.A = str2;
        this.B = e3Var;
        this.C = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a5 a5Var = new a5(this.f113910y, this.z, this.A, this.B, this.C, continuation);
        a5Var.f113909x = obj2;
        return a5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a5) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        if (r7.emit(r2, r14) == r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
    
        if (r7.emit(r9, r14) == r8) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:7:0x0021, B:13:0x0031, B:14:0x0039, B:20:0x0056, B:22:0x0060, B:23:0x0062), top: B:64:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[Catch: Exception -> 0x00c1, TryCatch #2 {Exception -> 0x00c1, blocks: (B:33:0x009d, B:39:0x00b1, B:44:0x00c3, B:47:0x00d5, B:36:0x00a5, B:29:0x0088), top: B:65:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: Exception -> 0x00c1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c1, blocks: (B:33:0x009d, B:39:0x00b1, B:44:0x00c3, B:47:0x00d5, B:36:0x00a5, B:29:0x0088), top: B:65:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072 A[EXC_TOP_SPLITTER, PHI: r0 r14
      0x0072: PHI (r0v14 java.lang.Object) = (r0v13 java.lang.Object), (r0v23 java.lang.Object) binds: [B:25:0x006e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r14v5 dfj.a5) = (r14v4 dfj.a5), (r14v6 dfj.a5) binds: [B:25:0x006e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.a5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
