package pb3;

import d4f.s;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pb2.v;
import pfm.z;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f234628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f234629c;

    public b(s cashTopUpAvailabilityInteractor, m navigator, int i) {
        this.f234627a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(cashTopUpAvailabilityInteractor, "cashTopUpAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f234628b = cashTopUpAvailabilityInteractor;
                this.f234629c = navigator;
                break;
            default:
                Intrinsics.checkNotNullParameter(cashTopUpAvailabilityInteractor, "cashTopUpAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.f234628b = cashTopUpAvailabilityInteractor;
                this.f234629c = navigator;
                break;
        }
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        switch (this.f234627a) {
            case 0:
                return y.D(deeplink, "deeplink", 1, "cash-deposit-eu");
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "cash-deposit/report-issue");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(jf0.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pb3.c
            if (r0 == 0) goto L13
            r0 = r7
            pb3.c r0 = (pb3.c) r0
            int r1 = r0.f234631x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234631x = r1
            goto L18
        L13:
            pb3.c r0 = new pb3.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234631x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            r7 = 3
            java.lang.String r6 = r6.e(r7)
            boolean r7 = kotlin.text.d0.W(r6)
            if (r7 != 0) goto L41
            goto L42
        L41:
            r6 = r4
        L42:
            d4f.s r7 = r5.f234628b
            xoj.a r7 = r7.f111304a
            yoj.c r2 = yoj.c.EU_CASH_DEPOSIT
            cpj.b r7 = (cpj.b) r7
            efm.r r7 = r7.l(r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            efm.d0 r7 = r7.first(r2)
            java.lang.String r2 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f234631x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6d
            return r4
        L6d:
            com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination r7 = new com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pb3.b.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f234627a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof pb3.d
            if (r0 == 0) goto L18
            r0 = r6
            pb3.d r0 = (pb3.d) r0
            int r1 = r0.f234632w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f234632w = r1
            goto L1f
        L18:
            pb3.d r0 = new pb3.d
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1f:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234632w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r6)
            goto L42
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r6)
            r0.f234632w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L42
            goto L4d
        L42:
            com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination r6 = (com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination) r6
            r1 = 0
            if (r6 == 0) goto L4d
            q06.h r5 = new q06.h
            r5.<init>(r6, r1)
            r1 = r5
        L4d:
            return r1
        L4e:
            boolean r5 = r6 instanceof pb3.a
            if (r5 == 0) goto L61
            r5 = r6
            pb3.a r5 = (pb3.a) r5
            int r0 = r5.f234626w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L61
            int r0 = r0 - r1
            r5.f234626w = r0
            goto L68
        L61:
            pb3.a r5 = new pb3.a
            gim.c r6 = (gim.c) r6
            r5.<init>(r4, r6)
        L68:
            java.lang.Object r6 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f234626w
            r2 = 1
            if (r1 == 0) goto L7f
            if (r1 != r2) goto L77
            yhm.o.b(r6)
            goto La2
        L77:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7f:
            yhm.o.b(r6)
            d4f.s r6 = r4.f234628b
            xoj.a r6 = r6.f111304a
            yoj.c r1 = yoj.c.EU_CASH_DEPOSIT
            cpj.b r6 = (cpj.b) r6
            efm.r r6 = r6.l(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            efm.d0 r6 = r6.first(r1)
            java.lang.String r1 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r5.f234626w = r2
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto La2
            goto Lba
        La2:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r0 = 0
            if (r5 != 0) goto Lac
            goto Lba
        Lac:
            q06.h r5 = new q06.h
            com.revolut.feature.cash_topup.api.declaration.CashTopUpFlowDestination r6 = new com.revolut.feature.cash_topup.api.declaration.CashTopUpFlowDestination
            cb3.a r1 = cb3.a.EU_FLOW
            r2 = 0
            r6.<init>(r1, r2)
            r5.<init>(r6, r0)
            r0 = r5
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb3.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        switch (this.f234627a) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                d0 d0VarFirst = ((cpj.b) this.f234628b.f111304a).l(yoj.c.EU_CASH_DEPOSIT).first(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
                p8k.b bVar = new p8k.b(15, new v(this, 2));
                d0VarFirst.getClass();
                z zVarD = new pfm.a(d0VarFirst, bVar, 4).D(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                return zVarD;
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return w.o0(p0.f264003c, new osk.m(this, deeplink, null, 27));
        }
    }
}
