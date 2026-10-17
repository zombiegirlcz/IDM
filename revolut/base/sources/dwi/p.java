package dwi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ long A;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f120447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f120448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f120449y;
    public final /* synthetic */ FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Ref$BooleanRef ref$BooleanRef, r rVar, String str, FlowCollector flowCollector, long j2, Continuation continuation) {
        super(2, continuation);
        this.f120447w = ref$BooleanRef;
        this.f120448x = rVar;
        this.f120449y = str;
        this.z = flowCollector;
        this.A = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f120447w, this.f120448x, this.f120449y, this.z, this.A, continuation);
        pVar.v = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Path cross not found for [B:25:0x006d, B:22:0x005e], limit reached: 35 */
    /* JADX WARN: Path cross not found for [B:30:0x0087, B:27:0x0075], limit reached: 35 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006a -> B:13:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0099 -> B:13:0x0028). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.v
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.u
            r3 = 4
            r4 = 3
            r5 = 2
            kotlin.jvm.internal.Ref$BooleanRef r6 = r10.f120447w
            r7 = 1
            if (r2 == 0) goto L25
            if (r2 == r7) goto L21
            if (r2 == r5) goto L25
            if (r2 == r4) goto L25
            if (r2 != r3) goto L19
            goto L25
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            yhm.o.b(r11)
            goto L52
        L25:
            yhm.o.b(r11)
        L28:
            boolean r11 = skm.e0.y(r0)
            if (r11 == 0) goto La2
            boolean r11 = r6.f186407a
            if (r11 != 0) goto La2
            dwi.r r11 = r10.f120448x
            hwi.n r11 = r11.f120454a
            r10.v = r0
            r10.u = r7
            hwi.v r11 = (hwi.v) r11
            r11.getClass()
            hwi.t r2 = new hwi.t
            java.lang.String r8 = r10.f120449y
            r9 = 0
            r2.<init>(r11, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r2, r10)
            if (r11 != r1) goto L52
            goto L9b
        L52:
            hwi.m r11 = (hwi.m) r11
            hwi.m$c r2 = hwi.m.c.f156235a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            kotlinx.coroutines.flow.FlowCollector r8 = r10.z
            if (r2 == 0) goto L6d
            r6.f186407a = r7
            r10.v = r0
            r10.u = r5
            qvi.b$b r11 = qvi.b.C1368b.f249709a
            java.lang.Object r11 = r8.emit(r11, r10)
            if (r11 != r1) goto L28
            goto L9b
        L6d:
            hwi.m$a r2 = hwi.m.a.f156233a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            if (r2 == 0) goto L87
            r6.f186407a = r7
            qvi.a r11 = new qvi.a
            r11.<init>()
            r10.v = r0
            r10.u = r4
            java.lang.Object r11 = r8.emit(r11, r10)
            if (r11 != r1) goto L28
            goto L9b
        L87:
            hwi.m$b r2 = hwi.m.b.f156234a
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            if (r11 == 0) goto L9c
            r10.v = r0
            r10.u = r3
            long r8 = r10.A
            java.lang.Object r11 = skm.k0.c(r8, r10)
            if (r11 != r1) goto L28
        L9b:
            return r1
        L9c:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        La2:
            boolean r11 = r6.f186407a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dwi.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
