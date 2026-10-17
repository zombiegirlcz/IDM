package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ dj0.d C;
    public final /* synthetic */ String D;
    public final /* synthetic */ xi0.b E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Long G;
    public Ref$ObjectRef u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w1 f114128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f114129y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, String str, String str2, String str3, boolean z, dj0.d dVar, String str4, xi0.b bVar, String str5, Long l2, Continuation continuation) {
        super(2, continuation);
        this.f114128x = w1Var;
        this.f114129y = str;
        this.z = str2;
        this.A = str3;
        this.B = z;
        this.C = dVar;
        this.D = str4;
        this.E = bVar;
        this.F = str5;
        this.G = l2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v1 v1Var = new v1(this.f114128x, this.f114129y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation);
        v1Var.f114127w = obj2;
        return v1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r2.emit(r4, r22) != r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        if (r2.emit(r5, r22) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        if (r2.emit(dfj.s1.d.f114103a, r22) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
    
        if (r2.emit(dfj.s1.c.f114102a, r22) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        if (r2.emit(r5, r22) == r3) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: Exception -> 0x0027, PHI: r0
      0x0094: PHI (r0v24 java.lang.Object) = (r0v23 java.lang.Object), (r0v31 java.lang.Object) binds: [B:22:0x0090, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0027, blocks: (B:8:0x0022, B:13:0x002d, B:14:0x0033, B:29:0x00af, B:15:0x0038, B:24:0x0094, B:26:0x009d, B:31:0x00b2, B:21:0x0053), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:8:0x0022, B:13:0x002d, B:14:0x0033, B:29:0x00af, B:15:0x0038, B:24:0x0094, B:26:0x009d, B:31:0x00b2, B:21:0x0053), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #1 {Exception -> 0x0027, blocks: (B:8:0x0022, B:13:0x002d, B:14:0x0033, B:29:0x00af, B:15:0x0038, B:24:0x0094, B:26:0x009d, B:31:0x00b2, B:21:0x0053), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:37:0x00d1, B:39:0x00d9, B:43:0x00df, B:47:0x00e5, B:33:0x00be), top: B:73:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
