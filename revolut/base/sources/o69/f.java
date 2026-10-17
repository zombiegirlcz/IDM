package o69;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f222527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f222528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f222529y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f222528x = gVar;
        this.f222529y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f222528x, this.f222529y, this.z, continuation);
        fVar.f222527w = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (vkm.q.u(r0, r2, r8) == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f222527w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            o69.g r3 = r8.f222528x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            yhm.o.b(r9)
            goto L62
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlinx.coroutines.flow.FlowCollector r0 = r8.u
            yhm.o.b(r9)
            goto L37
        L25:
            yhm.o.b(r9)
            r8.f222527w = r6
            r8.u = r0
            r8.v = r5
            java.lang.String r9 = r8.f222529y
            java.lang.Object r9 = r3.c(r9, r8)
            if (r9 != r1) goto L37
            goto L61
        L37:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L50
            kotlin.Lazy r9 = r3.f222533h
            java.lang.Object r9 = r9.getValue()
            kotlinx.coroutines.flow.StateFlow r9 = (kotlinx.coroutines.flow.StateFlow) r9
            mle.x r2 = new mle.x
            r5 = 4
            java.lang.String r7 = r8.z
            r2.<init>(r9, r3, r7, r5)
            goto L55
        L50:
            r9 = 3
            vkm.v1 r2 = org.bouncycastle.jcajce.provider.digest.a.s(r9, r6)
        L55:
            r8.f222527w = r6
            r8.u = r6
            r8.v = r4
            java.lang.Object r9 = vkm.q.u(r0, r2, r8)
            if (r9 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o69.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
