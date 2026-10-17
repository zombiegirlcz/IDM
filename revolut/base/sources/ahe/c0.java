package ahe;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends gim.i implements Function2 {
    public Set u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f4978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f4979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w0 w0Var, Continuation continuation) {
        super(2, continuation);
        this.f4979x = w0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.f4979x, continuation);
        c0Var.f4978w = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r15.collect(r2, r14) == r1) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f4978w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r14.v
            r3 = 2
            ahe.w0 r4 = r14.f4979x
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L33
            if (r2 == r6) goto L2f
            if (r2 == r3) goto L27
            if (r2 != r5) goto L1f
            java.util.Set r0 = r14.u
            java.util.Set r0 = (java.util.Set) r0
            yhm.o.b(r15)
            goto Lbf
        L1f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L27:
            java.util.Set r2 = r14.u
            java.util.Set r2 = (java.util.Set) r2
            yhm.o.b(r15)
            goto L81
        L2f:
            yhm.o.b(r15)
            goto L62
        L33:
            yhm.o.b(r15)
            ahe.b1 r15 = r4.i
            r14.f4978w = r0
            r14.v = r6
            ahe.k1 r15 = (ahe.k1) r15
            ne0.j r2 = r15.f5009a
            java.lang.String r8 = "descriptors_cache_key"
            java.lang.Object r2 = r2.get(r8)
            boolean r8 = r2 instanceof java.util.Set
            if (r8 == 0) goto L4d
            java.util.Set r2 = (java.util.Set) r2
            goto L4e
        L4d:
            r2 = r7
        L4e:
            if (r2 != 0) goto L5e
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            ahe.j1 r8 = new ahe.j1
            r8.<init>(r15, r7)
            java.lang.Object r15 = skm.e0.J(r2, r8, r14)
            goto L5f
        L5e:
            r15 = r2
        L5f:
            if (r15 != r1) goto L62
            goto Lbe
        L62:
            r9 = r15
            java.util.Set r9 = (java.util.Set) r9
            if (r9 == 0) goto L82
            com.revolut.data.model.Data r8 = new com.revolut.data.model.Data
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.f4978w = r0
            r15 = r9
            java.util.Set r15 = (java.util.Set) r15
            r14.u = r15
            r14.v = r3
            java.lang.Object r15 = r0.emit(r8, r14)
            if (r15 != r1) goto L80
            goto Lbe
        L80:
            r2 = r9
        L81:
            r9 = r2
        L82:
            ahe.e r15 = r4.f5042c
            vkm.j2 r15 = r15.f4984a
            ahe.u r2 = new ahe.u
            r3 = 4
            r2.<init>(r4, r3)
            akg.n r15 = nim.a.v(r15, r2)
            kotlinx.coroutines.flow.Flow r15 = vkm.q.q(r15)
            com.revolut.data.model.Data r8 = new com.revolut.data.model.Data
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            ahe.z r2 = new ahe.z
            r2.<init>(r5, r7)
            t38.e r3 = new t38.e
            r9 = 23
            r3.<init>(r8, r9, r15, r2)
            vkm.e0 r15 = vkm.q.t(r3, r6)
            ahe.b0 r2 = new ahe.b0
            r2.<init>(r0, r4)
            r14.f4978w = r7
            r14.u = r7
            r14.v = r5
            java.lang.Object r15 = r15.collect(r2, r14)
            if (r15 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
