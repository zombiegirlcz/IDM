package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 extends gim.i implements Function2 {
    public final /* synthetic */ int A;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q1 f114064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f114065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f114066y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, String str, String str2, String str3, int i, Continuation continuation) {
        super(2, continuation);
        this.f114064w = q1Var;
        this.f114065x = str;
        this.f114066y = str2;
        this.z = str3;
        this.A = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p1 p1Var = new p1(this.f114064w, this.f114065x, this.f114066y, this.z, this.A, continuation);
        p1Var.v = obj2;
        return p1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:41)|(1:(1:(1:(1:(3:9|37|38)(2:10|11))(2:15|30))(5:16|17|27|(1:29)(1:30)|36))(1:18))(3:19|(0)|36)|22|23|39|24|(1:26)(2:27|(0)(0))|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r9.emit(r0, r20) != r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        r1 = zhm.h0.f322473a;
        r2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimPhoneNumberPortingInteractorImpl", r15, r0, r1);
        r1 = new dfj.d2(r0);
        r20.v = r15;
        r20.u = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        if (r9.emit(r1, r20) != r10) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: Exception -> 0x00b5, PHI: r0 r15
      0x00a1: PHI (r0v17 java.lang.Object) = (r0v15 java.lang.Object), (r0v22 java.lang.Object) binds: [B:28:0x009e, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r15v6 java.lang.String) = (r15v4 java.lang.String), (r15v8 java.lang.String) binds: [B:28:0x009e, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x00b5, blocks: (B:30:0x00a1, B:27:0x0082, B:24:0x0077), top: B:39:0x0077 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
