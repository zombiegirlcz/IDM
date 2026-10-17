package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a4 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k4 f113906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f113907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(long j2, k4 k4Var, String str, Continuation continuation) {
        super(2, continuation);
        this.v = j2;
        this.f113906w = k4Var;
        this.f113907x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a4(this.v, this.f113906w, this.f113907x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r11 == r0) goto L30;
     */
    /* JADX WARN: Path cross not found for [B:37:0x0078, B:35:0x0071], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[PHI: r11
      0x003e: PHI (r11v1 java.lang.Object) = (r11v6 java.lang.Object), (r11v0 java.lang.Object) binds: [B:17:0x003b, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004f -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005e -> B:31:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0078 -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007e -> B:40:0x0080). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            dfj.k4 r2 = r10.f113906w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            yhm.o.b(r11)
            goto L61
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            goto L3e
        L21:
            yhm.o.b(r11)
            goto L33
        L25:
            yhm.o.b(r11)
        L28:
            r10.u = r5
            long r6 = r10.v
            java.lang.Object r11 = skm.k0.c(r6, r10)
            if (r11 != r0) goto L33
            goto L60
        L33:
            r10.u = r4
            java.lang.String r11 = r10.f113907x
            java.lang.Object r11 = dfj.k4.a(r2, r11, r10)
            if (r11 != r0) goto L3e
            goto L60
        L3e:
            dej.t1 r11 = (dej.t1) r11
            dej.u2 r1 = r11.Q
            dej.j3 r6 = r11.f113651b
            r7 = 0
            if (r1 == 0) goto L4a
            dej.v2 r1 = r1.f113669a
            goto L4b
        L4a:
            r1 = r7
        L4b:
            dej.v2 r8 = dej.v2.REQUIRED
            if (r1 != r8) goto L52
            dej.w1$b r7 = dej.w1.b.f113678a
            goto L80
        L52:
            boolean r1 = gj7.b.u(r11)
            if (r1 == 0) goto L65
            r10.u = r3
            java.lang.Object r11 = dfj.k4.b(r2, r11, r10)
            if (r11 != r0) goto L61
        L60:
            return r0
        L61:
            r7 = r11
            dej.w1 r7 = (dej.w1) r7
            goto L80
        L65:
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            dej.j3 r8 = dej.j3.FAILED
            dej.w1$a r9 = dej.w1.a.f113677a
            if (r6 != r8) goto L71
            goto L78
        L71:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            dej.j3 r1 = dej.j3.INACTIVE
            if (r6 != r1) goto L7a
        L78:
            r7 = r9
            goto L80
        L7a:
            boolean r11 = gj7.b.C(r11)
            if (r11 == 0) goto L78
        L80:
            if (r7 == 0) goto L28
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
