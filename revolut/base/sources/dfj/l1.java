package dfj;

import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class l1 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 0;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f114028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f114029y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(q1 q1Var, Instant instant, Continuation continuation) {
        super(2, continuation);
        this.z = q1Var;
        this.A = instant;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l1 l1Var = new l1((q1) this.z, (Instant) this.A, continuation);
                l1Var.f114029y = obj2;
                return l1Var;
            default:
                return new l1((kq.h) this.A, this.f114028x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l1) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fb -> B:47:0x00fe). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(kq.h hVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.A = hVar;
        this.f114028x = j2;
    }
}
