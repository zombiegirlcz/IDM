package vkm;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class t implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f290119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gim.i f290120b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Flow flow, Function3 function3) {
        this.f290119a = flow;
        this.f290120b = (gim.i) function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vkm.s
            if (r0 == 0) goto L13
            r0 = r10
            vkm.s r0 = (vkm.s) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vkm.s r0 = new vkm.s
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f290113x
            wkm.t r9 = (wkm.t) r9
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f290113x
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            yhm.o.b(r10)
            goto La0
        L44:
            kotlinx.coroutines.flow.FlowCollector r9 = r0.f290114y
            java.lang.Object r2 = r0.f290113x
            vkm.t r2 = (vkm.t) r2
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            yhm.o.b(r10)
            kotlinx.coroutines.flow.Flow r10 = r8.f290119a     // Catch: java.lang.Throwable -> L8a
            r0.f290113x = r8     // Catch: java.lang.Throwable -> L8a
            r0.f290114y = r9     // Catch: java.lang.Throwable -> L8a
            r0.v = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            wkm.t r10 = new wkm.t
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            gim.i r9 = r2.f290120b     // Catch: java.lang.Throwable -> L82
            r0.f290113x = r10     // Catch: java.lang.Throwable -> L82
            r0.f290114y = r6     // Catch: java.lang.Throwable -> L82
            r0.v = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            vkm.p2 r10 = new vkm.p2
            r10.<init>(r9)
            gim.i r2 = r2.f290120b
            r0.f290113x = r9
            r0.f290114y = r6
            r0.v = r4
            java.lang.Object r10 = vkm.q.e(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.t.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
