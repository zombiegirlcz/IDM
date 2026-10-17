package sde;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import elm.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n3j.w;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nde.d f261869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f261870b;

    public e(nde.d repository, b inboundTransactionListInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inboundTransactionListInteractor, "inboundTransactionListInteractor");
        this.f261869a = repository;
        this.f261870b = inboundTransactionListInteractor;
    }

    public final Object a(TransferArrivalRequest transferArrivalRequest, gim.c cVar) {
        nde.d dVar = this.f261869a;
        dVar.getClass();
        w wVar = new w(dVar, transferArrivalRequest, (Continuation) null, 20);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, wVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sde.d
            if (r0 == 0) goto L13
            r0 = r6
            sde.d r0 = (sde.d) r0
            int r1 = r0.f261868w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261868w = r1
            goto L18
        L13:
            sde.d r0 = new sde.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261868w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f261868w = r3
            nde.d r6 = r4.f261869a
            java.lang.Enum r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            kq2.l r6 = (kq2.l) r6
            r5 = -1
            if (r6 != 0) goto L44
            r0 = r5
            goto L4c
        L44:
            int[] r0 = sde.c.f261867a
            int r1 = r6.ordinal()
            r0 = r0[r1]
        L4c:
            if (r0 == r5) goto L6c
            if (r0 == r3) goto L69
            r5 = 2
            if (r0 == r5) goto L63
            r5 = 3
            if (r0 == r5) goto L63
            r5 = 4
            if (r0 == r5) goto L63
            r5 = 5
            if (r0 != r5) goto L5d
            goto L63
        L5d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L63:
            tde.n r5 = new tde.n
            r5.<init>(r6)
            return r5
        L69:
            tde.m r5 = tde.m.f269992a
            return r5
        L6c:
            tde.o r5 = tde.o.f269994a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sde.e.b(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.lang.Object");
    }
}
