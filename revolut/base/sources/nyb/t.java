package nyb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.v0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f220835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v0 f220836x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.f220835w = vVar;
        this.f220836x = v0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.f220835w, this.f220836x, continuation);
        tVar.v = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            yhm.o.b(r8)
            goto L62
        L1d:
            yhm.o.b(r8)
            nyb.v r8 = r7.f220835w
            eub.a r2 = r8.f220839c
            nyb.b r2 = (nyb.b) r2
            boolean r2 = r2.f()
            r5 = 0
            r6 = 0
            if (r2 != 0) goto L40
            m1c.u0$a r8 = m1c.u0.a.f201459a
            r2 = 3
            com.revolut.data.model.Data r8 = zi0.c.P(r8, r5, r6, r2)
            r7.v = r6
            r7.u = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L62
            goto L61
        L40:
            eub.i r2 = r8.f220837a
            nyb.o r2 = (nyb.o) r2
            efm.r r2 = r2.f(r5)
            vkm.d r2 = rd0.e.b(r2)
            nyb.s r4 = new nyb.s
            m1c.v0 r5 = r7.f220836x
            r4.<init>(r8, r5, r6)
            kotlinx.coroutines.flow.Flow r8 = xam.a.h(r4, r2)
            r7.v = r6
            r7.u = r3
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nyb.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
