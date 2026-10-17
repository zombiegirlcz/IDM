package n30;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f211627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f211628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f211629y;
    public UUID z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Continuation continuation, p0 p0Var) {
        super(3, continuation);
        this.f211628x = p0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g0 g0Var = new g0((Continuation) obj4, this.f211628x);
        g0Var.v = (FlowCollector) obj2;
        g0Var.f211627w = obj3;
        return g0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r7 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r7)
            goto L71
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.util.UUID r1 = r6.z
            kotlinx.coroutines.flow.FlowCollector r3 = r6.f211629y
            yhm.o.b(r7)
            goto L52
        L21:
            yhm.o.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r6.v
            java.lang.Object r1 = r6.f211627w
            java.util.UUID r1 = (java.util.UUID) r1
            if (r1 == 0) goto L53
            r6.v = r4
            r6.f211627w = r4
            r6.f211629y = r7
            r6.z = r1
            r6.u = r3
            n30.c0 r3 = n30.p0.Companion
            n30.p0 r3 = r6.f211628x
            tf3.b r3 = r3.f211660j
            vkm.d r3 = r3.a()
            afa.e r5 = new afa.e
            r5.<init>()
            java.lang.Object r3 = vkm.q.A(r3, r5, r6)
            if (r3 != r0) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r3 = kotlin.Unit.f186387a
        L4e:
            if (r3 != r0) goto L51
            goto L70
        L51:
            r3 = r7
        L52:
            r7 = r3
        L53:
            r6.v = r4
            r6.f211627w = r4
            r6.f211629y = r4
            r6.z = r4
            r6.u = r2
            vkm.q.w(r7)
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L67
            goto L69
        L67:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L69:
            if (r7 != r0) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6e:
            if (r7 != r0) goto L71
        L70:
            return r0
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
