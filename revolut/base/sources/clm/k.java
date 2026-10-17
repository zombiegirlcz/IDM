package clm;

import eg.m1;
import java.time.Duration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tfm.z0;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f25079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f25080y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25078w = obj2;
        this.f25079x = obj3;
        this.f25080y = obj4;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((Flow) this.f25079x, (z0) this.f25080y, continuation, 0);
                kVar.f25078w = obj2;
                return kVar;
            case 1:
                return new k((eg.q) this.f25078w, (CoroutineContext) this.f25079x, (m1) this.f25080y, continuation, 1);
            case 2:
                k kVar2 = new k((mk0.o) this.f25079x, (tk0.g) this.f25080y, continuation, 2);
                kVar2.f25078w = obj2;
                return kVar2;
            case 3:
                k kVar3 = new k((Duration) this.f25079x, (Duration) this.f25080y, continuation, 3);
                kVar3.f25078w = obj2;
                return kVar3;
            case 4:
                k kVar4 = new k((FlowCollector) this.f25079x, (wkm.d) this.f25080y, continuation, 4);
                kVar4.f25078w = obj2;
                return kVar4;
            case 5:
                return new k((Function3) this.f25079x, (x4l.c) this.f25080y, this.f25078w, continuation);
            default:
                return new k(this.f25078w, this.f25079x, this.f25080y, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018f A[PHI: r12
      0x018f: PHI (r12v26 java.lang.Boolean) = (r12v17 java.lang.Boolean), (r12v19 java.lang.Boolean) binds: [B:98:0x018d, B:101:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e1 -> B:52:0x00bb). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: clm.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25079x = obj2;
        this.f25080y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Function3 function3, x4l.c cVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.f25079x = (gim.i) function3;
        this.f25080y = cVar;
        this.f25078w = obj2;
    }
}
