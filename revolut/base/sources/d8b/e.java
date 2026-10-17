package d8b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f112191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f112192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f112193y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f112192x = fVar;
        this.f112193y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f112192x, this.f112193y, this.z, continuation);
        eVar.f112191w = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
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
            java.lang.Object r0 = r7.f112191w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            d8b.f r3 = r7.f112192x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            yhm.o.b(r8)
            goto L5c
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlinx.coroutines.flow.FlowCollector r0 = r7.u
            yhm.o.b(r8)
            goto L39
        L25:
            yhm.o.b(r8)
            r7.f112191w = r6
            r7.u = r0
            r7.v = r5
            q5b.c r8 = r3.f112195c
            c6b.p r8 = (c6b.p) r8
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r1) goto L39
            goto L5b
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L4a
            java.lang.String r8 = r7.z
            java.lang.String r2 = r7.f112193y
            vkm.y r8 = r3.j(r8, r2)
            goto L4f
        L4a:
            r8 = 3
            vkm.v1 r8 = org.bouncycastle.jcajce.provider.digest.a.s(r8, r6)
        L4f:
            r7.f112191w = r6
            r7.u = r6
            r7.v = r4
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d8b.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
