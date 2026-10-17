package ny4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import nxa.v;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f220663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f220664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DirectDebitAccountConfirmationScreenContract$InputData f220665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f220666s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ang.f userInteractor, x deeplinkHandler, DirectDebitAccountConfirmationScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f220663p = userInteractor;
        this.f220664q = deeplinkHandler;
        this.f220665r = inputData;
        this.f220666s = new d(new Data(null, null, false, 7, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(ny4.k r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ny4.j
            if (r0 == 0) goto L13
            r0 = r6
            ny4.j r0 = (ny4.j) r0
            int r1 = r0.f220662w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220662w = r1
            goto L18
        L13:
            ny4.j r0 = new ny4.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220662w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ang.f r6 = r5.f220663p
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            ny4.i r2 = new ny4.i
            r4 = 1
            r2.<init>(r5, r4)
            nx7.i r5 = new nx7.i
            r4 = 11
            r5.<init>(r2, r4)
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r6, r5, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.f220662w = r3
            java.lang.Object r6 = nim.a.b(r2, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ny4.k.y2(ny4.k, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new v(3));
        n2(new nt4.f(this, null, 7), new i(this, 0));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f220666s;
    }
}
