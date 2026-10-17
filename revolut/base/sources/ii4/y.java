package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ z B;
    public final /* synthetic */ long C;
    public final /* synthetic */ SpinnerConfiguration.Mode.Limited.TerminationCondition D;
    public final /* synthetic */ WaitingPopupScreenConfig E;
    public final /* synthetic */ ju3.g F;
    public q u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f161569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f161570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f161571y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, long j2, int i, z zVar, long j3, SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition, WaitingPopupScreenConfig waitingPopupScreenConfig, ju3.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f161571y = g0Var;
        this.z = j2;
        this.A = i;
        this.B = zVar;
        this.C = j3;
        this.D = terminationCondition;
        this.E = waitingPopupScreenConfig;
        this.F = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.f161571y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation);
        yVar.f161570x = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (skm.k0.b(r14, r26) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r2 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
    
        if (r5.send(r6, r26) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[PHI: r2 r4 r6
      0x00d0: PHI (r2v7 int) = (r2v8 int), (r2v18 int) binds: [B:29:0x00cc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r4v5 ii4.q) = (r4v6 ii4.q), (r4v15 ii4.q) binds: [B:29:0x00cc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r6v3 java.lang.Object) = (r6v12 java.lang.Object), (r6v24 java.lang.Object) binds: [B:29:0x00cc, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107 A[PHI: r2 r4
      0x0107: PHI (r2v3 int) = (r2v6 int), (r2v7 int) binds: [B:38:0x00f3, B:32:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r4v2 ii4.q) = (r4v4 ii4.q), (r4v5 ii4.q) binds: [B:38:0x00f3, B:32:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[PHI: r2 r4
      0x0130: PHI (r2v10 int) = (r2v7 int), (r2v9 int), (r2v16 int) binds: [B:34:0x00e1, B:18:0x0081, B:44:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r4v8 ii4.q) = (r4v5 ii4.q), (r4v7 ii4.q), (r4v13 ii4.q) binds: [B:34:0x00e1, B:18:0x0081, B:44:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011e -> B:42:0x0121). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii4.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
