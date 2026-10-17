package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hk6.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import os2.g;
import qg6.f;
import uj6.j;
import uj6.l;
import uj6.q;
import uj6.s;
import uj6.u;
import wj6.m;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements q {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f72610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f72611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f72612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f72613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oj6.g f72614t;
    public final y u;

    public b(n stateMapper, l inputData, g brazilInboundOpenBankingInteractor, f brazilPixMandateResultInteractor, m updatedLimitRelay, k updatedExpiryDateRelay, oj6.g updatedInstitutionRelay) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(brazilInboundOpenBankingInteractor, "brazilInboundOpenBankingInteractor");
        Intrinsics.checkNotNullParameter(brazilPixMandateResultInteractor, "brazilPixMandateResultInteractor");
        Intrinsics.checkNotNullParameter(updatedLimitRelay, "updatedLimitRelay");
        Intrinsics.checkNotNullParameter(updatedExpiryDateRelay, "updatedExpiryDateRelay");
        Intrinsics.checkNotNullParameter(updatedInstitutionRelay, "updatedInstitutionRelay");
        this.o = inputData;
        this.f72610p = brazilInboundOpenBankingInteractor;
        this.f72611q = brazilPixMandateResultInteractor;
        this.f72612r = updatedLimitRelay;
        this.f72613s = updatedExpiryDateRelay;
        this.f72614t = updatedInstitutionRelay;
        this.u = d.b(this, new uj6.k(new Data(null, null, true, 3, null), new j(inputData.f280498a, inputData.f280499b, inputData.d), h0.f322473a, r0.g(), r0.g()), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b r11, uj6.j r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof uj6.t
            if (r0 == 0) goto L13
            r0 = r13
            uj6.t r0 = (uj6.t) r0
            int r1 = r0.f280515w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280515w = r1
            goto L18
        L13:
            uj6.t r0 = new uj6.t
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280515w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L27
            goto L5d
        L27:
            r0 = move-exception
            r12 = r0
            goto L62
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            os2.g r13 = r11.f72610p     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = r12.f280492a     // Catch: java.lang.Throwable -> L27
            java.lang.String r8 = r12.f280494c     // Catch: java.lang.Throwable -> L27
            uj6.l r12 = r11.o     // Catch: java.lang.Throwable -> L27
            we6.k r9 = r12.e     // Catch: java.lang.Throwable -> L27
            r0.f280515w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r12 = r13.f229224b     // Catch: java.lang.Throwable -> L27
            r6 = r12
            of6.e r6 = (of6.e) r6     // Catch: java.lang.Throwable -> L27
            r6.getClass()     // Catch: java.lang.Throwable -> L27
            of6.d r4 = new of6.d     // Catch: java.lang.Throwable -> L27
            r10 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L27
            skm.p0 r12 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L27
            elm.f r12 = elm.f.f127540b     // Catch: java.lang.Throwable -> L27
            java.lang.Object r13 = skm.e0.J(r12, r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r13 != r1) goto L5d
            return r1
        L5d:
            qg6.b r13 = (qg6.b) r13     // Catch: java.lang.Throwable -> L27
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L68
        L62:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r13 = yhm.o.a(r12)
        L68:
            cli.y r12 = r11.u
            sx4.b r0 = new sx4.b
            r1 = 5
            r0.<init>(r13, r1)
            r11.H2(r12, r0)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b.I2(com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b, uj6.j, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new s(this, continuation, 0), new yi5.b(26));
        yji.l.a1(this, this.f72612r.f297972b, null, null, new u(this, continuation, 2), 3);
        yji.l.a1(this, this.f72613s.f152860b, null, null, new u(this, continuation, 0), 3);
        yji.l.a1(this, this.f72614t.f225744b, null, null, new u(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
