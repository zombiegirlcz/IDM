package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ExternalDestination;
import hx7.e;
import jv.o;
import k37.g;
import k37.l;
import k37.w;
import k37.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import mra.d;
import oki.h;
import vkm.q;
import zjh.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements l {
    public final d3j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaxHubPaymentAssessmentScreenContract$InputData f74306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f74307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f74308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Regex f74309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f74310t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(d3j.b beneficiaryInteractor, TaxHubPaymentAssessmentScreenContract$InputData inputData, f taxAuthorityInteractor, ang.f userInteractor, x stateMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxAuthorityInteractor, "taxAuthorityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = beneficiaryInteractor;
        this.f74306p = inputData;
        this.f74307q = taxAuthorityInteractor;
        this.f74308r = userInteractor;
        this.f74309s = new Regex("[\\s-]");
        this.f74310t = new vii.b();
        this.u = d.b(this, new g(inputData.f74301a, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.v = e.a(this, new jnf.d(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b r7, java.util.ArrayList r8, gim.c r9) {
        /*
            cli.y r0 = r7.u
            boolean r1 = r9 instanceof k37.u
            if (r1 == 0) goto L15
            r1 = r9
            k37.u r1 = (k37.u) r1
            int r2 = r1.f180647w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f180647w = r2
            goto L1a
        L15:
            k37.u r1 = new k37.u
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f180647w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r9)
            goto L7d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L80
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            k37.g r9 = (k37.g) r9
            java.util.List r9 = r9.f180630c
            if (r9 != 0) goto L82
            d3j.b r9 = r7.o
            r3 = 0
            r5 = 5
            r6 = 0
            efm.r r9 = w2j.a.d(r9, r6, r3, r6, r5)
            vkm.d r9 = rd0.e.b(r9)
            k1.a r3 = new k1.a
            r5 = 9
            r3.<init>(r8, r7, r5)
            akg.n r8 = nim.a.v(r9, r3)
            k37.s r9 = new k37.s
            r3 = 0
            r9.<init>(r3)
            cxe.u r8 = nim.a.A(r8, r9)
            k1f.n r9 = new k1f.n
            r3 = 6
            r9.<init>(r3)
            jhi.b r8 = mo3.a.g(r8, r6, r9, r4)
            r1.f180647w = r4
            java.lang.Object r9 = vkm.q.x(r8, r1)
            if (r9 != r2) goto L7d
            return r2
        L7d:
            java.util.List r9 = (java.util.List) r9
            goto L82
        L80:
            zhm.f0 r9 = zhm.f0.f322471a
        L82:
            k37.t r8 = new k37.t
            r1 = 0
            r8.<init>(r9, r1)
            r7.H2(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b.I2(com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b, java.util.ArrayList, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f74310t, new jy6.l(continuation, this, 4)), null, null, new o(this, continuation, 16), 3);
    }

    public final void J2(Object obj2) {
        if (obj2 instanceof m37.e) {
            C1(new ExternalDestination.Browser(((m37.e) obj2).f202296a, null));
        } else if (obj2 instanceof w) {
            C1(new ExternalDestination.Browser(((w) obj2).f180648a, null));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
