package jc7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f172739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f172740x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f172739w = cVar;
        this.f172740x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f172739w, this.f172740x, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (vkm.q.u(r0, r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (vkm.q.u(r0, r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            goto L59
        L1d:
            yhm.o.b(r7)
            jc7.c r7 = r6.f172739w
            boolean r2 = r7.j()
            r5 = 0
            if (r2 == 0) goto L49
            of1.b r7 = r7.f172741b
            tf1.c0 r7 = (tf1.c0) r7
            java.lang.String r2 = "listId"
            java.lang.String r3 = r6.f172740x
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            tf1.z r2 = new tf1.z
            r2.<init>(r7, r3, r5)
            vkm.v1 r7 = new vkm.v1
            r7.<init>(r2)
            r6.v = r5
            r6.u = r4
            java.lang.Object r7 = vkm.q.u(r0, r7, r6)
            if (r7 != r1) goto L59
            goto L58
        L49:
            r7 = 3
            vkm.v1 r7 = org.bouncycastle.jcajce.provider.digest.a.s(r7, r5)
            r6.v = r5
            r6.u = r3
            java.lang.Object r7 = vkm.q.u(r0, r7, r6)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jc7.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
