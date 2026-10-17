package m39;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ dsh.e A;
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f202300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f202301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f202302y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, dsh.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f202301x = fVar;
        this.f202302y = str;
        this.z = str2;
        this.A = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f202301x, this.f202302y, this.z, this.A, continuation);
        eVar.f202300w = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f202300w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            m39.f r3 = r7.f202301x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            yhm.o.b(r8)
            goto L5a
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlinx.coroutines.flow.FlowCollector r0 = r7.u
            yhm.o.b(r8)
            goto L37
        L25:
            yhm.o.b(r8)
            r7.f202300w = r6
            r7.u = r0
            r7.v = r5
            java.lang.String r8 = r7.f202302y
            java.lang.Object r8 = r3.c(r8, r7)
            if (r8 != r1) goto L37
            goto L59
        L37:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L48
            java.lang.String r8 = r7.z
            dsh.e r2 = r7.A
            vkm.y r8 = r3.j(r8, r2)
            goto L4d
        L48:
            r8 = 3
            vkm.v1 r8 = org.bouncycastle.jcajce.provider.digest.a.s(r8, r6)
        L4d:
            r7.f202300w = r6
            r7.u = r6
            r7.v = r4
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m39.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
