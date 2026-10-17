package osa;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import ufm.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f229296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f229297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f229298y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229298y = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f229298y, continuation, 0);
                eVar.f229297x = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f229298y, continuation, 1);
                eVar2.f229297x = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a5 -> B:31:0x0078). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f229297x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f229296w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L28
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1a
            yhm.o.b(r9)
            goto L4c
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            kotlinx.coroutines.flow.FlowCollector r0 = r8.v
            yhm.o.b(r9)
            goto L3a
        L28:
            yhm.o.b(r9)
            r8.f229297x = r5
            r8.v = r0
            r8.f229296w = r4
            ufm.n r9 = r8.f229298y
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r1) goto L3a
            goto L4e
        L3a:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r8.f229297x = r5
            r8.v = r5
            r8.f229296w = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4e:
            return r1
        L4f:
            java.lang.Object r0 = r8.f229297x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f229296w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L75
            if (r2 == r5) goto L6f
            if (r2 == r4) goto L6b
            if (r2 != r3) goto L63
            goto L75
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L6b:
            yhm.o.b(r9)
            goto L9b
        L6f:
            kotlinx.coroutines.flow.FlowCollector r2 = r8.v
            yhm.o.b(r9)
            goto L88
        L75:
            yhm.o.b(r9)
        L78:
            r8.f229297x = r0
            r8.v = r0
            r8.f229296w = r5
            ufm.n r9 = r8.f229298y
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r1) goto L87
            goto La7
        L87:
            r2 = r0
        L88:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            r8.f229297x = r0
            r6 = 0
            r8.v = r6
            r8.f229296w = r4
            java.lang.Object r9 = r2.emit(r9, r8)
            if (r9 != r1) goto L9b
            goto La7
        L9b:
            r8.f229297x = r0
            r8.f229296w = r3
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = skm.k0.b(r6, r8)
            if (r9 != r1) goto L78
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: osa.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
