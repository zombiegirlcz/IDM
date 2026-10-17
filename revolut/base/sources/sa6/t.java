package sa6;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t implements aa6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya6.q f261345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f261346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xvh.c f261347c;
    public final pre.c d;
    public final j0 e;
    public final ihm.f f;

    public t(ya6.q charityRepository, xua.a recurringPaymentInteractor, xvh.c autoInvestInteractor, pre.c termsInteractor, j0 processDonationInteractor) {
        Intrinsics.checkNotNullParameter(charityRepository, "charityRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(processDonationInteractor, "processDonationInteractor");
        this.f261345a = charityRepository;
        this.f261346b = recurringPaymentInteractor;
        this.f261347c = autoInvestInteractor;
        this.d = termsInteractor;
        this.e = processDonationInteractor;
        this.f = v0.a.d("create(...)");
    }

    public final efm.r b(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = ((ya6.z) this.f261345a).a(id10, z).map(new a(new s8h.h(26), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final vkm.d c(DonationQuoteRequest quoteRequest) {
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        ya6.p pVar = ya6.q.Companion;
        ya6.z zVar = (ya6.z) this.f261345a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        return qe0.o.a(zVar.f311994m, quoteRequest, 3L, null, false, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, ba6.b0 r9, boolean r10, ba6.u r11, gim.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof sa6.s
            if (r0 == 0) goto L14
            r0 = r12
            sa6.s r0 = (sa6.s) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.A = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sa6.s r0 = new sa6.s
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f261344y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.A
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L43
            if (r1 == r2) goto L34
            if (r1 != r3) goto L2c
            yhm.o.b(r12)
            return r12
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r10 = r6.f261343x
            ba6.u r11 = r6.f261342w
            ba6.b0 r9 = r6.v
            java.lang.String r8 = r6.u
            yhm.o.b(r12)
        L3f:
            r2 = r8
            r4 = r10
            r5 = r11
            goto L7f
        L43:
            yhm.o.b(r12)
            com.revolut.feature.terms.api.model.TermsScope$a r12 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r12.getClass()
            com.revolut.feature.terms.api.model.TermsScope r12 = com.revolut.feature.terms.api.model.TermsScope.Companion.b()
            pre.c r1 = r7.d
            rfm.l r12 = pre.c.e(r1, r12)
            s8h.h r1 = new s8h.h
            r4 = 27
            r1.<init>(r4)
            sa6.a r4 = new sa6.a
            r5 = 11
            r4.<init>(r1, r5)
            ufm.i r1 = new ufm.i
            r5 = 1
            r1.<init>(r12, r4, r5)
            java.lang.String r12 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r12)
            r6.u = r8
            r6.v = r9
            r6.f261342w = r11
            r6.f261343x = r10
            r6.A = r2
            java.lang.Object r12 = nim.a.b(r1, r6)
            if (r12 != r0) goto L3f
            goto L9b
        L7f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r8 = r12.booleanValue()
            if (r8 == 0) goto L9d
            r8 = 0
            r6.u = r8
            r6.v = r8
            r6.f261342w = r8
            r6.f261343x = r4
            r6.A = r3
            sa6.j0 r1 = r7.e
            r3 = r9
            java.lang.Object r8 = r1.d(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L9c
        L9b:
            return r0
        L9c:
            return r8
        L9d:
            ba6.e0 r8 = ba6.e0.f13930a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.t.d(java.lang.String, ba6.b0, boolean, ba6.u, gim.c):java.lang.Object");
    }

    public final efm.b e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        ya6.z zVar = (ya6.z) this.f261345a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return zVar.i.g(new ya6.v(id10), false);
    }
}
