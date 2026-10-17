package om4;

import com.revolut.core.model.account.AccountId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class s3 extends b implements al4.p, al4.j {
    public final xoj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dp4.o0 f226692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.n f226693h;
    public final ang.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dp4.r f226694j;
    public final jla.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k4 f226695l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(xoj.a featuresInteractor, dp4.o0 creditCardProductRepository, gte.a featureToggleInteractor, xq3.j creditApplicationInteractor, wsg.n walletInteractor, ang.f userInteractor, dp4.r creditCardEntryPointDetailsRepository, jla.h productCatalogInteractor, k4 familyCreditCardProductFeatureTogglesInteractor, e0 creditCardFacilityExistsInteractor, zq3.a creditEntryPointsInteractor, vie.h tabCreditAvailabilityInteractor) {
        super(featureToggleInteractor, creditApplicationInteractor, creditEntryPointsInteractor, creditCardFacilityExistsInteractor, tabCreditAvailabilityInteractor);
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductRepository, "creditCardProductRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsRepository, "creditCardEntryPointDetailsRepository");
        Intrinsics.checkNotNullParameter(productCatalogInteractor, "productCatalogInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardProductFeatureTogglesInteractor, "familyCreditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardFacilityExistsInteractor, "creditCardFacilityExistsInteractor");
        Intrinsics.checkNotNullParameter(creditEntryPointsInteractor, "creditEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        this.f = featuresInteractor;
        this.f226692g = creditCardProductRepository;
        this.f226693h = walletInteractor;
        this.i = userInteractor;
        this.f226694j = creditCardEntryPointDetailsRepository;
        this.k = productCatalogInteractor;
        this.f226695l = familyCreditCardProductFeatureTogglesInteractor;
    }

    @Override // qx4.i
    public final Flow d() {
        return rd0.e.e(vkm.q.q(nim.a.v(rd0.e.b(((cpj.b) this.f).k(yoj.c.CREDIT_CARD_APPLICATION, yoj.d.DISABLED)), new o0(27))), zhm.h0.f322473a, new n28.b(23));
    }

    @Override // qx4.f
    public final Flow k(grl.r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return vkm.q.q(nim.a.v(l().k(mif.a.m(ft3.d1.Companion, ft3.j1.CREDIT_CARD, null)), new o95.f(origin, 2)));
    }

    @Override // om4.b
    public final jhi.k n() {
        return (jhi.k) r();
    }

    public final Flow o() {
        return vkm.q.q(nim.a.v(this.i.j(w4l.j.f294644c), n3.f));
    }

    public final boolean p() {
        return yoj.b.k(((cpj.b) this.f).g(yoj.c.CREDIT_CARD_PREMIUM, yoj.d.DISABLED));
    }

    public final cxe.u q(ll4.c cVar) {
        grl.r2 r2Var;
        String strName = cVar.name();
        grl.r2[] r2VarArrValues = grl.r2.values();
        int length = r2VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2Var = null;
                break;
            }
            r2Var = r2VarArrValues[i];
            if (kotlin.text.a0.z(r2Var.name(), strName, true)) {
                break;
            }
            i++;
        }
        if (r2Var == null) {
            r2Var = grl.r2.UNRECOGNIZED;
        }
        return this.f226695l.l(r2Var);
    }

    public final Flow r() {
        Flow flowV = v();
        w4l.j jVar = w4l.j.f294644c;
        return nim.a.u(new m84.c(16), zh9.u0.m(zh9.u0.i(flowV, vkm.q.q(rd0.e.b(nim.a.w(this.f226693h.X(AccountId.Personal.f51414a, jVar), new kotlin.jvm.internal.h0() { // from class: om4.o3
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((fo3.c) obj2).d;
            }
        }))), o()), zh9.u0.m(vkm.q.q(l().i(w4l.h.f294642c)), vkm.q.q(new o9a.e(rd0.e.b(((cpj.b) this.f).j(yoj.c.CREDIT_CARD_PREMIUM, w4l.h.f294642c)), 8)))));
    }

    public final Flow s() {
        Flow flowE = e(grl.r2.CARD_ORDERING);
        Flow flowD = d();
        Flow flowO = o();
        return vkm.q.q(rd0.e.e(mo3.a.g(nim.a.u(new m84.c(17), zh9.u0.m(zh9.u0.i(flowE, flowD, flowO), vkm.q.Q(h(w4l.j.f294644c), new okf.m((Continuation) null, this.f226692g, 4)))), null, new ol6.b(11), 1), zhm.h0.f322473a, new n28.b(24)));
    }

    public final Flow t(ll4.c cVar) {
        grl.r2 r2Var;
        String strName = cVar.name();
        grl.r2[] r2VarArrValues = grl.r2.values();
        int length = r2VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2Var = null;
                break;
            }
            r2Var = r2VarArrValues[i];
            if (kotlin.text.a0.z(r2Var.name(), strName, true)) {
                break;
            }
            i++;
        }
        if (r2Var == null) {
            r2Var = grl.r2.UNRECOGNIZED;
        }
        return p() ? i(r2Var) : zi0.c.i(Boolean.FALSE);
    }

    public final Flow u() {
        return vkm.q.q(n14.k.p(nim.a.v(l().k(new ft3.d1(ft3.j1.CREDIT_CARD_LIMIT_INCREASE, null, it3.k.CC_CLI_USER_INITIATED)), new l3(1)), new l3(2)));
    }

    public final Flow v() {
        Flow flowD = d();
        od0.i.Companion.getClass();
        return vkm.q.q(rd0.e.e(nim.a.v(xam.a.h(new jkh.g((Continuation) null, this, 19), flowD), new o0(29)), zhm.h0.f322473a, new n28.b(25)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r7.f226694j.a(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(ll4.c r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof om4.r3
            if (r0 == 0) goto L13
            r0 = r9
            om4.r3 r0 = (om4.r3) r0
            int r1 = r0.f226685x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226685x = r1
            goto L18
        L13:
            om4.r3 r0 = new om4.r3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226685x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L84
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ll4.c r8 = r0.u
            yhm.o.b(r9)
            goto L69
        L39:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.Flow r9 = r7.t(r8)
            cxe.u r2 = r7.q(r8)
            t38.e r9 = zh9.u0.m(r9, r2)
            om4.o0 r2 = new om4.o0
            r6 = 28
            r2.<init>(r6)
            akg.n r9 = nim.a.v(r9, r2)
            ol6.b r2 = new ol6.b
            r6 = 10
            r2.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r4, r2, r5)
            r0.u = r8
            r0.f226685x = r5
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L69
            goto L83
        L69:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L87
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 != r5) goto L87
            r0.u = r4
            r0.f226685x = r3
            dp4.r r2 = r7.f226694j
            java.lang.Object r8 = r2.a(r8, r9, r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L87:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.s3.w(ll4.c, gim.c):java.lang.Object");
    }
}
