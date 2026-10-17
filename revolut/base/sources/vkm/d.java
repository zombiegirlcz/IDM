package vkm;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends f {
    public final gim.i f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Function2 function2, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(function2, coroutineContext, i, fVar);
        this.f = (gim.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vkm.f, wkm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlinx.coroutines.channels.ProducerScope r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vkm.c
            if (r0 == 0) goto L13
            r0 = r6
            vkm.c r0 = (vkm.c) r0
            int r1 = r0.f290001x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290001x = r1
            goto L1a
        L13:
            vkm.c r0 = new vkm.c
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290001x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.channels.ProducerScope r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r0.u = r5
            r0.f290001x = r3
            java.lang.Object r6 = super.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4a
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.d.b(kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // vkm.f, wkm.d
    public final wkm.d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new d(this.f, coroutineContext, i, fVar);
    }
}
