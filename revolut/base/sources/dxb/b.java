package dxb;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f120929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f120930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f120931y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f120930x = cVar;
        this.f120931y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f120930x, this.f120931y, this.z, continuation);
        bVar.f120929w = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (vkm.q.u(r0, r9, r8) == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f120929w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            java.lang.String r3 = r8.f120931y
            dxb.c r4 = r8.f120930x
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L27
            if (r2 == r6) goto L21
            if (r2 != r5) goto L19
            yhm.o.b(r9)
            goto L59
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlinx.coroutines.flow.FlowCollector r0 = r8.u
            yhm.o.b(r9)
            goto L37
        L27:
            yhm.o.b(r9)
            r8.f120929w = r7
            r8.u = r0
            r8.v = r6
            java.lang.Object r9 = r4.c(r3, r8)
            if (r9 != r1) goto L37
            goto L58
        L37:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L47
            java.lang.String r9 = r8.z
            r2 = 0
            vkm.y r9 = r4.i(r9, r3, r2)
            goto L4c
        L47:
            r9 = 3
            vkm.v1 r9 = org.bouncycastle.jcajce.provider.digest.a.s(r9, r7)
        L4c:
            r8.f120929w = r7
            r8.u = r7
            r8.v = r5
            java.lang.Object r9 = vkm.q.u(r0, r9, r8)
            if (r9 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dxb.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
