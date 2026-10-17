package dwi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ svi.f0 A;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f120450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f120451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f120452y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, String str, int i, String str2, svi.f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.f120450w = rVar;
        this.f120451x = str;
        this.f120452y = i;
        this.z = str2;
        this.A = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.f120450w, this.f120451x, this.f120452y, this.z, this.A, continuation);
        qVar.v = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r1.emit(r0, r18) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r1.emit(r2, r18) == r8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: Exception -> 0x002e, PHI: r0
      0x0096: PHI (r0v16 java.lang.Object) = (r0v15 java.lang.Object), (r0v22 java.lang.Object) binds: [B:26:0x0093, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:15:0x0031, B:28:0x0096, B:30:0x009e, B:16:0x0037, B:25:0x007c, B:22:0x0052), top: B:41:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:15:0x0031, B:28:0x0096, B:30:0x009e, B:16:0x0037, B:25:0x007c, B:22:0x0052), top: B:41:0x0010 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dwi.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
